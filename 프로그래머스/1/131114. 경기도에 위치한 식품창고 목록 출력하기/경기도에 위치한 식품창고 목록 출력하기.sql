-- 코드를 입력하세요
SELECT WAREHOUSE_ID, 
WAREHOUSE_NAME, 
ADDRESS,
Coalesce (FREEZER_YN , 'N') FREEZER_YN

from FOOD_WAREHOUSE
where ADDRESS Like "%경기도%"
order by WAREHOUSE_ID;