package Backend;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String contraseña;
    private Date fechaNacimiento;
    private String direccion;
    private String telefono;
    private List<String> objetosPerdidos;

    public Usuario(String nombre, String apellido, String email, String contraseña, Date fechaNacimiento, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.objetosPerdidos = new ArrayList<>();

    }

    public void register() {

    }

    public boolean authenticate(String email, String contraseña) {

        return false;
    }

    public void updateProfile(String nombre, String apellido, String direccion, String telefono) {
        
    }

    public void changePassword(String oldPassword, String newPassword) {

    }

    public void reportLostObject(String objetoPerdido) {
        this.objetosPerdidos.add(objetoPerdido); 
    }

    public void reportFoundObject(String objetoEncontrado) {
    
    }

    public String getProfile() {
    
        return "";
    }

    public List<String> getLostObjects() {
        return this.objetosPerdidos;
    }
