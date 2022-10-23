package com.example.thesimpsons.model;

public class Ataque {

    private String nombre;
    private int dano;

    public Ataque(String nombre, int daño) {
        this.nombre = nombre;
        this.dano = daño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return dano;
    }

    public void setDaño(int daño) {
        this.dano = daño;
    }
}
