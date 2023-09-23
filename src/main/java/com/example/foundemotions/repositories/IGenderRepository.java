package com.example.foundemotions.repositories;

import com.example.foundemotions.entities.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenderRepository extends JpaRepository <Gender,Integer> {

}
