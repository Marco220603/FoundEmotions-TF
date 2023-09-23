package com.example.foundemotions.serviceimplements;


import com.example.foundemotions.entities.Gender;
import com.example.foundemotions.repositories.IGenderRepository;
import com.example.foundemotions.serviceinterface.IGenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class GenderServiceImplement implements IGenderService {


    @Autowired
    private IGenderRepository igR ;


    @Override
    public void insert(Gender gender) { igR.save(gender); }

    @Override
    public List<Gender> list() {return igR.findAll();};

    @Override
    public void delete(int idGender) {igR.deleteById(idGender);};

    @Override
    public Gender listarId(int idGender){return igR.findById(idGender).orElse(new Gender()) ;}
}
