﻿--多表查询笔记
--  (+) 放哪边？没有Null数据的就没有、不要(+)
--  例：查找没有人员的部门
SELECT e.last_name, e.department_id, d.department_name
FROM employees e, departments d
WHERE e.department_id(+) = d.department_id AND e.last_name IS NULL;


--	自连接
--	自己连接自己
--	例：找到部门的管理者

SELECT distinct e2.last_name manager_name, e2.employee_id eid
FROM employees e1, employees e2
WHERE e1.manager_id = e2.employee_id;

--	自然连接
SELECT *
FROM employees e1 
NATURAL JOIN departments;

SELECT COUNT(*) FROM employees e, departments d
WHERE d.manager_id = e.manager_id AND e.department_id = d.department_id;

--	JOIN USING 的输出会为每一对相等的输入字段输出一个字段，后面跟着来自各个表的所有其它字段． 因此，USING (a, b, c) 等效于 ON (t1.a = t2.a AND t1.b = t2.b AND t1.c = t2.c) 只不过是如果使用了ON，那么在结果里 a，b，和 c字段每个都会有两个， 而用USING的时候每个字段就只会有一个．
SELECT * FROM employees e JOIN departments d
ON e.manager_id = d.manager_id AND e.department_id = d.department_id;
-- 使用 Using时
SELECT * FROM employees e JOIN departments d
USING(manager_id,department_id)

--	LEFT OUTER JOIN 
SELECT e.last_name, e.department_id, d.department_name
FROM employees e
LEFT OUTER JOIN departments d
ON (e.department_id = d.department_id) ;

SELECT e.last_name, e.department_id, d.department_name
FROM employees e, departments d
WHERE d.department_id (+) = e.department_id;



--子查询
--1．  查询与141号员工相同的职位，并且工资高于143号员工的所有人员信息
SELECT * FROM employees m
WHERE m.job_id = 
( SELECT e.job_id 
                 FROM employees e
                 WHERE e.employee_id = 141
                ) 
  AND m.salary > 
( SELECT p.salary
                 FROM employees p
                 WHERE p.employee_id = 143);
         
--2．	子查询中的分组函数：例：查询工资等于最底工资的所以员工信息
SELECT * FROM employees e
WHERE e.salary=(SELECT MIN(e.salary) FROM employees e);

--3．	Having子查询
--例1：部门之间最底工资比较，找出比部门编号50最底工资要高的哪些部门和该部门的最底工资
SELECT e.employee_id,MIN(e.salary)
FROM employees e
GROUP BY e.employee_id
HAVING MIN(e.salary) > (SELECT MIN(d.salary) FROM employees d WHERE d.employee_id = 107);

--例2：找出平均工资最底的职务
SELECT o.job_id, AVG(o.salary)
FROM employees o
GROUP BY o.job_id
HAVING AVG(o.salary) = (
                          SELECT MIN(AVG(e.salary))
                          FROM employees e
                          GROUP BY e.job_id);

--4．	子查询异常 找出雇员表中每个部门薪水最低的雇员信息
SELECT last_name, salary, department_id
FROM employees
WHERE salary IN 
(SELECT MIN(salary)
FROM employees
GROUP BY department_id);


--TOP-N分析与分页

--1、非排序查询TOP-N分析
--例题：返回员工信息表前5条记录

SELECT ROWNUM 序号,e.employee_id 员工编号,e.first_name 姓名,e.salary 工资
FROM employees e
WHERE e.department_id IN(10,30) AND ROWNUM<=5;

--2、排序查询TOP-N分析
--SELECT语句的执行顺序：先WHERE，后ORDER BY
--例题：按照工资降序排序，查询工资最高的前5名员工的信息。

SELECT ROWNUM 序号,e.employee_id 员工编号,e.first_name 姓名,e.salary 工资
FROM employees e
WHERE e.department_id IN(10,30) AND ROWNUM<=5
ORDER BY e.salary DESC;

SELECT ROWNUM 序号,ta.employee_id 员工编号,ta.first_name 姓名,ta.salary 工资
FROM (SELECT e.employee_id,e.first_name,e.salary
FROM employees e
WHERE e.department_id IN(10,30) ORDER BY e.salary DESC)ta
WHERE ROWNUM<=5;

SELECT ROWNUM 序号,rn 原始行号,ta.employee_id 员工编号,ta.first_name 姓名,ta.salary 工资
FROM 
(SELECT ROWNUM rn,e.employee_id,e.first_name,e.salary FROM employees e 
WHERE e.department_id IN(10,30)ORDER BY e.salary DESC)ta
WHERE ROWNUM<=5;

--3、分页查询（应用极广）
--例题：按照工资逆序、分页显示员工信息，每页显示6行记录。
--假定当前要显示第3页（即13~18行），应如何获取该页数据？
SELECT ROWNUM 序号
FROM(SELECT * FROM employees e ORDER BY e.salary DESC)ta
WHERE ROWNUM>=13 AND ROWNUM<=18;

SELECT rn 序号,t2.employee_id,t2.first_name,t2.job_id,t2.salary
FROM(SELECT ROWNUM rn,t1.employee_id,t1.first_name,t1.job_id,t1.salary
FROM (SELECT e.employee_id,e.first_name,e.job_id,e.salary
FROM employees e ORDER BY e.salary DESC)t1
)t2
WHERE rn>=4 AND rn<=6;

select * from (select rownum r,t1.* from (select * from employees e order by e.salary desc) t1 where rownum<=10) t2 where t2.r>=6; 
