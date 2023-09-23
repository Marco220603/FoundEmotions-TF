package com.example.foundemotions.serviceinterface;

import com.example.foundemotions.entities.Songs;
import com.example.foundemotions.entities.Temper;

import java.util.List;

public interface ISongsService {
    public void insert(Songs songs);

    public void delete(int idtsongs);

    public Temper listId(int idsongs);

    List<Temper> list();
}
