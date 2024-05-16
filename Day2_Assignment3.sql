-- Day2 assignment3

use joinsdb;

select * from customers;
select * from orders;

select c.customerid,c.customername,o.orderid,o.OrderItem,o.ordervalue from customers c inner join orders o on c.CustomerId=o.CustomerId 
where o.ordervalue > (select avg(ordervalue) from orders);


select c.customerid,c.customername,o.orderid,o.OrderItem,o.ordervalue from customers c inner join orders o on c.CustomerId=o.CustomerId 
where o.ordervalue > (select avg(ordervalue) from orders);

-- union

select c.customername,c.city,o.orderitem,o.price from customers c inner join orders o on (c.customerid=o.customerid)
union
select c.customername,c.contactno,c.city,o.orderitem from customers c inner join orders o on (c.customerid=o.customerid) where OrderItem='shoe'; 





