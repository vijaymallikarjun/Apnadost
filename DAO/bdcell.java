package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DTO.enclass;

public class bdcell {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	 public void send(enclass ec)
	 {
		 et.begin();
		 em.persist(ec);
		 et.commit();
	 }

	public enclass find(String id) {
		return em.find(enclass.class, id);
		
	}

	public void update(String f1, String f2) {
		enclass en=em.find(enclass.class, f1);
		en.setEmail(f2);
		et.begin();
		em.merge(en);
		et.commit();
		
	}

	public void Delete(String id) {
		enclass en=em.find(enclass.class, id);
		et.begin();
		em.remove(en);
		et.commit();
		
		
	}

}
