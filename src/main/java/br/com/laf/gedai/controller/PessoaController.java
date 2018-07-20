package br.com.laf.gedai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.laf.gedai.model.Pessoa;
import br.com.laf.gedai.service.PessoaService;

@Controller
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping("/cadastrarPessoa")
	public String inserirPessoa(Pessoa pessoa) {
		System.out.println(pessoa);
		pessoaService.inserir(pessoa);
		return "redirect:/";
	}
	
}
