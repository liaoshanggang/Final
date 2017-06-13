
/*
��ṹ��
--1.ѧ����
Student(S#,Sname,Sage,Ssex) --S# ѧ�����,Sname ѧ������,Sage ��������,Ssex ѧ���Ա�
--2.�γ̱�
Course(C#,Cname,T#) --C# --�γ̱��,Cname �γ�����,T# ��ʦ���
--3.��ʦ��
Teacher(T#,Tname) --T# ��ʦ���,Tname ��ʦ����
--4.�ɼ���
SC(S#,C#,score) --S# ѧ�����,C# �γ̱��,score ����

select * from Student
select * from Course
select * from Teacher
select * from SC
*/
--׼������������������������
/*DROP TABLE Student;
create table Student(S# varchar2(10),Sname varchar2(10),Sage date,Ssex varchar2(10));
insert into Student values('01' , '����' , to_date('1990-01-01','yyyy-mm-dd') , '��');
insert into Student values('02' , 'Ǯ��' , to_date('1990-12-21','yyyy-mm-dd') , '��');
insert into Student values('03' , '���' , to_date('1990-05-20','yyyy-mm-dd') , '��');
insert into Student values('04' , '����' , to_date('1990-08-06','yyyy-mm-dd') , '��');
insert into Student values('05' , '��÷' , to_date('1991-12-01','yyyy-mm-dd') , 'Ů');
insert into Student values('06' , '����' , to_date('1992-03-01','yyyy-mm-dd') , 'Ů');
insert into Student values('07' , '֣��' , to_date('1989-07-01','yyyy-mm-dd') , 'Ů');
insert into Student values('08' , '����' , to_date('1990-01-20','yyyy-mm-dd') , 'Ů');

DROP TABLE Course;
create table Course(C# varchar2(10),Cname varchar2(10),T# varchar2(10));
insert into Course values('01' , '����' , '02');
insert into Course values('02' , '��ѧ' , '01');
insert into Course values('03' , 'Ӣ��' , '03');

drop table teacher;
create table Teacher(T# varchar2(10),Tname varchar2(10));
insert into Teacher values('01' , '����');
insert into Teacher values('02' , '����');
insert into Teacher values('03' , '����');

drop table sc;
create table SC(S# varchar2(10),C# varchar2(10),score number(4,1));
insert into SC values('01' , '01' , 80);
insert into SC values('01' , '02' , 90);
insert into SC values('01' , '03' , 99);
insert into SC values('02' , '01' , 70);
insert into SC values('02' , '02' , 60);
insert into SC values('02' , '03' , 80);
insert into SC values('03' , '01' , 80);
insert into SC values('03' , '02' , 80);
insert into SC values('03' , '03' , 80);
insert into SC values('04' , '01' , 50);
insert into SC values('04' , '02' , 30);
insert into SC values('04' , '03' , 20);
insert into SC values('05' , '01' , 76);
insert into SC values('05' , '02' , 87);
insert into SC values('06' , '01' , 31);
insert into SC values('06' , '03' , 34);
insert into SC values('07' , '02' , 89);
insert into SC values('07' , '03' , 98);
*/

--ϰ��go
select * from Student;
select * from Course;
select * from Teacher;
select * from SC;

--1����ѯ"01"�γ̱�"02"�γ̳ɼ��ߵ�ѧ������Ϣ���γ̷���
SELECT s.*,sc1.score "�γ�'01'�ķ���",sc2.score "�γ�'02'�ķ���"
FROM student s,sc sc1,sc sc2
WHERE s.s# = sc1.s# AND s.s# = sc2.s# AND sc1.c#='01' AND sc2.c#='02'AND sc1.score>sc2.score;

--2����ѯ"01"�γ̱�"02"�γ̳ɼ��͵�ѧ������Ϣ���γ̷���
SELECT s.*,sc1.score "�γ�'01'�ķ���",sc2.score "�γ�'02'�ķ���"
FROM student s,sc sc1,sc sc2
WHERE s.s#=sc1.s# AND s.s#=sc2.s# AND sc1.c#='01' AND sc2.c#='02'AND sc1.score<sc2.score;


--3����ѯƽ���ɼ����ڵ���60�ֵ�ͬѧ��ѧ����ź�ѧ��������ƽ���ɼ�
select sc.s# ѧ�����,stu.sname ѧ������,round(avg(sc.score),2) ƽ���ɼ�
from student stu
join sc sc on(stu.s#=sc.s#)
group by sc.s#,stu.sname having avg(sc.score)>=60;

--4����ѯƽ���ɼ�С�ڷֵ�ͬѧ��ѧ����ź�ѧ��������ƽ���ɼ�
select sc.s# ѧ�����,stu.sname ѧ������,round(avg(sc.score),2) ƽ���ɼ�
from student stu
join sc sc on(stu.s#=sc.s#)
group by sc.s#,stu.sname having avg(sc.score)<60;

--5����ѯ����ͬѧ��ѧ����š�ѧ��������ѡ�����������пγ̵��ܳɼ�
select stu.s# ѧ�����,stu.sname ѧ������,count(sc.c#) ѡ������,sum(sc.score)���пγ̵��ܳɼ�
from student stu
join sc sc on(stu.s#=sc.s#)
group by stu.s#,stu.sname
ORDER BY stu.s#;


--6����ѯ"��"����ʦ������
SELECT COUNT(t.tname) "'��'����ʦ������"
FROM teacher t
WHERE t.tname LIKE '%��%';



--7����ѯѧ��"����"��ʦ�ڿε�ͬѧ����Ϣ
SELECT stu.*
FROM student stu JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#)
JOIN teacher t ON(t.t#=c.t#)
WHERE t.tname='����';

--8����ѯûѧ��"����"��ʦ�ڿε�ͬѧ����Ϣ --??
SELECT stu.*
FROM student stu WHERE stu.s# NOT IN
(SELECT sc.s# FROM sc sc JOIN course c ON(sc.c#=c.c#)
JOIN teacher t ON(c.t#=t.t#) WHERE t.tname='����');

--9����ѯѧ�����Ϊ"01"����Ҳѧ�����Ϊ"02"�Ŀγ̵�ͬѧ����Ϣ --??
SELECT DISTINCT stu.*
FROM student stu JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#)
,(SELECT DISTINCT stu.*
FROM student stu JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#)
WHERE c.c# IN('02')) s2
WHERE c.c# IN('01')AND stu.s# = s2.s# ORDER BY stu.s#;

--10����ѯѧ�����Ϊ"01"����û��ѧ�����Ϊ"02"�Ŀγ̵�ͬѧ����Ϣ --??
SELECT stu.*
FROM student stu
JOIN sc c ON(stu.s#=c.s#)
WHERE c.c# = '01' AND c.s# NOT IN(
SELECT c.s# FROM student stu
JOIN sc c ON(stu.s#=c.s#)
WHERE c.c# ='02');

--11����ѯû��ѧȫ���пγ̵�ͬѧ����Ϣ
--??? ����û��ѡ�޵�
SELECT stu.sname,stu.s#,stu.sage,stu.ssex
FROM student stu
LEFT OUTER JOIN sc sc ON(stu.s#=sc.s#)
GROUP BY stu.sname,stu.s#,stu.sage,stu.ssex HAVING COUNT(sc.s#)<3;

--12����ѯ������һ�ſ���ѧ��Ϊ"01"��ͬѧ��ѧ��ͬ��ͬѧ����Ϣ ��ʵ�����ҵ�û��ѡ�޿ε�ͬѧ
--���ҵ�ѧ��Ϊ"01"��ͬѧȫ���γ̶�ѧ�ˡ�
SELECT sc.c#
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
WHERE sc.s#='01';

SELECT DISTINCT stu.*
FROM student stu
LEFT OUTER JOIN sc sc ON(stu.s#=sc.s#)
WHERE sc.c# IS NOT NULL AND sc.s# <> '01';

--13����ѯ��"01"�ŵ�ͬѧѧϰ�Ŀγ���ȫ��ͬ������ͬѧ����Ϣ 
--��ʵ���ǲ���ȫ���γ�ѧ������Ϣ���������Լ�����
SELECT stu.*
FROM student stu 
WHERE stu.s#<>'01'AND stu.s# IN(
SELECT st01.s#
FROM st01,st02,st03
WHERE st01.s#=st02.s# AND st02.s#=st03.s#);

--14����ѯûѧ��"����"��ʦ���ڵ���һ�ſγ̵�ѧ������ --??�Ȳ�ѯѡ���˸ÿε�ѧ����ɸѡ
SELECT student.*
FROM student WHERE student.s# NOT IN
(SELECT DISTINCT sc.s# FROM sc sc,course c,teacher t 
WHERE sc.c# = c.c# AND c.t# = t.t# AND t.tname = '����'
);

--15����ѯ���ż������ϲ�����γ̵�ͬѧ��ѧ�ţ���������ƽ���ɼ� --?? count(1)
SELECT stu.s# ѧ��,stu.sname ����,ROUND(AVG(sc.score),2) ƽ���ɼ�
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
WHERE stu.s# IN (SELECT sc.s# FROM sc sc WHERE sc.score<60 GROUP BY sc.s# HAVING COUNT(1) >=2)
GROUP BY stu.s#,stu.sname;

--16������"01"�γ̷���С��60���������������е�ѧ����Ϣ
SELECT stu.*,sc.c#,sc.score
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
WHERE sc.c#='01'AND sc.score<60 ORDER BY sc.score DESC;

--17����ƽ���ɼ��Ӹߵ�����ʾ����ѧ�������пγ̵ĳɼ��Լ�ƽ���ɼ�--???
SELECT stu.s# ѧ�����,stu.sname ѧ������,
MAX(CASE c.cname WHEN '����' THEN sc.score ELSE NULL END) ����,
MAX(CASE c.cname WHEN '��ѧ' THEN sc.score ELSE NULL END) ��ѧ,
MAX(CASE c.cname WHEN 'Ӣ��' THEN sc.score ELSE NULL END) Ӣ��,
CAST(AVG(sc.score)AS DECIMAL(18,2)) ƽ����
FROM student stu
LEFT JOIN sc sc ON stu.s#=sc.s#
LEFT JOIN course c ON sc.c#=c.c#
GROUP BY stu.s#,stu.sname
ORDER BY ƽ���� DESC;



SELECT sc.s#,AVG(sc.score)
FROM sc sc
GROUP BY sc.s#;

--18����ѯ���Ƴɼ���߷֡���ͷֺ�ƽ���֣���������ʽ��ʾ�� --???????????
--�γ�ID���γ�name����߷֣���ͷ֣�ƽ���֣������ʣ��е��ʣ������ʣ�������
--����Ϊ>=60���е�Ϊ��-80������Ϊ��-90������Ϊ��>=90
select m.C# �γ̱��, m.Cname �γ�����, 
  max(n.score) ��߷�,
  min(n.score) ��ͷ�,
  cast(avg(n.score) as decimal(18,2)) ƽ����,
  cast((select count(1) from SC where C# = m.C# and score >= 60)*100.0 / (select count(1) from SC where C# = m.C#) as decimal(18,2)) ������,
  cast((select count(1) from SC where C# = m.C# and score >= 70 and score < 80 )*100.0 / (select count(1) from SC where C# = m.C#) as decimal(18,2)) �е���,
  cast((select count(1) from SC where C# = m.C# and score >= 80 and score < 90 )*100.0 / (select count(1) from SC where C# = m.C#) as decimal(18,2)) ������,
  cast((select count(1) from SC where C# = m.C# and score >= 90)*100.0 / (select count(1) from SC where C# = m.C#) as decimal(18,2))������
from Course m , SC n
where m.C# = n.C#
group by m.C# , m.Cname
order by m.C#;


--19�������Ƴɼ��������򣬲���ʾ����      ------------
SELECT sc.c#,sc.s#,stu.sname,sc.score,RANK() OVER(ORDER BY(sc.score) DESC)"����"
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
WHERE sc.c# = '01';

SELECT sc.c#,sc.s#,stu.sname,sc.score,RANK() OVER(ORDER BY(sc.score) DESC)"����"
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
WHERE sc.c# = '02';

SELECT sc.c#,sc.s#,stu.sname,sc.score,RANK() OVER(ORDER BY(sc.score) DESC)"����"
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
WHERE sc.c# = '03';

--ȫ���γ�һ����
SELECT sc.c#,sc.s#,sc.score,RANK() OVER(ORDER BY(sc.score) DESC)"����"
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
GROUP BY sc.c#,sc.s#,sc.score;

--20����ѯѧ�����ܳɼ�����������
SELECT sc.s#,sum(sc.score),RANK() OVER(ORDER BY(SUM(sc.score)) DESC)"����"
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
GROUP BY sc.s#;

--21����ѯ��ͬ��ʦ���̲�ͬ�γ�ƽ���ִӸߵ�����ʾ
SELECT t.t# "��ʦ���",t.tname "��ʦ",sc .c# "�γ̺�", ROUND(AVG (sc.score),2) "ƽ����"
FROM teacher t,course c,sc sc
WHERE t.t# = c.t# AND c.c# = sc.c# GROUP BY t.t#,t.tname,sc.c#
ORDER BY avg(sc.score) DESC; 

--22����ѯ���пγ̵ĳɼ���2������3����ѧ����Ϣ���ÿγ̳ɼ� --??????????
select * from 
(select t.* , px = 
(select count(distinct score) from SC where C# = t.C# and score >= t.score) 
from sc t) 
m where px between 2 and 3 order by m.c# , m.px 


--23��ͳ�Ƹ��Ƴɼ����������������γ̱��,�γ�����,[100-85],[85-70],[70-60],[0-60]����ռ�ٷֱ� --??
select Course.C# �γ̱�� , Cname as �γ����� ,
  sum(case when score >= 85 then 1 else 0 end) "85-100",
  sum(case when score >= 70 and score < 85 then 1 else 0 end) "70-85",
  sum(case when score >= 60 and score < 70 then 1 else 0 end) "60-70",
  sum(case when score < 60 then 1 else 0 end) "0-60"
from sc , Course 
where SC.C# = Course.C# 
group by Course.C# , Course.Cname
order by Course.C#


--24����ѯѧ��ƽ���ɼ���������
SELECT stu.s# ѧ��,stu.sname ����,ROUND(AVG(sc.score)) ƽ���ɼ�,rank() over(order by AVG(sc.score) desc)"����" 
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
GROUP BY stu.s#,stu.sname;

--25����ѯ���Ƴɼ�ǰ�����ļ�¼
SELECT *
FROM(SELECT *
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
WHERE sc.c#='01' ORDER BY sc.score DESC)st
WHERE ROWNUM<=3;

SELECT *
FROM(SELECT *
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
WHERE sc.c#='02' ORDER BY sc.score DESC)st
WHERE ROWNUM<=3;

SELECT *
FROM(SELECT *
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
WHERE sc.c#='03' ORDER BY sc.score DESC)st
WHERE ROWNUM<=3;

--26����ѯÿ�ſγ̱�ѡ�޵�ѧ����
SELECT sc.c#,COUNT(sc.c#)
FROM sc sc
GROUP BY sc.c#;


--27����ѯ��ֻ�����ſγ̵�ȫ��ѧ����ѧ�ź�����
SELECT stu.s#,stu.sname
FROM student stu
JOIN sc ON(stu.s#=sc.s#) GROUP BY stu.s#,stu.sname
HAVING COUNT(1) =2
ORDER BY stu.s#;


--28����ѯ������Ů������
SELECT SUM(DECODE(stu.ssex,'��',1,0))"��������",SUM(DECODE(stu.ssex,'Ů',1,0))"Ů������"
FROM student stu;


--29����ѯ�����к���"��"�ֵ�ѧ����Ϣ
SELECT *
FROM student stu
WHERE stu.sname LIKE '%��%';

--30����ѯͬ��ͬ��ѧ����������ͳ��ͬ������
--����ͬ��
SELECT *
FROM student;
INSERT INTO student VALUES('09','����',NULL,'��');
COMMIT;
--��ѯͬ��ͬ��ѧ����������ͳ��ͬ������
SELECT count(stu1.sname) ͬ������
FROM student stu1,student stu2
WHERE stu1.s# != stu2.s# AND stu1.sname = stu2.sname;

DELETE student 
WHERE s#='09';
COMMIT;
SELECT *
FROM student;

--31����ѯ1990�������ѧ������(ע��Student����Sage�е�������datetime) 
SELECT *
FROM student stu
WHERE to_char(stu.sage,'yyyy')=1990;

--32����ѯÿ�ſγ̵�ƽ���ɼ��������ƽ���ɼ��������У�ƽ���ɼ���ͬʱ�����γ̱����������
SELECT sc.c#,c.cname,ROUND(AVG(sc.score),2) ƽ���ɼ�
FROM sc sc
JOIN course c ON(sc.c#=c.c#)
GROUP BY sc.c#,c.cname
ORDER BY AVG(sc.score) DESC,sc.c#;

--33����ѯƽ���ɼ����ڵ���85������ѧ����ѧ�š�������ƽ���ɼ�
SELECT stu.s# ѧ��,stu.sname ����,ROUND(AVG(sc.score),2) ƽ���ɼ�
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
GROUP BY stu.s#,stu.sname
HAVING AVG(sc.score)>=85
ORDER BY stu.s#;

--34����ѯ�γ�����Ϊ"��ѧ"���ҷ�������60��ѧ�������ͷ���
SELECT stu.sname,sc.score
FROM student stu 
JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#)
WHERE c.cname='��ѧ'AND sc.score<60;


--35����ѯ����ѧ���Ŀγ̼����������
SELECT stu.sname,c.cname,sc.score
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#);

--36����ѯ�κ�һ�ſγ̳ɼ���70�����ϵ��������γ����ƺͷ�����
SELECT stu.sname,c.cname,sc.score
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#)
WHERE sc.score>70;

--37����ѯ������Ŀγ�
SELECT DISTINCT c.cname ������γ���
FROM course c JOIN sc ON(c.c#=sc.c#)
WHERE sc.score<60;


--38����ѯ�γ�'01'���Ϊ�ҿγ̳ɼ���80�����ϵ�ѧ����ѧ�ź�������stu.s#,stu.sname sc.c#='01' AND
SELECT stu.*,c.c#,c.cname,sc.score
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#)
WHERE  sc.score>=80 AND sc.c#='01';

--39����ÿ�ſγ̵�ѧ������
SELECT sc.c#,c.cname,count(sc.s#) ѧ������
FROM sc sc
JOIN course c ON(sc.c#=c.c#)
GROUP BY sc.c#,c.cname;

--40����ѯѡ��"����"��ʦ���ڿγ̵�ѧ���У��ɼ���ߵ�ѧ����Ϣ����ɼ�
DROP VIEW view40;
CREATE VIEW view40 
AS SELECT stu.s#,c.c#,sc.score
FROM student stu 
JOIN sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#)
JOIN teacher t ON(c.t#=t.t#)
WHERE t.tname LIKE'����'
ORDER BY sc.score DESC;

SELECT *
FROM view40 v40
WHERE ROWNUM <= 1;

--41����ѯ��ͬ�γ̳ɼ���ͬ��ѧ����ѧ����š��γ̱�š�ѧ���ɼ�,d2.s# ѧ����,d2.c# �γ�,d2.score ���� 
DROP VIEW differ;
CREATE VIEW differ
AS SELECT stu.s#,c.c#,sc.score
FROM student stu JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#);

SELECT d1.s# ѧ����,d1.c# �γ�,d1.score ���� FROM differ d1,differ d2
WHERE d1.score = d2.score AND d1.c#<>d2.c# GROUP BY d1.s#,d1.c#,d1.score;

--42����ѯÿ�Ź��ɼ���õ�ǰ���� 
SELECT *
FROM(SELECT * FROM st01
ORDER BY st01.score DESC) st
WHERE ROWNUM<=2;

SELECT *
FROM(SELECT * FROM st02
ORDER BY st02.score DESC) st
WHERE ROWNUM<=2;

SELECT *
FROM(SELECT * FROM st03
ORDER BY st03.score DESC) st
WHERE ROWNUM<=2;
--43��ͳ��ÿ�ſγ̵�ѧ��ѡ�������������˵Ŀγ̲�ͳ�ƣ���Ҫ������γ̺ź�ѡ����������ѯ����������������У���������ͬ�����γ̺��������� 

SELECT sc.c#,c.cname,COUNT(sc.c#)
FROM course c
JOIN sc sc ON(c.c#=sc.c#)
GROUP BY sc.c#,c.c#,c.cname ORDER BY COUNT(sc.c#),c.c#;


--44����������ѡ�����ſγ̵�ѧ��ѧ��
SELECT stu.s#,stu.sname
FROM student stu
JOIN sc ON(stu.s#=sc.s#) GROUP BY stu.s#,stu.sname
HAVING COUNT(1)>=2
ORDER BY stu.s#;

--45����ѯѡ����ȫ���γ̵�ѧ����Ϣ
DROP VIEW st01;
CREATE VIEW st01
AS SELECT stu.s#,stu.sname,sc.c#,sc.score
FROM student stu
JOIN sc ON(stu.s#=sc.s#)
WHERE sc.c#='01';
SELECT *
FROM st01;

DROP VIEW st02;
CREATE VIEW st02
AS SELECT stu.s#,stu.sname,sc.c#,sc.score
FROM student stu
JOIN sc ON(stu.s#=sc.s#)
WHERE sc.c#='02';
SELECT *
FROM st02;

DROP VIEW st03;
CREATE VIEW st03
AS SELECT stu.s#,stu.sname,sc.c#,sc.score
FROM student stu
JOIN sc ON(stu.s#=sc.s#)
WHERE sc.c#='03';
SELECT *
FROM st03;

SELECT *
FROM st01,st02,st03
WHERE st01.s#=st02.s# AND st02.s#=st03.s#;

--46����ѯ��ѧ��������
SELECT stu.sname ѧ������,stu.sage "��������",ROUND((SYSDATE - stu.sage)/365)AS ����
FROM student stu;

--47����ѯ���ܹ����յ�ѧ�� ��ɸѡ���£���ɸѡ���±��ܵ�
SELECT stu.*
FROM student stu
WHERE to_char(stu.sage,'MM')=to_char(SYSDATE,'MM')
AND to_char(stu.sage,'W')=to_char(SYSDATE,'W');

--48����ѯ���ܹ����յ�ѧ�� ��ɸѡ���£���ɸѡ������һ��
alter session set nls_date_language = 'american'
SELECT stu.*
FROM student stu
WHERE to_char(stu.sage,'MM')=to_char(SYSDATE,'MM')
AND to_char(stu.sage,'W')=to_char(next_day(SYSDATE,'SUNDAY'),'W');

--49����ѯ���¹����յ�ѧ��  ɸѡ����
SELECT stu.*
FROM student stu
WHERE to_char(stu.sage,'MM')=to_char(SYSDATE,'MM');

--50����ѯ���¹����յ�ѧ�� ��������һ���ϼ���1�������������
SELECT stu.*
FROM student stu
WHERE to_char(stu.sage,'MM') = to_char(add_months(SYSDATE,1),'MM');



