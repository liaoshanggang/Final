CREATE OR REPLACE TRIGGER update_job_history
    AFTER 
      UPDATE OF job, deptno ON emp
    FOR EACH ROW
BEGIN
    dbms_output.put_line('更新了job或deptno信息...');
END;
/
