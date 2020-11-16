# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\vjezba2.sql

drop database if exists vjezba2;
create database vjezba2;

use vjezba2;

create table vozilo(
	id int not null primary key auto_increment,
	naziv varchar (50) not null,
	vrsta varchar (50) not null,
	datum date
);

create table vozac(
	id int not null primary key auto_increment,
	vozilo int,
	ime varchar (50) not null,
	prezime varchar (50) not null
);

alter table vozac add foreign key (vozilo) references vozilo (id);

#select * from vozilo;
insert into vozilo (naziv,vrsta,datum) values ('volvo','terenac', null);
insert into vozilo (naziv,vrsta,datum) values ('fico', 'terenac', null);

#select * from vozac;
insert into vozac (vozilo,ime,prezime) 
values	 (null,'ivo','ivic'),
		(null,'mirko','mirkic'),
		(null, 'bla','lala'),
		(null,'ana','anic');