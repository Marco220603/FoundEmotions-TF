package com.example.foundemotions.dtos;

import javax.persistence.Column;

public class QuestionsDTO {
    private int id;
    private String textquestion;
    private String alternative1;
    private String alternative2;
    private String alternative3;
    private String alternative4;

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
