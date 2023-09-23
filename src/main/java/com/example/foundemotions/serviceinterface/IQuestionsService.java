package com.example.foundemotions.serviceinterface;

import com.example.foundemotions.entities.Questions;
import com.example.foundemotions.entities.Temper;

import java.util.List;

public interface IQuestionsService {
    public void insert(Questions questions);

    public void delete(int idquestions);

    public Temper listId(int idquestions);

    List<Temper> list();
}
