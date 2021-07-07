-- aggregate functions 

-- sum() : Used to perform sum operation on the given tables 

select sum(sal) from emp;

-- avg() : Used to display avg value on numeric column

select avg(sal) from Emp;

-- max(): Used to display max value on the numeric column

select max(sal) from Emp;

-- min() : Used to display the min value on the numeric column

select min(sal) from Emp;

-- count(*) : Used to display total no.of records of the given table 

select count(*) from EMp;

-- count(column_name) : Total no.of not null columns specified

select count(comm) from Emp;

