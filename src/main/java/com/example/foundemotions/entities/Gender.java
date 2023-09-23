package com.example.foundemotions.entities;


import javax.persistence.*;

@Entity
@Table(name="gender")
public class Gender{

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id ;

    @Column(name="nameGender",length = 40, nullable = false)
    private String nameGender;

    public Gender(int id, String nameGender) {
        this.id = id;
        this.nameGender = nameGender;
    }

    public Gender() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameGender() {
        return nameGender;
    }

    public void setNameGender(String nameGender) {
        this.nameGender = nameGender;
    }
}
