package com.example.foundemotions.repositories;

import com.example.foundemotions.entities.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuestionsRepository extends JpaRepository<Questions,Integer> {
}
