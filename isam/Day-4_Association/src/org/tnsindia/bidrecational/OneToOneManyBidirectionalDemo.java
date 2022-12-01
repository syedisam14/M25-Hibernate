package org.tnsindia.bidrecational;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneManyBidirectionalDemo {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		
		
		//create a dept1;
		
		Department department=new Department();
		department.setId(1199);
		department.setName("HR");
		
		//create a dept2;
		
		Department department1=new Department();
		department1.setId(1990);
		department1.setName("Marketing");
		
		
		
		//crete an emp0;
		Employee emp=new Employee();
		emp.setEmp_id(198);
		emp.setEmp_name("isam");		
		emp.setSalary(50500);
		
		
		//crete an emp1;
		Employee emp1=new Employee();
		emp1.setEmp_id(199);
		emp1.setEmp_name("rebel");		
		emp1.setSalary(50000);
		
		
		
		
		
		emp.setDepartment(department);
		em.persist(emp);	
		
		
		emp.setDepartment(department1);
		em.persist(emp1);	
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();
	
	}

}
