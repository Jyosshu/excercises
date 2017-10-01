BEGIN TRANSACTION;

CREATE TABLE departments (
        department_id serial NOT NULL,
        name varchar(255) NOT NULL,
        CONSTRAINT pk_departments_department_id PRIMARY KEY (department_id)        
);

CREATE TABLE employees (
        employee_id serial,
        job_title varchar(255),
        last_name varchar(255),
        first_name varchar(255),
        gender varchar(20),
        birthday date,
        hire_date date,
        department_id int,
        CONSTRAINT pk_employees_employee_id PRIMARY KEY (employee_id),
        CONSTRAINT fk_departments_department_id FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

CREATE TABLE employee_department (
        employee_id integer NOT NULL,
        department_id integer NOT NULL,
        CONSTRAINT pk_employee_id_department_id PRIMARY KEY (employee_id, department_id),
        CONSTRAINT fk_employees_employee_id FOREIGN KEY (employee_id) REFERENCES employees(employee_id),
        CONSTRAINT fk_departments_department_id FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

CREATE TABLE projects (
        project_id serial NOT NULL,
        name varchar(255),
        start_date date,
        CONSTRAINT pk_projects_project_id PRIMARY KEY (project_id),
        CONSTRAINT fk_employees_employee_id FOREIGN KEY (employee_id) REFERENCES employees(employee_id)
);

CREATE TABLE employee_project (
        employee_id integer NOT NULL,
        project_id integer NOT NULL,
        CONSTRAINT pk_employee_id_project_id PRIMARY KEY (employee_id, project_id),
        CONSTRAINT fk_employees_employee_id FOREIGN KEY (employee_id) REFERENCES employees(employee_id),
        CONSTRAINT fk_projects_project_id FOREIGN KEY (project_id) REFERENCES projects(project_id)
);


INSERT INTO departments (department_id, name) VALUES (1, 'Human Resources');
INSERT INTO departments (department_id, name) VALUES (2, 'Information Technology');
INSERT INTO departments (department_id, name) VALUES (3, 'Research and Development');

INSERT INTO employees (employee_id, job_title, last_name, first_name, gender, birthday, hire_date, department_id) 
VALUES (1, 'President', 'Bluth', 'Michael', 'Male', '12/14/1967', '01/01/2003', 1);
INSERT INTO employees (employee_id, job_title, last_name, first_name, gender, birthday, hire_date, department_id)
VALUES (2, 'Public Relations', 'Bluth', 'Lindsey', 'Female', '12/17/1967', '01/02/2003', 1);
INSERT INTO employees (employee_id, job_title, last_name, first_name, gender, birthday, hire_date, department_id) 
VALUES (3, 'Magician', 'Bluth', 'G.O.B', 'Male', '11/10/1965', '01/01/2003', 3);
INSERT INTO employees (employee_id, job_title, last_name, first_name, gender, birthday, hire_date, department_id) 
VALUES (4, 'Apprentice Geologist', 'Bluth', 'Buster', 'Male', '04/14/1970', '05/01/2004', 2);
INSERT INTO employees (employee_id, job_title, last_name, first_name, gender, birthday, hire_date, department_id) 
VALUES (5, 'Owner', 'Bluth', 'George', 'Male', '02/29/1932', '01/01/1953', 1);
INSERT INTO employees (employee_id, job_title, last_name, first_name, gender, birthday, hire_date, department_id) 
VALUES (6, 'Therapist', 'Funke', 'Tobias', 'Never nude', '03/15/1968', '08/11/2005', 3);
INSERT INTO employees (employee_id, job_title, last_name, first_name, gender, birthday, hire_date, department_id) 
VALUES (7, 'Banana Stand', 'Bluth', 'George Michael', 'Male', '11/02/1990', '11/03/2006', 3);
INSERT INTO employees (employee_id, job_title, last_name, first_name, gender, birthday, hire_date, department_id) 
VALUES (8, 'Director', 'Funke', 'Mae', 'Female', '09/22/1990', '05/10/2007', 2);

INSERT INTO employee_department (employee_id, department_id) VALUES (1,1);
INSERT INTO employee_department (employee_id, department_id) VALUES (2,1);
INSERT INTO employee_department (employee_id, department_id) VALUES (3,3);
INSERT INTO employee_department (employee_id, department_id) VALUES (4,2);
INSERT INTO employee_department (employee_id, department_id) VALUES (5,3);
INSERT INTO employee_department (employee_id, department_id) VALUES (6,3);
INSERT INTO employee_department (employee_id, department_id) VALUES (7,3);
INSERT INTO employee_department (employee_id, department_id) VALUES (8,2);

INSERT INTO projects (project_id, name, start_date) VALUES (1, 'Banana Stand', '01/01/1963');
INSERT INTO projects (project_id, name, start_date) VALUES (2, 'Bluth Company', '01/01/1953');
INSERT INTO projects (project_id, name, start_date) VALUES (3, 'The Cornballer', '01/01/1974');

INSERT INTO employee_project (employee_id, project_id) VALUES (5,1);
INSERT INTO employee_project (employee_id, project_id) VALUES (5,2);
INSERT INTO employee_project (employee_id, project_id) VALUES (5,3);
INSERT INTO employee_project (employee_id, project_id) VALUES (1,1);
INSERT INTO employee_project (employee_id, project_id) VALUES (1,2);
INSERT INTO employee_project (employee_id, project_id) VALUES (1,3);
INSERT INTO employee_project (employee_id, project_id) VALUES (2,2);
INSERT INTO employee_project (employee_id, project_id) VALUES (3,2);
INSERT INTO employee_project (employee_id, project_id) VALUES (7,1);
INSERT INTO employee_project (employee_id, project_id) VALUES (8,1);


