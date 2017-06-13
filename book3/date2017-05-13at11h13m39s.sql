--1．显示所有员工中的最高工资，最低工资，工资合计，平均工资，并将结果舍入到最接近的整数。
SELECT MAX(salary)AS"最高工资",
       MIN(salary)AS"最低工资",
       SUM(salary)AS"工资合计",
       ROUND(AVG(salary))AS"平均工资"
FROM employees;

--2．续：查询每个职务的 最高，最低，平均，合计工资
SELECT job_id,
       MAX(salary)AS"最高工资",
       MIN(salary)AS"最低工资",
       ROUND(AVG(salary)),
       SUM(salary)AS"工资合计"
FROM employees
GROUP BY job_id;

--3．按职位统计人数，并按降序排列
SELECT job_id AS"职位", COUNT(employee_id)AS"统计人数"
FROM employees
GROUP BY job_id ORDER BY COUNT(employee_id)DESC;

--4．统计经理人数
SELECT COUNT(DISTINCT manager_id)AS"经理人数"
FROM employees;

--5．查询最高工资与最底工资的差额
SELECT MAX(salary)-MIN(salary)AS"工资差额"
FROM employees;

--6．显示经理编号及其所管员工中工资最底的工资（没有经理的不显示），
--并且过滤工资低于5000的组，按降序排列
SELECT manager_id,MIN(salary)
FROM employees
WHERE employees.manager_id IS NOT NULL GROUP BY manager_id
HAVING MIN(salary)>5000 ORDER BY MIN(salary) DESC;

--7．查询每个部门的名称，地点，员工数以及该部门的平均工资(取整)

SELECT a.*,l.city FROM 
(SELECT e.department_id  ,AVG(d.location_id) location_id ,   COUNT(e.department_id)AS"员工数",ROUND(AVG(salary))AS"平均工资"
FROM employees e,departments d WHERE d.department_id = e.department_id
GROUP BY e.department_id
) a ,locations l WHERE a.location_id=l.location_id

SELECT d.department_name,l.street_address,COUNT(e.employee_id),ROUND(AVG(salary))
FROM employees e,departments d,locations l
WHERE e.department_id = d.department_id AND d.location_id = l.location_id
GROUP BY d.department_name,l.street_address;

--8．统计不同年份入职的员工人数1
SELECT to_char(hire_date,'YYYY')AS"入职年份"，COUNT(employee_id)AS"人数"
FROM employees
GROUP BY to_char(hire_date,'YYYY')ORDER BY to_char(hire_date,'YYYY');

--9．统计不同年份入职的员工人数2
SELECT COUNT(e.employee_id)AS"TOTAL",
SUM(DECODE(to_char(hire_date,'YYYY'),2001,1,0))AS"2001",
SUM(DECODE(to_char(hire_date,'YYYY'),2002,1,0))AS"2002",
SUM(DECODE(to_char(hire_date,'YYYY'),2003,1,0))AS"2003",
SUM(DECODE(to_char(hire_date,'YYYY'),2004,1,0))AS"2004",
SUM(DECODE(to_char(hire_date,'YYYY'),2005,1,0))AS"2005",
SUM(DECODE(to_char(hire_date,'YYYY'),2006,1,0))AS"2006",
SUM(DECODE(to_char(hire_date,'YYYY'),2007,1,0))AS"2007",
SUM(DECODE(to_char(hire_date,'YYYY'),2008,1,0))AS"2008"
FROM employees e;

--10．（*）创建一个查询，显示20,50,80,90部门的职务，
--基于部门编号的职务工资，以及该职务在这个部门的工资总额
SELECT job_id "JOB_ID", 
SUM(DECODE(department_id , 20, salary,0)) "DEPT_20", 
SUM(DECODE(department_id , 50, salary,0)) "DEPT_50", 
SUM(DECODE(department_id , 80, salary,0)) "DEPT_80",
SUM(DECODE(department_id , 90, salary,0)) "DEPT_90", 
SUM(salary) "TOTAL" FROM employees GROUP BY job_id;

DELETE departments WHERE department_id IN(280);
COMMIT;
