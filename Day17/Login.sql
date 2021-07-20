use practice;

drop table if exists users;

create table users
(
    userName varchar(30) Primary Key,
    passCode varchar(30) NOT NULL
);

INSERT INTO USERS values('Deepthi','Kakara'),
('Ashish','Baratam'),('Sai','Kumar'),('Rahul','Sasumana');

select * from users;