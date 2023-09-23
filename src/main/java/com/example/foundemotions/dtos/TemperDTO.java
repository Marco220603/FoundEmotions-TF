package com.example.foundemotions.dtos;

import com.example.foundemotions.entities.Gender;


import java.util.List;

public class TemperDTO {
    private int id;

    private String name;

    private String description;

    private List<Gender> genderid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Gender> getGenderid() {
        return genderid;
    }

    public void setGenderid(List<Gender> genderid) {
        this.genderid = genderid;
    }
}
