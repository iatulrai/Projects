package com.hbannotation;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class RunEmp {
	public static void main(String[] args) {

		Session session = new AnnotationConfiguration().configure()
				.buildSessionFactory().openSession();

		Transaction t = session.beginTransaction();

		Emp e1 = new Emp();
		e1.setId(1001);
		e1.setFirstName("Ram");
		e1.setLastName("Sir");

		Emp e2 = new Emp();
		e2.setId(1002);
		e2.setFirstName("Seeta");
		e2.setLastName("mam");

		session.persist(e1);
		session.persist(e2);

		t.commit();
		session.close();
		
		System.out.println("Data Saved");
	}

}
