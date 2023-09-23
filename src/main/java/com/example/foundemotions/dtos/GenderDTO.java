package com.example.foundemotions.dtos;

import javax.persistence.Column;

public class GenderDTO {

    private int id ;
    private String nameGender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameGender() {
        return nameGender;
    }

    public void setNameGender(String nameGender) {
        this.nameGender = nameGender;
    }
}
