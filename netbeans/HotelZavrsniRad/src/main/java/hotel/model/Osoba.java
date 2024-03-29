/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;


/**
 *
 * @author Mativel
 */
@MappedSuperclass
public abstract class Osoba extends Entitet{
    
    
    
    private String ime;
    private String prezime;
    private String oib;
    @Email(message = "email nije ispravan")
    private String email;
    
    @OneToMany(mappedBy = "djelatnik")
    private List<HotelskaUsluga> hotelskeusluge = new ArrayList<>();

    public List<HotelskaUsluga> getHotelskeusluge() {
        return hotelskeusluge;
    }

    public void setHotelskeusluge(List<HotelskaUsluga> hotelskeusluge) {
        this.hotelskeusluge = hotelskeusluge;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    
    @Override
    public String toString() {
        if(getIme()==null || getIme().trim().isEmpty() || getPrezime()==null || getPrezime().trim().isEmpty()){
            return "[Naziv nije definiran]";
        }
        return getIme()+" " + getPrezime();
    }
}
