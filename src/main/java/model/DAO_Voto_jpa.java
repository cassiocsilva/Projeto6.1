package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DAO_Voto_jpa {
	
	public List<Object[]> apurarVotos(){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select count(v) as voto_qtd, v.voto from voto v group by v.voto ORDER BY COUNT(v) DESC";

		@SuppressWarnings("unchecked")
		List<Object[]> votos = em.createQuery(jpql).getResultList();
		
		return votos;		
	}

	public Voto verificarEleitorNaoVotou(Voto v) throws Exception {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		String jpql = "SELECT v FROM voto v WHERE v.eleitor='" + v.getEleitor() + "'";
		Query query = em.createQuery(jpql);

		Voto votoBD = new Voto();

		@SuppressWarnings("unchecked")
		List<Voto> votos = query.getResultList();
		System.out.println("dao_jpa eleitores.size(): " + votos.size());

		if (votos.size() == 0) {
			System.out.println("dao_jpa: eleitorNaoVotou");
			votoBD.setEleitor("eleitorNaoVotou");
			em.close();
			emf.close();
			return votoBD;
		} else if (votos.size() == 1) {
			System.out.println("dao_jpa: eleitorJaVotou");
			votoBD.setEleitor("eleitorJaVotou");
			em.close();
			emf.close();
			return votoBD;
		}
		return votoBD;
	}

	public void cadastrarVoto(Voto v) throws Exception {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(v);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
