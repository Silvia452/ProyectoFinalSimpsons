package com.example.thesimpsons.model;

import java.io.Serializable;

public class Usuario {

    private long id;
    private String email;
    private String nombre;
    private String contrasena;

    public Usuario(long id, String email, String nombre, String contrasena) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.contrasena = contrasena;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
