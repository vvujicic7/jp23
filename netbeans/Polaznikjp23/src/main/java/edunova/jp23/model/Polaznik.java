/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.model;

import javax.persistence.Entity;


/**
 *
 * @author Mativel
 */
@Entity
public class Polaznik extends Osoba{
    
    private String brojUgovora;

    public String getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(String brojUgovora) {
        this.brojUgovora = brojUgovora;
    }
    
    
    
}

