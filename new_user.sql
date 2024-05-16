-- New_user accesing table of root user

-- Grant all permissions

select user();
use mydatabase;

select * from employee;

insert into employee values(6,'Fhatima',52000,'Hyderabad');

alter table employee add primary key(empno);

update employee set empname='Anjali' where empno=6;

desc employee;

-- after revoke all previlages

insert into employee values(7,'Gowri',52000,'Chennai');

update employee set empname='Fhatima' where empno=6;





