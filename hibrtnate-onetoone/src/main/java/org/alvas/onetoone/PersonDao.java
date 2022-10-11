package org.alvas.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDao {
	
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("neha");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	//save person and adhar
	public Person savePerson(Person person,Adhar adhar)
	{
		em=emf.createEntityManager();
		et=em.getTransaction();
		et.begin();
		em.persist(person);
		em.persist(adhar);
		et.commit();
		System.out.println("--------------Data Stored---------------------");
		
		return person;
	}
	
	public Person getPersonAdhar(int id)
	{
		em=emf.createEntityManager();
		Person person = em.find(Person.class, id);
		return person;
	}

	public Person deletePersonById(int id)
	{
		em=emf.createEntityManager();
		et=em.getTransaction();
		Person p = em.find(Person.class,id);
		//Integer id1 = p.getAdhar().getId();
		Adhar a = p.getAdhar();
			if(p!=null)
			{
				et.begin();
				em.remove(p);
				em.remove(a);
				et.commit();
				System.out.println("-------------------Data Deleted----------------------");
			}
			return p;
	}
	
	public Person updateById(int id,String name,long adharNumber)
	{
		emf.createEntityManager();
		em.getTransaction();
		Person p = em.find(Person.class,id);
		p.setName(name);
		p.getAdhar().setAdharNumber(adharNumber);
		Adhar a = em.find(Adhar.class, p.getAdhar().getId());
		if(p!=null)
		{
			et.begin();
			em.merge(p);
			et.commit();
			System.out.println("-------------------Data Updated----------------------");
		}
		return p;
	}
	
}