Drop Table EMp

Create Table Emp
(
    Empno int AUTO_INCREMENT,
    Name varchar(50), 
    Dept varchar(30),
    Desig varchar(30),
    Basic INT,
    primary key(Empno)
)



Insert into Emp(Name,Dept,Desig,Basic) values
('kiran kumar kailasam','java','developer',42233),
('Vishnu Vardhan Reddy','dotnet','programmer',42133),
('Ram Kishan','java','developer',82233),
('Kareem','dotnet','programmer',52234),
('Sheik Sulthan Mohammad','dotnet','developer',42555),
('Vaibhav Singh','java','Manager',82552),
('Rashmi Jadhav','Sql','DBA',42345),
('Vishnu Priya','Sql','Expert',56662)

select * from Emp 

drop table LeavedETAILS

use sqlpractice

Create Table lEAVEdETAILS
(
   LeavID INT AUTO_INCREMENT,
   Empno INT REFERENCES Emp(Empno), 
   pRIMARY KEY(lEAViD),
   lAVAIL INT,LTAKEN INT
)

INSERT INTO lEAVEDETAILS(EMPNO,LAVAIL,LTAKEN)
VALUES(1,2,3),
	   (3,2,3),
	  (4,3,3),
      (5,2,2),
      (1,3,2),
      (3,3,0),
      (4,3,5) 
      
SELECT * FROM LEAVEDETAILS
   
)
   LTaken INT,
   LAvail INT,
   LOP INT,
   Primary Key(LeavID)
)


select distinct dept from Emp

