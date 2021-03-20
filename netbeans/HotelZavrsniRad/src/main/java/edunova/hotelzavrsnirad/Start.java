/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.hotelzavrsnirad;

import hotel.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import java.math.BigDecimal;
import hotel.model.HotelskaUsluga;
import hotel.model.Usluga;
/**
 *
 * @author Mativel
 */
public class Start {
    
    public static void main(String[] args) {
        Session s = HibernateUtil.getSession();
        s.beginTransaction();
        
        Usluga usluga = new Usluga();
        usluga.setCijena(BigDecimal.TEN);
        usluga.setNaziv("Apartman");
        usluga.setOpis("Nocenje s doruckom u apartmanu");
        usluga.setVrsta("Nocenje");
        
        s.save(usluga);
        
       
        
        s.getTransaction().commit();
                
             //   System.out.println(s.getMetamodel().getEntities().size());

        
        
    }
}
