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
    
    private String ime;
    private String prezime;
    private char oib;

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

    public char getOib() {
        return oib;
    }

    public void setOib(char oib) {
        this.oib = oib;
    }
    
    
}
