-- Day2 Assignment5

set autocommit=0;

start transaction;

insert into orders values(134,8246,'sofa','2024-03-15',300000,7);
savepoint sp1;

insert into orders values(135,8248,'Dressing table','2024-05-23',3000,8);
insert into orders values(139,8249,'TV','2024-05-23',45000,9);
savepoint sp2;
 
 
insert into orders values(132,8243,'fridge','2023-05-16',35000,15);
savepoint sp3;

select * from orders;

rollback to savepoint sp2;

select * from orders;


commit;
