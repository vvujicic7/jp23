/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Mativel
 */
@Entity
public class Boravak extends Entitet{

    @ManyToOne
    private Gost gost;
    private Date datum_dolaska;
    private Date datum_odlaska;
    @ManyToOne
    private Usluga usluga;
    @ManyToOne 
    private Djelatnik djelatnik;

    
    public Djelatnik getDjelatnik() {
        return djelatnik;
    }

    public void setDjelatnik(Djelatnik djelatnik) {
        this.djelatnik = djelatnik;
    }

    public Usluga getUsluga() {
        return usluga;
    }

    public void setUsluga(Usluga usluga) {
        this.usluga = usluga;
    }
   
    public Gost getGost() {
        return gost;
    }

    public void setGost(Gost gost) {
        this.gost = gost;
    }

    public Date getDatum_dolaska() {
        return datum_dolaska;
    }

    public void setDatum_dolaska(Date datum_dolaska) {
        this.datum_dolaska = datum_dolaska;
    }

    public Date getDatum_odlaska() {
        return datum_odlaska;
    }

    public void setDatum_odlaska(Date datum_odlaska) {
        this.datum_odlaska = datum_odlaska;
    }

    

    
    
    
      }
