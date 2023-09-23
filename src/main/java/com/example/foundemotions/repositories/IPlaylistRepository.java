package com.example.foundemotions.repositories;

import com.example.foundemotions.entities.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlaylistRepository extends JpaRepository <Playlist,Integer> {


}
