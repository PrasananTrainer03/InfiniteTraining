DROP DATABASE IF EXISTS PRACTICE;

CREATE DATABASE PRACTICE;

USE PRACTICE;

CREATE TABLE EMPLOY
(
   Empno INT,
   Name varchar(30) NOT NULL,
   Gender ENUM('MALE','FEMALE'),
   Dept varchar(30),
   Desig varchar(30),
   Basic numeric(9,2),
   primary key(empno)
);

INSERT INTO EMPLOY(Empno,Name,Gender,Dept,Desig,Basic)
VALUES(1,'Ashish','MALE','Java','Programmer',88345),
	   (2,'Deeepthi','FEMALE','SQL','Programmer',88255),
	   (3,'Malissa','FEMALE','JAVA','Expert',88245),
       (4,'Karthik','MALE','SQL','DBA',99222),
       (5,'Sai Kumar','MALE','JAVA','Programmer',92111);

select * from Employ;