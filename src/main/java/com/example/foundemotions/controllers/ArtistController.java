package com.example.foundemotions.controllers;


import com.example.foundemotions.dtos.ArtistDTO;
import com.example.foundemotions.dtos.ArtistasPorGeneroDTO;
import com.example.foundemotions.dtos.GenderDTO;
import com.example.foundemotions.entities.Artist;
import com.example.foundemotions.serviceinterface.IArtistService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/artist")
public class ArtistController {

    @Autowired
    private IArtistService aS ;

    @PostMapping
    public void register(@RequestBody ArtistDTO dto){
        ModelMapper m = new ModelMapper();
        Artist t = m.map(dto,Artist.class);
        aS.insert(t);
    }

    @PutMapping
    private void modify(@RequestBody ArtistDTO dto){
        ModelMapper m = new ModelMapper();
        Artist t = m.map(dto,Artist.class);
        aS.insert(t);
    }
    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") Integer id){aS.delete(id);}

    @GetMapping
    public List<ArtistDTO> list(){
        return aS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ArtistDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public ArtistDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        ArtistDTO dto=m.map(aS.listId(id),ArtistDTO.class);
        return dto;
    }

    @GetMapping("/artistaporgenero")
    public List<ArtistasPorGeneroDTO> ArtistaPorGeneroaUser(){
        List<String[]>artistaporgenero = aS.ArtistasPorGenero();
        List<ArtistasPorGeneroDTO> ArtistasPorGeneroDTOS = new ArrayList<>();
        for (String[] data: artistaporgenero ){
            ArtistasPorGeneroDTO dto=new ArtistasPorGeneroDTO();
            dto.setName(data[0]);
            dto.setArtistaname(data[1]);
            dto.setGeneroname(data[2]);
            ArtistasPorGeneroDTOS.add(dto);
        }
        return ArtistasPorGeneroDTOS;

    }
}
