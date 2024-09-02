create database company;
use company;
drop database company; 

create table employee(
id int primary key auto_increment,
Name varchar(20), 
Dob date, 
Mob1 varchar(10), 
Email varchar(20),
AdharNo varchar(20), 
PanNo varchar(20));

drop table employee;


  create table contactdetails( 
  id int primary key auto_increment,
  eid int references employee(id),
  Mob2 varchar(10),
  email varchar(30));
  
  drop table contactdetails;
  
  create table communicationdetails(
  id int primary key auto_increment,
  eid int references employee(id),
  Address1 varchar(30), 
  Address2 varchar(30));
  
  create table registrationdetails(
  id int primary key auto_increment,
  eid int references department(id),
  Dateofjoining date, 
  Dpartment varchar(20), 
  Post varchar(20));
  drop table registrationdetails;
  create table department(
  id int primary key auto_increment,
  departmentname varchar(20),
  location varchar(20));
  
  create table payroll(
  id int primary key auto_increment,
  eid int references employee(id),
  post varchar(20), 
  salary int);
  
  insert into employee values(null, 'omkar', '2003.4.3','07', 'omkar@gmail.com', '12334', '2345');
  insert into contactdetails values(null,null,'2330088', 'omkar@23gmail.com');
  insert into communicationdetails values(null,1,'uttur','ambav');
  insert into registrationdetails values (null,1,'2024.04.20','sales','manager');
  insert into department values(null,'sales','pune');
  insert into payroll values(null,1,'manager', '40000');
  
  select * from employee;
  select * from contactdetails;
  
  
 select * from employee as e join contactdetails c on e.id=c.eid;
 select * from employee as e join payroll p on e.id=p.eid;
 select * from employee as e join communicationdetails cm on e.id=cm.eid;
 select * from employee as e join registrationdetails r on e.id=r.eid;
  select * from department as d join  registrationdetails  rg on d.id=rg.eid;


 

