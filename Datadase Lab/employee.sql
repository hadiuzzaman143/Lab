USE employee_db;
CREATE TABLE `employee` 
(
  `EMPLOYEE_ID` int(6) NOT NULL,
  `LAST_NAME` varchar(25) NOT NULL,
  `JOB_ID` varchar(10) NOT NULL,
  `SALARY` int(10) NOT NULL,
  `COMM_PCT` varchar(6) NOT NULL,
  `MGR_ID` int(6) NOT NULL,
  `DEPARTMENT_ID` int(4) NOT NULL
);

-- Dumping data for table `employee`

INSERT INTO `employee` (`EMPLOYEE_ID`, `LAST_NAME`, `JOB_ID`, `SALARY`, `COMM_PCT`, `MGR_ID`, `DEPARTMENT_ID`) 
VALUES
(198,'Connell','SH_CLERK',2600,2.5,124,50),
(199,'Grant','SH_CLERK',2600,2.2,124,50),
(200,'Whalen','AD_ASST',4400,1.3,101,10),
(201,'Hartstein','IT_PROG',6000,null,100,20),
(202,'Fay','AC_MGR',6500,null,210,20),
(203,'Mavris','AD_VP',7500,null,101,40),
(204,'Baer','AD_PRES',3500,1.5,101,90),
(205,'Higgins','AC_MGR',2300,null,101,60),
(206,'Gitz','IT_PROG',5000,null,103,60),
(100,'King','AD_ASST',8956,0.3,108,100),
(101,'Kochar','SH_CLERK',3400,1.3,118,30);

-- select specific multiple columns
select last_name,job_Id,employee_id from employee;

-- select specific columns by order
select * from employee where DEPARTMENT_ID = 60;

-- select specific columns by order
select * from employee where LAST_NAME = 'King';

-- select specific column with diffrent values
select distinct JOB_ID from employee;

-- select specific values by order
select LAST_NAME,SALARY + 300 as 'Increased_Salary' from employee;

-- select specific column
select COMM_PCT from employee;

-- select specific columns by order
select EMPLOYEE_ID, DEPARTMENT_ID , SALARY from employee where SALARY >5000; 

-- select specific columns by order in between range
select LAST_NAME, SALARY from employee where SALARY between 4000 and 7000; 

-- select specific columns by conditions
select * from employee where SALARY =6000 or SALARY=6500 or SALARY=7000;

-- select columns by order
select * from employee where DEPARTMENT_ID=10 or DEPARTMENT_ID=20 or DEPARTMENT_ID=30 or DEPARTMENT_ID=50;

-- select columns by order
select * from employee where SALARY != 5000;

-- select columns by order
select * from employee where JOB_ID = 'SH_CLERK';

-- update values by condition
update employee set JOB_ID = 'Grade_A' where SALARY >= 5000;

-- select columns by order
select * from employee where JOB_ID ='SH_CLERK' or JOB_ID='IT_PROG' or JOB_ID='AD_ASST';

-- select columns by order
select * from employee where JOB_ID ='SH_CLERK' and SALARY<3000;

-- select specific values by order
select last_name,MGR_ID from employee where SALARY>3000 and MGR_ID=101;