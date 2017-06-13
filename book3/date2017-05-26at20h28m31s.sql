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

--SET serveroutput ON
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

SELECT * FROM emp;
