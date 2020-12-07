drop database if exists kolokvij_vjezba_2;
create database kolokvij_vjezba_2;

use kolokvij_vjezba_2;


create table zarucnica(
	sifra int not null primary key auto_increment,
	narukvica int,
	bojakose varchar(37) not null,
	novcica decimal(15,9),
	lipa decimal(15,8) not null,
	indiferentno bit not null
);

create table decko_zarucnica (
	sifra int not null primary key auto_increment,
	decko int not null,
	zarucnica int not null
);

create table decko(
	sifra int not null primary key auto_increment,
	indiferentno bit,
	vesta varchar(34),
	asocijalno bit not null
);

create table cura(
	sifra int not null primary key auto_increment,
	haljina varchar(33) not null,
	drugiputa datetime not null,
	suknja varchar(38),
	narukvica int,
	introvertno bit,
	majica varchar(40) not null,
	decko int
);

create table neprijatelj(
	sifra int not null primary key auto_increment,
	majica varchar(32),
	haljina varchar(43) not null,
	lipa decimal(16,8),
	modelnaocala varchar(49) not null,
	kuna decimal(12,6) not null,
	jmbag char(11),
	cura int
);

create table brat(
	sifra int not null primary key auto_increment,
	suknja varchar(47),
	ogrlica int not null,
	asocijalno bit not null,
	neprijatelj int not null
);

create table prijatelj(
	sifra int not null primary key auto_increment,
	modelnaocala varchar(37),
	treciputa datetime not null,
	ekstroventno bit not null,
	prviputa datetime,
	svekar int not null
);

create table svekar(
	sifra int not null primary key auto_increment,
	stilfrizura varchar(48),
	ogrlica int not null,
	asocijalno bit not null
);

alter table brat add foreign key (neprijatelj) references neprijatelj(sifra);

alter table neprijatelj add foreign key (cura) references cura (sifra);

alter table cura add foreign key (decko) references decko (sifra);

alter table decko_zarucnica add foreign key (decko) references decko (sifra);
alter table decko_zarucnica add foreign key (zarucnica) references zarucnica (sifra);

alter table prijatelj add foreign key (svekar) references svekar (sifra);


select * from neprijatelj;
insert into neprijatelj (majica,haljina,lipa,modelnaocala,kuna,jmbag,cura) values
	(null,'plava',null,'plave',100,null,null),
	(null,'zuta',null,'zute',200,null,null),
	(null,'crvena',null,'crvene',300,null,null);
	
select * from cura;
insert into cura (haljina,drugiputa,suknja,narukvica,introvertno,majica,decko) values
	('plava','2020-11-11',null,null,null,'plavkasta',null),
	('zuta','2020-11-12',null,null,null,'zuckasta',null),
	('zelena','2020-11-13',null,null,null,'zelenkasta',null);

select * from decko;
insert into decko (indiferentno,vesta,asocijalno) values
	(null,null,1),
	(null,null,0),
	(null,null,1);

select * from zarucnica;
insert into zarucnica (narukvica,bojakose,novcica,lipa,indiferentno) values
	(null,'plava',null,50,1),
	(null,'zuta',null,55,0),
	(null,'crvena',null,555,1);
select * from decko_zarucnica;
insert into decko_zarucnica (decko,zarucnica) values
	(1,1),
	(2,2),
	(3,3);
	
select * from prijatelj;

select * from svekar;
insert into svekar (stilfrizura,ogrlica,asocijalno) values
	(null,1,1);
insert into prijatelj (modelnaocala,treciputa,ekstroventno,prviputa,svekar) values
	(null,'2020-01-01',1,null,1);
select * from prijatelj;


update prijatelj set treciputa = '2020-04-30';


delete from brat where ogrlica not like 14;


select * from cura where drugiputa is null;


select a.novcica ,f.neprijatelj ,e.haljina 
from zarucnica a
inner join decko_zarucnica b on b.zarucnica =a.sifra 
inner join decko c on b.decko =a.sifra 
inner join cura d on d.decko =a.sifra 
inner join neprijatelj e on e.cura =d.sifra 
inner join brat f on f.neprijatelj =e.sifra 
where c.vesta like '%ba%'
order by e.haljina desc;

