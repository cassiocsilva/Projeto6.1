package model;

public class Votacao {
	
	private String candidata;
	private Candidata cFull;
	private String qtdeVotos;
	private int classificacao;

	public Votacao() {
	}
	
	public String getCandidata() {
		return candidata;
	}
	public void setCandidata(String candidata) {
		this.candidata = candidata;
	}
	public String getQtdeVotos() {
		return qtdeVotos;
	}
	public void setQtdeVotos(String qtdeVotos) {
		this.qtdeVotos = qtdeVotos;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public Candidata getcFull() {
		return cFull;
	}
	public void setcFull(Candidata cFull) {
		this.cFull = cFull;
	}
	
	
}