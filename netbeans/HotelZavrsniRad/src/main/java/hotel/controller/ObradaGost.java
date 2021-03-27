/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.controller;

import hotel.model.Gost;
import hotel.util.EdunovaException;
import java.util.List;
import org.hibernate.CacheMode;

/**
 *
 * @author Mativel
 */
public class ObradaGost extends Obrada<Gost>{
    
    public ObradaGost() {
        super();
    }
    
    public ObradaGost(Gost g) {
        super(g);
    }

    @Override
    public List<Gost> getPodaci() {
        List<Gost> lista = session.createQuery("from Gost").list();
            session.setCacheMode(CacheMode.IGNORE);
                return lista;
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
            
    }
    
    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }
    
    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    public void setOsoba(String selectedValue) {
        
    }
    
    

}