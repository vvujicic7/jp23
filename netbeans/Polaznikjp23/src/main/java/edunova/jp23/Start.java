/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23;

import edunova.jp23.controller.ObradaSmjer;
import edunova.jp23.model.Smjer;
import edunova.jp23.util.EdunovaException;
import edunova.jp23.util.InitialFixtures;

/**
 *
 * @author Mativel
 */
public class Start {
    
    public static void main(String[] args) {
        
        Smjer s = new Smjer();
        ObradaSmjer os=new ObradaSmjer();
        os.setEntitet(s);
        
        try {
            os.create();
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }
        
        
        
     // for(Smjer smjer : os.getPodaci()){
     //     System.out.println(smjer.getNaziv());
     // }
       
       

    }
    
}


