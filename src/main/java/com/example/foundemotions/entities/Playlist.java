package com.example.foundemotions.entities;


import javax.persistence.*;

@Entity
@Table(name = "Playlist")
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Playlist(int id, String name, String description, User iduser, Songs idsongs) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.user = iduser;
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

    public User getIduser() {
        return user;
    }

    public void setIduser(User iduser) {
        this.user = iduser;
    }

    public Songs getIdsongs() {
        return idsongs;
    }

    public void setIdsongs(Songs idsongs) {
        this.idsongs = idsongs;
    }
}
