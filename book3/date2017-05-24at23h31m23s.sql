--��������1
SELECT e.ename,e.sal,sal_tax(e.sal) tax FROM emp e;
--��������2
SELECT empno,ename,sal-sal*sal_tax(sal) ʵ������ FROM emp;

SELECT func(100) FROM dual;
SELECT func(101) FROM dual;