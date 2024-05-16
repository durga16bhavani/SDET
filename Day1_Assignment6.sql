
-- Day1 Assignment6

-- creating  new database user

create user durgabhavani identified by 'durga@123';
select user();
select user from mysql.user;
grant select,update,insert on mydatabase.employee to durgabhavani;
grant all on mydatabase.employee to durgabhavani;
revoke insert on mydatabase.employee from durgabhavani;
revoke update on mydatabase.employee from durgabhavani;
drop user durgabhavani;
