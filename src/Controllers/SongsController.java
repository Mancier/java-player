/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Songs;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author victor
 */
public class SongsController implements BaseController<Songs>{
    public Map<Integer, Songs> songsRecorded = new HashMap<>();
    private Utils utils = new Utils();

    @Override
    public void insert(Songs element) {
        songsRecorded.put(utils.hashCode(), element);
    }

    @Override
    public Object get() {
        return songsRecorded.values();
    }

    @Override
    public Object getByKey(int key) {
        return songsRecorded.get(key);
    }

    @Override
    public void update(int key, Songs element) {
        songsRecorded.replace(key, element);
    }

    @Override
    public void remove(int key) {
        songsRecorded.remove(key);
    }
    
    @Override
    public Object[] getModelFields(){
        ArrayList<String> payback = new ArrayList<>();
        Field[] declaredFields = Songs.class.getDeclaredFields();
        
        for(Field field : declaredFields){
            payback.add(field.getName());
        }
        
        return payback.toArray();
    }

}
