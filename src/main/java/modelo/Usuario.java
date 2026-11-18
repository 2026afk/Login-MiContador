/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Win 11 Pro
 */
public class Usuario {
    // declaramos las variables
    private int id_usuario;
    private String nombre;
    private String contrasena;
    
    //creamos los constructores uno vaccio y el otro normal
    public Usuario(){
    }

    public Usuario(int id_usuario, String nombre, String contraseña) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.contrasena = contraseña;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contrasena;
    }

    public void setContraseña(String contraseña) {
        this.contrasena = contraseña;
    }
    
}
