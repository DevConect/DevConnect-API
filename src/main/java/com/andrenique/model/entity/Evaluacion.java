package com.andrenique.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "evaluaciones")
public class Evaluacion {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private int puntuacion; // Puntuación numérica (1 a 5)
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "contrato_id")
    private Contrato contrato;
}