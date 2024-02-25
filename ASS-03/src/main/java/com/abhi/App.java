package com.abhi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abhi.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Configuration configuration = new Configuration();
		configuration.configure(); // load and parse cfg.xml file
		SessionFactory sessionfactory = configuration.buildSessionFactory();

		Session session = sessionfactory.openSession();

		Transaction txn = session.beginTransaction();

		Student sob = new Student();
		sob.setRno(101);
		sob.setName("AAA");
		sob.setPer(50.00);

		session.save(sob);
		txn.commit();
		session.close();
		sessionfactory.close();
		System.out.println("hurry.......I done my first Hibernate");

	}
}
