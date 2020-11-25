# baza mjesta
# odaberite sva mjesta iz osječko baranjske županije

select * from mjesto where naziv like '%osijek%';
select * from mjesto where zupanija =14;

# odaberite sva mjesta u hrvatskoj koja ne završavaju s slovom k
select * from mjesto where naziv not like '%k';

insert into mjesto (postanskibroj, zupanija, naziv) values
	('20001',19,'Vitaljina'),
	('20002',19,'Mišići'),
	('20003',19,'Perna');

# nazive svih mjesta koji imaju početno slovo a postavite na XXXX

select * from mjesto;
update mjesto set naziv='XXXX' where naziv like 'a%';

# Mjestima dodati kolonu brojstanovnika i u nju postaviri slučajev vrijednosti između 10000 i 100000

# odaberite podatke na način da ispis u Gridu izgleda npr: ovako:
# Grad: Osijek, 31000 (Županija:14)

# baza knjiznica
# 1. odaberite sve autore koji nemaju definiran datum rođenja
select * from autor;
select * from autor where datumrodenja is null;

# 2. autora s prezimenom preišić ispraviti u Previšić
update autor set prezime='Previšić' where sifra=3;

# 3. kreirati tablicu grad (id,naziv). U tablicu autor dodati kolonu grad (nisam riješio)

# usmeni zadatak... :)-riješeno
select * from katalog where (naslov like '%ljubav%' or naslov like '%srce%')
and sifra not in (2541,2660,3063);

# 4. Koliko je izdavača društvo s ograničenom odgovornošću?

select * from izdavac;
select * from izdavac where naziv like '%d%o%o%';

# 5. Odaberite sva mjesta koja u svom nazivu imaju slovo z

select * from mjesto;
select * from mjesto where naziv like '%z%';

# 6. Unesite sebe kao autora i unesite kataložni zapis čiji ste Vi autor
select * from autor;
insert into autor (sifra, ime, prezime, datumRodenja) values (3222, 'VELIMIR', 'VUJIČIĆ', '1982-11-16');

# DZ razmišljati što raditi za završni rad