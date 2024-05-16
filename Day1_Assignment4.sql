-- Day1 Assignment4

create database library;
use library;

create table books(book_id int primary key,title varchar(50) not null,author varchar(50),
publication_year year,ISBN int unique);
alter table books add column copies_available int;
alter table books add column author_id int ;
alter table books drop column author;
desc books;

create table authors (author_id int primary key,author_name varchar(50));
desc authors;

create table borrowings(borrowing_id int primary key,book_id int,member_id int,borrow_date date,
return_date date,status varchar(50));

create table members(member_id int primary key,member_name varchar(50),email varchar(100),
phone_number varchar(20),address varchar(50));

alter table members rename column email to email_id;
alter table borrowings modify status varchar(100);

create table books(book_title varchar(20),book_price float);
drop table books;


-- Day1 Assignment7

desc books;
insert into books values(1241,'Making India Awesome',2005,9781565924796,5748),(1242,'A Bend in the River',2011,9789565923796,5749),(1243,'One indian Girl',2018,9781565924791,5748),
(1244,'A Brush with Life',2006,978156592465,5750);

select * from books;

alter table books modify column ISBN  bigint;

desc authors;

insert into authors values (5748,'Chetan Bhagat'),(5749,'V.S.Naipaul'),(5750,'Satish Gujral'),(5751,'Gita Mehta');

select * from authors;

desc borrowings;

insert into borrowings values(1,1241,451,'2024-02-12','2024-02-21','submitted'),(2,1243,452,'2024-04-23','2024-04-29','submitted'),
(3,1244,453,'2024-01-04','2024-01-11','Not submitted');

select * from borrowings;

desc members;
insert into members values(451,'Anu','anu@123.com',7483328942,'Hyderabad'),(452,'Radha','radha@123.com',783539859,'Secundrabad'),(453,'Laya','laya@54.com',7937942983,'Madhapur');

delete from members where member_id=451;

update borrowings set status="submitted" where member_id=453