package com.example.foundemotions.repositories;

import com.example.foundemotions.entities.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenderRepository extends JpaRepository <Gender,Integer> {

  @Query("SELECT gender.nameGender AS genero, COUNT(artist.id) AS cantidad_de_artistas " +
            "FROM Gender gender " +
            "JOIN Artist artist ON gender.id = artist.gender.id " +
            "GROUP BY gender.nameGender " +
            "ORDER BY cantidad_de_artistas DESC")
    List<String[]> findGenderWithMostArtists();

}
