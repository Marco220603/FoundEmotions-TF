package com.example.foundemotions.repositories;

import com.example.foundemotions.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArtistRepository extends JpaRepository<Artist,Integer> {


}
