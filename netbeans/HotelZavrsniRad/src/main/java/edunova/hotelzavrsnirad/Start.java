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
import hotel.view.Autorizacija;
import hotel.view.SplashScreen;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.Email;
import org.mindrot.jbcrypt.BCrypt;
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
        usluga.setOpis("Noćenje s doručkom");
        usluga.setVrsta("Smještaj");
        
        s.save(usluga);
        
        Usluga minibar = new Usluga();
        minibar.setCijena(new BigDecimal(50.44));
        minibar.setNaziv("Minibar");
        minibar.setOpis("Mineralna voda");
        minibar.setVrsta("Hrana i piće");
        
        s.save(minibar);
        
        Usluga izlet = new Usluga();
        izlet.setCijena(new BigDecimal(125.55));
        izlet.setNaziv("Izlet");
        izlet.setOpis("Panorama grada");
        izlet.setVrsta("Dodatne usluge");
        
        s.save(izlet);
        
       Djelatnik djelatnik = new Djelatnik();
       djelatnik.setIme("Velimir");
       djelatnik.setOib("63791759793");
       djelatnik.setPrezime("Vujicic");
       djelatnik.setEmail("velimir.vujicic@hotmail.com");
       djelatnik.setLozinka("edunova");
       djelatnik.setLozinka(BCrypt.hashpw("edunova", BCrypt.gensalt()));
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
        g.setEmail(faker.internet().emailAddress());
        
        gosti.add(g);
           
        s.save(g);
        }
        
        s.getTransaction().commit();
        
        new SplashScreen().setVisible(true);
        new Autorizacija().setVisible(true);
               
             //   System.out.println(s.getMetamodel().getEntities().size());

        
        
    
    }

}