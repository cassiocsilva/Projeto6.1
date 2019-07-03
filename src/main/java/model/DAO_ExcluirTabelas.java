package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DAO_ExcluirTabelas {
	
	public void reiniciarIDs() throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		String jpql1 = "DROP TABLE eleitor";
		Query query1 = em.createNativeQuery(jpql1);
		query1.executeUpdate();
		
		String jpql2 = "DROP TABLE candidata";
		Query query2 = em.createNativeQuery(jpql2);
		query2.executeUpdate();
		
		String jpql3 = "DROP TABLE voto";
		Query query3 = em.createNativeQuery(jpql3);
		query3.executeUpdate();
		
		String jpql4 = "DROP TABLE registro";
		Query query4 = em.createNativeQuery(jpql4);
		query4.executeUpdate();

		
		//String jpql = "ALTER TABLE hibernate_sequence AUTO_INCREMENT = 1";
		String jpql = "DROP TABLE hibernate_sequence";
		Query query = em.createNativeQuery(jpql);
		query.executeUpdate();
		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
