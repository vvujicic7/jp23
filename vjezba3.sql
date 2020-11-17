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
	naziv varchar(50) not null,
	vrsta int
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