# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\jp23\taksisluzba.sql

drop database if exists taksisluzba;
create database taksisluzba;

use taksisluzba;

create table vozilo(
	id int not null primary key auto_increment,
	naziv varchar(50) not null,
	vrsta int not null,
	vozac int not null
);

create table vozac(
	id int not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	iban varchar(30)
);

create table putnik(
	id int not null primary key auto_increment,
	naziv varchar(50) not null,
	vozac int not null
);

create table voznja(
	id int not null primary key auto_increment,
	naziv varchar(50) not null,
	cijena decimal (18,5) not null,
	datum date not null,
	trajanje int
);

create table putnik_voznja(
	putnik int not null,
	voznja int not null
);

alter table vozilo add foreign key (vozac) references vozac (id);

alter table putnik add foreign key (vozac) references vozac (id);

alter table putnik_voznja add foreign key (putnik) references putnik (id);
alter table putnik_voznja add foreign key (voznja) references voznja (id);