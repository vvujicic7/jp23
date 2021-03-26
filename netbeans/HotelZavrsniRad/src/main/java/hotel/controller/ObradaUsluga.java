/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.controller;

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
        
        List<Usluga> lista = session.createQuery("from Usluga").list();
            session.setCacheMode(CacheMode.IGNORE);
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
        if(!entitet.getHotelskeUsluge().isEmpty()){
            StringBuilder sb = new StringBuilder();
            sb.append("Uslugu ne mogu obrisati jer se koristi na HotelskojUsluzi: ");
            for(HotelskaUsluga h : entitet.getHotelskeUsluge()){
                sb.append(h.getNaziv());
                sb.append(", ");
            }
            throw new EdunovaException( sb.toString());
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

    

    
    }

    
