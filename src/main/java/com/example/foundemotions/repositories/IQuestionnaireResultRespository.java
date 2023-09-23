package com.example.foundemotions.repositories;

import com.example.foundemotions.entities.QuestionnaireResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IQuestionnaireResultRespository extends JpaRepository<QuestionnaireResult,Integer> {

    @Query(value = "SELECT u.username AS NombreUsuario, t.name AS NombreTemperamento\n" +
            "FROM QuestionnaireResult qr\n" +
            "INNER JOIN User u ON qr.userid = u.id\n" +
            "INNER JOIN Temper t ON qr.temperid = t.id;",nativeQuery = true)
    public List<String[]> ResultadoUserTemperamento();

}
