/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.util;


import com.github.javafaker.Faker;
import hotel.model.Gost;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Mativel
 */
public class InitialFixtures {
    
    public static void main(String[] args){
        Session s = HibernateUtil.getSession();
        s.beginTransaction();
        
        Faker faker = new Faker();
        List<Gost> gosti = new ArrayList<>();
        Gost g;
        for(int i=0; i>50; i++ );
        g = new Gost();
        g.setIme(faker.name().firstName());
        g.setPrezime(faker.name().lastName());
        gosti.add(g);
        
        s.save(g);
        s.getTransaction().commit();
        
        
        
        
       
    }
    
}
