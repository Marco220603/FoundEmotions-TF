package com.example.foundemotions.dtos;

public class findGenderWithMostArtistsDTO {
    private String genero;
    private String cantidad_canciones;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCantidad_canciones() {
        return cantidad_canciones;
    }

    public void setCantidad_canciones(String cantidad_canciones) {
        this.cantidad_canciones = cantidad_canciones;
    }
}
