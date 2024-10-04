package com.andrenique.api;

import com.andrenique.dto.OfertaLaboralDTO;
import com.andrenique.model.entity.ofertaLaboral;
import com.andrenique.service.OfertaLaboralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/overlay")
public class OfertaLaboralController {

    @Autowired
    private OfertaLaboralService ofertaLaboralService;

    @PostMapping
    public ResponseEntity<ofertaLaboral> crearOferta(@RequestBody OfertaLaboralDTO ofertaDTO) {
        ofertaLaboral nuevaOferta = ofertaLaboralService.crearOferta(ofertaDTO);
        return new ResponseEntity<>(nuevaOferta, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<ofertaLaboral>> listarOfertas() {
        List<ofertaLaboral> ofertas = ofertaLaboralService.listarOfertas();
        return new ResponseEntity<>(ofertas, HttpStatus.OK);
    }
    @GetMapping("/proyectos/{proyectoId}")
    public ResponseEntity<List<ofertaLaboral>> filtrarOfertasPorProyecto(@PathVariable Long proyectoId) {
        List<ofertaLaboral> ofertas;
        ofertas = ofertaLaboralService.filtrarOfertasPorProyecto(proyectoId);
        return new ResponseEntity<>(ofertas, HttpStatus.OK);
    }
}
