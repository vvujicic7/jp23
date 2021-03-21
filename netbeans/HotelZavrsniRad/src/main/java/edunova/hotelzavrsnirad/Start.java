/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.hotelzavrsnirad;

import hotel.model.Boravak;
import hotel.model.Djelatnik;
import hotel.model.Gost;
import hotel.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import java.math.BigDecimal;
import hotel.model.HotelskaUsluga;
import hotel.model.Usluga;
import java.time.Instant;
import java.util.Date;
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
        Gost gost = null;
       boravak.setGost(gost);
        
       s.save(boravak);
        s.getTransaction().commit();
                
             //   System.out.println(s.getMetamodel().getEntities().size());

        
        
    }
}
