CREATE OR REPLACE FUNCTION get_manager_id
  (p_id IN employees.employee_id%TYPE)
  RETURN NUMBER
IS
  v_manager_id employees.manager_id%TYPE :=0;
BEGIN
  SELECT e.manager_id INTO v_manager_id
  FROM employees e WHERE e.employee_id = p_id;
  RETURN v_manager_id;
END get_manager_id;
/
