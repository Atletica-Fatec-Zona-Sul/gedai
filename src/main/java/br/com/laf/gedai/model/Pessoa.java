package br.com.laf.gedai.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Zupper
 *
 */
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "ra")
	private String ra;
	@Column(name = "rg")
	private String rg;
//	@ManyToOne
//	@JoinColumn(name = "unidade")
//	private Unidade unidade;
	@Column(name = "curso")
	private String curso;
	@NotNull
	@Column(name = "email")
	private String email;
	@Column(name = "celular")
	private String celular;
	@Column(name = "anomat")
	private Integer anoMatricula;
	@Column(name = "semmat")
	private Integer semestreMatricula;
//	@Column(name = "turno")
//	private String turno;
	//@NotNull
	@Column(name = "img_atestado")
	private String caminhoAtestado;
//	@NotNull
//	@Column(name = "tipo_pessoa")
//	private TipoPessoa tipoPessoa;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
//	public Unidade getUnidade() {
//		return unidade;
//	}
//	public void setUnidade(Unidade unidade) {
//		this.unidade = unidade;
//	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Integer getAnoMatricula() {
		return anoMatricula;
	}
	public void setAnoMatricula(Integer anoMatricula) {
		this.anoMatricula = anoMatricula;
	}
	public Integer getSemestreMatricula() {
		return semestreMatricula;
	}
	public void setSemestreMatricula(Integer semestreMatricula) {
		this.semestreMatricula = semestreMatricula;
	}
//	public String getTurno() {
//		return turno;
//	}
//	public void setTurno(String turno) {
//		this.turno = turno;
//	}
	public String getCaminhoAtestado() {
		return caminhoAtestado;
	}
	public void setCaminhoAtestado(String caminhoAtestado) {
		this.caminhoAtestado = caminhoAtestado;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", ra=" + ra + ", rg=" + rg + ", unidade= curso="
				+ curso + ", email=" + email + ", celular=" + celular + ", anoMatricula=" + anoMatricula
				+ ", semestreMatricula=" + semestreMatricula + ", caminhoAtestado="
				+ caminhoAtestado + "]";
	}
}
