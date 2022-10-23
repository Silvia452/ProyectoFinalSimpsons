package com.example.thesimpsons.model;

public class Habilidad { //2 habilidades máximo por jugador
    public String habilidadj1_1;
    public String habilidadj1_2;
    public String habilidadj2_1;
    public String habilidadj2_2;


    public Habilidad(String habilidadj1_1, String habilidadj1_2, String habilidadj2_1, String habilidadj2_2) {
        this.habilidadj1_1 = habilidadj1_1;
        this.habilidadj1_2 = habilidadj1_2;
        this.habilidadj2_1 = habilidadj2_1;
        this.habilidadj2_2 = habilidadj2_2;
    }

    public String getHabilidadj1_1() {
        return habilidadj1_1;
    }

    public void setHabilidadj1_1(String habilidadj1_1) {
        this.habilidadj1_1 = habilidadj1_1;
    }

    public String getHabilidadj1_2() {
        return habilidadj1_2;
    }

    public void setHabilidadj1_2(String habilidadj1_2) {
        this.habilidadj1_2 = habilidadj1_2;
    }

    public String getHabilidadj2_1() {
        return habilidadj2_1;
    }

    public void setHabilidadj2_1(String habilidadj2_1) {
        this.habilidadj2_1 = habilidadj2_1;
    }

    public String getHabilidadj2_2() {
        return habilidadj2_2;
    }

    public void setHabilidadj2_2(String habilidadj2_2) {
        this.habilidadj2_2 = habilidadj2_2;
    }
}
