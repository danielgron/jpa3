/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import entity.Customer;
import entity.DiscountType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author danie
 */
public class Tester {
    public static void main(String[] args) {
        
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();
        Customer c = new Customer();
        
        Customer c2 = new Customer();
        DiscountType d = new DiscountType();
        
        try{
            em.getTransaction().begin();
            //em.persist(a);          // In order to avoid cascade with references between objects we must ensure both references are put in.
            em.persist(d);
            em.getTransaction().commit();
        }
        finally{
            if (em!=null) em.close();
        }
    }
}
