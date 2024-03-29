/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Mativel
 */
@Entity
public class Usluga extends Entitet {
    
    
    @NotNull(message = "Obavezno postaviti naziv (naziv je null)")
    @NotEmpty(message = "Naziv ne može biti prazan")
    @Size(min=3, max=20, message = "Naziv mora biti između 3 i 20 znakova")
    private String naziv;
    private String vrsta;
    private String opis;
    private BigDecimal cijena;
    
    @ManyToMany(mappedBy = "usluga")
    private Set<Boravak> boravci = new HashSet<>();
    
    //@OneToMany(mappedBy = "usluga")
    //private List<HotelskaUsluga> hotelskeUsluge = new ArrayList<>();
    
    @ManyToOne
    private Boravak boravak;
    
    private Date datumUsluge;

    public Set<Boravak> getBoravci() {
        return boravci;
    }

    public void setBoravci(Set<Boravak> boravci) {
        this.boravci = boravci;
    }
    
    

    public Boravak getBoravak() {
        return boravak;
    }

    public void setBoravak(Boravak boravak) {
        this.boravak = boravak;
    }

    
    public Date getDatumUsluge() {
        return datumUsluge;
    }

    public void setDatumUsluge(Date datumUsluge) {
        this.datumUsluge = datumUsluge;
    }
    
    
   /* public List<HotelskaUsluga> getHotelskeUsluge() {
        return hotelskeUsluge;
    }

    public void setHotelskeUsluge(List<HotelskaUsluga> hotelskeUsluge) {
        this.hotelskeUsluge = hotelskeUsluge;
    }*/

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }
    
    @Override
    public String toString() {
        if(getNaziv()==null || getNaziv().trim().isEmpty()){
            return "[Naziv nije definiran]";
        }
        return getNaziv();
    }

    
    
           
    
}
