package com.demo.HQL_2;

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
		
		/* ******************************** insert records ***************************************** */
		
		/*
		 * Random r = new Random();
		 * 
		 * for(int i=0; i<10; i++) { Employee emp = new Employee();
		 * emp.setEmpName("Employee "+(i+1)); emp.setEmpSalary(r.nextInt(10000));
		 * 
		 * session.save(emp); }
		 */
		
		/* **************************************************************************************** */
		
//		Query query = session.createQuery("from Employee");	// Select all records
		
//		Query query = session.createQuery("select sum(empSalary) from Employee");	// Sum of salary

//		Query query = session.createQuery("select min(empSalary) from Employee");	// Minimum salary
		
//		Query query = session.createQuery("select max(empSalary) from Employee");	// Maximum salary
		
		Query query = session.createQuery("select avg(empSalary) from Employee");	// Average salary
		
		List<Integer> list = query.list();  
		System.out.println(list.get(0));
		
		/*
		 * List<Employee> list = query.list();
		 * 
		 * for (Employee e : list) { System.out.println("Employee name is " +
		 * e.getEmpName() + " and salary is " + e.getEmpSalary() + " rs."); }
		 */

		session.getTransaction().commit();
		session.close();
	}
}
