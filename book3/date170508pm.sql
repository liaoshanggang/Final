select round(123.45678),round(123.47678,2),round(123.45678,-1) from dual;

select trunc(123.45678),trunc(123.45678,3),trunc(123.45678,-1) from dual;

select mod(21,5) from dual;

select sysdate from dual;

select first_name||' '||last_name as "Name",round((sysdate-hire_date)/7) as "Weeks"
from employees
where department_id = 60;

--select months_between('17-5-1','17-5-6') from dual;

--select add_months('17-JUN-13',10) from dual;

--select next_day('17-JUN-13','sunday') from dual;

--select last_day('17-JUN-13') from dual;

select employee_id "员工编号",hire_date "入职日期",months_between(sysdate,hire_date)"雇佣月数",
add_months(hire_date,3) "试用期结束日期",next_day(hire_date,'星期一')"资料提交日期",last_day(hire_date)"首月结薪日期"
from employees;

select round(sysdate,'month') from dual;
select round(sysdate,'year')from dual;
select trunc(sysdate,'month')from dual;
select trunc(sysdate,'year')from dual;

select to_char(sysdate,'YYYY/MM/DD,HH24-MI-SS')from dual;

select to_char(sysdate,'CC')from dual;

select to_char(sysdate,'YYYY')from dual;

select to_char(sysdate,'YYY')from dual;
select to_char(sysdate,'YY')from dual;
select to_char(sysdate,'Y')from dual;

select to_char(sysdate,'Y,YYY')from dual;

select to_char(sysdate,'YEAR')from dual;

select to_char(sysdate,'BC')from dual;

select to_char(sysdate,'AD')from dual;

select to_char(sysdate,'B.C.')from dual;

select to_char(sysdate,'A.D.')from dual;

select to_char(sysdate,'Q')from dual;

select to_char(sysdate,'MM')from dual;

select to_char(sysdate,'MONTH')from dual;

select to_char(sysdate,'Mon')from dual;

select to_char(sysdate,'RM')from dual;

select to_char(sysdate,'WW')from dual;

select to_char(sysdate,'W')from dual;

select to_char(sysdate,'DAY')from dual;

select to_char(sysdate,'DY')from dual;

select to_char(sysdate,'DDD')from dual;

select to_char(sysdate,'DD')from dual;

select to_char(sysdate,'D')from dual;

select to_char(sysdate,'YYYY/MM/DD,HH24-MI-SS')from dual;

select to_char(sysdate,'fmYYYY/MM/DD,HH24-MI-SS')from dual;

select to_char(sysdate,'YYYY/MM/DDsp,HH24-MI-SSsp')from dual;

select to_char(sysdate,'YYYY/MM/DD,HH24-MI-SSth')from dual;

select first_name,to_char(hire_date,'fmDdspth"of"Mon YYYY fmHH24:MI:SS') as"雇佣日期"
from employees
where department_id=60;

select first_name as "姓名",to_char(salary,'$99,999.99')as"薪水"
from employees
where department_id=90;

select to_char(12345,'999999') from dual;
select to_char(12345,'099999') from dual;
select to_char(12345,'$999999') from dual;
select to_char(1234,'L9999') from dual;
select to_char(1234,'999999.99') from dual;
select to_char(1234,'99999,999') from dual;
select to_char(-1234,'999999MI') from dual;
select to_char(-1234,'999999PR') from dual;
select to_char(-1234,'99.9999EEEE') from dual;
select to_char(-1234,'999999V99') from dual;

select to_number('2468','99999') from dual;
select to_number('2468','9999999') from dual;
select to_number(to_char(sysdate,'YYYY'),'9999')from dual;

alter session set nls_date_language = 'american'
select to_date('17-JUN-13')from dual;

select first_name,hire_date
from employees
where hire_date = to_date('Jan 03,2006','fxMon DD,YYYY');

select first_name,hire_date
from employees
where to_char(hire_date,'YY/MM/DD')='06/01/03';

select first_name "名字",(salary*12)+500+(salary*12*NVL(commission_pct,0))"年薪",commission_pct"佣金比例"
from employees
where department_id in('80','90');

select first_name "名字",(salary*12)+500 "年薪",commission_pct"佣金比例"
from employees
where department_id in('80','90');

select first_name "名字",NVL2(commission_pct,salary*0.3,salary*0.5)"过节费",
(salary*12)+NVL2(commission_pct,salary*0.3,salary*0.5）+（salary*12*NVL(commission_pct,0))"年薪"
,commission_pct"佣金比例"
from employees
where department_id in('80','90');

--select first_name,coalesce(commission_pct,manager_id,'老板')as coalesce列
--from employees
--where department_id in('80','90');

select first_name,coalesce (to_char(commission_pct),to_char(manager_id),'老板')as coalesce列
from employees
where department_id in('80','90');
