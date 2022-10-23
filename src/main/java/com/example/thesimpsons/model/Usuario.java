package com.example.thesimpsons.model;

public class Usuario {

    private long id;
    private String email;
    private String nombre;
    private String contraseña;


    public Usuario(long id, String email, String nombre, String contraseña) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
