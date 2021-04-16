/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Mativel
 */
@Entity
public class Djelatnik extends Osoba{
    
    
    
   // @NotNull
    //@NotEmpty
    private String lozinka;
    
    @OneToMany(mappedBy = "djelatnik")
    private List<HotelskaUsluga> hotelskeusluge = new ArrayList<>();

    @Override
    public List<HotelskaUsluga> getHotelskeusluge() {
        return hotelskeusluge;
    }

    @Override
    public void setHotelskeusluge(List<HotelskaUsluga> hotelskeusluge) {
        this.hotelskeusluge = hotelskeusluge;
    }


    

    public String getLozinka() {
        return lozinka;
    }
    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }
    
    public String getImePrezime(){
        return getIme() + " " + getPrezime();
    }
    @Override
    public String toString() {
        if(getIme()==null || getIme().trim().isEmpty() || getPrezime()==null || getPrezime().trim().isEmpty()){
            return "[Naziv nije definiran]";
        }
        return getIme()+" " + getPrezime();
    }
    
}
