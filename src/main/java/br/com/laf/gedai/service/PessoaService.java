package br.com.laf.gedai.service;

import java.util.List;

import br.com.laf.gedai.model.Pessoa;

public interface PessoaService {
	
	void inserir(Pessoa pessoa);
	void alterar(Pessoa pessoa);
	void excluir(Pessoa pessoa);
	List<Pessoa> listar();
	Pessoa buscar(Pessoa pessoa);
}
