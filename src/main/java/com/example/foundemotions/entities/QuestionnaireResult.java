package com.example.foundemotions.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "QuestionnaireResult")
public class QuestionnaireResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "userid")
    private User user;
    @OneToMany
    @JoinColumn(name = "questionsid")
    private List<Questions> questions;
    @Column(name = "rpta")
    private int rpta;
    @Column(name = "totalscore")
    private int totalscore;
    @OneToOne
    @JoinColumn(name = "temperid")
    private Temper temper;

    public QuestionnaireResult() {
    }

    public QuestionnaireResult(int id, User user, List<Questions> questions, int rpta, int totalscore, Temper temper) {
        this.id = id;
        this.user = user;
        this.questions = questions;
        this.rpta = rpta;
        this.totalscore = totalscore;
        this.temper = temper;
    }

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
