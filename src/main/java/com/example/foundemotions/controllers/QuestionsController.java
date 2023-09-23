package com.example.foundemotions.controllers;

import com.example.foundemotions.dtos.QuestionsDTO;
import com.example.foundemotions.dtos.SongsDTO;
import com.example.foundemotions.entities.Questions;
import com.example.foundemotions.entities.Songs;
import com.example.foundemotions.serviceinterface.IQuestionsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/questions")
public class QuestionsController {
    @Autowired
    private IQuestionsService qS;

    @PostMapping
    public void register(@RequestBody QuestionsDTO dto){
        ModelMapper m = new ModelMapper();
        Questions s = m.map(dto,Questions.class);
        qS.insert(s);
    }

    @PutMapping
    private void modify(@RequestBody QuestionsDTO dto){
        ModelMapper m = new ModelMapper();
        Questions t = m.map(dto,Questions.class);
        qS.insert(t);
    }

    @DeleteMapping
    private void delete(@PathVariable("id") Integer id){qS.delete(id);}

    @GetMapping
    public List<QuestionsDTO> list(){
        return qS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,QuestionsDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public QuestionsDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        QuestionsDTO dto=m.map(qS.listId(id),QuestionsDTO.class);
        return dto;
    }
}
