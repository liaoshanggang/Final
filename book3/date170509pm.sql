Select decode（region_id，1,'欧洲',2, '美洲',3,'亚洲',4,'中东和非洲',region_name）as 大洲名称
From regions;


SELECT region_id,
CASE region_id 
WHEN 1 THEN '欧洲'
WHEN 2 THEN '美洲'
WHEN 3 THEN '亚洲'
WHEN 4 THEN '中东和非洲'
  ELSE region_name
END "大洲名称"
FROM regions;
 

