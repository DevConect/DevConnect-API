package com.andrenique.dto;

import java.time.LocalDate;

public class TareaDTO {
    private String titulo;
    private String descripcion;
    private LocalDate fechaEntrega;
    private Long hitoId;

    // Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Long getHitoId() {
        return hitoId;
    }

    public void setHitoId(Long hitoId) {
        this.hitoId = hitoId;
    }
}
