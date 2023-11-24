package com.macedovingithub.festa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatosController {
	
	@GetMapping("/convidados")
	public String listar() {
		return "ListaConvidados";
	}
}
