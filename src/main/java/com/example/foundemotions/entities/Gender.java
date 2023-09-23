package com.example.foundemotions.entities;


import javax.persistence.*;

@Entity
@Table(name="gender")
public class Gender{

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id ;

    @Column(name="name",length = 40, nullable = false)
    private String nameGender;

    public Gender() {

    }

    public Gender(int id, String name) {
        this.id = id;
        this.nameGender = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nameGender;
    }

    public void setName(String name) {
        this.nameGender= name;
    }
}
