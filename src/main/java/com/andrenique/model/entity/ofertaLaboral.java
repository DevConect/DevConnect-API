package com.andrenique.model.entity;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

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

    @OneToMany(mappedBy = "ofertaLaboral", cascade = CascadeType.ALL)
    private List<Proyecto> proyectos;

    // Getters y setters
}
