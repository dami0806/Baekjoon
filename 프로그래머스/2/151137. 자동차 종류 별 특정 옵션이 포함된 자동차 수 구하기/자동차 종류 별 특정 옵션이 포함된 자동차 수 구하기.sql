-- 코드를 입력하세요
SELECT CAR_TYPE, Count(1) CARS
From CAR_RENTAL_COMPANY_CAR
Where OPTIONS Like '%열선시트%' or
        OPTIONS LIKE '%통풍시트%'or
        OPTIONS LIKE '%가죽시트%'
group by Car_TYPE
order by Car_TYPE