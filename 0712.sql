# funkcije

select now();

# znakovne
select lower (naziv), upper(naziv),left(naziv,1), right(naziv,1) from smjer;
select ime, prezime from osoba where concat(ime,' ',prezime) like '%a B%';

# matematičke
select pow(2,3), sqrt(9), abs(-1);

# datumske
select * from grupa;
update grupa set datumpocetka =now() where sifra=1;
select adddate(datumpocetka,interval 180 day) from grupa;

select datediff(now(),'1982-11-16') * 24*60*70; #otkucaj srca od rođenja :))

select concat(ime,prezime,'@edunova.hr') as email from osoba;

# vlastita funkcija
delimiter $$
drop function if exists cisto$$
create function cisto(s varchar(50)) returns varchar(50)
begin
	return
		replace(
			replace(
				replace(
					replace(
						replace(lower(s),'š','s')
						,'đ','d')
				,'č','c')
		,'ć','c')
,'ž','z')
;
end;
$$
drop function if exists email$$
create function email(ime varchar(50),prezime varchar(50)) returns varchar(255)
begin
return concat(cisto(ime),cisto(prezime),'@edunova.hr');
end;
$$

delimiter ;

# DZ
# Na današnji dan uz unos vlastitog datuma rodjenja upit ispisuje
# koliko ste stari godina,mjeseci i dana
