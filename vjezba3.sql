# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\jp23\vjezba3.sql
# Baza ima dvije tablice:
#Programskijezik i kategorija
#Treba unijeti sljedeće podatke
#Java (oop, win, osx)
#Swift (osx)
#PHP (oop, linux, win)
#Go (linux,osx)
drop database if exists vjezba3;
create database vjezba3;

use vjezba3;

create table programskijezik (
	id int not null primary key auto_increment,
	naziv varchar(50) not null
);

create table kategorija (
	id int not null primary key auto_increment,
	naziv varchar(50) not null
);

create table programskijezik_kategorija(
	programskijezik int not null,
	kategorija int not null
);

alter table programskijezik_kategorija add foreign key (programskijezik) references programskijezik (id);
alter table programskijezik_kategorija add foreign key (kategorija) references kategorija (id);

#select * from programskijezik;

insert into programskijezik (naziv) values 	
        ('Java'),
		('Swift'),
	 	('PHP'),
		('GO');

#select * from kategorija;
insert into kategorija  (naziv) values
	('oop'),
	('win'),
	('osx'),
	('linux');
	
select * from programskijezik_kategorija;
#describe programskijezik_kategorija;
insert into programskijezik_kategorija (programskijezik,kategorija) values
	(1,1),
	(1,2),
	(1,3),
	(2,3),
	(3,1),
	(3,4),
	(3,2),
	(4,4),
	(4,3);





