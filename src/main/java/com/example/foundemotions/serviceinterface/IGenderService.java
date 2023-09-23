package com.example.foundemotions.serviceinterface;

import com.example.foundemotions.entities.Artist;
import com.example.foundemotions.entities.Gender;

import java.util.List;

public interface IGenderService {

    public void insert(Gender gender);
    public List<Gender> list();
    public void delete(int idGender);
    public Gender listarId(int idGender);
}
