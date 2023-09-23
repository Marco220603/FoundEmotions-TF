package com.example.foundemotions.contrllers;

import com.example.foundemotions.dtos.TemperDTO;
import com.example.foundemotions.entities.Temper;
import com.example.foundemotions.serviceinterface.ITemperService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
