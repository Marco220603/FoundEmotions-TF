package com.example.foundemotions.serviceimplements;

import com.example.foundemotions.entities.Artist;
import com.example.foundemotions.repositories.IArtistRepository;
import com.example.foundemotions.serviceinterface.IArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ArtistServiceImplement implements IArtistService {


    @Autowired
    private IArtistRepository iaR ;


    @Override
    public void insert(Artist artist ) { iaR.save(artist); }

    @Override
    public List<Artist> list() {return iaR.findAll();};

    @Override
    public void delete(int idArtist) { iaR.deleteById(idArtist);};

    @Override
    public Artist listId(int idArtist){return iaR.findById(idArtist).orElse(new Artist()) ;}

    @Override
    public List<String[]> ArtistasPorGenero() {
        return iaR.ArtistasPorGenero();
    }

}
