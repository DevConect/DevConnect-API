package com.andrenique.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "aplicaciones_ofertas")
public class AplicacionOferta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "desarrollador_id")
    private Usuario desarrollador;

    @ManyToOne
    @JoinColumn(name = "oferta_laboral_id")
    private ofertaLaboral ofertaLaboral;

    private String estado; // Estado de la aplicación: "Pendiente", "Aceptado", "Rechazado"
}
