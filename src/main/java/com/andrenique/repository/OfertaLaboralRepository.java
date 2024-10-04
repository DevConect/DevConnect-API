package com.andrenique.repository;

import com.andrenique.model.entity.ofertaLaboral; // Asegúrate de que el nombre de la clase esté capitalizado
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfertaLaboralRepository extends JpaRepository<ofertaLaboral, Long> {
    List<ofertaLaboral> findByProyectoId(Long proyectoId);
}
