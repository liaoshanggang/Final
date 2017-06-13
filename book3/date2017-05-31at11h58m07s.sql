/*一、显示游标练习：
1. 创建一张copy_stu表，去掉所以约束限制，重复插入10次学生数据
2. 查看表，确认表中有重复的学生数据
3. 使用游标删除重复的学生记录，最后表中只保留不重复的学生信息

扩展：
    可能用到 for 游标变量 in 游标 loop
或者：
    while  xx While%found loop 
*/
CREATE TABLE copy_stu
AS SELECT * FROM student;

SELECT * FROM copy_stu;

DELETE copy_stu;

--f8插入多次
INSERT INTO copy_stu VALUES(10,'zhangsan',SYSDATE,'男');
INSERT INTO copy_stu VALUES(20,'小二',SYSDATE,'女');
INSERT INTO copy_stu VALUES(30,'三哥',SYSDATE,'男');
INSERT INTO copy_stu VALUES(40,'李四',SYSDATE,'女');
INSERT INTO copy_stu VALUES(50,'王五',SYSDATE,'男');
INSERT INTO copy_stu VALUES(60,'小六',SYSDATE,'男');
COMMIT;

SELECT * FROM copy_stu;

DECLARE CURSOR c_stu
IS 
SELECT * FROM copy_stu;
BEGIN
       FOR c_rows IN c_stu LOOP
       DELETE FROM copy_stu WHERE s# = c_rows.s#;
       INSERT INTO copy_stu VALUES (c_rows.s#,c_rows.sname,c_rows.sage,c_rows.ssex);                  
       END LOOP;
END;
COMMIT;
SELECT * FROM copy_stu;


/*二、带参数的游标：
定义一个游标，插入老师的名字，循环打印上过该老师课程的学生信息*/
SET serveroutput ON
DECLARE
  CURSOR c_t(NAME teacher.tname%TYPE) IS
  SELECT s.s#,s.sname,s.sage,s.ssex,t.tname FROM student s,sc sc,course c,teacher t WHERE s.s#=sc.s#
       AND sc.c#=c.c# AND c.t#=t.t#;
  t_tname teacher.tname%TYPE;
BEGIN
  dbms_output.put_line('行号 学生编号 学生姓名 学生年龄 学生性别');
  t_tname := '&name';    
  FOR i IN c_t(t_tname) 
  LOOP
    IF i.tname = t_tname THEN
    dbms_output.put_line(c_t%rowcount||' '||i.s#||' '||i.sname||' '||i.sage||' '||i.ssex);
    END IF;
  END LOOP;
END;
       
/*三、REF游标练习：
输入的部门编号，为“ACCOUNTING”部门增加10%的工资；
为RESEARCH部门的员工增加15%的工资，销售部门不增加
*/
DECLARE
   TYPE RefEmpCur is ref cursor return emp%rowtype;  -- 定义一个RefEmpCur类型的Ref游标 
   EmpCur_A RefEmpCur;  -- 定义一个EmpCur游标变量，类型为RefEmpCur
  -- EmpCur_R RefEmpCur; 
   --EmpCur_C RefEmpCur;  
   EmpRow emp%rowtype; -- 存储游标查询到得结果
   e_deptno emp.deptno%TYPE;
   --flag int:=0;
BEGIN
  e_deptno := &e_deptno;
   -- 根据不同输入条件，将查询结果传给EmpCur游标变量
   ---flag :=&flag;
   --if flag=0 then
      open EmpCur_A for select e.* from emp e,dept d WHERE e.deptno = e_deptno;
   --elsif  flag=1 then
      --open EmpCur_R for select e.* from emp e,dept d WHERE d.dname = 'RESEARCH';d.dname = 'ACCOUNTING'
   --else
      --open EmpCur_C for select e.* from emp e,dept d WHERE d.dname = 'SALES';
   --end if;
   CREATE VIEW emp_dept AS SELECT e.* ,d.* FROM emp e,dept d WHERE e.deptno = e_deptno;
   loop
      exit when EmpCur_A%notfound; 
      fetch EmpCur_A into EmpRow;
      UPDATE emp_dept SET e.sal = e.sal/1.10 WHERE d.dname = 'ACCOUNTING';
      --
      --UPDATE emp e,dept d SET e.sal = e.sal/1.10 WHERE d.dname = 'ACCOUNTING';
     -- UPDATE emp e,dept d SET e.sal = e.sal/1.15 WHERE d.dname = 'SALES';
      DBMS_output.put_line('empno='||EmpRow.empno);
   end loop;
   close EmpCur_A;
  /* loop
      exit when EmpCur_R%notfound; 
      fetch EmpCur_R into EmpRow;
       UPDATE emp e SET e.sal = e.sal/1.15 WHERE e.deptno = e_deptno;
      DBMS_output.put_line('empno='||EmpRow.empno);
   end loop;
   close EmpCur_R;
   loop
      exit when EmpCur_C%notfound; 
      fetch EmpCur_C into EmpRow;
      DBMS_output.put_line('empno='||EmpRow.empno);
   end loop;

    close EmpCur_C;*/
end;

SELECT * FROM emp,dept;


DECLARE
   TYPE Refdept  IS REF CURSOR RETURN  emp%ROWTYPE;  
   dtptcur Refdept;  
   deptrow emp%ROWTYPE; 
   v_dtptNo dept.deptno%TYPE :='&dtpeno'; 
   v_accNo dept.deptno%TYPE:=0;
   v_resNo dept.deptno%TYPE:=0;
    BEGIN  
    SELECT  deptno INTO v_accNo
    FROM dept WHERE dname='RESEARCH';
  
    SELECT deptno INTO v_resNo
    FROM dept WHERE dname='ACCOUNTING';
    
  OPEN dtptcur 
  
  LOOP  
     
    EXIT WHEN dtptcur%NOTFOUND;  
    FETCH dtptcur INTO deptrow; 
    
   IF 
     v_dtptNo=v_accNo THEN
       UPDATE emp 
       SET sal=deptrow.sal+deptrow.sal*0.1;
      
     ELSIF 
       v_dtptNo=v_resNo THEN
         UPDATE emp 
         SET sal=deptrow.sal+deptrow.sal*0.15;
         
           ELSE
             DBMS_output.put_line('销售部门不增加');
    END IF; 
    
   END LOOP; 
   CLOSE dtptcur;
END;



/*四、触发器练习：
记录周六和周日对emp表进行DML操作的信息，将修改前的EMP原始记录备份
到日志表。（扩展字段：登录用户，修改时间）
登录用户：select user from dual; 能获得登录用户名称*/
CREATE OR REPLACE TRIGGER dml_depts_time
BEFORE
UPDATE OR INSERT OR DELETE 
ON EMP
BEGIN
 IF (TO_CHAR(SYSDATE,'DY') NOT IN ('SAT','SUN')) 
 THEN
    RAISE_APPLICATION_ERROR(-20500,'You may only make changes during normal office hours！');
 END IF; 
END dml_depts_time;
