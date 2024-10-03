package com.andrenique.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "contratos")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Usuario cliente;

    @ManyToOne
    @JoinColumn(name = "desarrollador_id")
    private Usuario desarrollador;

    @OneToOne
    @JoinColumn(name = "oferta_laboral_id")
    private ofertaLaboral ofertaLaboral;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estado; // Estado del contrato: "Activo", "Finalizado"
}
