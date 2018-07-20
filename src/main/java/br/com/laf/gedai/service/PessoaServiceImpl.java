package br.com.laf.gedai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.laf.gedai.model.Pessoa;
import br.com.laf.gedai.repository.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Override
	public void inserir(Pessoa pessoa) {
		
		pessoaRepository.save(pessoa);
		// TODO Auto-generated method stub

	}

	@Override
	public void alterar(Pessoa pessoa) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Pessoa pessoa) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Pessoa> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pessoa buscar(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return null;
	}

}
