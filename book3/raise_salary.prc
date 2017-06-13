CREATE OR REPLACE PROCEDURE raise_salary
  (p_id IN employees.employee_id%TYPE)
IS
BEGIN
  IF p_id >= 200 THEN
    --BEGIN
      UPDATE employees
      SET salary = salary * 1.15
      WHERE employee_id = p_id;
    --END;
  END IF;
  IF p_id < 200 THEN
    --BEGIN
      UPDATE employees
      SET salary = salary * 1.10
      WHERE employee_id = p_id;
    --END;
  END IF;
END raise_salary;
/
