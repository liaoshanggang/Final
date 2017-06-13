--3.8.1
SELECT employees.first_name,jobs.job_id,job_title,employees.salary
FROM employees,jobs
WHERE employees.job_id = jobs.job_id;

SELECT e.first_name,j.job_id,j.job_title,e.salary
FROM employees e,jobs j
WHERE e.job_id = j.job_id;

--3.8.3
SELECT e.first_name,j.job_title,d.department_name,e.salary
FROM employees e,jobs j,departments d
WHERE e.job_id = j.job_id AND e.department_id = d.department_id;

SELECT e.first_name,j.job_title,d.department_name,e.salary,l.location_id
FROM employees e,jobs j,departments d,locations l
WHERE e.job_id = j.job_id AND e.department_id = d.department_id AND d.location_id = l.location_id;

--3.8.4
SELECT e.first_name,j.job_title,e.salary
FROM employees e
NATURAL JOIN jobs j;

SELECT e.first_name,j.job_title,e.salary
FROM employees e JOIN jobs j
USING(job_id);

SELECT e.first_name,j.job_title,e.salary
FROM employees e JOIN jobs j
ON (e.job_id = j.job_id);

SELECT e.first_name,d.department_name,e.salary
FROM employees e
NATURAL JOIN departments d;

SELECT e.first_name,d.department_name,e.salary
FROM employees e,departments d
WHERE e.department_id = d.department_id;

SELECT e.first_name,d.department_name,e.salary
FROM employees e,departments d 
WHERE e.department_id = d.department_id AND e.manager_id = d.manager_id;

SELECT e.first_name,d.department_name,l.city,e.salary
FROM employees e
NATURAL JOIN departments d
NATURAL JOIN locations l;

SELECT e.first_name,d.department_name,l.city,e.salary
FROM employees e,departments d ,locations l
WHERE e.department_id = d.department_id AND e.manager_id = d.manager_id AND d.location_id = l.location_id;

--3.9.2
SELECT e.first_name,e.department_id,d.department_name
FROM employees e
LEFT OUTER JOIN departments d
ON (e.department_id= d.department_id);

SELECT e.first_name,d.department_id,d.department_name
FROM employees e,departments d
WHERE e.department_id = d.department_id(+);

SELECT e.first_name,d.department_id,d.department_name
FROM employees e 
RIGHT OUTER JOIN departments d
ON (e.department_id = d.department_id);

SELECT e.first_name,d.department_id,d.department_name
FROM employees e,departments d
WHERE e.department_id(+) = d.department_id;

SELECT e.first_name,department_id,d.department_name
FROM employees e
FULL OUTER JOIN departments d
USING (department_id);
