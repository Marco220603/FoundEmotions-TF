package com.example.foundemotions.serviceinterface;

import com.example.foundemotions.entities.Songs;


import java.util.List;

public interface ISongsService {
    public void insert(Songs songs);

    public void delete(int idtsongs);

    public Songs listId(int idsongs);

    List<Songs> list();
}
