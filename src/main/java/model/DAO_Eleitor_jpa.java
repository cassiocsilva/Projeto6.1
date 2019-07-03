package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DAO_Eleitor_jpa {
	
	public Eleitor verificarNumeroDeTituloNaoCadastrado(Eleitor e) throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		String jpql = "SELECT e FROM eleitor e WHERE e.numeroDeTitulo='" + e.getNumeroDeTitulo() + "'";
		Query query = em.createQuery(jpql);

		Eleitor eBD = new Eleitor();
		
		if (e.getNumeroDeTitulo().equals("")) {
			eBD.setNumeroDeTitulo("PreenchaNUM");
			return eBD;
		}

		@SuppressWarnings("unchecked")
		List<Eleitor> eleitores = query.getResultList();
		
		System.out.println("DAO_Eleitor_jpa");
		System.out.println("eleitores.size(): "+eleitores.size());

		if (eleitores.size() == 0) {
			eBD.setNumeroDeTitulo("numNaoCadastrado");
			em.close();
			emf.close();
			return eBD;
		} else if (eleitores.size() == 1) {
			eBD.setNumeroDeTitulo("TituloJaExiste");
			em.close();
			emf.close();
			return eBD;
		}
		return eBD;
	}

	public Eleitor cadastrarEleitor(Eleitor e) throws Exception {
		
		DAO_Eleitor_jpa eBD = new DAO_Eleitor_jpa();
		Eleitor verificaJaCadastrado = eBD.verificarNumeroDeTituloNaoCadastrado(e);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		if (verificaJaCadastrado.getNumeroDeTitulo().equals("numNaoCadastrado")) {

			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();

			em.close();
			emf.close();
		}
		else {
			return verificaJaCadastrado;
		}
		return e;
	}
	
	public void editarEleitor (Eleitor eAtual) throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		String jpql = "SELECT e FROM eleitor e WHERE e.numeroDeTitulo='" + eAtual.getNumeroDeTitulo() + "'";
		Query query = em.createQuery(jpql);

		@SuppressWarnings("unchecked")
		List<Eleitor> eleitores = query.getResultList();
		
		Eleitor eAnt = eleitores.get(0);
		
		em.detach(eAnt);
		eAnt.setNome(eAtual.getNome());
		eAnt.setDataNascimento(eAtual.getDataNascimento());
		eAnt.setMunicipio(eAtual.getMunicipio());
		eAnt.setUf(eAtual.getUf());
		eAnt.setDataDeEmissao(eAtual.getDataDeEmissao());
		eAnt.setZona(eAtual.getZona());
		eAnt.setSessaoEleitoral(eAtual.getSessaoEleitoral());
		eAnt.setCargo(eAtual.getCargo());
		
        em.getTransaction().begin();
        em.merge(eAnt);
        em.getTransaction().commit();
  
	}
	
		

	public Eleitor validarLogin(Eleitor e) throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		Eleitor validaLogin = new Eleitor();

		if (e.getNumeroDeTitulo().equals("")) {
			validaLogin.setNumeroDeTitulo("PreenchaNUM");
			return validaLogin;
		}

		String jpql = "SELECT e FROM eleitor e WHERE e.numeroDeTitulo='" + e.getNumeroDeTitulo() + "'";
		Query query = em.createQuery(jpql);

		@SuppressWarnings("unchecked")
		List<Eleitor> eleitores = query.getResultList();

		if (eleitores.isEmpty()) {
			em.close();
			emf.close();
			validaLogin.setNumeroDeTitulo("TituloNaoEncontrado");
			return validaLogin;

		} else if (!eleitores.get(0).getSenha().equals(e.getSenha())) {
			em.close();
			emf.close();
			validaLogin.setNumeroDeTitulo("SenhaIncorreta");
			return validaLogin;

		} else if (eleitores.get(0).getSenha().equals(e.getSenha())) {
			em.close();
			emf.close();
			return eleitores.get(0);
		}
		return validaLogin;
	}
	
	public Eleitor buscarEleitor(Eleitor e) throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		Eleitor validaLogin = new Eleitor();

		String jpql = "SELECT e FROM eleitor e WHERE e.numeroDeTitulo='" + e.getNumeroDeTitulo() + "'";
		Query query = em.createQuery(jpql);

		@SuppressWarnings("unchecked")
		List<Eleitor> eleitores = query.getResultList();

		if (eleitores.isEmpty()) {
			em.close();
			emf.close();
			validaLogin.setNumeroDeTitulo("TituloNaoEncontrado");
			return validaLogin;

		} else {
			
			return eleitores.get(0);
		}
	}

	public void excluirEleitor(Eleitor e) throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		String jpql = "SELECT e FROM eleitor e WHERE e.numeroDeTitulo='" + e.getNumeroDeTitulo() + "'";
		Query query = em.createQuery(jpql);

		@SuppressWarnings("unchecked")
		List<Eleitor> eleitores = query.getResultList();
		
		Eleitor eBD = eleitores.get(0);
		
		em.getTransaction().begin();
        em.remove(eBD);
        em.getTransaction().commit();
        
        em.close();
        emf.close();   
	}

	public void zerarIDsTabela_eleitor() throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		String jpql = "ALTER TABLE eleitor AUTO_INCREMENT = 1";
		Query query = em.createNativeQuery(jpql);

		query.executeUpdate();
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
