select * from smjer;

update smjer set cijena=1000 where sifra=2;

update smjer set 
	cijena=null, 
	trajanje=200 
where sifra=2;

update smjer set naziv=null where sifra=1;

select * from grupa;

# neće napraviti promjenu jer ne postoji predavač s šifrom 7
update grupa set predavac=7 where sifra=1;
select * from predavac where sifra=7;

select * from predavac;
select * from osoba;
update grupa set predavac=1 where sifra=1;

select * from osoba;
update osoba set oib='26324216912' where sifra=1;
update osoba set oib='09171450354' where sifra=2;
update osoba set oib='59325458927' where sifra=3;
update osoba set oib='16283395455' where sifra=4;
update osoba set oib='14616431261' where sifra=5;


select * from smjer;
alter table smjer add broj decimal(18,2);
alter table smjer add iznos decimal(18,2) not null default 0;

update smjer set broj=rand();

# svim smjerovima postavite iznose između 10 i 100

update smjer set iznos=rand()*100;

update smjer set iznos=10 + (rand()*90);

# sve iznose uvećajte za 10 kuna
update smjer set iznos=iznos+10;

#svim brojevima dodijeliti iznos umanjen za 15

update smjer set broj=iznos-15;

#sve cijene smanjite za 10%

update smjer set cijena=cijena*0.9;

# neće obrisati jer su smjerovi s šiframa 1 i 2 vanjski ključevi u tablici grupa

select * from grupa;

# gdje je smjer vanjski ključ?
SELECT
TABLE_NAME,COLUMN_NAME,CONSTRAINT_NAME, REFERENCED_TABLE_NAME,REFERENCED_COLUMN_NAME
FROM
INFORMATION_SCHEMA.KEY_COLUMN_USAGE
WHERE
REFERENCED_TABLE_SCHEMA = 'edunovajp23' AND
REFERENCED_TABLE_NAME = 'smjer';



delete from smjer where sifra=3;

# zadatak: Obriši smjer Java programiranje i sve podatke koji o njemu ovise
select * from smjer; #1
select * from grupa; #1
delete from clan where grupa=1;
delete from grupa where sifra=1;
delete from smjer where sifra=1;

# čitati: cascade