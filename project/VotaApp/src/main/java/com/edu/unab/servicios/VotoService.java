package com.edu.unab.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.unab.entidades.Voto;

@Repository
public interface VotoService extends JpaRepository<Voto, Integer> {

}
