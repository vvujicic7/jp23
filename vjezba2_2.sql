# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\jp23\vjezba2_2.sql

drop database if exists vjezba2_2;
create database vjezba2_2;

use vjezba2_2;

create table zupanija(
	sifra int not null primary key auto_increment,
	naziv varchar(50) not null,
	zupan int not null
);

create table zupan(
	sifra int not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null
);

create table opcina(
	sifra int not null primary key auto_increment,
	zupanija int not null,
	naziv varchar(50) not null
);

create table mjesto(
	sifra int not null primary key auto_increment,
	opcina int not null,
	naziv varchar(50) not null
);

alter table zupanija add foreign key (zupan) references zupan(sifra);
alter table opcina add foreign key (zupanija) references zupanija(sifra);
alter table mjesto add foreign key (opcina) references opcina(sifra);

select * from zupanija;
select * from zupan;
insert into zupan (ime,prezime) 
	values
insert into zupanija (naziv,zupan) values
	('dubrovacko_neretvanska',1),
	('osijecko_baranjska',1),
	('grad_zagreb',1);