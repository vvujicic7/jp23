/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.model;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author Mativel
 */
@MappedSuperclass
public abstract class Osoba extends Entitet{
    
    private String ime;
    private String prezime;
    private String Oib;

    public String getOib() {
        return Oib;
    }

    public void setOib(String Oib) {
        this.Oib = Oib;
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
    
    
}
