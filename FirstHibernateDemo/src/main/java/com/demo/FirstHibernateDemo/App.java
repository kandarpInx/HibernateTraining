package com.demo.FirstHibernateDemo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Student s = new Student();
        
        s.setRollno(1);
        s.setName("Kandarp");
        s.setAddress("Address of student needs to be inserted here...");
        s.setCity("Junagadh");
        s.setDateOfBirth(new Date());
        
//        Configuration conf = new Configuration().configure();
//        addAnnotatedClass(Student.class)
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(s);
        session.getTransaction().commit();
        System.out.println("City is :: "+s.getCity());
        session.close();
        
        s = null;
        
        session = sf.openSession();
        session.beginTransaction();
        s = session.get(Student.class, 1);
        System.out.println("Student name is :: "+s.getName());
        System.out.println("Birth Date is :: "+s.getDateOfBirth());
        System.out.println("Address is :: "+s.getAddress());
        System.out.println("City is :: "+s.getCity());
        session.close();
        
    }
}