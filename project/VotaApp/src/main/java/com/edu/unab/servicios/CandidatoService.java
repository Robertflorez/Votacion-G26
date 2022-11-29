package com.edu.unab.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.unab.entidades.Candidato;

@Repository
public interface CandidatoService extends JpaRepository<Candidato, Integer>{
	
	
}
