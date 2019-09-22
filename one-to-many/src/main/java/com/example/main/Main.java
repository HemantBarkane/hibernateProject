package com.example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.example.course.Course;
import com.example.subject.Subject;

public class Main {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Course c = new Course("IT");
		Subject s1 = new Subject("c");
		Subject s2 = new Subject("c++");
		Subject s3 = new Subject("java");
		Subject s4 = new Subject("html");
		Subject s5 = new Subject("python");
		c.getSub().add(s1);
		c.getSub().add(s2);
		c.getSub().add(s3);
		c.getSub().add(s4);
		c.getSub().add(s5);
		
		s.save(c);
		s.save(s1);
		s.save(s2);
		s.save(s3);
		s.save(s4);
		s.save(s5);
		
		t.commit();
		s.close();
		sf.close();
		
	}

}
