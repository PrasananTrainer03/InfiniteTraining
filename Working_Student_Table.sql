use practice;

drop table if exists student;

create table student
(
   sno int,
   name varchar(30),
   sub1 int,
   sub2 int,
   sub3 int,
   total int,
   aveg numeric(9,2)
);

INSERT INTO Student(sno,name,sub1,sub2,sub3)
values(1,'Ambika',77,74,88),
	  (2,'Hari Krishna',89,78,76),
      (3,'Karthik M',90,78,57),
      (4,'Sai Kumar',91,78,56),
      (5,'Pavan',90,78,87);
      
select * from Student;

UPDATE Student SET TOTAL=Sub1+Sub2+Sub3,
		AVEG=(Sub1+Sub2+Sub3)/3;

select * from student;