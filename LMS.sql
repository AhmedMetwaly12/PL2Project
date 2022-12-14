create database LMS	

on primary(
name=plproject,
filename='C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\LMS.mdf',
size=5MB,
maxsize=unlimited,
filegrowth=5MB
)

log on(
name=plproject_log,
filename='C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\LMS_log.ldf',
size=5MB,
maxsize=unlimited,
filegrowth=5MB
)

/*1*/
create table student(
id int primary key,
[name] nvarchar(50),
email nvarchar(50),
[year] int check([year]<5),
course nvarchar(50)
)

/*2*/
create table teacher(
id int primary key,
[name] nvarchar(50),
email nvarchar(50)
)

/*3*/
create table course(
id int primary key,
[name] nvarchar(50),
tID int
CONSTRAINT teacherID_const foreign key(tID) references teacher(id)
)

/*4*/
create table assignment(
num int check(num<8) unique,
deadline nvarchar(50),
[type] nvarchar(50),
cID int, 
constraint courseid_const foreign key(cID) references course(id)
)

/*5*/
create table lecture(
num int unique,
[name] nvarchar(50),
cID int, 
constraint courseid1_const foreign key(cID) references course(id)
)

/*6*/
create table exam(
num int unique,
noOfQues int,
stdID int,
constraint studentid_const foreign key(stdID) references student(id),
cID int, 
constraint courseid2_const foreign key(cID) references course(id)
)

/*7*/
create table examScore(
stdID int,
constraint studentid1_const foreign key(stdID) references student(id),
cID int, 
constraint courseid3_const foreign key(cID) references course(id),
grade int primary key,
gradeInLetters nvarchar(50)
)







