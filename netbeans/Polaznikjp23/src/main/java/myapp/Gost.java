/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Mativel
 */
@Entity
public class Gost {
    
    private String ime;
    private String prezime;
    private String email;
    private Date datumRodjenja;
    private String drzavljanstvo;
    
    
}
