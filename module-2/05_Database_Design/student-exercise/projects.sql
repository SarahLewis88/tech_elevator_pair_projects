drop table if exists project_employee;
drop table if exists project;
drop table if exists department;
drop table if exists employee;

CREATE TABLE employee
(
        emp_num serial,
        job_title varchar(32) not null,
        last_name varchar(16) not null,
        first_name varchar(16) not null,
        gender varchar(8) not null,
        date_of_birth date not null,
        date_of_hire date not null,
        emp_dept int not null,
        
        CONSTRAINT pk_employee PRIMARY KEY (emp_num)
);
CREATE TABLE department
(
        dept_num serial,
        dept_name varchar(32) not null,
        num_of_emp int not null,
        
        CONSTRAINT pk_department PRIMARY KEY (dept_num)
        --CONSTRAINT fk_department_employee FOREIGN KEY (dept_num) REFERENCES employee(emp_dept)       
);  
CREATE TABLE project
(
        proj_num serial,
        proj_name varchar(64) not null,
        start_date date not null,
        num_of_emp int not null,
        
       CONSTRAINT pk_project PRIMARY KEY (proj_num)
       --CONSTRAINT fk_project_project_employee FOREIGN KEY (proj_num) REFERENCES project_employee(proj_num) 
);
CREATE TABLE project_employee
(
        proj_num int not null,
        emp_num int not null,
        CONSTRAINT pk_project_employee PRIMARY KEY (emp_num, proj_num)

        --CONSTRAINT fk_project_employee_employee FOREIGN KEY (emp_num) REFERENCES employee(emp_num)
        --CONSTRAINT fk_project_employee_project FOREIGN KEY (proj_num) REFERENCES employee(proj_num)       
);
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, emp_dept) VALUES
        ('Casheir', 'Mullins', 'Debra', 'Female', '12.29.1956', '08.12.1998', 1),
        ('Manager', 'Dixon', 'Shane', 'Male', '05.14.1982', '02.17.2004', 1),
        ('Sales Associate', 'Bigby', 'Brad', 'Male', '05.02.1988', '06.19.2010', 3),
        ('Sales Associate', 'Miller', 'Stewart', 'Male', '10.02.1999', '06.20.2016', 2),
        ('Sales Associate', 'Cole', 'David', 'Male', '02.02.1967', '01.14.2017', 1),
        ('Casheir', 'Lewis', 'Sam', 'Male', '11.20.1990', '9.18.2019', 3),
        ('Sales Associate', 'Bradford', 'Amy', 'Female', '09.24.1992', '11.16.2019', 3),
        ('Assistant Manager', 'Reynolds', 'Sharon', 'Female', '10.17.1979', '11.22.2020', 2);
        
INSERT INTO department (dept_name, num_of_emp) VALUES
        ('Lawn and Garden', 3),
        ('Seasonal', 2),
        ('Toys', 3);
        
INSERT INTO project_employee (proj_num, emp_num) VALUES 
        (1, 2),
        (1, 5),
        (1, 6),
        (2, 1),
        (3, 3),
        (3, 7),
        (4, 4),
        (4, 8);
        
INSERT INTO project (proj_name, start_date, num_of_emp) VALUES 
        ('Outdoor Christmas Decorations Display', '11.05.2020', 3),
        ('Christmas Tree Display', '11.18.2020', 1),
        ('Lego Star Wars Christmas Display', '11.20.2020', 2),
        ('XBOX Holiday Bundle Display', '12.03.2020', 2);