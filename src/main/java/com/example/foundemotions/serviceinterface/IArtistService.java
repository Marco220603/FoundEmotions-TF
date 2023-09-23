package com.example.foundemotions.serviceinterface;

import com.example.foundemotions.entities.Artist;

import java.util.List;

public interface IArtistService {

    public void insert(Artist artist);
    public List<Artist> list();
    public void delete(int idArtist);
    public Artist listarId(int idArtist);

}
