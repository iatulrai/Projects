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

		

		// persisting the object
		session.persist(e1);
		

		// transaction is committed
		t.commit();
		session.close();

		System.out.println("Data saved successfully");

	}

}
