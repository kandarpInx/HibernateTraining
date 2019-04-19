package com.demo.NamedQuery;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		/*
		 * Random r = new Random();
		 * 
		 * for(int i=0;i<10;i++) { Student stud = new Student();
		 * stud.setStudName("Student - "+(i+1)); stud.setStudAddr("Adderss - "+(100+i));
		 * stud.setMarks(r.nextInt(100)); session.save(stud); }
		 */ 
		 
		Query query = session.getNamedQuery("select_record_by_id");

		query.setParameter("studId", 7);

		List<Student> stud = query.list();

		for (Student s : stud) {
			System.out.println(s.getStudName() + "----- Marks -----" + s.getMarks());
		}
  
		session.getTransaction().commit();
		session.close();
		
		
		
		
	}
}
