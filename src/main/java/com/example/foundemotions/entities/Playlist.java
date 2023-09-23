package com.example.foundemotions.entities;


import javax.persistence.*;

@Entity
@Table(name = "Playlist")
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",length = 35,nullable = false)
    private String namePlaylist;

    @Column(name = "description",length = 50)
    private String description ;


    @ManyToOne
    @JoinColumn(name="id_user",referencedColumnName = "id_user")
    private User iduser;

    @ManyToOne
    @JoinColumn(name="id_songs",referencedColumnName = "id_songs")
    private Songs idsongs;

    public Playlist(int id, String namePlaylist, String description, User iduser, Songs idsongs) {
        this.id = id;
        this.namePlaylist = namePlaylist;
        this.description = description;
        this.iduser = iduser;
        this.idsongs = idsongs;
    }

    public Playlist() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePlaylist() {
        return namePlaylist;
    }

    public void setNamePlaylist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getIduser() {
        return iduser;
    }

    public void setIduser(User iduser) {
        this.iduser = iduser;
    }

    public Songs getIdsongs() {
        return idsongs;
    }

    public void setIdsongs(Songs idsongs) {
        this.idsongs = idsongs;
    }
}
