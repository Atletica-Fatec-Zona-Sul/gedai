package br.com.laf.gedai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.laf.gedai.model.Unidade;
import br.com.laf.gedai.repository.UnidadeRepository;

@Service
public class UnidadeServiceImpl implements UnidadeService {

	@Autowired
	private UnidadeRepository repository;
	
	@Override
	public void inserir(Unidade unidade) {
		repository.save(unidade);

	}

	@Override
	public void alterar(Unidade unidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Unidade unidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Unidade> listar() {
		
		return repository.findAll();
	}

	@Override
	public Unidade buscar(Unidade unidade) {
		// TODO Auto-generated method stub
		return null;
	}

}
