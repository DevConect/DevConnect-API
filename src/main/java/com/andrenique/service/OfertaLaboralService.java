package com.andrenique.service;

import com.andrenique.dto.OfertaLaboralDTO;
import com.andrenique.model.entity.ofertaLaboral; // Asegúrate de que el nombre de la clase sea correctamente capitalizado
import com.andrenique.model.entity.Proyecto;
import com.andrenique.model.entity.ofertaLaboral;
import com.andrenique.repository.OfertaLaboralRepository;
import com.andrenique.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@Service
public class OfertaLaboralService {

    @Autowired
    private OfertaLaboralRepository ofertaLaboralRepository;

    @Autowired
    private ProyectoRepository proyectoRepository;

    public ofertaLaboral crearOferta(OfertaLaboralDTO ofertaDTO) {
        Proyecto proyecto = proyectoRepository.findById(ofertaDTO.getProyectoId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Proyecto no encontrado"));

        ofertaLaboral oferta = new ofertaLaboral();
        oferta.setTitulo(ofertaDTO.getTitulo());
        oferta.setDescripcion(ofertaDTO.getDescripcion());
        oferta.setPresupuesto(ofertaDTO.getPresupuesto());
        oferta.setProyecto(proyecto);
        oferta.setFechaCreacion(LocalDate.now());

        return ofertaLaboralRepository.save(oferta);
    }

    public List<ofertaLaboral> listarOfertas() {
        return ofertaLaboralRepository.findAll();
    }

    public List<ofertaLaboral> filtrarOfertasPorProyecto(Long proyectoId) {
        return ofertaLaboralRepository.findByProyectoId(proyectoId);
    }
}
