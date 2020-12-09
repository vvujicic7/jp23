select * from smjer;
select * from grupa;
select * from clan;


# procedure
delimiter $$
create procedure brisismjer(in sifrasmjera int)
begin
	delete from clan where grupa=(select sifra from grupa where smjer=sifrasmjera);
	delete from grupa where smjer=sifrasmjera;
	delete from smjer where sifra=sifrasmjera;
end;
delimiter ;

call brisismjer(1);



# okidači (trigger) 

create table logiranje(
	sifra int not null primary key auto_increment,
	tablica varchar(255),
	sto varchar(255),
	kada datetime default now()
);

select * from logiranje;

delimiter $$
create trigger osoba_unos before insert on osoba for each row
begin 
	insert into logiranje(tablica,sto) values
	('osoba', concat('novi unos:',new.ime,' ',new.prezime));
end;
delimiter ;

select  email('Pero','Perić');
insert into osoba(ime,prezime,email) values ('Pero','perić','peroperic@mail.com');

select * from osoba;

delimiter $$
create trigger osoba_promjena before update on osoba for each row
begin
insert into logiranje(tablica,sto) values
('osoba', concat(
'stari unos: ',old.ime,' ',old.prezime, ' - ',
'novi unos: ',new.ime,' ',new.prezime));
end;
delimiter ;


delimiter $$
create trigger osoba_brisanje after delete on osoba for each row
begin
insert into logiranje(tablica,sto) values
('osoba', concat('obrisano: ',old.ime,' ',old.prezime));
end;
delimiter ;

# nisam uspio sve













