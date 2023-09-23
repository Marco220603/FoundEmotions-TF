package com.example.foundemotions.serviceinterface;

import com.example.foundemotions.entities.QuestionnaireResult;
import com.example.foundemotions.entities.Temper;

import java.util.List;

public interface IQuestionnaireResultService {
    public void insert(QuestionnaireResult questionnaireResult);

    public void delete(int idtquetionnaireresult);

    public Temper listId(int idquestionnaireresult);

    List<Temper> list();
}
