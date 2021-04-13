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
public class Soba extends Entitet {
    
    @ManyToOne
    private Boravak boravak;
    
    private Date datumPrijave;
    
    private String brojSobe;

    public Boravak getBoravak() {
        return boravak;
    }

    public void setBoravak(Boravak boravak) {
        this.boravak = boravak;
    }

    public Date getDatumPrijave() {
        return datumPrijave;
    }

    public void setDatumPrijave(Date datumPrijave) {
        this.datumPrijave = datumPrijave;
    }

    
    public String getBrojSobe() {
        return brojSobe;
    }

    public void setBrojSobe(String brojSobe) {
        this.brojSobe = brojSobe;
    }
    @Override
    public String toString() {
       return getBrojSobe().toString();
    }
    
    
}
