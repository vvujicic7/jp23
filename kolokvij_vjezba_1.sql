drop database if exists kolokvij_vjezba_1;
create database kolokvij_vjezba_1;

use kolokvij_vjezba_1;


create table sestra(
	sifra int not null primary key auto_increment,
	introvertno bit,
	haljina varchar(31) not null,
	maraka decimal(16,6),
	hlace varchar(46) not null,
	narukvica int
);

create table zena(
	sifra int not null primary key auto_increment,
	treciputa datetime,
	hlace varchar(46),
	kratkamajica varchar(31) not null,
	jmbag char(11) not null,
	bojaociju varchar(39) not null,
	haljina varchar(44),
	sestra int not null
);

create table muskarac(
	sifra int not null primary key auto_increment,
	bojaociju varchar(50) not null,
	hlace varchar(30),
	modelnaocala varchar(43),
	maraka decimal(14,5) not null,
	zena int not null
);

create table mladic(
	sifra int not null primary key auto_increment,
	suknja varchar(50) not null,
	kuna decimal(16,8) not null,
	drugiputa datetime,
	asocijalno bit,
	ekstroventno bit not null,
	dukserica varchar(48) not null,
	muskarac int
);

create table svekar (
	sifra int not null primary key auto_increment,
	bojaociju varchar(40) not null,
	prstena int,
	dukserica varchar(41),
	lipa decimal(13,8),
	eura decimal(12,7),
	majica varchar(35)
);

create table sestra_svekar(
	sifra int not null primary key auto_increment,
	sestra int not null,
	svekar int not null
);

create table punac(
	sifra int not null primary key auto_increment,
	ogrlica int,
	gustoca decimal(14,9),
	hlace varchar(41) not null
);

create table cura(
	sifra int not null primary key auto_increment,
	novcica decimal(16,5) not null,
	gustoca decimal(18,6) not null,
	lipa decimal(13,10),
	ogrlica int not null,
	bojakose varchar(38),
	suknja varchar(36),
	punac int
);

alter table zena add foreign key (sestra) references sestra (sifra);

alter table muskarac add foreign key (zena) references zena (sifra);

alter table mladic add foreign key (muskarac) references muskarac (sifra);

alter table sestra_svekar add foreign key (sestra) references sestra (sifra);
alter table sestra_svekar add foreign key (svekar) references svekar (sifra);

alter table cura add foreign key (punac) references punac (sifra);

select * from sestra;
insert into sestra (introvertno,haljina,maraka,hlace,narukvica) values
	(null,'zuta',null,'zute',1),
	(null,'crvena',null,'crvene',2),
	(null,'plava',null,'plave',3);
select * from svekar;
insert into svekar (bojaociju,prstena,dukserica,lipa,eura,majica) values
	('zuta',null,null,null,null,null),
	('crvena',null,null,null,null,null),
	('plava',null,null,null,null,null);
select * from sestra_svekar;
insert into sestra_svekar (sestra,svekar) values
	(1,1),
	(2,2),
	(3,3);
select * from zena;
insert into zena(treciputa,hlace,kratkamajica,jmbag,bojaociju,haljina,sestra) values
	(null,'banana','kratka',12345678912,'plava',null,1),
	(null,'ban','jakokratka',34567894556,'zuta',null,2),
	(null,'ddd','kratkolika',52525252525,'crvena',null,3);
select * from muskarac;
insert into muskarac (bojaociju, hlace, modelnaocala, maraka, zena) values
	('zuta',null,null,100,1),
	('plave',null,null,200,2),
	('crvene',null,null,300,3);

select * from cura;
update cura set gustoca=15.77;

select * from mladic;
insert into mladic(suknja,kuna,drugiputa,asocijalno,ekstroventno,dukserica ,muskarac ) values
	('p',15,null,null,1,'p',1),
	('p',16,null,null,1,'t',2),
	('o',17,null,null,1,'o',3);
delete from mladic where kuna>15.78;

select * from zena;
select kratkamajica from zena where hlace like '%ana%'; 

select a.dukserica ,f.asocijalno ,e.hlace 
from svekar a 
inner join sestra_svekar b on b.svekar =a.sifra 
inner join sestra c on b.sestra =c.sifra 
inner join zena d on d.sestra =c.sifra 
inner join muskarac e on e.zena =d.sifra 
inner join mladic f on f.muskarac =e.sifra 
where (d.hlace like 'a%') and c.haljina like '%ab%';
