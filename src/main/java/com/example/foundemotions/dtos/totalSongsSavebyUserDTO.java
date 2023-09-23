package com.example.foundemotions.dtos;

public class totalSongsSavebyUserDTO {
    private String name;
    private int totalcanciones;

    private int totalcuestionario;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalcanciones() {
        return totalcanciones;
    }

    public void setTotalcanciones(int totalcanciones) {
        this.totalcanciones = totalcanciones;
    }

    public int getTotalcuestionario() {
        return totalcuestionario;
    }

    public void setTotalcuestionario(int totalcuestionario) {
        this.totalcuestionario = totalcuestionario;
    }
}
