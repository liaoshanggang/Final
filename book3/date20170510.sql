select *
from departments d,employees e;

SELECT e.employee_id,e.last_name,e.manager_id,m.employee_id,m.last_name
FROM employees e,employees m
WHERE m.employee_id=e.manager_id;

--3.8.1
SELECT employees.first_name,jobs.job_title,employees.salary
FROM employees,jobs
WHERE employees.job_id=jobs.job_id;

SELECT e.first_name,j.job_title,e.salary
FROM employees e,jobs j
WHERE e.job_id = j.job_id;

SELECT *
FROM employees e,jobs j,departments d
WHERE e.job_id=j.job_id AND e.department_id = d.department_id;

--1．查询员工的姓名、部门编号和名称
SELECT e.last_name,e.department_id,d.department_name
FROM employees e,departments d
WHERE e.department_id=d.department_id;

--2．创建部门编号为80的所有职务，并包括部门地址
SELECT e.job_id,l.location_id
FROM employees e JOIN departments d ON (e.department_id=d.department_id)
JOIN locations l ON(d.location_id=l.location_id)
WHERE d.department_id = '80';

--3．查询获得奖金的所有员工姓名、部门名称、地址ID和对应的城市
SELECT e.last_name,d.department_name,l.location_id,l.city
FROM employees e JOIN departments d
ON(e.department_id=d.department_id)
JOIN locations l
ON(d.location_id = l.location_id)
WHERE e.commission_pct IS NOT NULL;

--4．查询所有LastName中名字包含小写的所有员工姓名和部门名称
/*SELECT e.last_name,d.department_name
FROM employees e JOIN departments d
ON(e.department_id = d.department_id)
WHERE UPPER(e.last_name)!=e.last_name; */

--4．查询所有LastName中名字包含小写a的所有员工姓名和部门名称
SELECT e.last_name,d.department_name
FROM employees e JOIN departments d
ON (e.department_id=d.department_id)
WHERE e.last_name LIKE '%a%';

--5．查询所有在多伦多（Toronto）员工名字、职务、部门编号和部门名称
SELECT e.last_name,e.job_id,d.department_id,d.department_name
FROM employees e JOIN departments d
ON(e.department_id=d.department_id)
JOIN locations l ON (d.location_id=l.location_id)
WHERE l.city='Toronto';

SELECT e.last_name,e.job_id,d.department_id,d.department_name
FROM employees e JOIN departments d ON e.department_id = d.department_id
JOIN locations l ON d.location_id = l.location_id
WHERE l.city = 'Toronto'

--6．查询员工名字、编号以及他们经理的名字和编号，并标记为Employee，Emp#，Manager，Mgr#，最后按管理者编号升序排列
SELECT m.last_name Employee,m.employee_id Emp#,e.last_name Manager,m.manager_id Mgr#
FROM employees e,employees m
WHERE e.employee_id=m.manager_id
ORDER BY m.manager_id;

--SELECT * FROM employees WHERE last_name = 'Cambrault';
--SELECT * FROM employees WHERE employee_id = '100';--king
--7．显示员工姓名、部门编号以及在同一部门工作的所有员工
SELECT e1.department_id,e1.last_name,e2.department_id,e2.last_name
FROM employees e1,employees e2
WHERE e1.department_id = e2.department_id;

--8．在员工Davies之后聘用的人员姓名和入职日期
SELECT e2.last_name,e2.hire_date
FROM employees e1,employees e2
WHERE e1.last_name='Davies' AND e2.hire_date>=e1.hire_date;
