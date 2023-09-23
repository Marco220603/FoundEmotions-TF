package com.example.foundemotions.repositories;

import com.example.foundemotions.entities.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenderRepository extends JpaRepository <Gender,Integer> {

}
