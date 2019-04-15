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
4. Run the EmployeeMain.java class.

### Code Overview

The hibernate.cfg.xml is the hibernate configuration file which connects to the database. The employee.hbm.xml is not used here since we use annotations provided by hibernate. The EmpPOJO class consists of the objects which correspond to fields in the database. The database already consists of the employee table with all the fields specified in the POJO class. In the main class, the insert code is written and the persistence life cycle is tested here. There is one record which is inserted into the table. If the session.save(ep) line is not written in the Main class, the object ep is in transcient state. If the line is written after the setter methods, the object enters the persistent state. This means that hibernate can track the object. So, even after the session.save(ep) line, if any of the data record is updated, then the new updated variable will be stored in the table. After the session is closed, the object enters the detached state. So, any update after session.close() line will not be reflected in the table. 
 
