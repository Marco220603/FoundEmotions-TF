package com.example.foundemotions.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Playlist")
public class Playlist {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name",length = 35,nullable = false)
    private String name;

    @Column(name = "description",length = 50)
    private String description ;


    @ManyToOne
    @JoinColumn(name="userid")
    private User user;

    @ManyToOne
    @JoinColumn(name="idsongs")
    private Songs idsongs;

    public Playlist() {
    }

    public Playlist(int id, String name, String description, User user, Songs idsongs) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.user = user;
        this.idsongs = idsongs;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Songs getIdsongs() {
        return idsongs;
    }

    public void setIdsongs(Songs idsongs) {
        this.idsongs = idsongs;
    }
}
