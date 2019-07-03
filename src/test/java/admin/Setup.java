package admin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.Candidata;
import model.DAO_Candidata_jpa;
import model.DAO_Eleitor_jpa;
import model.DAO_ExcluirTabelas;
import model.Eleitor;

public class Setup {
	
	
	@BeforeAll
	public static void reiniciarIDs() throws Exception {
		
		DAO_ExcluirTabelas daoP6 = new DAO_ExcluirTabelas();
		daoP6.reiniciarIDs();
		
	}
	
	
	@Test
	public void cadastrarCandidata01() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("01");
		c.setNome("Sayonara Dias Moura");
		c.setUf("AC");
		c.setIdade("25");
		c.setProfissao("Enfermeira");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("AC", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata02() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("02");
		c.setNome("Raíssa de Souza Chaga");
		c.setUf("AL");
		c.setIdade("21");
		c.setProfissao("Estudante");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("AL", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata03() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("03");
		c.setNome("Brenda Gomes Lazareth");
		c.setUf("AP");
		c.setIdade("22");
		c.setProfissao("Estudante");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("AP", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata04() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("04");
		c.setNome("Lorena Alencar Machado da Silva");
		c.setUf("AM");
		c.setIdade("26");
		c.setProfissao("Advogada");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("AM", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata05() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("05");
		c.setNome("Liliane Natiele Santos Silva");
		c.setUf("BA");
		c.setIdade("20");
		c.setProfissao("Técnica em agropecuária e modelo");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("BA", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata06() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("06");
		c.setNome("Luana Carvalho Lobo");
		c.setUf("CE");
		c.setIdade("24");
		c.setProfissao("Modelo");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("CE", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata07() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("07");
		c.setNome("Ana Gabriela Carvalho Borges");
		c.setUf("DF");
		c.setIdade("21");
		c.setProfissao("Design de moda");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("DF", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata08() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("08");
		c.setNome("Thainá de Castro");
		c.setUf("ES");
		c.setIdade("24");
		c.setProfissao("Arquiteta");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("ES", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata09() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("09");
		c.setNome("Isadora Rocha Dantas");
		c.setUf("GO");
		c.setIdade("22");
		c.setProfissao("Modelo");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("GO", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata10() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("10");
		c.setNome("Anna Carolina Azevedo Sousa");
		c.setUf("MA");
		c.setIdade("21");
		c.setProfissao("Empresária e estudante de odontologia");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("MA", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata11() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("11");
		c.setNome("Ingrid Cristina Santin");
		c.setUf("MT");
		c.setIdade("21");
		c.setProfissao("Empresária e estudante de odontologia");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("MT", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata12() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("12");
		c.setNome("Priscilla Xavier Vacchiano");
		c.setUf("MS");
		c.setIdade("24");
		c.setProfissao("Publicitária");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("MS", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata13() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("13");
		c.setNome("Júlia do Vale Horta");
		c.setUf("MG");
		c.setIdade("24");
		c.setProfissao("Jornalista e apresentadora");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("MG", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata14() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("14");
		c.setNome("Wilma da Silva Paulino");
		c.setUf("PA");
		c.setIdade("19");
		c.setProfissao("Estudante de estética e cosmética");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("PA", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata15() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("15");
		c.setNome("Kennya de Araújo da Silva");
		c.setUf("PB");
		c.setIdade("26");
		c.setProfissao("Modelo");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("PB", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata16() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("16");
		c.setNome("Djenifer Frey");
		c.setUf("PR");
		c.setIdade("20");
		c.setProfissao("Estudante de ciências contábeis");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("PR", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata17() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("17");
		c.setNome("Bárbara Daniele Barbosa de Souza");
		c.setUf("PE");
		c.setIdade("22");
		c.setProfissao("Estudante de publicidade");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("PE", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata18() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("18");
		c.setNome("Dagmara da Silva Landim");
		c.setUf("PI");
		c.setIdade("22");
		c.setProfissao("Estudante de direito");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("PI", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata19() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("19");
		c.setNome("Isadora Saraiva Meira");
		c.setUf("RJ");
		c.setIdade("26");
		c.setProfissao("Modelo");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("RJ", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata20() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("20");
		c.setNome("Erika Fontes de Oliveira");
		c.setUf("RN");
		c.setIdade("24");
		c.setProfissao("Modelo");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("RN", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata21() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("21");
		c.setNome("Bianca Beatriz Scheren");
		c.setUf("RS");
		c.setIdade("20");
		c.setProfissao("Modelo");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("RS", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata22() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("22");
		c.setNome("Hunaide Horitham dos Santos");
		c.setUf("RO");
		c.setIdade("23");
		c.setProfissao("Assistente jurídica");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("RO", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata23() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("23");
		c.setNome("Natali Vitória Lima Da Silva");
		c.setUf("RR");
		c.setIdade("20");
		c.setProfissao("Estudante de medicina veterinária");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("RR", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata24() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("24");
		c.setNome("Patrícia Marafon");
		c.setUf("SC");
		c.setIdade("25");
		c.setProfissao("Modelo");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("SC", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata25() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("25");
		c.setNome("Bianca Dias Lopes");
		c.setUf("SP");
		c.setIdade("22");
		c.setProfissao("Modelo e estudante de direito");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("SP", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata26() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("26");
		c.setNome("Ingrid Moraes Vieira");
		c.setUf("SE");
		c.setIdade("24");
		c.setProfissao("Modelo");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("SE", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata27() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("27");
		c.setNome("Alessandra de Almeida");
		c.setUf("TO");
		c.setIdade("19");
		c.setProfissao("Estudante de psicologia");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("TO", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidata99() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("99");
		c.setNome("VOTO NULO");
		c.setUf("NU");
		c.setIdade("99");
		c.setProfissao("VOTO NULO");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("NU", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarCandidataVotoBranco() throws Exception {
		
		Candidata c = new Candidata();
		
		c.setNumero("00");
		c.setNome("VOTO BRANCO");
		c.setUf("BR");
		c.setIdade("00");
		c.setProfissao("VOTO BRANCO");
		
		DAO_Candidata_jpa cDAO = new DAO_Candidata_jpa();
		
		assertEquals("BR", cDAO.cadastrarCandidata(c).getUf());
	}
	
	@Test
	public void cadastrarEleitor01() throws Exception {
		
		Eleitor e = new Eleitor();
		
		e.setNome("Eleitor");
		e.setDataNascimento("28/05/1976");
		e.setMunicipio("Sao Jose dos Campos");
		e.setUf("SP");
		e.setNumeroDeTitulo("11122201");
		e.setDataDeEmissao("28/05/1994");
		e.setZona("032");
		e.setSessaoEleitoral("032");
		e.setSenha("123");
		e.setCargo("Eleitor");
		
		DAO_Eleitor_jpa eDAO = new DAO_Eleitor_jpa();
		
		assertEquals("11122201", eDAO.cadastrarEleitor(e).getNumeroDeTitulo());
	}
	
	@Test
	public void cadastrarEleitor02() throws Exception {
		
		Eleitor e = new Eleitor();
		
		e.setNome("Mesario");
		e.setDataNascimento("28/05/1976");
		e.setMunicipio("Sao Jose dos Campos");
		e.setUf("SP");
		e.setNumeroDeTitulo("11122202");
		e.setDataDeEmissao("28/05/1994");
		e.setZona("032");
		e.setSessaoEleitoral("032");
		e.setSenha("123");
		e.setCargo("Mesário");
		
		DAO_Eleitor_jpa eDAO = new DAO_Eleitor_jpa();
		
		assertEquals("11122202", eDAO.cadastrarEleitor(e).getNumeroDeTitulo());
	}
	
	@Test
	public void cadastrarEleitor03() throws Exception {
		
		Eleitor e = new Eleitor();
		
		e.setNome("ChefeDeSessao");
		e.setDataNascimento("28/05/1976");
		e.setMunicipio("Sao Jose dos Campos");
		e.setUf("SP");
		e.setNumeroDeTitulo("11122203");
		e.setDataDeEmissao("28/05/1994");
		e.setZona("032");
		e.setSessaoEleitoral("032");
		e.setSenha("123");
		e.setCargo("Chefe de Sessão");
		
		DAO_Eleitor_jpa eDAO = new DAO_Eleitor_jpa();
		
		assertEquals("11122203", eDAO.cadastrarEleitor(e).getNumeroDeTitulo());
	}
	
	@Test
	public void cadastrarEleitor04() throws Exception {
		
		Eleitor e = new Eleitor();
		
		e.setNome("MembroTRE");
		e.setDataNascimento("28/05/1976");
		e.setMunicipio("Sao Jose dos Campos");
		e.setUf("SP");
		e.setNumeroDeTitulo("11122204");
		e.setDataDeEmissao("28/05/1994");
		e.setZona("032");
		e.setSessaoEleitoral("032");
		e.setSenha("123");
		e.setCargo("Membro TRE");
		
		DAO_Eleitor_jpa eDAO = new DAO_Eleitor_jpa();
		
		assertEquals("11122204", eDAO.cadastrarEleitor(e).getNumeroDeTitulo());
	}
	
	@Test
	public void cadastrarEleitor05() throws Exception {
		
		Eleitor e = new Eleitor();
		
		e.setNome("Eleitor Outra Zona");
		e.setDataNascimento("28/05/1976");
		e.setMunicipio("Sao Jose dos Campos");
		e.setUf("SP");
		e.setNumeroDeTitulo("11122205");
		e.setDataDeEmissao("28/05/1994");
		e.setZona("033");
		e.setSessaoEleitoral("032");
		e.setSenha("123");
		e.setCargo("Eleitor");
		
		DAO_Eleitor_jpa eDAO = new DAO_Eleitor_jpa();
		
		assertEquals("11122205", eDAO.cadastrarEleitor(e).getNumeroDeTitulo());
	}
	
	@Test
	public void cadastrarEleitor05_jaExiste() throws Exception {
		
		Eleitor e = new Eleitor();
		
		e.setNumeroDeTitulo("11122205");
		
		DAO_Eleitor_jpa eDAO = new DAO_Eleitor_jpa();
		
		assertEquals("TituloJaExiste", eDAO.cadastrarEleitor(e).getNumeroDeTitulo());
	}
	
	/*
	@Test
	public void cadastrarEleitor06ate99() throws Exception {
		
		for (int i=6; i<100; i++) {
			
			String iS = "";
			
			if (i < 10) {
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append("0");
				stringBuilder.append(i);
				iS = stringBuilder.toString();	
			} else {
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append(i);
				iS = stringBuilder.toString();
			}
			
			Eleitor e = new Eleitor();
			
			e.setNome("Eleitor "+iS);
			e.setDataNascimento("28/05/1976");
			e.setMunicipio("Sao Jose dos Campos");
			e.setUf("SP");
			e.setNumeroDeTitulo("111222"+iS);
			e.setDataDeEmissao("28/05/1994");
			e.setZona("032");
			e.setSessaoEleitoral("032");
			e.setSenha("123");
			e.setCargo("Eleitor");
			
			DAO_Eleitor_jpa eDAO = new DAO_Eleitor_jpa();
			
			assertEquals("111222"+iS, eDAO.cadastrarEleitor(e).getNumeroDeTitulo());
		}
	}
	*/

}
