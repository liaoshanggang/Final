--4.1.1
SELECT last_name 
FROM employees
WHERE salary>(SELECT salary FROM employees WHERE last_name = 'Abel') AND department_id = 90;

--4.1.2
SELECT employee_id,last_name,salary
FROM employees
WHERE department_id = (SELECT department_id FROM employees WHERE employee_id = 105);

SELECT employee_id,last_name,salary
FROM employees
WHERE department_id = (SELECT department_id FROM employees WHERE employee_id = 105)
AND salary >(SELECT salary FROM employees WHERE employee_id = 105);

SELECT employee_id,last_name,salary
FROM employees
WHERE department_id = (SELECT department_id FROM employees WHERE employee_id = 105)
AND salary >(SELECT AVG(salary) FROM employees);

--4.1.3
SELECT e.employee_id,e.last_name,e.salary,e.department_id
FROM employees e
WHERE salary IN(SELECT salary FROM employees e WHERE e.department_id=60);

SELECT e.employee_id,e.last_name,e.salary,e.department_id
FROM employees e
WHERE salary IN(9000,6000,4800,4800,4200);

SELECT e.employee_id,e.last_name,e.salary,e.department_id
FROM employees e
WHERE salary <ANY(SELECT salary FROM employees e WHERE e.department_id=60);

--4.3
SELECT e.employee_id,e.last_name,e.salary,e.department_id
FROM employees e
WHERE salary <(SELECT MAX(salary) FROM employees e WHERE e.department_id=60);

SELECT MAX(e.salary) "���нˮ",MIN(e.salary) AS "���нˮ",AVG(e.salary) "ƽ��нˮ",SUM(e.salary) AS "нˮ�ܺ�"
FROM employees e
WHERE e.department_id = 60;

SELECT MAX(DISTINCT e.salary) "���нˮ",MIN(DISTINCT e.salary) AS "���нˮ",AVG(DISTINCT e.salary) "ƽ��нˮ",SUM(DISTINCT e.salary) AS "нˮ�ܺ�"
FROM employees e
WHERE e.department_id = 60;

SELECT COUNT(*) AS "������",COUNT(e.commission_pct) AS "��Ӷ������",COUNT(DISTINCT e.commission_pct) AS "Ӷ������"
FROM employees e;

SELECT COUNT(e.manager_id) AS "������",COUNT(e.commission_pct) AS "��Ӷ������",COUNT(DISTINCT e.commission_pct) AS "Ӷ������"
FROM employees e;

SELECT COUNT(NVL(manager_id,0)) AS "������" FROM employees;

--4.3.3
SELECT department_id,MAX(salary)
FROM employees GROUP BY department_id;

SELECT department_id,MAX(salary)
FROM employees GROUP BY department_id 
ORDER BY MAX(salary)DESC;

--4.3.4
SELECT department_id,job_id,MAX(salary)
FROM employees GROUP BY department_id,job_id
ORDER BY department_id,job_id;

--4.3.5
SELECT department_id,MAX(salary)
FROM employees
WHERE department_id IN(50,60,80,90)
GROUP BY department_id;

SELECT department_id,MAX(salary)FROM employees
WHERE department_id IN(50,60,80,90)
GROUP BY department_id HAVING MAX(salary)>12000;
