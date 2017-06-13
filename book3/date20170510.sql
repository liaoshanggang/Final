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

--1����ѯԱ�������������ű�ź�����
SELECT e.last_name,e.department_id,d.department_name
FROM employees e,departments d
WHERE e.department_id=d.department_id;

--2���������ű��Ϊ80������ְ�񣬲��������ŵ�ַ
SELECT e.job_id,l.location_id
FROM employees e JOIN departments d ON (e.department_id=d.department_id)
JOIN locations l ON(d.location_id=l.location_id)
WHERE d.department_id = '80';

--3����ѯ��ý��������Ա���������������ơ���ַID�Ͷ�Ӧ�ĳ���
SELECT e.last_name,d.department_name,l.location_id,l.city
FROM employees e JOIN departments d
ON(e.department_id=d.department_id)
JOIN locations l
ON(d.location_id = l.location_id)
WHERE e.commission_pct IS NOT NULL;

--4����ѯ����LastName�����ְ���Сд������Ա�������Ͳ�������
/*SELECT e.last_name,d.department_name
FROM employees e JOIN departments d
ON(e.department_id = d.department_id)
WHERE UPPER(e.last_name)!=e.last_name; */

--4����ѯ����LastName�����ְ���Сдa������Ա�������Ͳ�������
SELECT e.last_name,d.department_name
FROM employees e JOIN departments d
ON (e.department_id=d.department_id)
WHERE e.last_name LIKE '%a%';

--5����ѯ�����ڶ��׶ࣨToronto��Ա�����֡�ְ�񡢲��ű�źͲ�������
SELECT e.last_name,e.job_id,d.department_id,d.department_name
FROM employees e JOIN departments d
ON(e.department_id=d.department_id)
JOIN locations l ON (d.location_id=l.location_id)
WHERE l.city='Toronto';

SELECT e.last_name,e.job_id,d.department_id,d.department_name
FROM employees e JOIN departments d ON e.department_id = d.department_id
JOIN locations l ON d.location_id = l.location_id
WHERE l.city = 'Toronto'

--6����ѯԱ�����֡�����Լ����Ǿ�������ֺͱ�ţ������ΪEmployee��Emp#��Manager��Mgr#����󰴹����߱����������
SELECT m.last_name Employee,m.employee_id Emp#,e.last_name Manager,m.manager_id Mgr#
FROM employees e,employees m
WHERE e.employee_id=m.manager_id
ORDER BY m.manager_id;

--SELECT * FROM employees WHERE last_name = 'Cambrault';
--SELECT * FROM employees WHERE employee_id = '100';--king
--7����ʾԱ�����������ű���Լ���ͬһ���Ź���������Ա��
SELECT e1.department_id,e1.last_name,e2.department_id,e2.last_name
FROM employees e1,employees e2
WHERE e1.department_id = e2.department_id;

--8����Ա��Davies֮��Ƹ�õ���Ա��������ְ����
SELECT e2.last_name,e2.hire_date
FROM employees e1,employees e2
WHERE e1.last_name='Davies' AND e2.hire_date>=e1.hire_date;
