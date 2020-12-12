drop database if exists kolokvij_vjezba_6;
create database kolokvij_vjezba_6;

use kolokvij_vjezba_6;

create table decko(
	sifra int not null primary key auto_increment,
	prvipta datetime,
	modelnaocala varchar(41),
	nausnica int,
	zena int not null
);

create table zena(
	sifra int not null primary key auto_increment,
	novcica decimal(14,8) not null,
	narukvica int not null,
	dukserica varchar(40) not null,
	haljina varchar(30),
	hlace varchar(32),
	brat int not null
);

create table brat(
	sifra int not null primary key auto_increment,
	nausnica int not null,
	treciputa datetime not null,
	narukvica int not null,
	hlace varchar(31),
	prijatelj int
);

create table prijatelj(
	sifra int not null primary key auto_increment,
	haljina varchar(35),
	prstena int not null,
	introvertno bit,
	stilfrizura varchar(36) not null
);

create table prijatelj_ostavljena(
	sifra int not null primary key auto_increment,
	prijatelj int not null,
	ostavljena int not null
);

create table ostavljena(
	sifra int not null primary key auto_increment,
	prviputa datetime not null,
	kratkamajica varchar(39) not null,
	drugiputa datetime,
	maraka decimal(14,10)
);

create table svekrva(
	sifra int not null primary key auto_increment,
	hlace varchar(48) not null,
	suknja varchar(42) not null,
	ogrlica int not null,
	treciputa datetime not null,
	dukserica varchar(32) not null,
	narukvica int not null,
	punac int
);

create table punac(
	sifra int not null primary key auto_increment,
	ekstroventno bit not null,
	suknja varchar(30) not null,
	majica varchar(44) not null,
	prviputa datetime not null
);


alter table svekrva add foreign key (punac) references punac(sifra);

alter table decko add foreign key (zena) references zena(sifra);

alter table zena add foreign key (brat) references brat(sifra);

alter table brat add foreign key (prijatelj) references prijatelj(sifra);

alter table prijatelj_ostavljena add foreign key (prijatelj) references prijatelj(sifra);
alter table prijatelj_ostavljena add foreign key (ostavljena) references ostavljena(sifra);


# U tablice zena, brat i prijatelj_ostavljena unesite po 3 retka.
select * from brat;
insert into brat (nausnica, treciputa, narukvica) values
	(1,'2020-10-10',1),
	(2,'2020-11-11',2),
	(3,'2020-09-09',3);
select * from zena ;
insert into zena (novcica,narukvica,dukserica,brat) values
	(100,1,'p',1),
	(200,2,'k',2),
	(300,3,'l',3);
insert into prijatelj (prstena,stilfrizura) values
	(1,'p'),
	(2,'k'),
	(3,'d');
insert into ostavljena (prviputa,kratkamajica) values 
	('2020-01-01','p'),
	('2020-02-02','l'),
	('2020-04-04','h');
insert into prijatelj_ostavljena (prijatelj,ostavljena) values
	(1,1),
	(2,2),
	(3,3);


update svekrva set suknja = 'Osijek';


delete from decko where modelnaocala <'AB';


select narukvica from brat where treciputa is null;


# Prikažite drugiputa iz tablice ostavljena, zena iz tablice decko te narukvica iz tablice zena uz uvjet
# da su vrijednosti kolone treciputa iz tablice brat poznate te da su vrijednosti kolone prstena iz 
# tablice prijatelj jednake broju 219. Podatke posložite po narukvica iz tablice zena silazno.
select a.drugiputa ,f.zena ,e.narukvica 
from ostavljena a
inner join prijatelj_ostavljena b on a.sifra =b.ostavljena
inner join prijatelj c on c.sifra =b.prijatelj 
inner join brat d on d.prijatelj =c.sifra 
inner join zena e on e.brat =d.sifra 
inner join decko f on f.zena =e.sifra 
where d.treciputa is not null and c.prstena =219
order by e.narukvica desc;


# Prikažite kolone prstena i introvertno iz tablice prijatelj čiji se 
# primarni ključ ne nalaze u tablici prijatelj_ostavljena.
select a.prstena ,a.introvertno 
from prijatelj a
left join prijatelj_ostavljena b on b.prijatelj =a.sifra 
where b.sifra is null;
# 28 min
