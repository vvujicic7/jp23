package hotel.util;

import hotel.controller.ObradaDjelatnik;
import hotel.model.Djelatnik;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Mativel
 */
public class KreirajDjelatnika {

    public static void main(String[] args) {
        
        Session s = HibernateUtil.getSession();
        s.beginTransaction();
        
       Djelatnik djelatnik = new Djelatnik();
       djelatnik.setIme("Velimir");
       djelatnik.setOib("63791759793");
       djelatnik.setPrezime("Vujicic");
       djelatnik.setEmail("velimir.vujicic@hotmail.com");
       djelatnik.setLozinka("edunova");
       djelatnik.setLozinka(BCrypt.hashpw("edunova", BCrypt.gensalt()));
       s.save(djelatnik);
/*
        Djelatnik d = new Djelatnik();
        d.setIme("Velimir");
        d.setPrezime("Vujicic");
        d.setEmail("velimir.vujicic@hotmail.com");
        d.setLozinka(BCrypt.hashpw("edunova", BCrypt.gensalt()));
        d.setOib("40654655739");



        ObradaDjelatnik od = new ObradaDjelatnik();
        od.setEntitet(d);

        try {
            od.create();
        } catch (EdunovaException e) {
            System.out.println(e.getMessage());
        }*/
       s.getTransaction().commit();
    }

}