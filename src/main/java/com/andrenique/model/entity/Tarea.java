package com.andrenique.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "tareas")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(length = 500)
    private String descripcion;

    private LocalDate fechaEntrega;

    private String estado; // Por ejemplo: "Pendiente", "Completado"

    @ManyToOne
    @JoinColumn(name = "hito_id")
    private Hito hito;

    // Getters y setters
}