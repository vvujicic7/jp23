/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Mativel
 */
@Entity
public class HotelskaUsluga implements Serializable {

    
    @ManyToOne
    private Boravak boravak;
    @ManyToOne
    private Usluga usluga;
    @ManyToOne
    private Djelatnik djelatnik;
    private BigDecimal kolicina;
    @Id
    private BigDecimal cijena;

    public Boravak getBoravak() {
        return boravak;
    }

    public void setBoravak(Boravak boravak) {
        this.boravak = boravak;
    }

    public Usluga getUsluga() {
        return usluga;
    }

    public void setUsluga(Usluga usluga) {
        this.usluga = usluga;
    }

    public Djelatnik getDjelatnik() {
        return djelatnik;
    }

    public void setDjelatnik(Djelatnik djelatnik) {
        this.djelatnik = djelatnik;
    }

    public BigDecimal getKolicina() {
        return kolicina;
    }

    public void setKolicina(BigDecimal kolicina) {
        this.kolicina = kolicina;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }
    
    
}
