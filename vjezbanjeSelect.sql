# baza mjesta
# odaberite sva mjesta iz osječko baranjčke županije
select * from mjesto where postanskibroj like '31%';
select * from mjesto where zupanija =14;

# odaberite sva mjesta u hrvatskoj koja ne završavaju s slovom k

# Nazive svih mjesta koji imaju početno slovo a postavite na XXXX

# Mjestima dodati kolonu brojstanovnika i u nju postaviti slučajne vrijednosti
# između 10000 i 100000.

# odaberite podatke na način da ispis u Gridu izgleda npr: ovako:
# Grad: Osijek, 31000 (Županija: 14)


# baza knjiznica

# 1. odaberite sve autore koji nemaju definiran datum rođenja

# 2. autora s prezimenom preišić ispraviti u Perišić

# 3. kreirati tablic grad (id, naziv). U tablicu autor doddati kolonu grad koja je 
# vanjski ključ na grad(id)


select * from katalog where (naslov like '%ljubav%' or naslov like '%srce%')
and sifra not in (2541,2680,3063);
;


# 4. Koliko je izdavača društvo s ograničenom odgovornošću?
select * from izdavac where naziv like '%d%o%o%';

# 5. odaberite sva mjesta koja u svom nazivu imaju slovo Z

# Unesite sebe kao autora i unesite kataložni zapis čiji ste Vi autor


