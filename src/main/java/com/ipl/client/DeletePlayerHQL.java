package com.ipl.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


//import com.ipl.entity.*;


public class DeletePlayerHQL {
      public static void main(String args[]) {
    	     SessionFactory sf = new Configuration().configure().buildSessionFactory();
    	     
    	     Session session = sf.openSession();
    	  
    	     Transaction tx = session.beginTransaction();
    	     
    	     String hql = "delete from Player where playerId=:id";
    	     
    	     Query query = session.createQuery(hql);
    	     
   
    	     query.setParameter("id", 6);
    	     
    	      int result = query.executeUpdate();
    	      
    	      tx.commit();
    	      
    	      System.out.println("Rows deleted: "+result);
    	      
    	      session.close();
    	      sf.close();
      }
}
