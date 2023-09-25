package com.example.foundemotions.repositories;

import com.example.foundemotions.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IArtistRepository extends JpaRepository<Artist,Integer> {
  @Query(value = "SELECT artist.name,gender.name FROM artist\n" +
            "LEFT JOIN gender ON artist.genderid=gender.id;",nativeQuery = true)
    public List<String[]> ArtistasPorGenero();

}
