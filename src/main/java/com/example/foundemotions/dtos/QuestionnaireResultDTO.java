package com.example.foundemotions.dtos;

import com.example.foundemotions.entities.Questions;
import com.example.foundemotions.entities.Temper;
import com.example.foundemotions.entities.User;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

public class QuestionnaireResultDTO {
    private int id;
    private User user;
    private List<Questions> questions;
    private int rpta;
    private int totalscore;
    private Temper temper;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }

    public int getRpta() {
        return rpta;
    }

    public void setRpta(int rpta) {
        this.rpta = rpta;
    }

    public int getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(int totalscore) {
        this.totalscore = totalscore;
    }

    public Temper getTemper() {
        return temper;
    }

    public void setTemper(Temper temper) {
        this.temper = temper;
    }
}
