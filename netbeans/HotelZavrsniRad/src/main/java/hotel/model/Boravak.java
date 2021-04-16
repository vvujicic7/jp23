/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.model;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
    private Djelatnik djelatnik;
    private String naziv;
    private String nocenje;
    private Date datumUsluge;
    @ManyToMany
    private List<HotelskaUsluga> hotelskaUsluga = new ArrayList<>();

    public List<HotelskaUsluga> getHotelskaUsluga() {
        return hotelskaUsluga;
    }

    public void setHotelskaUsluga(List<HotelskaUsluga> hotelskaUsluga) {
        this.hotelskaUsluga = hotelskaUsluga;
    }
            
    public Date getDatumUsluge() {
        return datumUsluge;
    }

    public void setDatumUsluge(Date datumUsluge) {
        this.datumUsluge = datumUsluge;
    }
   
    public String getNocenje() {
        return nocenje;
    }

    public void setNocenje(String nocenje) {
        this.nocenje = nocenje;
    }
    
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    public Djelatnik getDjelatnik() {
        return djelatnik;
    }

    public void setDjelatnik(Djelatnik djelatnik) {
        this.djelatnik = djelatnik;
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

    public void setNocenje(int value) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
@Override
    public String toString() {
        if(getNaziv()==null || getNaziv().trim().isEmpty()){
            return "[Naziv nije definiran]";
        }
        return getNaziv();
    }

    

        
    
    }
    
    
    
    
      
