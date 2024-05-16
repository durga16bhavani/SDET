-- Day2 Assignment4

set autocommit=0;

start transaction;
insert into orders values(132,8246,'Table','2024-05-16',3000,4);
 commit;
select * from orders;
/* output
OrderId	  CustomerId	OrderItem	OrderDate	Price	ordervalue
121			8241		Mobile		2024-01-23	23500	5
128			8242		Laptop		2023-12-25	64500	17
129			8241		Shoe		2024-02-07	2000	25
130			8243		Watch		2024-02-16	4600	11
132			8246		Table		2024-05-16	3000	4
*/

 start transaction;
 
 update customers set customerid=8245 where customername='sravya';
  
select * from customers;

/* output
 CustomerId		CustomerName	ContactNo	city		email
8241			Ravi			9876543210	Hyderabad	ravi123@gmail.com
8242			Laya			9792742853	Chennai		laya54@gmail.com
8243			Nani			5333353664	Vizag		nani2002@gmail.com
8244			Bhavya			4544693930	Bengaluru	bhavya56@gmail.com
8245			Sravya			6836489456	Hyderabad	sravyasravs@gmail.com
*/
 
 rollback;
 
 -- after rollback the uncomitted actions will remain same
 
 select *from customers;
 
 /* output
CustomerId	CustomerName	ContactNo	city		email
3241		Sravya			6836489456	Hyderabad	sravyasravs@gmail.com
8241		Ravi			9876543210	Hyderabad	ravi123@gmail.com
8242		Laya			9792742853	Chennai		laya54@gmail.com
8243		Nani			5333353664	Vizag		nani2002@gmail.com
8244		Bhavya			4544693930	Bengaluru	bhavya56@gmail.com
*/
