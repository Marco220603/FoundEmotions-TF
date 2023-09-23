package com.example.foundemotions.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "temper")
public class Temper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name",length = 30,nullable = false)
    private String name;
    @Column(name = "description",length = 250,nullable = false)
    private String description;
    @ManyToMany
    @JoinColumn(name = "genderid")
    private List<Gender> genderid;
    public Temper() {
    }

    public Temper(int id, String name, String description, List<Gender> genderid) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.genderid = genderid;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Gender> getGenderid() {
        return genderid;
    }

    public void setGenderid(List<Gender> genderid) {
        this.genderid = genderid;
    }
}
