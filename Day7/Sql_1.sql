use infinite;

-- Display all tables available in the current database

show tables;

-- Display the information about Emp table 

DESC Emp;

-- Display all records from Emp table 

SELECT * from Emp;

-- Display Empno, Ename, job, sal from Emp table 

select 
   Empno, Ename, Job, Sal
FROM Emp;

-- Where clause : Used to filter the given records 

-- Display all records whose sal > 2000 

select * from Emp where sal > 2000;

-- Display all records whose Job is 'MANAGER' 

select * from Emp where job='MANAGER';

-- Display information whose Ename is 'KING'

select * from Emp where Ename='KING';

-- Display information whose Ename is 'FORD' 

select * from Emp Where Ename='FORD';

-- BETWEEN...AND : Only used for numerics and date-time fields. 

-- Display all records whose sal between 1000 and 3000 

select * from Emp 
Where Sal BETWEEN 1000 and 3000;

-- Display all records whose sal not between 1000 and 3000 

select * from Emp 
where SAL NOT BETWEEN 1000 and 3000;

-- IN Clause : used to check for multiple values of specified column

-- Display all records whose job is CLERK or SALESMAN or ANALYST 

select * from Emp 
where job in('CLERK','SALESMAN','ANALYST');

-- Display information whose Ename is SMITH or WARD or KING or MILLER or FORD 

select * from Emp 
where ENAME IN('SMITH','WARD','MILLER','FORD');

select * from Emp 
where ENAME NOT IN('SMITH','WARD','MILLER','FORD');

-- How to check for NULL constraint 

-- Display all records for whom comm is NULL 

select * from Emp
where comm is NULL;

-- Dispaly all records whose comm is NOT NULL

select * from Emp 
where COMM IS NOT NULL;

-- LIKE Operator : Used to display records w.r.t. Wildcards 

-- Display all records whose name starts with 'S' 

select * from emp where ename like 'S%';

-- Display all records whose Name ends with 'S' 

select * from Emp where ename like '%S';

-- Dispaly all records whose names starts with 'J' and 5th char is 'S' 

select * from Emp where ename like 'J___S';

-- Order By : Used to display data w.r.t. Specific field(s) in ascending or descending order 

select Empno, Ename, Job, Sal, Hiredate from Emp 
order by Sal;

select Empno, Ename, Job, Sal, Hiredate from Emp 
order by Ename;

select Empno, Ename, Job, Sal, Hiredate from Emp 
order by Job, Ename;

select Empno, Ename, Job, Sal, Hiredate from Emp 
order by Job, Ename DESC;

