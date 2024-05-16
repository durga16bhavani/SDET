-- Day1 Assignment4

create database library;
use library;

create table books(book_id int primary key,title varchar(50) not null,author varchar(50),
publication_year year,ISBN int unique);
alter table books add column copies_available int;
alter table books add column author_id int ;
alter table books drop column author;
desc books;

-- output	
/*
Field	             Type	         Null	  Key	
book_id	             int	         NO 	  PRI		
title	           varchar(50)	     NO			
publication_year	year	         YES			
ISBN	             bigint	         YES	  UNI		
author_id	         int	         YES		
*/	


create table authors (author_id int primary key,author_name varchar(50));
desc authors;

-- output
/*
Field	         Type	        Null	       Key
author_id	      int	        NO	           PRI		
author_name    	varchar(50)     YES			
*/

create table borrowings(borrowing_id int primary key,book_id int,member_id int,borrow_date date,
return_date date,status varchar(50));
desc borrowings;

-- output
/*
 Field	         Type	     Null	    Key	
borrowing_id	 int	     NO	        PRI		
book_id	         int	     YES			
member_id        int		 YES			
borrow_date      date		 YES			
return_date	     date		 YES			
status	         varchar(50) YES			
*/

create table members(member_id int primary key,member_name varchar(50),email varchar(100),
phone_number varchar(20),address varchar(50));

desc members;

-- output
/*
 Field			Type			Null	Key
member_id		int				NO	PRI		
member_name		varchar(50)		YES			
email			varchar(100)	YES			
phone_number	varchar(20)		YES			
address			varchar(50)		YES			
*/

alter table borrowings modify status varchar(100);

create table books(book_title varchar(20),book_price float);
drop table books;


