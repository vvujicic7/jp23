/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.util;

import edunova.jp23.model.Grupa;
import edunova.jp23.model.Polaznik;
import edunova.jp23.model.Predavac;
import edunova.jp23.model.Smjer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Korisnik
 */
public class InitialFixtures {
    
    public static void start(){
        Session s = HibernateUtil.getSession();
        s.beginTransaction();
        
        // Domaća zadaća: optimizirati kod (metode,...)
        
        Smjer java = new Smjer();
        java.setNaziv("Java programiranje");
        java.setCijena(new BigDecimal(5900.09));
        java.setTrajanje(130);
        java.setVerificiran(Boolean.TRUE);
        
        s.save(java);
        
         Smjer php = new Smjer();
        php.setNaziv("PHP programiranje");
        php.setCijena(new BigDecimal(4900.09));
        php.setTrajanje(130);
        php.setVerificiran(Boolean.FALSE);
        
        s.save(php);
        
        List<Polaznik> polaznici=new ArrayList<>();
        Polaznik p;
        for(int i=0;i<100;i++){
            p=new Polaznik();
            p.setIme("Polaznik");
            p.setPrezime(String.valueOf(i+1));
            s.save(p);
            polaznici.add(p);
        }
        
        Predavac predavac = new Predavac();
        predavac.setIme("Predavač");
        predavac.setPrezime("Grupe");
        
        s.save(predavac);
        
        Grupa jp23 = new Grupa();
        jp23.setNaziv("JP23");
        jp23.setSmjer(java);
        jp23.setPredavac(predavac);
        
        Collections.shuffle(polaznici);
        for(int i=0;i<19;i++){
            jp23.getPolaznici().add(polaznici.get(i));
        }
        
        s.save(jp23);
        
        
         Grupa pp22 = new Grupa();
        pp22.setNaziv("PP22");
        pp22.setSmjer(php);
        pp22.setPredavac(predavac);
        
        Collections.shuffle(polaznici);
        for(int i=0;i<16;i++){
            pp22.getPolaznici().add(polaznici.get(i));
        }
        
        s.save(pp22);
        s.getTransaction().commit();
        
    }
    
}