package com.andrenique.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "ofertas_laborales")
public class ofertaLaboral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(length = 500)
    private String descripcion;

    private String habilidadesRequeridas;

    private double presupuesto;

    @ManyToOne // Cambiado a ManyToOne, ya que varias ofertas pueden pertenecer a un proyecto
    @JoinColumn(name = "proyecto_id", nullable = false)
    private Proyecto proyecto;

    public void setFechaCreacion(LocalDate now) {
    }

    // No necesitas este método ya que se manejará a través del proyecto
    // public void setProyecto(Proyecto proyecto) {
    // }

    // Getters y Setters generados por Lombok
}
