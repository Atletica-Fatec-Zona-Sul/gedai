//package br.com.laf.gedai.model;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//@Entity
//@Table(name = "unidade")
//public class Unidade {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer id;
//	@Column(name = "nome")
//	private String nome;
//	@Column(name = "cidade")
//	private String cidade;
//	@Column(name = "regiao")
//	private String regiao;
//	@Column(name = "atletica")
//	private String atletica;
//	@Column(name = "delegado")
//	private String delegado;
//	@Column(name = "delegadoSuplente1")
//	private String delegadoSuplente1;
//	@Column(name = "delegadoSuplente2")
//	private String delegadoSuplente2;
//	@OneToMany(mappedBy = "unidade", cascade = CascadeType.ALL)
//	private List<Pessoa> atletas;
//	@Override
//	public String toString() {
//		return "Unidade [id=" + id + ", nome=" + nome + ", cidade=" + cidade + ", regiao=" + regiao + ", atletica="
//				+ atletica + ", delegado=" + delegado + ", delegadoSuplente1=" + delegadoSuplente1
//				+ ", delegadoSuplente2=" + delegadoSuplente2 + "]";
//	}
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	public String getCidade() {
//		return cidade;
//	}
//	public void setCidade(String cidade) {
//		this.cidade = cidade;
//	}
//	public String getRegiao() {
//		return regiao;
//	}
//	public void setRegiao(String regiao) {
//		this.regiao = regiao;
//	}
//	public String getAtletica() {
//		return atletica;
//	}
//	public void setAtletica(String atletica) {
//		this.atletica = atletica;
//	}
//	public String getDelegado() {
//		return delegado;
//	}
//	public void setDelegado(String delegado) {
//		this.delegado = delegado;
//	}
//	public String getDelegadoSuplente1() {
//		return delegadoSuplente1;
//	}
//	public void setDelegadoSuplente1(String delegadoSuplente1) {
//		this.delegadoSuplente1 = delegadoSuplente1;
//	}
//	public String getDelegadoSuplente2() {
//		return delegadoSuplente2;
//	}
//	public void setDelegadoSuplente2(String delegadoSuplente2) {
//		this.delegadoSuplente2 = delegadoSuplente2;
//	}
//	public List<Pessoa> getAtletas() {
//		return atletas;
//	}
//	public void setAtletas(List<Pessoa> atletas) {
//		this.atletas = atletas;
//	}
//	
//
//}
