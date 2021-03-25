/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.controller;

import hotel.model.Usluga;
import hotel.util.EdunovaException;
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
        
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }
    
}
