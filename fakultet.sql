# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\jp23\fakultet.sql

drop database if exists fakultet;
create database fakultet;

use fakultet;

create table student(
	id int not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	oib char(11) not null,
	kolegij int not null
);

create table kolegij(
	id int not null primary key auto_increment,
	naziv varchar(50) not null,
	cijena decimal(18,2) not null,
	trajanje int
);

create table student_rok(
	student int not null,
	rok int not null
);

create table rok(
	id int not null primary key auto_increment,
	naziv varchar(50) not null,
	datum date not null
);

create table kolegij_rok(
	kolegij int not null,
	rok int not null
);

create table prijava(
	id int not null primary key auto_increment,
	naziv varchar(50) not null,
	datum date not null,
	rok int not null
);

alter table student add foreign key (kolegij) references kolegij (id);

alter table student_rok add foreign key (student) references student (id);
alter table student_rok add foreign key (rok) references rok (id);

alter table kolegij_rok add foreign key (kolegij) references kolegij (id);
alter table kolegij_rok add foreign key (rok) references rok (id);

alter table prijava add foreign key (rok) references rok (id);