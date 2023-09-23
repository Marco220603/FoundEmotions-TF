package com.example.foundemotions.entities;

import javax.persistence.Entity;


public class Temper {
    private int id;
    private String name;
    private String description;
    private Gender genderid;
    public Temper() {
    }

    public Temper(int id, String name, String description, Gender genderid) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.genderid = genderid;
    }

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

    public Gender getGenderid() {
        return genderid;
    }

    public void setGenderid(Gender genderid) {
        this.genderid = genderid;
    }
}
