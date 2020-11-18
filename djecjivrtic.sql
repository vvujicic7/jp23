# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\jp23\djecjivrtic.sql

drop database if exists djecjivrtic;
create database djecjivrtic;

use djecjivrtic;

create table odgojnaskupina(
	id int not null primary key auto_increment,
	naziv int not null,
	vrsta int not null,
	cijena decimal (15,5)
);

create table dijete(
	id int not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	oib char(11) not null,
	odgojnaskupina int not null,
	odgajateljica int not null
);

create table odgajateljica(
	id int not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	vrsta int,
	strucnasprema int not null
);

create table strucnasprema(
	id int not null primary key auto_increment,
	naziv int not null,
	vrsta int
);

alter table dijete add foreign key (odgojnaskupina) references odgojnaskupina (id);
alter table dijete add foreign key (odgajateljica) references odgajateljica (id);

alter table odgajateljica add foreign key (strucnasprema) references strucnasprema (id);
