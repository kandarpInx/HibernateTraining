package com.demo.CascadeTypes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) {
    	Employee emp = new Employee();
    	
    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
    	
    	Session session = sf.openSession();
    	session.beginTransaction();
    	emp = session.get(Employee.class, 1);
    	session.remove(emp);
    	session.getTransaction().commit();
    	session.close();
    }
}
