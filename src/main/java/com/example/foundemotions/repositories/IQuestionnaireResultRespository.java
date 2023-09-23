package com.example.foundemotions.repositories;

import com.example.foundemotions.entities.QuestionnaireResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuestionnaireResultRespository extends JpaRepository<QuestionnaireResult,Integer> {
}
