# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\jp23\vjezba1_1.sql

drop database if exists vjezba1_1;
create database vjezba1_1;

use vjezba1_1;

create table automobil(
	sifra int not null primary key auto_increment,
	naziv varchar(50) not null,
	boja varchar(50) not null,
	marka varchar(50) not null,
	cijena decimal(18,2) not null
);

select * from automobil;
insert into automobil values
	(null,'jurilica','bijela','ford',150.000),
	(null,'obiteljski','zuta','audi',180.000),
	(null,'terenac','crna','volvo',190.000),
	(null,'gradski','plava','seat',110.000),
	(null,'putnicki','crvena','renault',120.000);

update automobil set naziv='jur' where sifra=1;
update automobil set naziv='jurilica' where sifra=1;

delete from automobil where boja='crna'; 

	
