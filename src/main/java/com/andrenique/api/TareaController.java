package com.andrenique.api;

import com.andrenique.dto.TareaDTO;
import com.andrenique.model.entity.Tarea;
import com.andrenique.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @PostMapping
    public ResponseEntity<Tarea> crearTarea(@RequestBody TareaDTO tareaDTO) {
        Tarea nuevaTarea = tareaService.crearTarea(tareaDTO);
        return new ResponseEntity<>(nuevaTarea, HttpStatus.CREATED);
    }
}
