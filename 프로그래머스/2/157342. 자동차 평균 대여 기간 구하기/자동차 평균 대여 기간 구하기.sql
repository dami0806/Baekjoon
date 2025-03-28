-- 코드를 입력하세요
SELECT DISTINCT CAR_ID,
Round(Avg(DATEDIFF(END_DATE,START_DATE))+1,1) as AVERAGE_DURATION
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
group by CAR_ID
Having AVERAGE_DURATION >= 7
ORDER BY AVERAGE_DURATION DESC, CAR_ID DESC;