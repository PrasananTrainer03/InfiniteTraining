drop database if exists exam;
create database exam;

use exam;

drop table if Exists Agent;

Create Table Agent
(
  AgentID INT AUTO_INCREMENT primary key,
  Name varchar(30),
  City varchar(30),
  GENDER ENUM('MALE','FEMALE'),
  MaritalStatus INT,
  Premium Double
);

Insert into Agent(Name,City,Gender,
MaritalStatus,Premium) values('Aman',
'Delhi','Male',0,56654.44),
('Sougata','Kolkata','Male',1,56643.33),
('Sarbani','Kolkata','Female',0,66433.55),
('Chandana','Hyderabad','Female',0,66334.44)