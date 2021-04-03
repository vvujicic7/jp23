/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.controller;


import edunova.jp23.model.Clan;
import edunova.jp23.util.EdunovaException;
import java.util.List;

/**
 *
 * @author Mativel
 */
public class ObradaClan extends Obrada<Clan>{


    
    @Override
    public List<Clan> getPodaci() {
        //https://docs.jboss.org/hibernate/orm/3.3/reference/en/html/queryhql.html
        List<Clan> lista =session.createQuery("from Clan").list();
      
        return lista;
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
       
    }

    @Override
    protected void kontrolaUpdate()throws EdunovaException {
      
    }

    @Override
    protected void kontrolaDelete()throws EdunovaException {
       
    }
    
   
}
