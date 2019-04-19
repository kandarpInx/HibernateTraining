package com.demo.HQLJoins;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {
	public static void main(String[] args) {
		
//		Customer cm = new Customer();
//		cm.setCustName("Abc");
		
//		ProductDetails pd = new ProductDetails();
//		pd.setProdName("Books");
//		ProductDetails pd1 = new ProductDetails();
//		pd1.setProdName("Pens");
//		ProductDetails pd2 = new ProductDetails();
//		pd2.setProdName("Pencils");
//		cm.getPd().add(pd);
//		cm.getPd().add(pd1);
//		cm.getPd().add(pd2);
		
//		pd.setCust(cm);
//		pd1.setCust(cm);
//		pd2.setCust(cm);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
//		session.save(cm);
		
		Query query = session.createQuery("Select new list(c.custName,p.prodName,p.prodPrice) "
				+ "from Customer c "
				+ "Left Join ProductDetails p with c.custId = p.cust "
				+ "where p.prodName between 'O' and 'Q' "
				+ "group by c.custName "
				+ "having avg(p.prodPrice) > 100 "
				+ "order by p.prodPrice desc");
		
		List<List> list = query.list();

		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		session.getTransaction().commit();
		session.close();
	}
}
