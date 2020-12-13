drop database if exists kolokvij_vjezba_7;
create database kolokvij_vjezba_7;

use kolokvij_vjezba_7;


create table zarucnik_mladic(
	sifra int not null primary key auto_increment,
	zarucnik int not null,
	mladic int not null
);

create table mladic(
	sifra int not null primary key auto_increment,
	prstena int,
	lipa decimal(14,5) not null,
	narukvica int not null,
	drugiputa datetime not null
);

create table zarucnik(
	sifra int not null primary key auto_increment,
	vesta varchar(34),
	asocijalno bit not null,
	modelnaocala varchar(43),
	narukvica int not null,
	novcica decimal(15,5) not null
);

create table ostavljen(
	sifra int not null primary key auto_increment,
	lipa decimal(14,6),
	introvertno bit not null,
	kratkamajica varchar(38) not null,
	prstena int not null,
	zarucnik int
);

create table prijateljica(
	sifra int not null primary key auto_increment,
	haljina varchar(46),
	gustoca decimal(15,10) not null,
	ogrlica int,
	novcica decimal(12,5),
	ostavljen int
);

create table sestra(
	sifra int not null primary key auto_increment,
	bojakose varchar(34) not null,
	hlace varchar(36) not null,
	lipa decimal(15,6),
	stilfrizura varchar(40) not null,
	maraka decimal(12,8) not null,
	prijateljica int
);

create table cura(
	sifra int not null primary key auto_increment,
	lipa decimal(12,9) not null,
	introvertno bit,
	modelnaocala varchar(40),
	narukvica int,
	treciputa datetime,
	kuna decimal(14,9)
);

create table punica(
	sifra int not null primary key auto_increment,
	majica varchar(40),
	eura decimal(12,6) not null,
	prstena int,
	cura int not null
);


alter table punica add foreign key (cura) references cura(sifra);
alter table sestra add foreign key (prijateljica) references prijateljica(sifra);
alter table prijateljica add foreign key (ostavljen) references ostavljen(sifra);
alter table ostavljen add foreign key (zarucnik) references zarucnik(sifra);
alter table zarucnik_mladic add foreign key (zarucnik) references zarucnik(sifra);
alter table zarucnik_mladic add foreign key (mladic) references mladic(sifra);


# U tablice prijateljica, ostavljen i zarucnik_mladic unesite po 3 retka.
insert into ostavljen (introvertno, kratkamajica, prstena) values
	(1,'p',1),
	(1,'k',2),
	(1,'u',3);
	
insert into prijateljica (gustoca) values
	(100),
	(200),
	(300);
	
insert into zarucnik (asocijalno, narukvica, novcica) values
	(1,1,100),
	(1,2,200),
	(1,3,300);
	
insert into mladic (lipa, narukvica, drugiputa) values
	(100,1,'2020-10-05'),
	(200,2,'2020-04-20'),
	(300,3,'2020-12-29');
	
insert into zarucnik_mladic (zarucnik, mladic) values
	(1,1),
	(2,2),
	(3,3);
	

update punica set eura='15,77';


delete from sestra where hlace <'AB';


select kratkamajica from ostavljen where introvertno is null;


# Prikažite narukvica iz tablice mladic, stilfrizura iz tablice sestra te gustoca iz tablice 
# prijateljica uz uvjet da su vrijednosti kolone introvertno iz tablice ostavljen poznate te da su 
# vrijednosti kolone asocijalno iz tablice zarucnik poznate. 
# Podatke posložite po gustoca iz tablice prijateljica silazno.
select a.narukvica , f.stilfrizura , e.gustoca 
from mladic a
inner join zarucnik_mladic b on b.mladic =a.sifra 
inner join zarucnik c on c.sifra =b.zarucnik 
inner join ostavljen d on d.zarucnik =c.sifra 
inner join prijateljica e on e.ostavljen =d.sifra 
inner join sestra f on f.prijateljica =e.sifra 
where d.introvertno is null and c.asocijalno is not null 
order by e.gustoca desc;


# Prikažite kolone asocijalno i modelnaocala iz tablice zarucnik čiji se primarni ključ ne nalaze u tablici zarucnik_mladic.
select a.asocijalno ,a.modelnaocala 
from zarucnik a
left join zarucnik_mladic b on b.zarucnik =a.sifra 
where b.sifra is null ;

