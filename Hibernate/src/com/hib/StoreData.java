package com.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {

		// creating configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the date of
											// configuration file

		// creating session object factory
		SessionFactory factory = cfg.buildSessionFactory();

		// creating session object

		Session session = factory.openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setId(1111);
		e1.setFirstName("Atul");
		e1.setLastName("Rai");

		Employee e2 = new Employee();

		e2.setId(123);
		e2.setFirstName("Ram");
		e2.setLastName("Singh");

		Employee e3 = new Employee();

		e3.setId(12333);
		e3.setFirstName("Anand");
		e3.setLastName("Maurya");

		// persisting the object
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		// transaction is committed
		t.commit();
		session.close();

		System.out.println("Data saved successfully");

	}

}
