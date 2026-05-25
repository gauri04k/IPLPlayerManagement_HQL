package com.ipl.client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ipl.entity.Player;
public class FetchSinglePlayer {
   public static void main(String args[]) {
	   SessionFactory sf = new Configuration().configure().buildSessionFactory();
	   Session session = sf.openSession();
	   
	   String hql = "from Player where playerId=:id";
	   
	   Query<Player>query = session.createQuery(hql, Player.class);
	   //for single player
	   query.setParameter("id", 2);
	   //for single player
	   Player p = query.uniqueResult();
	   
	   System.out.println(p);
	   
	   session.clear();
	   sf.close();
	  
   }
}
