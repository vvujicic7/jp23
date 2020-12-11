drop database if exists kolokvij_vjezba_4;
create database kolokvij_vjezba_4;

use kolokvij_vjezba_4;

create table punac(
	sifra int not null primary key auto_increment,
	treciputa datetime,
	majica varchar(46),
	jmbag char(11) not null,
	novcica decimal(18,7) not null,
	maraka decimal(12,6) not null,
	ostavljen int not null
);

create table ostavljen(
	sifra int not null primary key auto_increment,
	modelnaocala varchar(43),
	introvertno bit,
	kuna decimal(14,10)
);

create table prijatelj(
	sifra int not null primary key auto_increment,
	eura decimal(16,9),
	prstena int not null,
	gustoca decimal(16,5),
	jmbag char(11) not null,
	suknja varchar(47) not null,
	becar int not null
);

create table becar(
	sifra int not null primary key auto_increment,
	novcica decimal(14,8),
	kratkamajica varchar(48) not null,
	bojaociju varchar(36) not null,
	snasa int not null
);

create table snasa(
	sifra int not null primary key auto_increment,
	introvertno bit,
	treciputa datetime,
	haljina varchar(44) not null,
	zena int not null
);

create table zena (
	sifra int not null primary key auto_increment,
	suknja varchar(39) not null,
	lipa decimal(18,7),
	prstena int not null
);

create table zena_mladic(
	sifra int not null primary key auto_increment,
	zena int not null,
	mladic int not null
);

create table mladic(
	sifra int not null primary key auto_increment,
	kuna decimal(15,9),
	lipa decimal(18,5),
	nausnica int,
	stilfrizura varchar(49),
	vesta varchar(34) not null
);


alter table punac add foreign key (ostavljen) references ostavljen(sifra);

alter table prijatelj add foreign key (becar) references becar(sifra);

alter table becar add foreign key (snasa) references snasa(sifra);

alter table snasa add foreign key (zena) references zena(sifra);
alter table zena_mladic add foreign key (mladic) references mladic(sifra);
alter table zena_mladic add foreign key (zena) references zena(sifra);

# U tablice becar, snasa i zena_mladic unesite po 3 retka.

select * from zena;
insert into zena (suknja,lipa,prstena) values
	('lijepa',10,1),
	('divna',20,2),
	('prelijepa',30,3);
select * from mladic;
insert into mladic (kuna,lipa,nausnica,stilfrizura,vesta) values
	(null,null,null,null,'bijela'),
	(null,null,null,null,'plava'),
	(null,null,null,null,'zuta');
select * from zena_mladic;
insert into zena_mladic (zena,mladic) values
	(1,1),
	(2,2),
	(3,3);
select * from snasa;
insert into snasa (introvertno,treciputa,haljina,zena) values
	(null,null,'bijela',1),
	(null,null,'zuta',2),
	(null,null,'plava',3);
	
select * from becar;
insert into becar (novcica,kratkamajica,bojaociju ,snasa ) values
	(null,'kratka','plava',1),
	(null,'kart','zuta',2),
	(null,'kratkaa','crvena',3);
	

update punac set majica = 'Osijek';

delete from prijatelj where prstena >17;

select haljina from snasa 
where treciputa = null;

# Prikažite nausnica iz tablice mladic, jmbag iz tablice prijatelj te kratkamajica 
# iz tablice becar uz uvjet da su vrijednosti kolone treciputa iz tablice snasa 
# poznate te da su vrijednosti kolone lipa iz tablice zena različite od 29. 
# Podatke posložite po kratkamajica iz tablice becar silazno.

select a.nausnica ,f.jmbag ,e.kratkamajica 
from mladic a
inner join zena_mladic b on b.mladic =a.sifra 
inner join zena c on c.sifra = b.zena 
inner join snasa d on d.zena =c.sifra 
inner join becar e on e.snasa =d.sifra 
inner join prijatelj f on f.becar =e.sifra 
where d.treciputa like '' and c.lipa!=29
order by e.kratkamajica desc;

# Prikažite kolone lipa i prstena iz tablice zena čiji se primarni ključ 
# ne nalaze u tablici zena_mladic.
select a.lipa ,a.prstena 
from zena a
left join zena_mladic b on b.zena =a.sifra
where b.sifra is null;
