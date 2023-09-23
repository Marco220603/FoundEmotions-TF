package com.example.foundemotions.controllers;

import com.example.foundemotions.dtos.TemperDTO;
import com.example.foundemotions.entities.Temper;
import com.example.foundemotions.serviceinterface.ITemperService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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



}
