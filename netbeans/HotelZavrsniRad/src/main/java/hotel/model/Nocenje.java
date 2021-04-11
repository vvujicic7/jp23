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
public class Nocenje extends Entitet {
    
    private String kolicina;

    public String getKolicina() {
        return kolicina;
    }

    public void setKolicina(String kolicina) {
        this.kolicina = kolicina;
    }
    
    
}
