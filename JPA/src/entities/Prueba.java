package entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Prueba {
	
	public static void main(String[] args) {
		
		Mensaje m = new Mensaje();
		m.setName("hola");
		m.setEmail("hola@hola.com");
		m.setWebsite("www.hola.com");
		m.setMessage("hola");
		EntityManagerFactory emf =
				 Persistence.createEntityManagerFactory("JPA");
				 EntityManager em = emf.createEntityManager();
				 try {
				 em.getTransaction().begin();
				 em.persist(m);
				 em.getTransaction().commit();
				 } catch (Exception e) {
				 
				 e.printStackTrace();
				 }finally {
				 em.close();
				 
				 }
				 }
	}

