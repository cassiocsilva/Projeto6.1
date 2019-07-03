package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="eleitor")
public class Eleitor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", updatable = true, nullable = true)
	private Long id;
	
	
	@Column(name="nome")
	private String nome;
	@Column(name="dataNascimento",length=10)
	private String dataNascimento;
	@Column(name="municipio")
	private String municipio;
	@Column(name="uf",length=2)
	private String uf;
	@Column(name="numeroDeTitulo",length=11,unique=true)
	private String numeroDeTitulo;
	@Column(name="dataDeEmissao",length=10)
	private String dataDeEmissao;
	@Column(name="zona",length=3)
	private String zona;
	@Column(name="sessaoEleitoral",length=3)
	private String sessaoEleitoral;
	@Column(name="senha")
	private String senha;

	@Column(name="cargo")
	private String cargo;
	
	
	public Eleitor(){
	}

	public long getIdEleitor() {
		return id;
	}

	public void setIdEleitor(long idEleitor) {
		this.id = idEleitor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNumeroDeTitulo() {
		return numeroDeTitulo;
	}

	public void setNumeroDeTitulo(String numeroDeTitulo) {
		this.numeroDeTitulo = numeroDeTitulo;
	}

	public String getDataDeEmissao() {
		return dataDeEmissao;
	}

	public void setDataDeEmissao(String dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getSessaoEleitoral() {
		return sessaoEleitoral;
	}

	public void setSessaoEleitoral(String sessaoEleitoral) {
		this.sessaoEleitoral = sessaoEleitoral;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
