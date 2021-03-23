/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.hotelzavrsnirad;

import com.github.javafaker.Faker;
import hotel.model.Boravak;
import hotel.model.Djelatnik;
import hotel.model.Gost;
import hotel.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import java.math.BigDecimal;
import hotel.model.Usluga;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.Email;
/**
 *
 * @author Mativel
 */
public class Start {

    
    public static void main(String[] args) {
        Session s = HibernateUtil.getSession();
        s.beginTransaction();
        
        Usluga usluga = new Usluga();
        usluga.setCijena(new BigDecimal(23.99));
        usluga.setNaziv("Apartman");
        usluga.setOpis("Nocenje s doruckom u apartmanu");
        usluga.setVrsta("Nocenje");
        
        s.save(usluga);
        
       Djelatnik djelatnik = new Djelatnik();
       djelatnik.setIme("Ivo");
       djelatnik.setOib("63791759793");
       djelatnik.setPrezime("Javic");
       
       s.save(djelatnik);
       
       Boravak boravak = new Boravak();
       boravak.setDatum_dolaska(new Date());
       boravak.setDatum_odlaska(new Date());
       
        
       s.save(boravak);
       
       Gost gost = new Gost();
       gost.setIme("John");
       gost.setPrezime("Smith");
       gost.setEmail("john.smithzavrsni@gmail.com");
       
       s.save(gost);
       
       Faker faker = new Faker();
        List<Gost> gosti = new ArrayList<>();
        Gost g;
        for(int i=0; i<50; i++) {
        g = new Gost();
        g.setIme(faker.name().firstName());
        g.setPrezime(faker.name().lastName());
        g.setDrzavljanstvo(faker.nation().nationality());
        g.setDatum_rodjenja(faker.date().birthday());
        
        gosti.add(g);
           
        s.save(g);
        }
        
        s.getTransaction().commit();
                
             //   System.out.println(s.getMetamodel().getEntities().size());

        
        
    
    }

}