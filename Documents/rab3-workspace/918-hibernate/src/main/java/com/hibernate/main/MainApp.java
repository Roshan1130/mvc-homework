package com.hibernate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.entities.GuitarEntity;
import com.hibernate.repositories.GuitarRepository;

public class MainApp {

	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("application-context.xml");
		GuitarRepository gr = (GuitarRepository) ac.getBean("guitarRepository");
		
		GuitarEntity ge = new GuitarEntity();
		ge.setName("Fender");
		ge.setModel("jife74");
		ge.setBody("Electric");
		ge.setPrice(500);
		
		gr.save(ge);
		
	}
}
