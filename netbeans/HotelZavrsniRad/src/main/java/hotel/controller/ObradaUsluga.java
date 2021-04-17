/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.controller;

import hotel.model.Boravak;
import hotel.model.HotelskaUsluga;
import hotel.model.Usluga;
import hotel.util.EdunovaException;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.CacheMode;

/**
 *
 * @author Mativel
 */
public class ObradaUsluga extends Obrada<Usluga> {
    
    public ObradaUsluga() {
        super();
    }
    
    public ObradaUsluga(Usluga u) {
        super(u);
    }

    
    @Override
    public List<Usluga> getPodaci() {
        
        List<Usluga> lista = session.createQuery("from Usluga u").list();
            
                return lista;
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaNaziv();
        kontrolaVrsta();
        kontrolaOpis();
        kontrolaCijena();
        
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        kontrolaCreate();
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        if(entitet.getBoravci().size() > 0){
            throw new EdunovaException("Ne možete obrisati uslugu jer se koristi");
        }
    }

    private void kontrolaNaziv() throws EdunovaException {
       kontrolaNazivPostavljen();
       
    }

    private void kontrolaNazivPostavljen() throws EdunovaException {
        if(entitet.getNaziv()==null 
               || entitet.getNaziv().isEmpty()){
           throw new EdunovaException("Naziv mora biti postavljen");
       }
    }

    private void kontrolaCijena() throws EdunovaException {
        if(entitet.getCijena()==null 
               || entitet.getCijena().compareTo(BigDecimal.ZERO)<=0){
           throw new EdunovaException("Cijena mora biti postavljena i veća od 0");
       }
    }

    private void kontrolaVrsta() throws EdunovaException {
        if(entitet.getVrsta()==null 
               || entitet.getVrsta().isEmpty()){
           throw new EdunovaException("Vrsta mora biti unesena");
       }
    }

    private void kontrolaOpis() throws EdunovaException {
        if(entitet.getOpis()==null
                || entitet.getOpis().isEmpty()){
            throw new EdunovaException("Opis mora biti unesen");
        }
    }

    public void setEntitet(Boravak b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    }

    
