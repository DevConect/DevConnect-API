package com.andrenique.service;

import com.andrenique.dto.HitoDTO;
import com.andrenique.model.entity.Hito;
import com.andrenique.model.entity.Proyecto;
import com.andrenique.repository.HitoRepository;
import com.andrenique.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class HitoService {

    @Autowired
    private HitoRepository hitoRepository;

    @Autowired
    private ProyectoRepository proyectoRepository;

    public Hito crearHito(HitoDTO hitoDTO) {
        // Verificamos que el proyecto existe
        Proyecto proyecto = proyectoRepository.findById(hitoDTO.getProyectoId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Proyecto no encontrado"));

        // Creamos el nuevo Hito
        Hito nuevoHito = new Hito();
        nuevoHito.setNombre(hitoDTO.getNombre());
        nuevoHito.setDescripcion(hitoDTO.getDescripcion());
        nuevoHito.setFechaLimite(hitoDTO.getFechaLimite());
        nuevoHito.setProyecto(proyecto); // Asociamos el hito con el proyecto

        // Guardamos el nuevo Hito en la base de datos
        return hitoRepository.save(nuevoHito);
    }
}
