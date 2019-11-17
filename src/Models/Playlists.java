/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author victor
 */
public class Playlists {
    private String name;
    private String creator;
    private String createdAt;
    private ArrayList<Songs> musicList = new ArrayList<>();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ArrayList<Songs> getMusicList() {
        return musicList;
    }

    public void setMusicList(ArrayList<Songs> musicList) {
        this.musicList = musicList;
    }
}
