--1����ʾ����Ա���е���߹��ʣ���͹��ʣ����ʺϼƣ�ƽ�����ʣ�����������뵽��ӽ���������
SELECT MAX(salary)AS"��߹���",
       MIN(salary)AS"��͹���",
       SUM(salary)AS"���ʺϼ�",
       ROUND(AVG(salary))AS"ƽ������"
FROM employees;

--2��������ѯÿ��ְ��� ��ߣ���ͣ�ƽ�����ϼƹ���
SELECT job_id,
       MAX(salary)AS"��߹���",
       MIN(salary)AS"��͹���",
       ROUND(AVG(salary)),
       SUM(salary)AS"���ʺϼ�"
FROM employees
GROUP BY job_id;

--3����ְλͳ��������������������
SELECT job_id AS"ְλ", COUNT(employee_id)AS"ͳ������"
FROM employees
GROUP BY job_id ORDER BY COUNT(employee_id)DESC;

--4��ͳ�ƾ�������
SELECT COUNT(DISTINCT manager_id)AS"��������"
FROM employees;

--5����ѯ��߹�������׹��ʵĲ��
SELECT MAX(salary)-MIN(salary)AS"���ʲ��"
FROM employees;

--6����ʾ�����ż�������Ա���й�����׵Ĺ��ʣ�û�о���Ĳ���ʾ����
--���ҹ��˹��ʵ���5000���飬����������
SELECT manager_id,MIN(salary)
FROM employees
WHERE employees.manager_id IS NOT NULL GROUP BY manager_id
HAVING MIN(salary)>5000 ORDER BY MIN(salary) DESC;

--7����ѯÿ�����ŵ����ƣ��ص㣬Ա�����Լ��ò��ŵ�ƽ������(ȡ��)

SELECT a.*,l.city FROM 
(SELECT e.department_id  ,AVG(d.location_id) location_id ,   COUNT(e.department_id)AS"Ա����",ROUND(AVG(salary))AS"ƽ������"
FROM employees e,departments d WHERE d.department_id = e.department_id
GROUP BY e.department_id
) a ,locations l WHERE a.location_id=l.location_id

SELECT d.department_name,l.street_address,COUNT(e.employee_id),ROUND(AVG(salary))
FROM employees e,departments d,locations l
WHERE e.department_id = d.department_id AND d.location_id = l.location_id
GROUP BY d.department_name,l.street_address;

--8��ͳ�Ʋ�ͬ�����ְ��Ա������1
SELECT to_char(hire_date,'YYYY')AS"��ְ���"��COUNT(employee_id)AS"����"
FROM employees
GROUP BY to_char(hire_date,'YYYY')ORDER BY to_char(hire_date,'YYYY');

--9��ͳ�Ʋ�ͬ�����ְ��Ա������2
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

--10����*������һ����ѯ����ʾ20,50,80,90���ŵ�ְ��
--���ڲ��ű�ŵ�ְ���ʣ��Լ���ְ����������ŵĹ����ܶ�
SELECT job_id "JOB_ID", 
SUM(DECODE(department_id , 20, salary,0)) "DEPT_20", 
SUM(DECODE(department_id , 50, salary,0)) "DEPT_50", 
SUM(DECODE(department_id , 80, salary,0)) "DEPT_80",
SUM(DECODE(department_id , 90, salary,0)) "DEPT_90", 
SUM(salary) "TOTAL" FROM employees GROUP BY job_id;

DELETE departments WHERE department_id IN(280);
COMMIT;
