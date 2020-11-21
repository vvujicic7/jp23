# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\jp23\postolar.sql

drop database if exists postolar;
create database postolar;

use postolar;

create table obuca(
	id int not null primary key auto_increment,
	naziv varchar(50) not null,
	marka varchar(50),
	korisnik int not null
);

create table korisnik(
	id int not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null
);

create table popravak (
	id int not null primary key auto_increment,
	naziv varchar(50) not null,
	cijena decimal(18,2) not null,
	obuca int not null,
	segrt int not null
);

create table segrt(
	id int not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	oib char(11)
);

alter table obuca add foreign key (korisnik) references korisnik(id);

alter table popravak add foreign key (obuca) references obuca(id);
alter table popravak add foreign key (segrt) references segrt(id);

