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
    @ManyToOne
    private Usluga usluga;
    private Date datum_dolaska;
    private Date datum_odlaska;

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

    public String getNaziv() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
        
          
    
    }
