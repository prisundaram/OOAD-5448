# GRADUATE PRESENTATION

### NAME: PRIYANKA SUNDARAM
### SID: 109265722

This code is developed for demonstration of Hibernate CRUD operations.

### Prerequisites

Eclipse - Java EE preferred with all required Hibernate jar files, Java 1.8, MySQL workbench.

### To run the code

1. Create a database in MySQL and provide its name in the hibernate.cfg.xml file after localhost:3306.
2. Change the username and password for the database in the hibernate.cfg.xml file to the corresponding username and password of the database.
3. Run the EmployeeMain.java class with insertInfo() method.
4. Try using the other methods in main class one by one to see how the CRUD operations are done with hibernate.

### Code Overview

The hibernate.cfg.xml is the hibernate configuration file which connects to the database. The employee.hbm.xml file provides a mapping between the POJO class and the database table. The EmployeePOJO class consists of the objects which correspond to fields in the database. The main class, EmployeeMain.java consists of functions which help us to create table, insert data into it, update the existing data and also to delete the records in the table. 
