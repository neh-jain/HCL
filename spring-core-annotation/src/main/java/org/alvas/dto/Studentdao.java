package org.alvas.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;

public class Studentdao {
	@Autowired
	Student std;
	@Autowired
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction et;
	
	public Student saveStudent(Student student)
	{
		emf = Persistence.createEntityManagerFactory("neha");
		et = em.getTransaction();
		et.begin();
		em.persist(student);
		et.commit();
		return student;
	}
	

}
