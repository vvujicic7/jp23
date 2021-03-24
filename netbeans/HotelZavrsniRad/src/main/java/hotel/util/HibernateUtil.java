/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author Mativel
 */
public class HibernateUtil {
    
    private static StandardServiceRegistry registry;
    private static Session session;
    
    public static Session getSession() {
        if (session == null) {
            
            try {
                
                registry = new StandardServiceRegistryBuilder().configure().build();

                
                MetadataSources sources = new MetadataSources(registry);

                
                Metadata metadata = sources.getMetadataBuilder().build();

                
               SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
                
                session=sessionFactory.openSession();
            } catch (Exception e) {
                
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
               
            }
        }
        return session;
    }

    public static void shutdown() {
        if (registry != null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
    
}

    

