package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="voto")
public class Voto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", updatable = true, nullable = true)
	private Long id;
	
	@Column(name="eleitor")
	private String eleitor;
	@Column(name="voto")
	private String voto;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEleitor() {
		return eleitor;
	}
	public void setEleitor(String eleitor) {
		this.eleitor = eleitor;
	}
	public String getVoto() {
		return voto;
	}
	public void setVoto(String voto) {
		this.voto = voto;
	}
	
	
}
