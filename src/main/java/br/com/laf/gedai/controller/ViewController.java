package br.com.laf.gedai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.laf.gedai.model.Unidade;
import br.com.laf.gedai.service.UnidadeService;

@RestController
public class ViewController {
	
	@Autowired
	private UnidadeService unidadeService;
	
	@GetMapping("/")
	public ModelAndView index() {
		List<Unidade> unidades = unidadeService.listar();
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("unidades", unidades);
		return mv;
	}

	@GetMapping("/cadastroUnidadeView")
	public ModelAndView cadastroUnidadeView() {
		return new ModelAndView("unidade/cadastro-unidade");
	}
	
	@GetMapping("/cadastroPessoaView")
	public ModelAndView cadastroAtletaView() {
		List<Unidade> unidades = unidadeService.listar();
		ModelAndView mv =  new ModelAndView("pessoa/cadastro-pessoa");
		mv.addObject("unidades", unidades);
		return mv;
	}
}
