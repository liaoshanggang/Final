select  avg(DISTINCT salary),max(DISTINCT salary),min(DISTINCT salary),sum(salary)
from employees
where job_id like '%REP%';

SELECT MIN(hire_date),MAX(hire_date)
FROM employees;

SELECT COUNT(*)
FROM employees
WHERE department_id = 50;

SELECT COUNT(commission_pct)
FROM employees
WHERE department_id = 80;

SELECT COUNT(DISTINCT department_id)
FROM employees;

SELECT AVG(commission_pct)
FROM employees;

SELECT AVG(NVL(commission_pct,0))
FROM employees;

SELECT department_id,AVG(salary)
FROM employees
GROUP BY department_id;

SELECT AVG(salary)
FROM employees
GROUP BY department_id;

SELECT department_id dept_id,job_id,SUM(salary)
FROM employees
GROUP BY department_id,job_id;

--SELECT department_id, AVG(salary)FROM employees WHERE AVG(salary) > 8000GROUP BY department_id;

SELECT department_id,MAX(salary)
FROM employees
GROUP BY department_id
HAVING MAX(salary)>1000;

SELECT job_id,SUM(salary) PAYROLL
FROM employees
WHERE job_id NOT LIKE 'REP'
GROUP BY job_id
HAVING SUM(salary)>13000
ORDER BY SUM(salary);

SELECT MAX(AVG(salary))
FROM employees
GROUP BY department_id;

SELECT MIN(AVG(salary))
FROM employees
GROUP BY department_id;

--×Ö²éÑ¯
SELECT last_name
FROM employees
WHERE salary >(SELECT salary FROM employees WHERE last_name = 'Abel');

SELECT last_name,job_id,salary
FROM employees
WHERE job_id = (SELECT job_id FROM employees WHERE employee_id = 141)
AND salary = (SELECT salary FROM employees WHERE employee_id = 143);

SELECT last_name,job_id,salary
FROM employees
WHERE salary = (SELECT MIN(salary)FROM employees);

SELECT department_id,MIN(salary)
FROM employees
GROUP BY department_id
HAVING MIN(salary)> (SELECT MIN(salary) FROM employees WHERE department_id = 50);
