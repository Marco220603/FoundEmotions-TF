package com.example.foundemotions.controllers;

import com.example.foundemotions.dtos.QuestionnaireResultDTO;
import com.example.foundemotions.dtos.QuestionsDTO;
import com.example.foundemotions.serviceinterface.IQuestionnaireResultService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/questionsresult")
public class QuestionnaireResultController {
    @Autowired
    private IQuestionnaireResultService qrS;

    @GetMapping
    public List<QuestionnaireResultDTO> list(){
        return qrS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,QuestionnaireResultDTO.class);
        }).collect(Collectors.toList());
    }
}
