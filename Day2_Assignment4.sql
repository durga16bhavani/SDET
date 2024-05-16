-- Day2 Assignment4

set autocommit=0;

start transaction;
select * from orders;

insert into orders values(132,8246,'Table','2024-05-16',3000,4);
 
 commit;
 
 start transaction;
 
 update customers set customerid=3241 where customername='sravya';
 
 rollback;