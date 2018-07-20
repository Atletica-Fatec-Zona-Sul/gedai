package br.com.laf.gedai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.laf.gedai.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
