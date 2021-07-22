drop database if exists library;

create database library;

use library;

CREATE TABLE Books(
	Id INT primary key,
	Name varchar(50) NULL,
	Author varchar(50) NULL,
	Edition varchar(50) NULL,
	Dept varchar(20) NULL,
	TotalBooks INT NULL
);

CREATE TABLE LibUsers (
	Username varchar(50) primary key,
	Password varchar(50) NOT NULL
);

CREATE TABLE TranBook(
	Username varchar(50) NULL,
	BookId INT NULL,
	Fromdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE TransReturn(
	Username varchar(50) NOT NULL,
	BookId INT NOT NULL,
	Fromdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	Todate date
);


INSERT into Books VALUES (1, 'Problem Solving in C', 'Elliot Koffman', '4th Edition', 'C/C++', 5);
INSERT into Books VALUES (3, 'C++ from Scratch', 'Jesse Liberty', '2nd Edition', 'C/C++', 5);
INSERT into Books VALUES (4, 'Design using C#', 'Diane Zak', '4th Edition', '.NET', 1);
INSERT into Books VALUES (5, 'Progamming with C#.NET', 'Ted Coombs', '2nd Revised Edition', '.NET', 5);
INSERT into Books VALUES (6, 'The C Programming','Brian Kernighan','1st Basic Edition','C/C++', 0);
INSERT into Books VALUES (7, 'JavaBeans','John Osborn','1st Edition', 'JAVA', 4);
INSERT into Books VALUES (8,'Java Network Programming','O.Reilly','3rd Edition','JAVA', 4);
INSERT into Books VALUES (9,'Java I/O','Frank Yellin','2nd Basic Edition', 'JAVA', 5);
INSERT into Books VALUES (10,'Basics of JAVA','Elliot Koffman','4th Edition','JAVA', 8);
INSERT into Books VALUES (11,'The Java AWT Reference','John Zukowski','4th Edition','JAVA', 1);
INSERT into Books VALUES (12,'Basics of C','Dennis Ritchie','3rd revised Edition','C/C++', 6);
INSERT into Books VALUES (13,'Basics of C++','BalaGurusamy','1st Basic Edition','C/C++', 6);
INSERT into Books VALUES (14,'JavaScript Goodies','Joe Burns','2nd Edition', 'Other PL', 4);

Insert into LibUsers values('Lavanya','Sidharthan');
Insert into LibUsers values('Naresh','Suvvada');
Insert into LibUsers values('Deepthi','Kakara');
Insert into LibUsers values('Sravani','Gorle');
Insert into LibUsers values('Sunil','Kumar');