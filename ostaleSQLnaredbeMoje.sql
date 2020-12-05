select * from smjer where sifra>1;

# order by i limit klauzule
select naziv, 'Osijek' as grad, now() as danas 
from smjer 
where sifra>1
order by naziv desc
limit 1;

# distinct oznaka
select distinct grupa from clan;


# proširenje update naredbe
# promjenite trajanje smjera na 150 te broj polaznika grupe na 15 svim grupama i svim smjerovima
# na kojima je polaznik s šifrom 1
update smjer a 
inner join grupa b on a.sifra =b.smjer 
inner join clan c on b.sifra =c.grupa 
set a.trajanje =150, b.brojpolaznika =15
where c.polaznik =1;

# proširenje delete naredbe
# želim obrisati sve članove koji su upisani u grupe čiji smjerovi traju duže od 150 sati
delete a
from clan a inner join grupa b on a.grupa =b.sifra 
inner join smjer c on b.smjer =c.sifra 
where c.trajanje >150;

# Klauzule group by i having
