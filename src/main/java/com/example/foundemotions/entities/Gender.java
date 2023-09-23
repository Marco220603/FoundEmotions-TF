package com.example.foundemotions.entities;


import javax.persistence.*;

@Entity
@Table(name="gender")
public class Gender{

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id ;

    @Column(name="name",length = 40, nullable = false)
    private String name;

    public Gender() {
    }

    public Gender(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
