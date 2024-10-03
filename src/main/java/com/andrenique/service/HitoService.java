package com.andrenique.service;

import com.andrenique.dto.HitoDTO;
import com.andrenique.model.entity.Hito;
import com.andrenique.model.entity.Proyecto;
import com.andrenique.repository.HitoRepository;
import com.andrenique.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HitoService {

    @Autowired
    private HitoRepository hitoRepository;

    @Autowired
    private ProyectoRepository proyectoRepository;

    public Hito crearHito(HitoDTO hitoDTO) {
        Proyecto proyecto = proyectoRepository.findById(hitoDTO.getProyectoId())
                .orElseThrow(() -> new ResourceNotFoundException("Proyecto no encontrado"));

        Hito nuevoHito = new Hito();
        nuevoHito.setNombre(hitoDTO.getNombre());
        nuevoHito.setDescripcion(hitoDTO.getDescripcion());
        nuevoHito.setFechaLimite(hitoDTO.getFechaLimite());
        nuevoHito.setProyecto(proyecto);

        return hitoRepository.save(nuevoHito);
    }
}

