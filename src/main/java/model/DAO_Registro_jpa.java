package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO_Registro_jpa {

	public void registrar(Registro r) throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(r);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public List<Registro[]> listarRegistros() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		String jpql = "SELECT r FROM registro r ORDER BY r.id DESC";

		@SuppressWarnings("unchecked")
		List<Registro[]> registros = em.createQuery(jpql).getResultList();

		return registros;
	}

}
