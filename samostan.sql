# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\jp23\samostan.sql
drop database if exists samostan;
create database samostan;

use samostan;

create table svecenik(
	id int not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	iban varchar(50),
	nadredjeni int not null
);

create table posao(
	id int not null primary key auto_increment,
	naziv int not null,
	trajanje time,
	vrsta int
);

create table nadredjeni(
	id int not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	oib char(11)
);

create table svecenik_posao(
	id int not null primary key auto_increment,
	svecenik int not null,
	posao int not null
);


alter table svecenik_posao add foreign key (svecenik) references svecenik (id);
alter table svecenik_posao add foreign key (posao) references posao (id);

alter table svecenik add foreign key (nadredjeni) references nadredjeni (id);


