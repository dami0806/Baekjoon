-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME ,
Case
when (SEX_UPON_INTAKE Like "%Neutered%" OR SEX_UPON_INTAKE Like "%Spayed%")
then "O"
else "X"
End "중성화"
From ANIMAL_INS