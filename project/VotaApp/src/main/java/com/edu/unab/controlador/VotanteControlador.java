package com.edu.unab.controlador;

import java.util.Optional;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;

import com.edu.unab.entidades.Votante;
import com.edu.unab.servicios.VotanteService;


@Controller
public class VotanteControlador {
	
	private VotanteService votanteService;
	
	@PostMapping("/validar")
	public String valida(@Validated Votante votante) {
		try {
			Optional<Votante> objVotante = votanteService.findById(votante.getIdentificacion());
			if(objVotante != null){
				return "redirect:/index";		
			}
			else {
				JOptionPane.showMessageDialog(null, "Usuario Desconocido!");
				return "/login";
			}
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "redirect:/validar";
	}

}
