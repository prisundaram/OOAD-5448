# GRADUATE PRESENTATION

### NAME: PRIYANKA SUNDARAM
### SID: 109265722

This code is developed for demonstration of Hibernate versioning.

### Prerequisites

Eclipse - Java EE preferred with all required Hibernate jar files, Java 1.8, MySQL workbench.

### To run the code

1. Create a database in MySQL and provide its name in the hibernate.cfg.xml file after localhost:3306.
2. Change the username and password for the database in the hibernate.cfg.xml file to the corresponding username and password of the database.
3. Create a table employee_info with fields id int primary key, ename varchar, email varchar, phone varchar, address varchar
4. Run the EmpMain.java class with updateInfo() method.

### Code Overview

The hibernate.cfg.xml is the hibernate configuration file which connects to the database. The employee.hbm.xml file provides a mapping between the POJO class and the database table. The EmpPOJO class consists of the objects which correspond to fields in the database. The database already consists of the employee table with all the fields specified in the POJO class except for the version. In the main class, the update code is written and whenever the update is done, the version number is incremented by 1. This is a very useful method when simultaneous users are working on the same object because, only the first change is saved.
