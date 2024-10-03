package com.andrenique.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Asegúrate de que esta columna esté configurada para autogenerarse en la base de datos.

    private String nombre;
    private String correo;
    private String contrasena;
    private String rol; // Puede ser "Desarrollador" o "Cliente"

    // Otros detalles del perfil como portafolio, habilidades para desarrolladores o empresa para clientes
}
