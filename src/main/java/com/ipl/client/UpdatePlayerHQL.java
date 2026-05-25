package com.ipl.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UpdatePlayerHQL {
        public static void main(String args[]) {
        	   SessionFactory sf =  new Configuration().configure().buildSessionFactory();
        	   
        	   Session session = sf.openSession();
        	   
        	   Transaction tx = session.beginTransaction();
        	   
        	   String hql = "update Player set runs=:runs where playerId=:id";
        	   
        	   Query query =session.createQuery(hql);
        	   
        	   query.setParameter("runs", 9000);
        	   query.setParameter("id", 1);
        	   
        	   
        	   int result = query.executeUpdate();
        	   
        	   tx.commit();
        	   
        	   System.out.println("Rows Updated: +result");
        	   
        	   session.close();
        	   sf.close();
        	   
        }
}
