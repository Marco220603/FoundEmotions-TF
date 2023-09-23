package com.example.foundemotions.entities;

import javax.persistence.*;

@Entity
@Table(name = "Questions")
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "textquestion",nullable = false,length = 150)
    private String textquestion;
    @Column(name = "alternative1",nullable = false,length = 150)
    private String alternative1;
    @Column(name = "alternative2",nullable = false,length = 150)
    private String alternative2;
    @Column(name = "alternative3",nullable = false,length = 150)
    private String alternative3;
    @Column(name = "alternative4",nullable = false,length = 150)
    private String alternative4;

    public Questions() {
    }

    public Questions(int id, String textquestion, String alternative1, String alternative2, String alternative3, String alternative4) {
        this.id = id;
        this.textquestion = textquestion;
        this.alternative1 = alternative1;
        this.alternative2 = alternative2;
        this.alternative3 = alternative3;
        this.alternative4 = alternative4;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTextquestion() {
        return textquestion;
    }

    public void setTextquestion(String textquestion) {
        this.textquestion = textquestion;
    }

    public String getAlternative1() {
        return alternative1;
    }

    public void setAlternative1(String alternative1) {
        this.alternative1 = alternative1;
    }

    public String getAlternative2() {
        return alternative2;
    }

    public void setAlternative2(String alternative2) {
        this.alternative2 = alternative2;
    }

    public String getAlternative3() {
        return alternative3;
    }

    public void setAlternative3(String alternative3) {
        this.alternative3 = alternative3;
    }

    public String getAlternative4() {
        return alternative4;
    }

    public void setAlternative4(String alternative4) {
        this.alternative4 = alternative4;
    }
}
