-- 코드를 입력하세요
SELECT i.NAME, i.DATETIME
FROM ANIMAL_INS i
Left join ANIMAL_OUTS o
on o.ANIMAL_ID = i.ANIMAL_ID
where o.ANIMAL_ID IS NULL
order by i.DATETIME
LIMIT 3;
-- out에 없는 동물중 DATETIME이 가장 작은 순 limit 3