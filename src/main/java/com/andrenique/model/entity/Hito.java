package com.andrenique.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "hitos")
public class Hito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(length = 500)
    private String descripcion;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private Proyecto proyecto;

    @OneToMany(mappedBy = "hito", cascade = CascadeType.ALL)
    private List<Tarea> tareas;

    // Getters y setters
}
