use joinsdb;

select * from customers;
select * from orders;

-- inner join

select c.customername,c.city,o.orderitem,o.price from customers c inner join orders o on (c.customerid=o.customerid);
select c.customername,o.orderitem,o.price,o.orderdate from customers c inner join orders o on (c.customerid=o.customerid);
select c.customername,c.contactno,c.city,o.orderitem from customers c inner join orders o on (c.customerid=o.customerid) where OrderItem='shoe'; 
select c.customername,c.contactno,c.city,o.orderitem from customers c inner join orders o on (c.customerid=o.customerid) where city='vizag';

-- left join

select c.customerid,c.customername,c.city,o.orderitem,o.price from customers c left join orders o on (c.customerid=o.customerid);
select c.customername,o.orderitem,o.price,o.orderdate from customers c left join orders o on (c.customerid=o.customerid);
select c.customername,c.contactno,c.city,o.orderitem from customers c left join orders o on (c.customerid=o.customerid) where OrderItem='shoe'; 
select c.customername,c.contactno,c.city,o.orderitem from customers c left join orders o on (c.customerid=o.customerid) where city='vizag';






