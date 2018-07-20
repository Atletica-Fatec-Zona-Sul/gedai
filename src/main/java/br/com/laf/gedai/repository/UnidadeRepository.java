package br.com.laf.gedai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.laf.gedai.model.Unidade;

@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Integer> {

}
