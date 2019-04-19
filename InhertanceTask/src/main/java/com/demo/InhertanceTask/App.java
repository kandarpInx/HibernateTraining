package com.demo.InhertanceTask;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		Item i = new Item();
		i.setItemName("Book");
		i.setDeletedBy("sdasdasd");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(i);
		session.getTransaction().commit();
		session.close();
		
	}
}
