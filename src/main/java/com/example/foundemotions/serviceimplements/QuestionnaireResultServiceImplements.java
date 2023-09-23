package com.example.foundemotions.serviceimplements;

import com.example.foundemotions.entities.QuestionnaireResult;
import com.example.foundemotions.repositories.IQuestionnaireResultRespository;
import com.example.foundemotions.serviceinterface.IQuestionnaireResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionnaireResultServiceImplements implements IQuestionnaireResultService {
    @Autowired
    private IQuestionnaireResultRespository qrR;
    @Override
    public void insert(QuestionnaireResult questionnaireResult) {
        qrR.save(questionnaireResult);
    }

    @Override
    public void delete(int idtquetionnaireresult) {
        qrR.deleteById(idtquetionnaireresult);
    }

    @Override
    public QuestionnaireResult listId(int idquestionnaireresult) {
        return qrR.findById(idquestionnaireresult).orElse(new QuestionnaireResult());
    }

    @Override
    public List<QuestionnaireResult> list() {
        return qrR.findAll();
    }
}
