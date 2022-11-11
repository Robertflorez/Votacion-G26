package com.edu.unab.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VotappControlador {

	@GetMapping("/inicio")
	public String inicioApp() {
		return "/inicio/inicio";
	}
	
	@GetMapping("/votar")
	public String votarApp() {
		return "/inicio/votar";
	}
	
	@GetMapping("/estadistica")
	public String estadisticaApp() {
		return "/inicio/estadistica";
	}
}
