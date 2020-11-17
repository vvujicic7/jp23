# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\jp23\muzej.sql

drop database if exists muzej;
create database muzej;

use muzej;

create table izlozba(
	id int not null primary key auto_increment,
	naziv int not null,
	trajanje int not null,
	djelo int not null,
	sponzor int not null
);

create table izlozba_djelo(
	izlozba int not null,
	djelo int not null
);

create table djelo(
	id int not null primary key auto_increment,
	naziv int not null,
	datum date not null,
	izlozba int not null
);

create table kustos(
	id int not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	izlozba int not null
);

create table sponzor(
	id int not null primary key auto_increment,
	naziv int not null,
	cijena decimal(18,5),
	iban varchar(30)
);

alter table izlozba_djelo add foreign key (izlozba) references izlozba(id);
alter table izlozba_djelo add foreign key (djelo) references djelo(id);

alter table izlozba add foreign key (sponzor) references sponzor(id);

alter table kustos add foreign key (izlozba) references izlozba (id);
