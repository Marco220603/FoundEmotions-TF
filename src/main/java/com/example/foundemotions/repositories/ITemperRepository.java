package com.example.foundemotions.repositories;

import com.example.foundemotions.entities.Temper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemperRepository extends JpaRepository<Temper,Integer> {
}
