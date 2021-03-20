/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Mativel
 */

public class HotelskaUsluga {

    @ManyToOne
    private Integer boravak;
    @ManyToOne
    private Integer usluga;
    @ManyToOne
    private Integer djelatnik;
    private BigDecimal kolicina;
    private BigDecimal cijena;

    public Integer getBoravak() {
        return boravak;
    }

    public void setBoravak(Integer boravak) {
        this.boravak = boravak;
    }

    public Integer getUsluga() {
        return usluga;
    }

    public void setUsluga(Integer usluga) {
        this.usluga = usluga;
    }

    public Integer getDjelatnik() {
        return djelatnik;
    }

    public void setDjelatnik(Integer djelatnik) {
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
