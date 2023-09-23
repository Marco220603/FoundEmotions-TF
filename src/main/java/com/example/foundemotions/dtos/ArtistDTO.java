package com.example.foundemotions.dtos;

import com.example.foundemotions.entities.Gender;


public class ArtistDTO {


    private int id;

    private String nameArtist;

    private Gender genderid ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public Gender getGenderid() {
        return genderid;
    }

    public void setGenderid(Gender genderid) {
        this.genderid = genderid;
    }
}
