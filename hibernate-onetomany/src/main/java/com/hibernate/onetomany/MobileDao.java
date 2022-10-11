package com.hibernate.onetomany;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MobileDao {
			
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ganavi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		public Mobile saveMobileSim(Mobile mobile,Sim sim1,Sim sim2)
		{
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			em.persist(mobile);
			em.persist(sim1);
			em.persist(sim2);
			et.commit();
			return mobile;
		}
}