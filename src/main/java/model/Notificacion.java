package model;

import java.time.LocalDateTime;

public class Notificacion {
    private String mensaje;
    private LocalDateTime fecha;
    private Usuario usuario;

    public Notificacion(String mensaje, Usuario usuario) {
        this.mensaje = mensaje;
        this.usuario = usuario;
        this.fecha = LocalDateTime.now();
    }

    // Getters y Setters
    public String getMensaje() { return mensaje; }
    public LocalDateTime getFecha() { return fecha; }
    public Usuario getUsuario() { return usuario; }

    public void enviarNotificacion() {
        // Lógica para enviar notificación al usuario
    }
}
