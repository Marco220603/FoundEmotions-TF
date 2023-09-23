package com.example.foundemotions.serviceinterface;

import com.example.foundemotions.entities.Temper;

import java.util.List;

public interface ITemperService {
    public void insert(Temper temper);

    public void delete(int idtemper);

    public Temper listId(int idtemper);

    List<Temper> list();
}
