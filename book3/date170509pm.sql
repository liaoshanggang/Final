Select decode��region_id��1,'ŷ��',2, '����',3,'����',4,'�ж��ͷ���',region_name��as ��������
From regions;


SELECT region_id,
CASE region_id 
WHEN 1 THEN 'ŷ��'
WHEN 2 THEN '����'
WHEN 3 THEN '����'
WHEN 4 THEN '�ж��ͷ���'
  ELSE region_name
END "��������"
FROM regions;
 

