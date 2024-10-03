package com.andrenique.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "proyectos")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(length = 500)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "oferta_laboral_id")
    private ofertaLaboral ofertaLaboral;

    @ManyToOne
    @JoinColumn(name = "cliente_id") // Aquí se especifica el nombre de la columna en la base de datos
    private Cliente cliente; // Asegúrate de que tienes una clase Cliente definida
    @OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL)
    private List<Hito> hitos;

    // Getters y setters

}
