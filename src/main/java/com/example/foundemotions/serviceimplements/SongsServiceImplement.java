package com.example.foundemotions.serviceimplements;

import com.example.foundemotions.entities.Songs;
import com.example.foundemotions.repositories.ISongsRespository;
import com.example.foundemotions.serviceinterface.ISongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongsServiceImplement implements ISongsService {
    @Autowired
    private ISongsRespository sR;
    @Override
    public void insert(Songs songs) {
        sR.save(songs);
    }

    @Override
    public void delete(int idtsongs) {
        sR.deleteById(idtsongs);
    }

    @Override
    public Songs listId(int idsongs) {
        return sR.findById(idsongs).orElse(new Songs());
    }

    @Override
    public List<Songs> list() {
        return sR.findAll();
    }
}
