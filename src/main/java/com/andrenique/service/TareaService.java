package com.andrenique.service;

import com.andrenique.dto.TareaDTO;
import com.andrenique.model.entity.Hito;
import com.andrenique.model.entity.Tarea;
import com.andrenique.repository.HitoRepository;
import com.andrenique.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    @Autowired
    private HitoRepository hitoRepository;

    public Tarea crearTarea(TareaDTO tareaDTO) {
        Hito hito = hitoRepository.findById(tareaDTO.getHitoId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Hito no encontrado"));

        Tarea nuevaTarea = new Tarea();
        nuevaTarea.setTitulo(tareaDTO.getTitulo());
        nuevaTarea.setDescripcion(tareaDTO.getDescripcion());
        nuevaTarea.setFechaEntrega(tareaDTO.getFechaEntrega());
        nuevaTarea.setEstado("Pendiente"); // O el estado que consideres adecuado
        nuevaTarea.setHito(hito); // Asigna el hito a la tarea

        return tareaRepository.save(nuevaTarea);
    }
}
