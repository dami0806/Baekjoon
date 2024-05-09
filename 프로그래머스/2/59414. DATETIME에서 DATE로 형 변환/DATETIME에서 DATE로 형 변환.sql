-- 코드를 입력하세요
SELECT ANIMAL_ID ,NAME, Date_Format(DATETIME, '%Y-%m-%d' ) as '날짜'
From ANIMAL_INS
order by 1