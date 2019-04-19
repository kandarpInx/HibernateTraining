package com.demo.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) {
    	
    	Employee emp = new Employee();
    	emp.setEmp_name("Kandarp Dave");
    	
    	Vehicle v1 = new Vehicle();
    	v1.setVehicle_name("Car");
    	
    	emp.setVehicle(v1);
    	
    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	session.beginTransaction();
    	session.save(emp);
    	session.save(v1);
    	session.getTransaction().commit();
    	session.close();
    }
}
