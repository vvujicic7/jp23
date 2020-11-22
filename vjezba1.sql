# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\vjezba1.sql

drop database if exists vjezba1;
create database vjezba1;

use vjezba1;

create table vozilo(
	id int not null primary key auto_increment,
	naziv varchar (50) not null,
	vrsta varchar (50) not null,
	cijena decimal (15,5) not null,
	datum date
);

#describe vozilo;
select * from vozilo;
insert into vozilo (naziv,vrsta,cijena,datum) values 
('volvo','terenac',100.00 ,'2020-10-02'),
('volvo2','terenac2',101.00,'2020-10-03'),
('volvo3','terenac3',102.00,'2020-10-04'),
('volvo4','terenac4',103.00,'2020-10-05'),
('volvo5','terenac5',104.00,'2020-10-06');



