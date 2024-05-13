-- 코드를 입력하세요
SELECT Count(USER_ID) USERS
from USER_INFO
where YEAR(joined) = 2021 And AGE>= 20 And AGE<=29