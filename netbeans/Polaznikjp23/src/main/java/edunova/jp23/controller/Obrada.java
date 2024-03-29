/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.controller;

import edunova.jp23.model.Entitet;
import edunova.jp23.util.EdunovaException;
import edunova.jp23.util.HibernateUtil;
import edunova.jp23.view.Aplikacija;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.hibernate.Session;

/**
 *
 * @author Mativel
 */
public abstract class Obrada<T extends Entitet> {
    
    protected T entitet;
    protected Session session;
    protected Validator validator;
    
    public abstract List<T> getPodaci();
    protected abstract void kontrolaCreate() throws EdunovaException;
    protected abstract void kontrolaUpdate() throws EdunovaException;
    protected abstract void kontrolaDelete() throws EdunovaException;
    
    public Obrada(){
        this.session=HibernateUtil.getSession();
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        this.validator=factory.getValidator();
    }
    public Obrada(T entitet){
        this();
        this.entitet=entitet;
    }
    
    public T create() throws EdunovaException{
        kontrola();
        kontrolaCreate();
        entitet.setOperaterUnosa(Aplikacija.operater);
        entitet.setDatumUnosa(new Date());
        save();
        return this.entitet;
    }
    
    public T update() throws EdunovaException{
        kontrola();
        kontrolaUpdate();
        entitet.setOperaterPromjene(Aplikacija.operater);
        entitet.setDatumPromjene(new Date());
        save();
        return this.entitet;
    }
    
    public boolean delete() throws EdunovaException{
        kontrolaDelete();
        session.beginTransaction();
        session.delete(this.entitet);
        session.getTransaction().commit();
        return true;
    }
    
    private void save(){
        session.beginTransaction();
        session.save(this.entitet);
        session.getTransaction().commit();
    }
    
    protected void kontrola() throws EdunovaException{
        //https://howtodoinjava.com/hibernate/hibernate-validator-java-bean-validation/
         Set<ConstraintViolation<T>> constraintViolations 
                 = validator.validate(this.entitet);
         
         if(constraintViolations.size()>0){
             
             //String s=""; // Ovo nije najbolje
             StringBuilder sb=new StringBuilder();
             for (ConstraintViolation<T> violation : constraintViolations) {
             //   s+=violation.getMessage() + ", ";
             sb.append(violation.getMessage());
             sb.append(", ");
            }
            // throw new EdunovaException(s);
             throw new EdunovaException(sb.toString());
         }
         
         
    }
    
    

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }

    
    
    
    
}

