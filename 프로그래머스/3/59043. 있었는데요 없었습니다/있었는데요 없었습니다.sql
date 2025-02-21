-- 코드를 입력하세요
SELECT o.ANIMAL_ID, o.NAME
FROM ANIMAL_OUTS o
inner join ANIMAL_INS i
on i.ANIMAL_ID = o.ANIMAL_ID
where o.DATETIME<i.DATETIME
order by i.DATETIME 

# out: 입양일
# in: 보호 시작
# 보호 시작일보다 입양일이 더 빠른 동물: in의 날짜가크다 out