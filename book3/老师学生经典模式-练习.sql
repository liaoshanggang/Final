
/*
表结构：
--1.学生表
Student(S#,Sname,Sage,Ssex) --S# 学生编号,Sname 学生姓名,Sage 出生年月,Ssex 学生性别
--2.课程表
Course(C#,Cname,T#) --C# --课程编号,Cname 课程名称,T# 教师编号
--3.教师表
Teacher(T#,Tname) --T# 教师编号,Tname 教师姓名
--4.成绩表
SC(S#,C#,score) --S# 学生编号,C# 课程编号,score 分数

select * from Student
select * from Course
select * from Teacher
select * from SC
*/
--准备工作：建表、新增测试数据
/*DROP TABLE Student;
create table Student(S# varchar2(10),Sname varchar2(10),Sage date,Ssex varchar2(10));
insert into Student values('01' , '赵雷' , to_date('1990-01-01','yyyy-mm-dd') , '男');
insert into Student values('02' , '钱电' , to_date('1990-12-21','yyyy-mm-dd') , '男');
insert into Student values('03' , '孙风' , to_date('1990-05-20','yyyy-mm-dd') , '男');
insert into Student values('04' , '李云' , to_date('1990-08-06','yyyy-mm-dd') , '男');
insert into Student values('05' , '周梅' , to_date('1991-12-01','yyyy-mm-dd') , '女');
insert into Student values('06' , '吴兰' , to_date('1992-03-01','yyyy-mm-dd') , '女');
insert into Student values('07' , '郑竹' , to_date('1989-07-01','yyyy-mm-dd') , '女');
insert into Student values('08' , '王菊' , to_date('1990-01-20','yyyy-mm-dd') , '女');

DROP TABLE Course;
create table Course(C# varchar2(10),Cname varchar2(10),T# varchar2(10));
insert into Course values('01' , '语文' , '02');
insert into Course values('02' , '数学' , '01');
insert into Course values('03' , '英语' , '03');

drop table teacher;
create table Teacher(T# varchar2(10),Tname varchar2(10));
insert into Teacher values('01' , '张三');
insert into Teacher values('02' , '李四');
insert into Teacher values('03' , '王五');

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

--习题go
select * from Student;
select * from Course;
select * from Teacher;
select * from SC;

--1、查询"01"课程比"02"课程成绩高的学生的信息及课程分数
SELECT s.*,sc1.score "课程'01'的分数",sc2.score "课程'02'的分数"
FROM student s,sc sc1,sc sc2
WHERE s.s# = sc1.s# AND s.s# = sc2.s# AND sc1.c#='01' AND sc2.c#='02'AND sc1.score>sc2.score;

--2、查询"01"课程比"02"课程成绩低的学生的信息及课程分数
SELECT s.*,sc1.score "课程'01'的分数",sc2.score "课程'02'的分数"
FROM student s,sc sc1,sc sc2
WHERE s.s#=sc1.s# AND s.s#=sc2.s# AND sc1.c#='01' AND sc2.c#='02'AND sc1.score<sc2.score;


--3、查询平均成绩大于等于60分的同学的学生编号和学生姓名和平均成绩
select sc.s# 学生编号,stu.sname 学生姓名,round(avg(sc.score),2) 平均成绩
from student stu
join sc sc on(stu.s#=sc.s#)
group by sc.s#,stu.sname having avg(sc.score)>=60;

--4、查询平均成绩小于分的同学的学生编号和学生姓名和平均成绩
select sc.s# 学生编号,stu.sname 学生姓名,round(avg(sc.score),2) 平均成绩
from student stu
join sc sc on(stu.s#=sc.s#)
group by sc.s#,stu.sname having avg(sc.score)<60;

--5、查询所有同学的学生编号、学生姓名、选课总数、所有课程的总成绩
select stu.s# 学生编号,stu.sname 学生姓名,count(sc.c#) 选课总数,sum(sc.score)所有课程的总成绩
from student stu
join sc sc on(stu.s#=sc.s#)
group by stu.s#,stu.sname
ORDER BY stu.s#;


--6、查询"李"姓老师的数量
SELECT COUNT(t.tname) "'李'姓老师的数量"
FROM teacher t
WHERE t.tname LIKE '%李%';



--7、查询学过"张三"老师授课的同学的信息
SELECT stu.*
FROM student stu JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#)
JOIN teacher t ON(t.t#=c.t#)
WHERE t.tname='张三';

--8、查询没学过"张三"老师授课的同学的信息 --??
SELECT stu.*
FROM student stu WHERE stu.s# NOT IN
(SELECT sc.s# FROM sc sc JOIN course c ON(sc.c#=c.c#)
JOIN teacher t ON(c.t#=t.t#) WHERE t.tname='张三');

--9、查询学过编号为"01"并且也学过编号为"02"的课程的同学的信息 --??
SELECT DISTINCT stu.*
FROM student stu JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#)
,(SELECT DISTINCT stu.*
FROM student stu JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#)
WHERE c.c# IN('02')) s2
WHERE c.c# IN('01')AND stu.s# = s2.s# ORDER BY stu.s#;

--10、查询学过编号为"01"但是没有学过编号为"02"的课程的同学的信息 --??
SELECT stu.*
FROM student stu
JOIN sc c ON(stu.s#=c.s#)
WHERE c.c# = '01' AND c.s# NOT IN(
SELECT c.s# FROM student stu
JOIN sc c ON(stu.s#=c.s#)
WHERE c.c# ='02');

--11、查询没有学全所有课程的同学的信息
--??? 还有没有选修的
SELECT stu.sname,stu.s#,stu.sage,stu.ssex
FROM student stu
LEFT OUTER JOIN sc sc ON(stu.s#=sc.s#)
GROUP BY stu.sname,stu.s#,stu.sage,stu.ssex HAVING COUNT(sc.s#)<3;

--12、查询至少有一门课与学号为"01"的同学所学相同的同学的信息 其实就是找到没有选修课的同学
--查找到学号为"01"的同学全部课程都学了。
SELECT sc.c#
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
WHERE sc.s#='01';

SELECT DISTINCT stu.*
FROM student stu
LEFT OUTER JOIN sc sc ON(stu.s#=sc.s#)
WHERE sc.c# IS NOT NULL AND sc.s# <> '01';

--13、查询和"01"号的同学学习的课程完全相同的其他同学的信息 
--其实就是查找全部课程学生的信息，除了它自己本身
SELECT stu.*
FROM student stu 
WHERE stu.s#<>'01'AND stu.s# IN(
SELECT st01.s#
FROM st01,st02,st03
WHERE st01.s#=st02.s# AND st02.s#=st03.s#);

--14、查询没学过"张三"老师讲授的任一门课程的学生姓名 --??先查询选修了该课的学生，筛选
SELECT student.*
FROM student WHERE student.s# NOT IN
(SELECT DISTINCT sc.s# FROM sc sc,course c,teacher t 
WHERE sc.c# = c.c# AND c.t# = t.t# AND t.tname = '张三'
);

--15、查询两门及其以上不及格课程的同学的学号，姓名及其平均成绩 --?? count(1)
SELECT stu.s# 学号,stu.sname 姓名,ROUND(AVG(sc.score),2) 平均成绩
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
WHERE stu.s# IN (SELECT sc.s# FROM sc sc WHERE sc.score<60 GROUP BY sc.s# HAVING COUNT(1) >=2)
GROUP BY stu.s#,stu.sname;

--16、检索"01"课程分数小于60，按分数降序排列的学生信息
SELECT stu.*,sc.c#,sc.score
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
WHERE sc.c#='01'AND sc.score<60 ORDER BY sc.score DESC;

--17、按平均成绩从高到低显示所有学生的所有课程的成绩以及平均成绩--???
SELECT stu.s# 学生编号,stu.sname 学生姓名,
MAX(CASE c.cname WHEN '语文' THEN sc.score ELSE NULL END) 语文,
MAX(CASE c.cname WHEN '数学' THEN sc.score ELSE NULL END) 数学,
MAX(CASE c.cname WHEN '英语' THEN sc.score ELSE NULL END) 英语,
CAST(AVG(sc.score)AS DECIMAL(18,2)) 平均分
FROM student stu
LEFT JOIN sc sc ON stu.s#=sc.s#
LEFT JOIN course c ON sc.c#=c.c#
GROUP BY stu.s#,stu.sname
ORDER BY 平均分 DESC;



SELECT sc.s#,AVG(sc.score)
FROM sc sc
GROUP BY sc.s#;

--18、查询各科成绩最高分、最低分和平均分：以如下形式显示： --???????????
--课程ID，课程name，最高分，最低分，平均分，及格率，中等率，优良率，优秀率
--及格为>=60，中等为：-80，优良为：-90，优秀为：>=90
select m.C# 课程编号, m.Cname 课程名称, 
  max(n.score) 最高分,
  min(n.score) 最低分,
  cast(avg(n.score) as decimal(18,2)) 平均分,
  cast((select count(1) from SC where C# = m.C# and score >= 60)*100.0 / (select count(1) from SC where C# = m.C#) as decimal(18,2)) 及格率,
  cast((select count(1) from SC where C# = m.C# and score >= 70 and score < 80 )*100.0 / (select count(1) from SC where C# = m.C#) as decimal(18,2)) 中等率,
  cast((select count(1) from SC where C# = m.C# and score >= 80 and score < 90 )*100.0 / (select count(1) from SC where C# = m.C#) as decimal(18,2)) 优良率,
  cast((select count(1) from SC where C# = m.C# and score >= 90)*100.0 / (select count(1) from SC where C# = m.C#) as decimal(18,2))优秀率
from Course m , SC n
where m.C# = n.C#
group by m.C# , m.Cname
order by m.C#;


--19、按各科成绩进行排序，并显示排名      ------------
SELECT sc.c#,sc.s#,stu.sname,sc.score,RANK() OVER(ORDER BY(sc.score) DESC)"名次"
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
WHERE sc.c# = '01';

SELECT sc.c#,sc.s#,stu.sname,sc.score,RANK() OVER(ORDER BY(sc.score) DESC)"名次"
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
WHERE sc.c# = '02';

SELECT sc.c#,sc.s#,stu.sname,sc.score,RANK() OVER(ORDER BY(sc.score) DESC)"名次"
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
WHERE sc.c# = '03';

--全部课程一起排
SELECT sc.c#,sc.s#,sc.score,RANK() OVER(ORDER BY(sc.score) DESC)"名次"
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
GROUP BY sc.c#,sc.s#,sc.score;

--20、查询学生的总成绩并进行排名
SELECT sc.s#,sum(sc.score),RANK() OVER(ORDER BY(SUM(sc.score)) DESC)"名次"
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
GROUP BY sc.s#;

--21、查询不同老师所教不同课程平均分从高到低显示
SELECT t.t# "教师编号",t.tname "教师",sc .c# "课程号", ROUND(AVG (sc.score),2) "平均分"
FROM teacher t,course c,sc sc
WHERE t.t# = c.t# AND c.c# = sc.c# GROUP BY t.t#,t.tname,sc.c#
ORDER BY avg(sc.score) DESC; 

--22、查询所有课程的成绩第2名到第3名的学生信息及该课程成绩 --??????????
select * from 
(select t.* , px = 
(select count(distinct score) from SC where C# = t.C# and score >= t.score) 
from sc t) 
m where px between 2 and 3 order by m.c# , m.px 


--23、统计各科成绩各分数段人数：课程编号,课程名称,[100-85],[85-70],[70-60],[0-60]及所占百分比 --??
select Course.C# 课程编号 , Cname as 课程名称 ,
  sum(case when score >= 85 then 1 else 0 end) "85-100",
  sum(case when score >= 70 and score < 85 then 1 else 0 end) "70-85",
  sum(case when score >= 60 and score < 70 then 1 else 0 end) "60-70",
  sum(case when score < 60 then 1 else 0 end) "0-60"
from sc , Course 
where SC.C# = Course.C# 
group by Course.C# , Course.Cname
order by Course.C#


--24、查询学生平均成绩及其名次
SELECT stu.s# 学号,stu.sname 姓名,ROUND(AVG(sc.score)) 平均成绩,rank() over(order by AVG(sc.score) desc)"名次" 
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
GROUP BY stu.s#,stu.sname;

--25、查询各科成绩前三名的记录
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

--26、查询每门课程被选修的学生数
SELECT sc.c#,COUNT(sc.c#)
FROM sc sc
GROUP BY sc.c#;


--27、查询出只有两门课程的全部学生的学号和姓名
SELECT stu.s#,stu.sname
FROM student stu
JOIN sc ON(stu.s#=sc.s#) GROUP BY stu.s#,stu.sname
HAVING COUNT(1) =2
ORDER BY stu.s#;


--28、查询男生、女生人数
SELECT SUM(DECODE(stu.ssex,'男',1,0))"男生人数",SUM(DECODE(stu.ssex,'女',1,0))"女生人数"
FROM student stu;


--29、查询名字中含有"风"字的学生信息
SELECT *
FROM student stu
WHERE stu.sname LIKE '%风%';

--30、查询同名同性学生名单，并统计同名人数
--测试同名
SELECT *
FROM student;
INSERT INTO student VALUES('09','李云',NULL,'男');
COMMIT;
--查询同名同性学生名单，并统计同名人数
SELECT count(stu1.sname) 同名人数
FROM student stu1,student stu2
WHERE stu1.s# != stu2.s# AND stu1.sname = stu2.sname;

DELETE student 
WHERE s#='09';
COMMIT;
SELECT *
FROM student;

--31、查询1990年出生的学生名单(注：Student表中Sage列的类型是datetime) 
SELECT *
FROM student stu
WHERE to_char(stu.sage,'yyyy')=1990;

--32、查询每门课程的平均成绩，结果按平均成绩降序排列，平均成绩相同时，按课程编号升序排列
SELECT sc.c#,c.cname,ROUND(AVG(sc.score),2) 平均成绩
FROM sc sc
JOIN course c ON(sc.c#=c.c#)
GROUP BY sc.c#,c.cname
ORDER BY AVG(sc.score) DESC,sc.c#;

--33、查询平均成绩大于等于85的所有学生的学号、姓名和平均成绩
SELECT stu.s# 学号,stu.sname 姓名,ROUND(AVG(sc.score),2) 平均成绩
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
GROUP BY stu.s#,stu.sname
HAVING AVG(sc.score)>=85
ORDER BY stu.s#;

--34、查询课程名称为"数学"，且分数低于60的学生姓名和分数
SELECT stu.sname,sc.score
FROM student stu 
JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#)
WHERE c.cname='数学'AND sc.score<60;


--35、查询所有学生的课程及分数情况；
SELECT stu.sname,c.cname,sc.score
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#);

--36、查询任何一门课程成绩在70分以上的姓名、课程名称和分数；
SELECT stu.sname,c.cname,sc.score
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#)
WHERE sc.score>70;

--37、查询不及格的课程
SELECT DISTINCT c.cname 不及格课程有
FROM course c JOIN sc ON(c.c#=sc.c#)
WHERE sc.score<60;


--38、查询课程'01'编号为且课程成绩在80分以上的学生的学号和姓名；stu.s#,stu.sname sc.c#='01' AND
SELECT stu.*,c.c#,c.cname,sc.score
FROM student stu
JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#)
WHERE  sc.score>=80 AND sc.c#='01';

--39、求每门课程的学生人数
SELECT sc.c#,c.cname,count(sc.s#) 学生人数
FROM sc sc
JOIN course c ON(sc.c#=c.c#)
GROUP BY sc.c#,c.cname;

--40、查询选修"张三"老师所授课程的学生中，成绩最高的学生信息及其成绩
DROP VIEW view40;
CREATE VIEW view40 
AS SELECT stu.s#,c.c#,sc.score
FROM student stu 
JOIN sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#)
JOIN teacher t ON(c.t#=t.t#)
WHERE t.tname LIKE'张三'
ORDER BY sc.score DESC;

SELECT *
FROM view40 v40
WHERE ROWNUM <= 1;

--41、查询不同课程成绩相同的学生的学生编号、课程编号、学生成绩,d2.s# 学生号,d2.c# 课程,d2.score 分数 
DROP VIEW differ;
CREATE VIEW differ
AS SELECT stu.s#,c.c#,sc.score
FROM student stu JOIN sc sc ON(stu.s#=sc.s#)
JOIN course c ON(sc.c#=c.c#);

SELECT d1.s# 学生号,d1.c# 课程,d1.score 分数 FROM differ d1,differ d2
WHERE d1.score = d2.score AND d1.c#<>d2.c# GROUP BY d1.s#,d1.c#,d1.score;

--42、查询每门功成绩最好的前两名 
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
--43、统计每门课程的学生选修人数（超过人的课程才统计）。要求输出课程号和选修人数，查询结果按人数降序排列，若人数相同，按课程号升序排列 

SELECT sc.c#,c.cname,COUNT(sc.c#)
FROM course c
JOIN sc sc ON(c.c#=sc.c#)
GROUP BY sc.c#,c.c#,c.cname ORDER BY COUNT(sc.c#),c.c#;


--44、检索至少选修两门课程的学生学号
SELECT stu.s#,stu.sname
FROM student stu
JOIN sc ON(stu.s#=sc.s#) GROUP BY stu.s#,stu.sname
HAVING COUNT(1)>=2
ORDER BY stu.s#;

--45、查询选修了全部课程的学生信息
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

--46、查询各学生的年龄
SELECT stu.sname 学生姓名,stu.sage "出生日期",ROUND((SYSDATE - stu.sage)/365)AS 年龄
FROM student stu;

--47、查询本周过生日的学生 先筛选本月，再筛选本月本周的
SELECT stu.*
FROM student stu
WHERE to_char(stu.sage,'MM')=to_char(SYSDATE,'MM')
AND to_char(stu.sage,'W')=to_char(SYSDATE,'W');

--48、查询下周过生日的学生 先筛选本月，再筛选本月下一周
alter session set nls_date_language = 'american'
SELECT stu.*
FROM student stu
WHERE to_char(stu.sage,'MM')=to_char(SYSDATE,'MM')
AND to_char(stu.sage,'W')=to_char(next_day(SYSDATE,'SUNDAY'),'W');

--49、查询本月过生日的学生  筛选本月
SELECT stu.*
FROM student stu
WHERE to_char(stu.sage,'MM')=to_char(SYSDATE,'MM');

--50、查询下月过生日的学生 就是在上一题上加上1个日历后的日期
SELECT stu.*
FROM student stu
WHERE to_char(stu.sage,'MM') = to_char(add_months(SYSDATE,1),'MM');



