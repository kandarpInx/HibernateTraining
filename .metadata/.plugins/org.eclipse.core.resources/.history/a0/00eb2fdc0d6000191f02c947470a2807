package com.demo.InheritanceSingleTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) {
    	
    	Vehicle v1 = new Vehicle();
    	v1.setVehicleName("Bicycle");
    	
    	FourWheel f1 = new FourWheel();
    	f1.setVehicleName("Car");
    	f1.setSteeringWheel("Steering type is wheel...!");
    	
    	TwoWheel t1 = new TwoWheel();
    	t1.setVehicleName("Bike");
    	t1.setSteeringHandle("Steering type is handle...!");
    	
    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
    	Session session = sf.openSession();
    	session.beginTransaction();
    	session.save(v1);
    	session.save(f1);
    	session.save(t1);
    	session.getTransaction().commit();
    	session.close();
    }
}
