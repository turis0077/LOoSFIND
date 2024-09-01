package main;

import model.Usuario;

public class MainController {
    private Usuario usuarioActual;

    public void iniciarSesion(String nombre, String correo) {
        usuarioActual = new Usuario(nombre, correo);
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }
}
