package com.example.foundemotions.controllers;

import com.example.foundemotions.dtos.PlaylistDTO;
import com.example.foundemotions.dtos.SongsDTO;
import com.example.foundemotions.dtos.totalSongsSavebyUserDTO;
import com.example.foundemotions.entities.Playlist;
import com.example.foundemotions.serviceinterface.IPlaylistService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/Playlist")

public class PlaylistController {

    @Autowired
    private IPlaylistService pS;

    @PostMapping
    public void register(@RequestBody PlaylistDTO dto){
        ModelMapper m = new ModelMapper();
        Playlist t = m.map(dto,Playlist.class);
        pS.insert(t);
    }

    @PutMapping
    private void modify(@RequestBody PlaylistDTO dto){
        ModelMapper m = new ModelMapper();
        Playlist t = m.map(dto,Playlist.class);
        pS.insert(t);
    }
    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") Integer id){pS.delete(id);}


    @GetMapping("/{id}")
    public PlaylistDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        PlaylistDTO dto=m.map(pS.listId(id),PlaylistDTO.class);
        return dto;
    }


    @GetMapping
    public List<PlaylistDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,PlaylistDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/cancionesagregadasporUser")
    public List<totalSongsSavebyUserDTO> cancionesagregasbyUser(){
        List<String[]>totalSongsSavebyUser = pS.totalSongsSavebyUser();
        List<totalSongsSavebyUserDTO> totalSongsSavebyUserDTOS = new ArrayList<>();
        for (String[] data: totalSongsSavebyUser){
            totalSongsSavebyUserDTO dto = new totalSongsSavebyUserDTO();
            dto.setName(data[0]);
            dto.setTotalcanciones(Integer.parseInt(data[1]));
            dto.setTotalcuestionario(Integer.parseInt(data[2]));
            totalSongsSavebyUserDTOS.add(dto);
        }

        return totalSongsSavebyUserDTOS;
    }



}
