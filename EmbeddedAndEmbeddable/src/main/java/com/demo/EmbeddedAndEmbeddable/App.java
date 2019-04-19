package com.demo.EmbeddedAndEmbeddable;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
	final static Logger logger = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	
    	Student student1 = new Student();
    	
    	student1.setStudent_id(1);
    	student1.setStudent_name("Kandarp");
    	
    	Address ad = new Address();
    	
    	ad.setStreet("Street name");
    	ad.setCity("City name");
    	
    	student1.setHome_address(ad);
    	
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(student1);
    	session.getTransaction().commit();
    	session.close();
    	
    }
}
