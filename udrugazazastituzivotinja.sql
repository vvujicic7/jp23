# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\jp23\udrugazazastituzivotinja.sql

drop database if exists udrugazazastituzivotinja;
create database udrugazazastituzivotinja;

use udrugazazastituzivotinja;

create table osoba(
	id int not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	oib char(11)
);

create table zivotinja(
	id int not null primary key auto_increment,
	naziv int not null,
	vrsta int not null,
	cijena decimal (15,5),
	osoba int,
	prostor int
);

create table prostor(
	id int not null primary key auto_increment,
	naziv int not null,
	vrta int not null
);

alter table zivotinja add foreign key (osoba) references osoba (id);
alter table zivotinja add foreign key (prostor) references prostor (id);