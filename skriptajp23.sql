# win+r, upiši cmd te zaljepi sljedeću liniju (prilagoditi putanje - diskove)
# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\skriptajp23.sql
drop database if exists edunovajp23;
create database edunovajp23 CHARACTER SET utf8; 

use edunovajp23;

create table smjer(
    sifra       int not null primary key auto_increment,
    naziv       varchar(50) not null,
    cijena      decimal(18,2),
    trajanje    int,
    verificiran boolean
);

create table grupa(
    sifra int not null primary key auto_increment,
    naziv varchar(20) not null,
    smjer int not null,
    predavac int,
    datumpocetka datetime,
    brojpolaznika int not null
);

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11),
    email varchar(50) not null
);

create table predavac(
    sifra int not null primary key auto_increment,
    osoba int not null,
    iban varchar(50) # komentar
);

create table polaznik(
    sifra int not null primary key auto_increment,
    osoba int not null,
    brojugovora varchar(50) 
);

create table clan(
    grupa int not null,
    polaznik int not null
);

alter table grupa add foreign key  (smjer) references smjer(sifra);
alter table grupa add foreign key (predavac) references predavac(sifra);

alter table predavac add foreign key (osoba) references osoba(sifra);

alter table polaznik add foreign key (osoba) references osoba(sifra);

alter table clan add foreign key (grupa) references grupa(sifra);
alter table clan add foreign key (polaznik) references polaznik(sifra);


# najlošiji
# 1
insert into smjer values (null, 'Java programiranje', 4999.99,130,true);

# malo bolji način
# 2
insert into smjer (sifra,naziv) values (null, 'PHP programer');

# best practice
# 3
insert into smjer (sifra,naziv,cijena,trajanje,verificiran)
values (null, 'Računalni operator',2000,200,null);


insert into grupa (naziv,smjer,brojpolaznika) values ('JP23',1,13);


# 2
insert into grupa(naziv,smjer,brojpolaznika) values ('PP22',2,13);

# 1-20
insert into osoba (ime,prezime,email) values
('Tomislav','Jakopec','tjakopec@gmail.com'),
('Velimir','Vujičić','velimir.vujicic@hotmail.com');

#1
insert into predavac (osoba,iban) values (1,'');

# 1-19

insert into polaznik (osoba)
select sifra from osoba where sifra>1;

insert into clan (grupa,polaznik)
select 1,sifra from polaznik;

