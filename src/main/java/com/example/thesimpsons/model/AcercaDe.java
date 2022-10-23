package com.example.thesimpsons.model;

public class AcercaDe {
    public String persona1;
    public String persona2;
    public String persona3;
    public String nombrejuego;

    public AcercaDe(String persona1, String persona2, String persona3, String nombrejuego) {
        this.persona1 = persona1;
        this.persona2 = persona2;
        this.persona3 = persona3;
        this.nombrejuego = nombrejuego;
    }
    public AcercaDe(){

    }

    public String getPersona1() {
        return persona1;
    }

    public void setPersona1(String persona1) {
        this.persona1 = persona1;
    }

    public String getPersona2() {
        return persona2;
    }

    public void setPersona2(String persona2) {
        this.persona2 = persona2;
    }

    public String getPersona3() {
        return persona3;
    }

    public void setPersona3(String persona3) {
        this.persona3 = persona3;
    }

    public String getNombrejuego() {
        return nombrejuego;
    }

    public void setNombrejuego(String nombrejuego) {
        this.nombrejuego = nombrejuego;
    }
}
