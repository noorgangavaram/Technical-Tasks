create table Emp_Details(Emp_ID int, name varchar(30), salary money )

insert into Emp_Details values(1001,'A',57000)
insert into Emp_Details values(1002,'B',85000)
insert into Emp_Details values(1003,'C',96000)
insert into Emp_Details values(1004,'D',95000)
insert into Emp_Details values(1005,'E',98000)
insert into Emp_Details values(1006,'F',84000)
insert into Emp_Details values(1007,'G',83000)

select * from Emp_Details


CREATE table salary1(Department varchar(30), age int , emp_id int)

insert into salary1 values('HR',32,1001)
insert into salary1 values('IT',36,1003)
insert into salary1 values('Admin',38,1004)
insert into salary1 values('Sales',24,1005)
insert into salary1 values('Marketing',26,1002)
insert into salary1 values('Manager',33,1009)
insert into salary1 values('salesforce',36,1008)
insert into salary1 values('data',38,1010)
insert into salary1 values('HR',32,1234)

Select * from salary1

---------------- INNER JOIN ----------------
select Emp_Details.*,salary1.*
from Emp_Details
Inner join salary1
On Emp_Details.Emp_ID = salary1.emp_id

---------------- LEFT JOIN -----------------
--- Matching records from both the tables + remining records from Left table

select Emp_Details.*,salary1.*
from Emp_Details
Left join salary1
On Emp_Details.Emp_ID = salary1.emp_id

---------------- RIGHT JOIN ----------------
select Emp_Details.*,salary1.*
from Emp_Details
Right join salary1
On Emp_Details.Emp_ID = salary1.emp_id


-------------- Full Outter Join ---------------------
--Matching records from both the tables + remining records from Right table
SELECT Emp_Details.*,salary1.*
From Emp_Details
Full Join salary1
On Emp_Details.Emp_ID = salary1.emp_id

-------------- Cross join ----------------------

Select Emp_Details.*,salary1.*
from Emp_Details
Cross join
salary1

-------------------------------------------------------------------------------------------------------------------------------------
Begin Transaction
Rollback transaction
--------------------------------------------------------------------------------------------------------------------------------------

----------------------Rename the column name -----------------

Exec sp_rename 'salary1.age','AGE'

----------------------- Duplicate records -----

Select Department,count(*) as appears from salary1
Group By Department
Having count(*)>1


----------------------- First 5 records -------------
select top(5) Department from salary1 

---------------------- Last 5 records
select * from Emp_Details

Select top 3 * from Emp_Details order by Emp_ID desc


---------------------------OPERATORS -----------------------

create table employee1(e_id int Not null,e_name varchar(20),e_salary int,e_age int,e_gender varchar(20),e_dept varchar(20),primary key (e_id))
insert into employee1 values(1,'Noor',35000,21,'Male','computers')
insert into employee1 values(2,'Mahin',45000,22,'Male','developer')
insert into employee1 values(3,'Iyan',56000,23,'Male','Tester')
insert into employee1 values(4,'Jabir',75000,29,'Male','Network')
insert into employee1 values(5,'gouse',25000,20,'Male','Hr')
insert into employee1 values(6,'Shereen',30000,18,'Female',Null)
insert into employee1 values(7,'mahamood',2300,21,'Female','developer')


select distinct e_gender from employee1       
select * from employee1 where e_age < 23
select * from employee1 where e_salary >50000
select * from employee1 where e_age<23 AND e_dept='developer'
select * from employee1 where e_age<23 or e_dept='developer'
select * from employee1 where NOT e_dept='developer'
select * from employee1 where e_name LIKE 'j%'       
select * from employee1 where e_age BETWEEN 20 and 23
select * from employee1 where e_salary BETWEEN 20000 and 30000

 
