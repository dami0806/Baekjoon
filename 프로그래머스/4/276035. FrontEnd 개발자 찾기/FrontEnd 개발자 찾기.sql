# -- 코드를 작성해주세요
SELECT DISTINCT d.ID,	d.EMAIL,	d.FIRST_NAME,	d.LAST_NAME
FROM DEVELOPERS d

inner join SKILLCODES s on
# d.SKILL_CODE = s.CODE
 (d.SKILL_CODE & s.CODE) > 0  -- 비트 연산으로 스킬 포함 여부 확인

WHERE s.CATEGORY = 'Front End'

order by ID;
