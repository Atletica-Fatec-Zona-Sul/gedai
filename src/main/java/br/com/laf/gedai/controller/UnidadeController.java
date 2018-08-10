//package br.com.laf.gedai.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import br.com.laf.gedai.model.Unidade;
//import br.com.laf.gedai.service.UnidadeService;
//
//@Controller
//public class UnidadeController {
//
//	@Autowired
//	private UnidadeService unidadeService;
//	
//	@PostMapping("/cadastrarUnidade")
//	public String cadastrarUnidade(Unidade unidade) {
//		System.out.println(unidade.toString());
//		unidadeService.inserir(unidade);
//		return "redirect:/";
//	}
//	
//}
