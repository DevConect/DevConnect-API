package com.andrenique.service;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import com.andrenique.dto.OfertaLaboralDTO;
import com.andrenique.model.entity.Proyecto;
import com.andrenique.model.entity.ofertaLaboral;
import com.andrenique.repository.OfertaLaboralRepository;
import com.andrenique.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

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
                .orElseThrow(() -> {
                    return new ConfigDataResourceNotFoundException("Proyecto no encontrado");
                });

        ofertaLaboral oferta = new OfertaLaboral();
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
