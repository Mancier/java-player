/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Playlists;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author victor
 */
public class PlaylistsController implements BaseController<Playlists>{
    public Map<Integer, Playlists> playlistsRecorded = new HashMap<>();
    private Utils utils = new Utils();

    @Override
    public void insert(Playlists element) {
        playlistsRecorded.put(utils.hashCode(), element);
    }

    @Override
    public Playlists[] get() {
        return (Playlists[]) playlistsRecorded.values().toArray();
    }

    @Override
    public Playlists getByKey(int key) {
        return playlistsRecorded.get(key);
    }

    @Override
    public void update(int key, Playlists element) {
        playlistsRecorded.replace(key, element);
    }

    @Override
    public void remove(int key) {
        playlistsRecorded.remove(key);
    }
    
    @Override
    public Playlists[] getModelFields(){
        ArrayList<String> payback = new ArrayList<>();
        Field[] declaredFields = Playlists.class.getDeclaredFields();
        
        for(Field field : declaredFields){
            payback.add(field.getName());
        }
        
        return (Playlists[]) payback.toArray();
    }
}
