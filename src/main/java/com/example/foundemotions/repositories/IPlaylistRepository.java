package com.example.foundemotions.repositories;

import com.example.foundemotions.entities.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPlaylistRepository extends JpaRepository <Playlist,Integer> {
    @Query(value = "SELECT c.username as Name, COUNT(p.userid) as total_canciones_en_su_playlist,SUM(qr.totalscore) AS TotalDescoreDelCuestionario\n" +
            "FROM Users c\n" +
            "LEFT JOIN Playlist p ON c.id = p.userid\n" +
            "LEFT JOIN Questionnaire_result qr ON c.id = qr.userid\n" +
            "GROUP BY c.username",nativeQuery = true)
    public List<String[]> totalSongsSavebyUser();
}
