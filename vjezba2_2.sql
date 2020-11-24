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

select * from zupan;
insert into zupan (ime,prezime) values
	('Dubrovacki','Dub'),
	('Osijecki','Osi'),
	('Zagrebacki','Zag');

select * from zupanija;
insert into zupanija (naziv,zupan) values
	('dubrovacko_neretvanska',1),
	('osijecko_baranjska',2),
	('grad_zagreb',3);
	
select * from opcina;
insert into opcina(zupanija,naziv) values
	(1,'Dubrovnik'),
	(1,'Cavtat'),
	(2,'Osijek'),
	(2,'Nasice'),
	(3,'Zagreb'),
	(3,'Samobor');
	
select * from mjesto;
insert into mjesto (opcina,naziv) values
	(1,'Konavle'),
	(1,'Ston'),
	(2,'Slano'),
	(2,'Srebreno'),
	(3,'Antunovac'),
	(3,'Bilje'),
	(4,'Bizovac'),
	(4,'Ceminac'),
	(5,'Zapresic'),
	(5,'Jastrebarsko'),
	(6,'Zabok'),
	(6,'Svetanedelja');
	
update mjesto set naziv='Cavtat' where sifra=1;
update mjesto set naziv='Mljet' where sifra=2;
update mjesto set naziv='Zelina' where sifra=9;
update mjesto set naziv='Valpovo' where sifra=6;
update mjesto set naziv='Djakovo' where sifra=7;


