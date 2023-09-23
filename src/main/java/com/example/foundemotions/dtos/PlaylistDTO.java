package com.example.foundemotions.dtos;

import com.example.foundemotions.entities.Songs;
import com.example.foundemotions.entities.User;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PlaylistDTO {
    private int id;

    private String namePlaylist;

    private String description ;

    private User iduser;

    private Songs idsongs;

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
