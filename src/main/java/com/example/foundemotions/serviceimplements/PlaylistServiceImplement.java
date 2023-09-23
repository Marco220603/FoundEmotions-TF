package com.example.foundemotions.serviceimplements;

import com.example.foundemotions.entities.Playlist;
import com.example.foundemotions.repositories.IPlaylistRepository;
import com.example.foundemotions.serviceinterface.IPlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistServiceImplement implements IPlaylistService {
    @Autowired
    private IPlaylistRepository pR;
    @Override
    public void insert(Playlist playlist) {
        pR.save(playlist);
    }

    @Override
    public List<Playlist> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPlaylist) {
        pR.deleteById(idPlaylist);
    }

    @Override
    public Playlist listarId(int idPlaylist) {
        return pR.findById(idPlaylist).orElse(new Playlist());
    }
}
