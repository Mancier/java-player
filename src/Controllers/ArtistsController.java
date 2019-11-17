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
    public Object get() {
        return artistsRecorded.values();
    }

    @Override
    public Object getByKey(int key) {
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
}
