/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Mativel
 */
@Entity
public class Gost extends Osoba {
    
    private String ime;
    private String prezime;
    private String email;
    private Date datum_rodjenja;
    private String drzavljanstvo;
    
    @OneToMany(mappedBy = "gost")
    private List<Boravak> boravci = new ArrayList<>();

    public List<Boravak> getBoravak() {
        return boravci;
    }

    public void setBoravci(List<Boravak> boravci) {
        this.boravci = boravci;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatum_rodjenja() {
        return datum_rodjenja;
    }

    public void setDatum_rodjenja(Date datum_rodjenja) {
        this.datum_rodjenja = datum_rodjenja;
    }

    public String getDrzavljanstvo() {
        return drzavljanstvo;
    }

    public void setDrzavljanstvo(String drzavljanstvo) {
        this.drzavljanstvo = drzavljanstvo;
    }
    
    @Override
    public String toString() {
        if(getIme()==null || getIme().trim().isEmpty() || getPrezime()==null || getPrezime().trim().isEmpty()){
            return "[Naziv nije definiran]";
        }
        return getIme()+" " + getPrezime();
    }

    
    
    
    
}
