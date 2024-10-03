package com.andrenique.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String empresa;
    private String descripcionEmpresa;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Otros detalles del cliente
}
