# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\jp22\Hotel_Mativel.sql

drop database if exists Hotel_Mativel;
create database Hotel_Mativel;
use Hotel_Mativel;


create table gost(
	id 				int not null primary key auto_increment,
	ime 			varchar (50) not null,
	prezime 		varchar (50) not null,
	email 			varchar (100) not null,
	datum_rodjenja 	datetime not null,
	drzavljanstvo 	char (3) not null
);

create table djelatnik(
	id 				int not null primary key auto_increment,
	ime 			varchar (50) not null,
	prezime 		varchar (50) not null,
	oib 			char (11) not null
);

create table usluga(
	id 			int not null primary key auto_increment,
	vrsta 		varchar (50) not null,
	naziv 		varchar (50) not null,
	opis 		text not null,
	cijena 		decimal (15,5) not null
);

create table boravak(
	id 				int not null primary key auto_increment,
	gost 			int,
	datum_dolaska 	date not null,
	datum_odlaska 	date not null
);

create table hotelska_usluga(
	boravak 	int not null,
	usluga 		int not null,
	djelatnik 	int not null
);


alter table hotelska_usluga add foreign key (usluga) references usluga (id);
alter table hotelska_usluga add foreign key (djelatnik) references djelatnik (id);
alter table hotelska_usluga add foreign key (boravak) references boravak (id);

alter table boravak add foreign key (gost) references gost (id);


#show tables;

#describe djelatnik;

insert into djelatnik(ime, prezime, oib)
values ('Rade', 'Radić', 88016235844);

#describe usluga;

insert into usluga(vrsta, naziv, opis, cijena)
values ('privatni_izlet', 'elafiti', 'cjelodnevni_izlet', 180);


insert into gost(ime, prezime, email, datum_rodjenja, drzavljanstvo)
values ('Henry', 'Smith', 'henrysmith@mail.com', '1970-12-20', 'GBR');

insert into boravak(gost, datum_dolaska, datum_odlaska)
values (null, '2020-05-01', '2020-05-05');






