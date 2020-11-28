# SELECT NA JEDNU TABLICU moja verzija
# select kreira novu tablicu

select * from osoba;

# FILTRIRANJE KOLONA
# u select listi se može nalaziti
# * - sve kolone
#    OVO NE VALJA ?!select sifra, ime, ime, sifra, from osoba;


# nazivi kolona odvojeni zarezom
select sifra, ime, ime, sifra from osoba;

# konstanta
select sifra,2, ime, 'Osijek' from osoba;

# svakoj koloni se može dati zamjensko ime
select sifra as id, 2 as sifra, ime as grad from osoba;

# izraz
select now();

select 2;


# FILTRIRANJE REDOVA
# operatori
# uspoređivanje
# =
select * from osoba where ime='Filip';

# > <
select * from osoba where sifra>4;

# >= <=
select * from osoba where sifra<=4;

# !=različito
select * from osoba where sifra!=4;

# (<>) različito druga varijanta
select * from osoba where sifra<>4;


# logički : and or not - Booleova algebra: https://byjus.com/maths/boolean-algebra/
select * from osoba where ime='Filip' and prezime='Nađ';
select * from osoba where sifra=1 or sifra=2;
select * from osoba where not sifra=2;

select * from osoba where not ((ime='Filip' and prezime='Nađ') or sifra=2);

# is null, is not null
select * from osoba where oib is not null;
select * from osoba where oib is null;


# ostali operatori
# like
select * from osoba where ime like 'Filip';
select * from osoba where ime like 'F%';
select * from osoba where ime like '%an%';
select * from osoba where ime like '%o';

# in
select * from osoba where sifra=1 or sifra=2;
select * from osoba where sifra in (1,2);

# between
select * from osoba where sifra>=5 and sifra<=10;
select * from osoba where sifra between 5 and 10;

select * from grupa;
update grupa set datumpocetka='2020-02-10 17:00:00' where sifra=2;



select concat(ime,'', prezime) as polaznik from osoba;