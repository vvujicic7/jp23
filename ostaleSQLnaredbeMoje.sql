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
select b.productLine ,sum(a.buyPrice) 
from products a inner join productlines b on a.productLine =b.productLine
where b.productLine ='Trains' # ovo nije dobar pristup

# sum,min,max,avg...itd su agregirane funkcije i koriste se skupa s group by klauzulom
select b.productLine ,sum(a.buyPrice), avg(a.buyPrice), min(a.buyPrice), max(a.buyPrice)
from products a inner join productlines b on a.productLine =b.productLine
where a.productLine like '%a%' # filtrira podatke zapisane u tablici
group by b.productLine 
having sum(a.buyPrice)>1000 # filtriranje agregiranih podataka
order by 2 desc;


# union
select productCode , productName, '' as city from products
union 
select addressLine1 ,postalCode ,city from offices;

# kreiranje tablice na osnovu select naredbe
create table spojeno
select productCode , productName, '' as city from products
union 
select addressLine1 ,postalCode ,city from offices;


# unos podataka u tablicu na osnovu select
insert into spojeno
select productCode , productName, '' as city from products
union 
select addressLine1 ,postalCode ,city from offices;


insert into spojeno 
select '',firstName , 'Osijek' from employees;


# odaberite sve proizvode koje je prodao Martin

select distinct e.productName 
from employees a
inner join customers b on b.salesRepEmployeeNumber =a.employeeNumber 
inner join orders c on c.customerNumber =b.customerNumber 
inner join orderdetails d on d.orderNumber =c.orderNumber 
inner join products e on e.productCode =d.productCode 
where a.firstName like 'Martin'
order by productName ;


# odaberite sve podređene zaposlenike od Patterson Mary
select a.firstName ,a.lastName 
from employees a 
inner join employees b on b.employeeNumber =a.reportsTo 
where b.firstName ='Mary' and b.lastName ='Patterson';

# odaberite sve proizvode koji nisu niti na jednoj narudžbi
select distinct productCode from orderdetails;

select count(*) from products;

select * from products where productCode not in 
(select distinct productCode from orderdetails);

# obrišite 1985 Toyota Supra

delete from products where productName like '1985 Toyota Supra';

# obrisati sve proizvode koji nisu niti na jednoj narudžbi
delete from products where productLine not in 
(select distinct productCode from orderdetails);

# na koji datum narudžbe je prodan najskuplji (priceEach)proizvod?
select b.priceEach ,a.orderDate 
from orders a
inner join orderdetails b on b.orderNumber =a.orderNumber 
where b.priceEach =(select max(b2.priceEach) from orderdetails b2);

# sakila
select count(*) from film f ;
