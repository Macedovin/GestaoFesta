package com.macedovingithub.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.macedovingithub.festa.repository.IConvidados;


@Controller
public class ConvidadosController {
	
	@Autowired
	private IConvidados convidados;
	
	@GetMapping("/convidados")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados"); 
		
		modelAndView.addObject("convidados", convidados.findAll());
		
		return modelAndView;
	}
}