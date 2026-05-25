package com.ipl.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ipl.entity.Player;



public class FetchAllPlayers {
        public static void main(String args[]) {
        	      SessionFactory sf  = new Configuration().configure().buildSessionFactory();
        	      Session session = sf.openSession();
        	      
        	      String hql = "from Player";
        	      
        	      Query<Player>query =  session.createQuery(hql,Player.class);
        	      
        	      List<Player>players = query.list();
        	      
        	      for(Player p :players) {
        	    	      System.out.println(p);
        	      }
        	      
        	      session.close();
        	      sf.close();
        	      
        }
}
