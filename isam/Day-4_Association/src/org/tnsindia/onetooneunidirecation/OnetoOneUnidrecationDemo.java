package org.tnsindia.onetooneunidirecation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OnetoOneUnidrecationDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		
		
		Student s=new Student();
		s.setID(1100);
		s.setNAME("isam");
		
		
		Student s1=new Student();
		s1.setID(1101);
		s1.setNAME("asad");
		
		
		
		Address a=new Address();
		a.setStreetNo(11);
		a.setArea("MG Road");
		a.setCity("Gulbarga");
		
		
		Address a1=new Address();
		a1.setStreetNo(21);
		a1.setArea("Mehboob Nagar");
		a1.setCity("Gulbarga");
		
		s.setAddress(a);
		em.persist(s);
		
		s1.setAddress(a1);
		em.persist(s1);
		
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();
		
		
		

	}

}
