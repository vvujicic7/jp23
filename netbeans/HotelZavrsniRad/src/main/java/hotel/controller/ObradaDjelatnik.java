/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.controller;

import hotel.model.Djelatnik;
import hotel.util.EdunovaException;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Mativel
 */
public class ObradaDjelatnik extends ObradaOsoba<Djelatnik>{

    /**
     * Autorizacija operatera na bazi
     * @param email email operatera kojeg želimo autorizirati
     * @param lozinka plain lozinka kao char[] koju je unio korisnik na formi
     * @return Instancu klase Operater ako operater s danim emailom postoji i lozinka
     * odgovara. Vraća null ukoliko operater ne postoji u bazi ili lozinka ne odgovara
     */
    public Djelatnik autoriziraj(String email, char[] lozinka){
       
        Djelatnik djelatnik = (Djelatnik)session
                .createQuery("from Djelatnik o where o.email=:email")
                .setParameter("email", email)
                .getSingleResult();
        if(djelatnik==null){
            return null;
        }
        return BCrypt.checkpw(new String(lozinka),djelatnik.getLozinka()) ? djelatnik : null;
    }
    
    
    public List<Djelatnik> getPodaci() {
        return session.createQuery("from Djelatnik").list();
    }

    protected void kontrolaDelete() throws EdunovaException {
    
    }
    
}
