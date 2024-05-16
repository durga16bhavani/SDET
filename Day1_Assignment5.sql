-- Day1 Assignment5 index 

use durgabhavani;

create index index_empname on employee_details(emp_id,emp_name);
explain select * from employee_details where emp_name='Radha';
explain select * from employee_details where emp_id>500;
drop index index_empname on employee_details;
explain select * from employee_details where emp_id>500;