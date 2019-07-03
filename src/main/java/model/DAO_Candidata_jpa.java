package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DAO_Candidata_jpa {
	
	public Candidata carregarDadosCandidata(Candidata c) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		String jpql = "SELECT c FROM candidata c WHERE c.numero='" + c.getNumero() + "'";
		Query query = em.createQuery(jpql);
		
		@SuppressWarnings("unchecked")
		List<Candidata> candidatas = query.getResultList();
		
		Candidata candidata = candidatas.get(0);
		
		return candidata;
	}

	public Candidata verificarUfNaoCadastrada(Candidata c) throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		String jpql = "SELECT c FROM candidata c WHERE c.uf='" + c.getUf().toUpperCase() + "'";
		Query query = em.createQuery(jpql);

		Candidata cBD = new Candidata();

		@SuppressWarnings("unchecked")
		List<Candidata> candidatas = query.getResultList();

		if (candidatas.size() == 0) {
			cBD.setUf("ufNaoCadastrada");
			return cBD;
		} else if (candidatas.size() == 1) {
			cBD.setUf("ufJaExiste");
			em.close();
			emf.close();
			return cBD;
		}
		return cBD;
	}
	
	public Candidata cadastrarCandidata(Candidata c) throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		DAO_Candidata_jpa cBD = new DAO_Candidata_jpa();
		Candidata verificaJaCadastrado = cBD.verificarUfNaoCadastrada(c);

		if (verificaJaCadastrado.getUf().equals("ufNaoCadastrada")) {
			
			c.setUf(c.getUf().toUpperCase());

			em.getTransaction().begin();
			em.persist(c);
			em.getTransaction().commit();

			em.close();
			emf.close();
		}
		else {
			return verificaJaCadastrado;
		}
		return c;
	}

}
