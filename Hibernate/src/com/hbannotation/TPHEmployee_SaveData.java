package com.hbannotation;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TPHEmployee_SaveData {

	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		Session session = cfg.configure().buildSessionFactory().openSession();

		Transaction tx = session.beginTransaction();

		TPHEmployee e1 = new TPHEmployee();
		e1.setName("Ram");

		TPHEmployee_Regular e2 = new TPHEmployee_Regular();
		e2.setName("Sohan");
		e2.setSalary(10000);
		e2.setBonus(6);

		TPHEmployee_Contract e3 = new TPHEmployee_Contract();

		e3.setName("Mohan");
		e3.setPay_per_hour(2000);
		e3.setContract_duration("10 hr");

		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		tx.commit();
		session.close();

		System.out.println("Data saved Successfully");
	}

}
