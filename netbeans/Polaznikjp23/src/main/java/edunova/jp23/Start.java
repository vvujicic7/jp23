/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23;

import edunova.jp23.model.Dokument;
import edunova.jp23.util.HibernateUtil;
import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.Session;

/**
 *
 * @author Mativel
 */
public class Start {
    
    public static void main(String[] args) {

        Session s= HibernateUtil.getSession();
        Dokument d=new Dokument();
        d.setDatum(new Date());
        d.setNaziv("Račun");
        d.setPlacen(Boolean.TRUE);
        d.setIznos(new BigDecimal (23.99));
        
        s.beginTransaction();
        s.save(d);
        s.getTransaction().commit();
        //System.out.println(s.getMetamodel().getEntities().size());

    }


    }
    

