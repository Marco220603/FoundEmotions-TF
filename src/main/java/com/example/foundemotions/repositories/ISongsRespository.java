package com.example.foundemotions.repositories;

import com.example.foundemotions.entities.Songs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISongsRespository extends JpaRepository<Songs,Integer> {
}
