package com.example.foundemotions.serviceinterface;

import com.example.foundemotions.entities.Playlist;

import java.util.List;

public interface IPlaylistService {
    public void insert(Playlist playlist);
    public List<Playlist> list();
    public void delete(int idPlaylist);
    public Playlist listId(int idPlaylist);
    public List<String[]> totalSongsSavebyUser();
}
