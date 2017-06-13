  SET serveroutput ON
  BEGIN
    UPDATE emp SET sal=6000.00
      WHERE empno = '7369';
      IF SQL%FOUND THEN
        dbms_output.put_line('表已更新');
      END IF;
  END;

  SELECT * 
  FROM emp
  WHERE emp.empno='7369';

  DECLARE 
  v_empSal emp.sal%TYPE :='&sal';
  v_empId emp.empno%TYPE :='&empno';
  BEGIN
    UPDATE emp SET sal = v_empSal
    WHERE empno=v_empId;
    IF SQL%NOTFOUND THEN
      dbms_output.put_line('编号未找到');
    ELSE 
      dbms_output.put_line('表已更新');
    END IF;
  END;


  BEGIN
    UPDATE emp SET sal=sal+sal*0.05
    WHERE empno=7369;
    dbms_output.put_line('更新行数：'||SQL%Rowcount);
  END;

  DECLARE
    v_empid VARCHAR2(10);
    v_ename VARCHAR2(10);
  BEGIN
    v_empid:='&empno';
    SELECT ename INTO v_ename
    FROM emp WHERE empno=v_empid;
    EXCEPTION
      WHEN no_data_found THEN
        dbms_output.put_line('职员未找到');
  END;

  DECLARE
  empid VARCHAR2(10);
  BEGIN
    SELECT empno INTO empid FROM emp;
    EXCEPTION
      WHEN too_many_rows THEN
        dbms_output.put_line('该查询提取多行');
  END;

  ======================== 显式游标(scott 模式)  ========================

  DECLARE CURSOR c_dept
    IS
    SELECT * FROM dept;
    c_rows c_dept%ROWTYPE;
  BEGIN
    OPEN c_dept;
    LOOP
      FETCH c_dept INTO c_rows;
      EXIT WHEN c_dept%NOTFOUND;
      dbms_output.put_line('结果>>>'||c_rows.dname||';'||c_rows.loc);
      END LOOP;
    CLOSE c_dept;
  END;

  SELECT * FROM emp;
  SELECT * FROM dept;

  DECLARE
  CURSOR c_1(NAME emp.ename%TYPE) IS
  SELECT ename,sal FROM emp WHERE ename=NAME;
  BEGIN
    dbms_output.put_line('行号 姓名 薪水');
    FOR i IN c_1('&name')
    LOOP
      dbms_output.put_line(c_1%ROWCOUNT||''||i.ename||''||i.sal);
    END LOOP;
  END;

  DECLARE
    TYPE DeptCurTyp IS REF CURSOR RETURN departments%ROWTYPE;
    TYPE genericcurtyp IS REF CURSOR;

  DECLARE
    TYPE RefEmpCur IS REF CURSOR RETURN emp%ROWTYPE;
    EmpCur RefEmpCur;
    EmpRow emp%ROWTYPE;
    flag INT:=0;
  BEGIN
    flag :=&flag;
    IF flag=0 THEN
      OPEN EmpCur FOR SELECT * FROM emp WHERE sal>500 AND sal<2000;
    ELSIF flag=1 THEN
          OPEN EmpCur FOR SELECT * FROM emp WHERE sal>=2000;
          ELSE
            OPEN EmpCur FOR SELECT * FROM emp;
            END IF;
            
            LOOP
              EXIT WHEN EmpCur%NOTFOUND;
              FETCH EmpCur INTO EmpRow;
              dbms_output.put_line('empno='||EmpRow.empno);
              END LOOP;
              CLOSE EmpCur;
              END;
    

  DECLARE
  TYPE empcurtyp IS REF CURSOR RETURN emp%ROWTYPE;
  empcur empcurtyp;
  PROCEDURE process_emp_cv(emp_cv IN empcurtyp) IS
    person emp%ROWTYPE;
    BEGIN
      dbms_output.put_line('---------');
      dbms_output.put_line('Here are the names from the result set:');
      LOOP
        FETCH emp_cv INTO person;
        EXIT WHEN emp_cv%NOTFOUND;
        dbms_output.put_line('Name='||person.ename);
        END LOOP;
        END;
        BEGIN
          OPEN empcur FOR SELECT * FROM emp WHERE ROWNUM <11;
            process_emp_cv(empcur);
            CLOSE empcur;
            OPEN empcur FOR SELECT * FROM emp WHERE ename LIKE 'A%';
            process_emp_cv(empcur);
            CLOSE empcur;
            END;
          
DECLARE
v_deptno emp.deptno%TYPE :=&p_deptno;
CURSOR emp_cursor
IS 
SELECT emp.empno,emp.sal
       FROM emp WHERE emp.deptno=v_deptno
       FOR UPDATE;
       BEGIN
         FOR emp_record IN emp_cursor LOOP
           IF emp_record.sal < 1000 THEN
             UPDATE emp SET sal=1000
             WHERE CURRENT OF emp_cursor;
             END IF;
             END LOOP;
             END;
             
SELECT * FROM emp t WHERE t.deptno=20;

DECLARE
v_deptno emp.deptno%TYPE :=&p_deptno;
CURSOR emp_cursor
IS 
SELECT emp.empno,emp.sal
FROM emp WHERE emp.deptno=v_deptno
FOR UPDATE;
BEGIN
  FOR emp_record IN emp_cursor LOOP
    IF emp_record.sal = 800 THEN
      DELETE FROM emp
      WHERE CURRENT OF emp_cursor;
      END IF;
      END LOOP;
      END;
