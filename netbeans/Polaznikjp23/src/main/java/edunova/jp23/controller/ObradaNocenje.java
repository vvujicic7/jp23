/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.controller;

import edunova.jp23.util.EdunovaException;
import java.util.List;

/**
 *
 * @author Mativel
 */
public class ObradaNocenje extends Obrada<Nocenje>{

    @Override
    public List<Nocenje> getPodaci() {
        return session.createQuery("from Nocenje n ").list();
    }
    public List<Nocenje> getPodaci(String uvjet) {
        return session.createQuery("from Nocenje n ")
                
                .setMaxResults(20)
                .list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
