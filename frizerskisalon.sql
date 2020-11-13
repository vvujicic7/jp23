# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\jp23\frizerskisalon.sql
drop database if exists frizerskisalon;
create database frizerskisalon;

use frizerskisalon;

create table djelatnica(
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null,
    oib char (11)
);

create table korisnik(
    sifra int not null primary key auto_increment,
    ime varchar (50) not null,
    prezime varchar (50) not null
);