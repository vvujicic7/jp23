/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.controller;

import edunova.jp23.model.Smjer;
import edunova.jp23.util.EdunovaException;
import java.util.List;

/**
 *
 * @author Mativel
 */
public class ObradaSmjer extends Obrada<Smjer>{

    public ObradaSmjer(){
        super();
    }
    public ObradaSmjer(Smjer s){
        super(s);
    }
    
    @Override
    public List<Smjer> getPodaci() {
        //https://docs.jboss.org/hibernate/orm/3.3/reference/en/html/queryhql.html
       return session.createQuery("from Smjer").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
       if(entitet.getNaziv()==null || entitet.getNaziv().isEmpty()){
           throw new EdunovaException("Naziv mora biti postavljen");
       }
    }

    @Override
    protected void kontrolaUpdate() {
       
    }

    @Override
    protected void kontrolaDelete() {
       
    }
    
}
