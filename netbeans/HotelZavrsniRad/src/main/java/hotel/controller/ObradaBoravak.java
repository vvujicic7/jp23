/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.controller;

import hotel.model.Boravak;
import hotel.util.EdunovaException;
import java.util.Collection;
import java.util.List;
import org.hibernate.CacheMode;

/**
 *
 * @author Mativel
 */
public class ObradaBoravak extends Obrada<Boravak> {
    
    public ObradaBoravak() {
        super();
    }
    
    public ObradaBoravak(Boravak b) {
        super(b);
    }

    @Override
    public List<Boravak> getPodaci() {
        List<Boravak> lista = session.createQuery("from Boravak").list();
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
}

        
    
    
    

