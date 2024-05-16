-- Day1 Assignment5 index 

use durgabhavani;

create index index_empname on employee_details(emp_id,emp_name);
explain select * from employee_details where emp_name='Radha';

-- output 
/*
id	select_type		table				partitions	type	possible_keys	key		key_len		ref		rows	filtered	Extra
1	SIMPLE			employee_details	 NULL		ALL		NULL		    NULL	NULL		NULL	11		10.00		Using where
*/

explain select * from employee_details where emp_id>500;

-- output
/*
id	select_type		table				partitions	    type	possible_keys			    key			key_len		ref		   rows	    filtered	    Extra
1	SIMPLE			employee_details	NULL			range	PRIMARY,index_empname	    PRIMARY		4		     NULL       6	    100.00	    Using where
*/

drop index index_empname on employee_details;

explain select * from employee_details where emp_id>500;

