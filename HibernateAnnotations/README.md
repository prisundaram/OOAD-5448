# GRADUATE PRESENTATION

### NAME: PRIYANKA SUNDARAM
### SID: 109265722

This code is developed for demonstration of Hibernate Annotations.

### Prerequisites

Eclipse - Java EE preferred with all required Hibernate jar files, Java 1.8, MySQL workbench.

### To run the code

1. Create a database in MySQL and provide its name in the hibernate.cfg.xml file after localhost:3306.
2. Change the username and password for the database in the hibernate.cfg.xml file to the corresponding username and password of the database.
3. Create a table employee_info with fields id int primary key, ename varchar, email varchar, phone varchar, address varchar
4. Run the EmployeeMain.java class.

### Code Overview

The hibernate.cfg.xml is the hibernate configuration file which connects to the database. The employee.hbm.xml file is not present. Instead, we make use of the Hibernate Annotations like @Entity, @Id, @Column to map the objects directly to the fields in the table. The PojoAnnotations class consists of the objects which correspond to fields in the database with all annotations specified. The main class, EmployeeMain.java consists of functions which help us to insert data into an existing table and the data is inserted without a mapping file. 

