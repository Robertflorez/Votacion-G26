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
	
	@GetMapping("/cand-1")
	public String infoCand1() {
		return "/info-cand/cand-1";
	}
	
	@GetMapping("/cand-2")
	public String infoCand2() {
		return "/info-cand/cand-2";
	}
	
	@GetMapping("/cand-3")
	public String infoCand3() {
		return "/info-cand/cand-3";
	}
	
	@GetMapping("/cand-4")
	public String infoCand4() {
		return "/info-cand/cand-4";
	}
	
	@GetMapping("/part-1")
	public String infoPart1() {
		return "/info-cand/part-cand-1";
	}
	
	@GetMapping("/part-2")
	public String infoPart2() {
		return "/info-cand/part-cand-2";
	}
	
	@GetMapping("/part-3")
	public String infoPart3() {
		return "/info-cand/part-cand-3";
	}
	
	@GetMapping("/part-4")
	public String infoPart4() {
		return "/info-cand/part-cand-4";
	}
}
