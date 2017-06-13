CREATE SEQUENCE dept_deptid_seq
INCREMENT BY 10
START WITH 280
MAXVALUE 9990
NOCYCLE
NOCACHE

INSERT INTO departments
VALUES(dept_deptid_seq.nextval,'Development',103,1700);

INSERT INTO employees(employee_id,department_id)
VALUES(employees_seq.nextval,dept_deptid_seq.currval,)

CREATE INDEX emp_phone_number_ix
ON employees(phone_number);

CREATE INDEX emp_last_name_ix
ON employees(LOWER(last_name));

SELECT * FROM employees WHERE LOWER(last_name) = 'grant';
