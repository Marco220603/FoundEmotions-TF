package com.example.foundemotions.controllers;

import com.example.foundemotions.dtos.TemperDTO;
import com.example.foundemotions.entities.Temper;
import com.example.foundemotions.serviceinterface.ITemperService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/temper")
public class TemperController {
    @Autowired
    private ITemperService tS;

    @PostMapping
    public void register(@RequestBody TemperDTO dto){
        ModelMapper m = new ModelMapper();
        Temper t = m.map(dto,Temper.class);
        tS.insert(t);
    }
    @PutMapping
    private void modify(@RequestBody TemperDTO dto){
        ModelMapper m = new ModelMapper();
        Temper t = m.map(dto,Temper.class);
        tS.insert(t);
    }
    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") Integer id){tS.delete(id);}

    @GetMapping
    public List<TemperDTO> list(){
        return tS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,TemperDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public TemperDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        TemperDTO dto=m.map(tS.listId(id),TemperDTO.class);
        return dto;
    }








}
