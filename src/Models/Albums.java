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
public class Albums {
    private String name;
    private int releasedAt;
    private ArrayList<Songs> music = new ArrayList<>();
    private Artists artist;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(int releasedAt) {
        this.releasedAt = releasedAt;
    }

    public ArrayList<Songs> getMusic() {
        return music;
    }

    public void setMusic(ArrayList<Songs> music) {
        this.music = music;
    }

    public Artists getArtist() {
        return artist;
    }

    public void setArtist(Artists artist) {
        this.artist = artist;
    }
}
