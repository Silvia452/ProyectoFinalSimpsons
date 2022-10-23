package com.example.thesimpsons.model;

public class Personaje {

    private String nombre;
    private int vida;
    private Ataque[] ataques;

    public Personaje(String nombre, int vida, Ataque[] ataques) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataques = ataques;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Ataque[] getAtaques() {
        return ataques;
    }

    public void setAtaques(Ataque[] ataques) {
        this.ataques = ataques;
    }
}
