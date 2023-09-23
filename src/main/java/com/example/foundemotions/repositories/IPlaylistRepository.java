package com.example.foundemotions.repositories;

import com.example.foundemotions.entities.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlaylistRepository extends JpaRepository <Playlist,Integer> {


}
