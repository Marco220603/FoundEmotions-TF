package com.example.foundemotions.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Songs")
public class Songs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title",length = 30,nullable = false)
    private String title;
    @ManyToOne
    @JoinColumn(name = "genderid")
    private Gender gender;
    @ManyToOne
    @JoinColumn(name = "artistid")
    private Artist artist;
    @Column(name = "localdate")
    private LocalDate localDate;

    public Songs() {
    }

    public Songs(int id, String title, Gender gender, Artist artist, LocalDate localDate) {
        this.id = id;
        this.title = title;
        this.gender = gender;
        this.artist = artist;
        this.localDate = localDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
