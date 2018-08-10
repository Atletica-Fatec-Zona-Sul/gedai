package br.com.laf.gedai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.laf.gedai.model.Pessoa;
import br.com.laf.gedai.service.PessoaService;

@RestController
public class ViewController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping("/")
	public String index() {
		List<Pessoa> pessoa = pessoaService.listar();
		return pessoa.toString();
	}
}
