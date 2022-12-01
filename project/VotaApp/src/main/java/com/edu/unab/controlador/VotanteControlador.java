package com.edu.unab.controlador;

import java.util.Optional;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;

import com.edu.unab.entidades.Votante;
import com.edu.unab.servicios.VotanteService;


@Controller
public class VotanteControlador {
	
	@Autowired
	private VotanteService votanteService;
	Votante objVot = new Votante();
	
	@PostMapping("/validar")
	public String valida(@Validated Votante votante, Model model) {
		try {
			Optional<Votante> objVotante = votanteService.findById(votante.getIdentificacion());
			if(objVotante.isEmpty()){
				return "redirect:/inexistente";		
			}
			else {
				objVot=objVotante.get();
				if(objVot.getIdentificacion()== votante.getIdentificacion() && objVot.getClave().equals(votante.getClave())) {
					return "redirect:/inicio";
				}else {
					return "redirect:/invalido";
				}
			}
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "redirect:/validar";
	}

}
