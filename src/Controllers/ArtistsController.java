/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Artists;
import java.util.HashMap;
import java.util.Map;
import Controllers.Utils;
import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 *
 * @author victor
 */
public class ArtistsController implements BaseController<Artists>{
    private Map<Integer, Artists> artistsRecorded = new HashMap<>();
    private Utils utils = new Utils();
    
    @Override
    public void insert(Artists artists) {
        artistsRecorded.put(utils.generateKeys(), artists);
    }

    @Override
    public Artists[] get() {
        return (Artists[]) artistsRecorded.values().toArray();
    }

    @Override
    public Artists getByKey(int key) {
        return artistsRecorded.get(key);
    }

    @Override
    public void update(int key, Artists artist) {
        artistsRecorded.replace(key, artist);
    }

    @Override
    public void remove(int key) {
        artistsRecorded.remove(key);
    }
    
    public Artists[] getModelFields(){
        ArrayList<String> payback = new ArrayList<>();
        Field[] declaredFields = Artists.class.getDeclaredFields();
        
        for(Field field : declaredFields){
            payback.add(field.getName());
        }        
        return (Artists[]) payback.toArray();
    }
}
