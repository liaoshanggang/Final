CREATE OR REPLACE TRIGGER update_job_history
    AFTER 
      UPDATE OF job, deptno ON emp
    FOR EACH ROW
BEGIN
    dbms_output.put_line('������job��deptno��Ϣ...');
END;
/
