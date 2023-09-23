package com.example.foundemotions.repositories;

import com.example.foundemotions.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArtistRepository extends JpaRepository<Artist,Integer> {


}
