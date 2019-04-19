package com.demo.HQL_1;

import java.util.List;

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
		 * for(int i=0;i<10;i++) { Student student = new Student();
		 * student.setStudentName("Student "+ (i+1)); session.save(student); }
		 */
		
		int minId = 5;
		String name = "Kandarp Dave";
		
		/* ************************** Display all records ***************************************** */
		
		/*
		 * Query query = session.createQuery("from Student");
		 * 
		 * //		query.setFirstResult(3);
		 * //		query.setMaxResults(3);
		 * 
		 * List<Student> list = query.list();
		 * 
		 * for (Student s : list) { System.out.println("Name of student is :: " +
		 * s.getStudentName() + " id is :: " + s.getStudentId()); }
		 */ 
		
		/* **************************************************************************************** */
		
//		Query query = session.createQuery("from Student where studentId >"+minId);
//		Query query = session.createQuery("from Student where studentId = :studentId");
		
		Query query = session.createQuery("update Student set studentName=:studentName where studentId = :studentId");

		query.setParameter("studentId", minId);
		query.setParameter("studentName", name);

		int status = query.executeUpdate();
		System.out.println(status); 
		
		session.getTransaction().commit();
		session.close();
	}
}
