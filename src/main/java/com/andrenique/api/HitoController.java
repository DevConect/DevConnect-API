package com.andrenique.api;

import com.andrenique.dto.HitoDTO;
import com.andrenique.model.entity.Hito;
import com.andrenique.service.HitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hitos")
public class HitoController {

    @Autowired
    private HitoService hitoService;

    @PostMapping
    public ResponseEntity<Hito> crearHito(@RequestBody HitoDTO hitoDTO) {
        Hito nuevoHito = hitoService.crearHito(hitoDTO);
        return new ResponseEntity<>(nuevoHito, HttpStatus.CREATED);
    }
}
