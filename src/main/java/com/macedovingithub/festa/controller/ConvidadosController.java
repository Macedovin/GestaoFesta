package com.macedovingithub.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.macedovingithub.festa.model.Convidado;
import com.macedovingithub.festa.repository.IConvidados;


@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	@Autowired
	private IConvidados convidados;
	
	@GetMapping
	public ModelAndView listar() {

		ModelAndView modelAndView = new ModelAndView("ListaConvidados"); 
		
		modelAndView.addObject("convidados", convidados.findAll());

		modelAndView.addObject("convidado", new Convidado());
		
		return modelAndView;
	}

	@PostMapping
	public String salvar(Convidado convidado) {
		
		this.convidados.save(convidado);
		
		return "redirect:/convidados";
	}
}
