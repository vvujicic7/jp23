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
    prezime varchar (50) not null,
    djelatnica int
);

create table usluga (
    sifra int not null primary key auto_increment,
    naziv varchar (20) not null,
    cijena decimal (15,5)
);

create table posjeta (
    sifra int not null primary key auto_increment,
    datumtermina datetime not null,
    trajanje int not null,
    korisnik int,
    usluga int
);

alter table korisnik add foreign key (djelatnica) references djelatnica (sifra);

alter table posjeta add foreign key (korisnik) references korisnik (sifra);

alter table posjeta add foreign key (usluga) references usluga (sifra);
