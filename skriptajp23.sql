drop database if exists edunovajp23;
create database edunovajp23; 

use edunovajp23;

create table smjer(
    sifra       int,
    naziv       varchar(50),
    cijena      decimal(18,2),
    trajanje    int,
    verificiran boolean
);

create table grupa(
    sifra int,
    naziv varchar(20),
    smjer int,
    predavac int,
    datumpocetka datetime,
    brojpolaznika int
);

create table predavac(
    sifra int,
    ime varchar(50),
    prezime varchar(50),
    oib char(11),
    email varchar(50),
    iban varchar(50) # komentar
);

create table polaznik(
    sifra int,
    ime varchar(50),
    prezime varchar(50),
    oib char(11),
    email varchar(50),
    brojugovora varchar(50) 
);