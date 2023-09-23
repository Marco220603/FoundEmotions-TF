package com.example.foundemotions.serviceimplements;

import com.example.foundemotions.entities.Questions;
import com.example.foundemotions.repositories.IQuestionsRepository;
import com.example.foundemotions.serviceinterface.IQuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsServiceImplements implements IQuestionsService {
    @Autowired
    private IQuestionsRepository qR;
    @Override
    public void insert(Questions questions) {
        qR.save(questions);
    }

    @Override
    public void delete(int idquestions) {
        qR.deleteById(idquestions);
    }

    @Override
    public Questions listId(int idquestions) {
        return qR.findById(idquestions).orElse(new Questions());
    }

    @Override
    public List<Questions> list() {
        return qR.findAll();
    }
}
