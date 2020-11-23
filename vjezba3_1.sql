# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\jp23\vjezba3.sql
# Baza ima dvije tablice:
#Programskijezik i kategorija
#Treba unijeti sljedeće podatke
#Java (oop, win, osx)
#Swift (osx)
#PHP (oop, linux, win)
#Go (linux,osx)
drop database if exists vjezba3_1;
create database vjezba3_1;

use vjezba3_1;

create table programskijezik (
	id int not null primary key auto_increment,
	naziv varchar(50) not null,
	kategorija int not null
);

create table kategorija (
	id int not null primary key auto_increment,
	naziv varchar(50) not null,
	programskijezik int not null
);

create table programskijezik_kategorija(
	programskijezik int not null,
	kategorija int not null
);

alter table programskijezik_kategorija add foreign key (programskijezik) references programskijezik (id);
alter table programskijezik_kategorija add foreign key (kategorija) references kategorija (id);

select * from programskijezik;
insert into programskijezik (naziv,kategorija) values
	('Java',1),
	('Swift',2),
	('PHP',3),
	('GO',4);
	
select * from kategorija;
insert into kategorija (naziv,programskijezik) values
	('oop',1),
	('win',1),
	('osx',1),
	('osx',2),
	('oop',3),
	('linux',3),
	('win',3),
	('linux',4),
	('osx',4);
	
select * from programskijezik_kategorija;
insert into programskijezik_kategorija (programskijezik,kategorija) values
	(1,1);
	
# nedovršeno...