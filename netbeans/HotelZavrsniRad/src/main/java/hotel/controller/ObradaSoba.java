/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.controller;

import hotel.model.Soba;
import hotel.util.EdunovaException;
import java.util.List;

/**
 *
 * @author Mativel
 */
public class ObradaSoba extends Obrada<Soba> {

    
        @Override
    public List<Soba> getPodaci() {
        return session.createQuery("from Soba s "
                + " order by s.brojsobe").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
