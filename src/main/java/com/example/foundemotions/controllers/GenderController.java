package com.example.foundemotions.controllers;


import com.example.foundemotions.dtos.GenderDTO;
import com.example.foundemotions.dtos.PlaylistDTO;
import com.example.foundemotions.entities.Gender;
import com.example.foundemotions.serviceinterface.IGenderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Gender")
public class GenderController {

    @Autowired
    private IGenderService gS;

    @PostMapping
    public void register(@RequestBody GenderDTO dto){
        ModelMapper m = new ModelMapper();
        Gender t = m.map(dto,Gender.class);
        gS.insert(t);
    }

    @PutMapping
    private void modify(@RequestBody GenderDTO dto){
        ModelMapper m = new ModelMapper();
        Gender t = m.map(dto,Gender.class);
        gS.insert(t);
    }
    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") Integer id){gS.delete(id);}

    @GetMapping
    public List<GenderDTO> list(){
        return gS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,GenderDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public GenderDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        GenderDTO dto=m.map(gS.listId(id),GenderDTO.class);
        return dto;
    }







}
