/*һ����ʾ�α���ϰ��
1. ����һ��copy_stu��ȥ������Լ�����ƣ��ظ�����10��ѧ������
2. �鿴��ȷ�ϱ������ظ���ѧ������
3. ʹ���α�ɾ���ظ���ѧ����¼��������ֻ�������ظ���ѧ����Ϣ

��չ��
    �����õ� for �α���� in �α� loop
���ߣ�
    while  xx While%found loop 
*/
CREATE TABLE copy_stu
AS SELECT * FROM student;

SELECT * FROM copy_stu;

DELETE copy_stu;

--f8������
INSERT INTO copy_stu VALUES(10,'zhangsan',SYSDATE,'��');
INSERT INTO copy_stu VALUES(20,'С��',SYSDATE,'Ů');
INSERT INTO copy_stu VALUES(30,'����',SYSDATE,'��');
INSERT INTO copy_stu VALUES(40,'����',SYSDATE,'Ů');
INSERT INTO copy_stu VALUES(50,'����',SYSDATE,'��');
INSERT INTO copy_stu VALUES(60,'С��',SYSDATE,'��');
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


/*�������������α꣺
����һ���α꣬������ʦ�����֣�ѭ����ӡ�Ϲ�����ʦ�γ̵�ѧ����Ϣ*/
SET serveroutput ON
DECLARE
  CURSOR c_t(NAME teacher.tname%TYPE) IS
  SELECT s.s#,s.sname,s.sage,s.ssex,t.tname FROM student s,sc sc,course c,teacher t WHERE s.s#=sc.s#
       AND sc.c#=c.c# AND c.t#=t.t#;
  t_tname teacher.tname%TYPE;
BEGIN
  dbms_output.put_line('�к� ѧ����� ѧ������ ѧ������ ѧ���Ա�');
  t_tname := '&name';    
  FOR i IN c_t(t_tname) 
  LOOP
    IF i.tname = t_tname THEN
    dbms_output.put_line(c_t%rowcount||' '||i.s#||' '||i.sname||' '||i.sage||' '||i.ssex);
    END IF;
  END LOOP;
END;
       
/*����REF�α���ϰ��
����Ĳ��ű�ţ�Ϊ��ACCOUNTING����������10%�Ĺ��ʣ�
ΪRESEARCH���ŵ�Ա������15%�Ĺ��ʣ����۲��Ų�����
*/
DECLARE
   TYPE RefEmpCur is ref cursor return emp%rowtype;  -- ����һ��RefEmpCur���͵�Ref�α� 
   EmpCur_A RefEmpCur;  -- ����һ��EmpCur�α����������ΪRefEmpCur
  -- EmpCur_R RefEmpCur; 
   --EmpCur_C RefEmpCur;  
   EmpRow emp%rowtype; -- �洢�α��ѯ���ý��
   e_deptno emp.deptno%TYPE;
   --flag int:=0;
BEGIN
  e_deptno := &e_deptno;
   -- ���ݲ�ͬ��������������ѯ�������EmpCur�α����
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
             DBMS_output.put_line('���۲��Ų�����');
    END IF; 
    
   END LOOP; 
   CLOSE dtptcur;
END;



/*�ġ���������ϰ��
��¼���������ն�emp�����DML��������Ϣ�����޸�ǰ��EMPԭʼ��¼����
����־������չ�ֶΣ���¼�û����޸�ʱ�䣩
��¼�û���select user from dual; �ܻ�õ�¼�û�����*/
CREATE OR REPLACE TRIGGER dml_depts_time
BEFORE
UPDATE OR INSERT OR DELETE 
ON EMP
BEGIN
 IF (TO_CHAR(SYSDATE,'DY') NOT IN ('SAT','SUN')) 
 THEN
    RAISE_APPLICATION_ERROR(-20500,'You may only make changes during normal office hours��');
 END IF; 
END dml_depts_time;
