package com.edu.unab.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.unab.entidades.Votante;

@Repository
public interface VotanteService extends JpaRepository<Votante, Integer> {

}
