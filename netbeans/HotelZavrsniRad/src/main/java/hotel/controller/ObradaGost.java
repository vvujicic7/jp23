/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.controller;

import hotel.model.Gost;
import hotel.util.EdunovaException;
import java.util.List;

/**
 *
 * @author Mativel
 */
public class ObradaGost extends ObradaOsoba<Gost>{

    @Override
    public List<Gost> getPodaci() {
        return session.createQuery("from Gost").list();
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
    
    

}