/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.model;

import javax.persistence.Entity;

/**
 *
 * @author Mativel
 */
@Entity
public class Djelatnik extends Osoba{
    
    
    
   // @NotNull
    //@NotEmpty
    private String lozinka;


    

    public String getLozinka() {
        return lozinka;
    }
    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }
    
    public String getImePrezime(){
        return getIme() + " " + getPrezime();
    }
    
}
