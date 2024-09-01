package model;

import java.time.LocalDate;

public class ObjetoPerdido {
    private int id;
    private String descripcion;
    private String foto;
    private String ubicacion;
    private LocalDate fechaPerdida;
    private String estado;

    public ObjetoPerdido(int id, String descripcion, String foto, String ubicacion, LocalDate fechaPerdida) {
        this.id = id;
        this.descripcion = descripcion;
        this.foto = foto;
        this.ubicacion = ubicacion;
        this.fechaPerdida = fechaPerdida;
        this.estado = "Perdido";
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }
    public String getFoto() { return foto; }
    public String getUbicacion() { return ubicacion; }
    public LocalDate getFechaPerdida() { return fechaPerdida; }
    public String getEstado() { return estado; }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
}
