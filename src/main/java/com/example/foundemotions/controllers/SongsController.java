package com.example.foundemotions.controllers;

import com.example.foundemotions.dtos.SongsDTO;
import com.example.foundemotions.dtos.TemperDTO;
import com.example.foundemotions.entities.Songs;
import com.example.foundemotions.entities.Temper;
import com.example.foundemotions.serviceinterface.ISongsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/songs")
public class SongsController {
    @Autowired
    private ISongsService sS;

    @PostMapping
    public void register(@RequestBody SongsDTO dto){
        ModelMapper m = new ModelMapper();
        Songs s = m.map(dto,Songs.class);
        sS.insert(s);
    }

    @PutMapping
    private void modify(@RequestBody SongsDTO dto){
        ModelMapper m = new ModelMapper();
        Songs t = m.map(dto,Songs.class);
        sS.insert(t);
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") Integer id){sS.delete(id);}

    @GetMapping
    public List<SongsDTO> list(){
        return sS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,SongsDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public SongsDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        SongsDTO dto=m.map(sS.listId(id),SongsDTO.class);
        return dto;
    }
}
