package com.example.thesimpsons.model;

public class Ranking {
    private int puntosjugador1;
    private int puntosjugador2;
    private String ataquesjugador1;
    private String ataquesjugador2;
    private int vidasj1;
    private int vidasj2;

    public Ranking(int puntosjugador1, int puntosjugador2, String ataquesjugador1, String ataquesjugador2, int vidasj1, int vidasj2) {
        this.puntosjugador1 = puntosjugador1;
        this.puntosjugador2 = puntosjugador2;
        this.ataquesjugador1 = ataquesjugador1;
        this.ataquesjugador2 = ataquesjugador2;
        this.vidasj1 = vidasj1;
        this.vidasj2 = vidasj2;
    }

    public int getPuntosjugador1() {
        return puntosjugador1;
    }

    public void setPuntosjugador1(int puntosjugador1) {
        this.puntosjugador1 = puntosjugador1;
    }

    public int getPuntosjugador2() {
        return puntosjugador2;
    }

    public void setPuntosjugador2(int puntosjugador2) {
        this.puntosjugador2 = puntosjugador2;
    }

    public String getAtaquesjugador1() {
        return ataquesjugador1;
    }

    public void setAtaquesjugador1(String ataquesjugador1) {
        this.ataquesjugador1 = ataquesjugador1;
    }

    public String getAtaquesjugador2() {
        return ataquesjugador2;
    }

    public void setAtaquesjugador2(String ataquesjugador2) {
        this.ataquesjugador2 = ataquesjugador2;
    }

    public int getVidasj1() {
        return vidasj1;
    }

    public void setVidasj1(int vidasj1) {
        this.vidasj1 = vidasj1;
    }

    public int getVidasj2() {
        return vidasj2;
    }

    public void setVidasj2(int vidasj2) {
        this.vidasj2 = vidasj2;
    }
}
