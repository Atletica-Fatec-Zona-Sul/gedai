package br.com.laf.gedai.model;

public enum TipoPessoa {
	
	LAF(1),
	DELEGADO(2),
	ATLETA(3),
	VISITANTE(4);

	private Integer tipoPessoa;
	
	TipoPessoa(Integer tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public Integer getTipoPessoa() {
		return tipoPessoa;
	}
}
