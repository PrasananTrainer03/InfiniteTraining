select empno,ename,job,sal from Emp;

-- If Job is CLERK put Head as 'John'
-- if job is SALESMAN put HEAD as 'Harish'
-- if Job is ANALYST put Head as 'Lavanya'
-- if job is MANAGER put head as 'Malissa'
-- if job is PRESIDENT put as 'No Manager' 

select empno,ename,job,sal,
CASE JOB
    WHEN 'CLERK' THEN 'John'
    WHEN 'SALESMAN' THEN 'Harish'
    WHEN 'ANALYST' THEN 'Lavanya'
    WHEN 'MANAGER' THEN 'Malissa'
    WHEN 'PRESIDENT' THEN 'No Manager'
    ELSE 'Invalid Value'
END 'Head'
from Emp;

select * from Dept;

-- if Dname is 'ACCOUNTING' THEN 'PUNE' 
-- if Dname is 'RESEARCH' THEN 'HYDERABAD'
-- if Dname is 'SALES' THEN 'CHENNAI'
-- if Dname is 'OPERATIONS' then 'DELHI' 

select
   Deptno, Dname,Loc,
   CASE Dname
	WHEN 'ACCOUNTING' THEN 'PUNE'
    WHEN 'RESEARCH' THEN 'HYDERABAD'
    WHEN 'SALES' THEN 'CHENNAI'
    WHEN 'OPERATIONS' THEN 'DELHI'
   END 'CITY'
from Dept;

SELECT * FROM EMP;

SELECT EMPNO,ENAME,JOB,SAL,COMM FROM EMP;

SELECT EMPNO,ENAME,JOB,SAL,COMM,
CASE
  WHEN COMM IS NULL THEN 0  else comm
END comm
FROM EMP;

-- Dispaly values as if comm is null then sal else sal+comm as 'TakeHome'

select 
    empno, ename, job, sal,comm,
    case 
		WHEN comm is NULL THEN SAL 
        else SAL+COMM
    end 'Take Home'
from Emp;

