package com.demo.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) {
    	
    	Employee emp = new Employee();
    	emp.setEmp_name("Kandarp Dave");
    	
    	Vehicle v1= new Vehicle();
    	v1.setVehicle_name("Bike");
    	
    	Vehicle v2= new Vehicle();
    	v2.setVehicle_name("Car");
    	
    	emp.getVehicle().add(v1);
    	emp.getVehicle().add(v2);
    	v1.setEmp(emp);
    	v2.setEmp(emp);
    	
    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
    	
    	Session session = sf.openSession();
    		
    	session.beginTransaction();
    	session.save(emp);
    	session.save(v1);
    	session.save(v2);
    	session.getTransaction().commit();
    	session.close();
    	
    	
    }
}
