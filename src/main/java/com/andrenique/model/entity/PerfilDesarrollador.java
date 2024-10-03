package com.andrenique.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "perfiles_desarrolladores")
public class PerfilDesarrollador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String habilidades;
    private String portafolio;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Otros atributos específicos de los desarrolladores
}

