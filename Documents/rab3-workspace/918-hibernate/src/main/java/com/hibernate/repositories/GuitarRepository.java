package com.hibernate.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.entities.GuitarEntity;

public class GuitarRepository {
	
	private SessionFactory sessionFactory ;

	public void save(GuitarEntity ge) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(ge);
		session.getTransaction().commit();
		session.close();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
}
