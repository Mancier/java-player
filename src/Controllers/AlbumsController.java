/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Albums;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author victor
 */
public class AlbumsController implements BaseController<Albums>{
    public Map<Integer, Albums> albumsRecorded = new HashMap<>();
    private Utils utils = new Utils();

    @Override
    public void insert(Albums element) {
        albumsRecorded.put(utils.hashCode(), element);
    }

    @Override
    public Albums[] get() {
        return (Albums[]) albumsRecorded.values().toArray();
    }

    @Override
    public Albums getByKey(int key) {
        return albumsRecorded.get(key);
    }

    @Override
    public void update(int key, Albums element) {
        albumsRecorded.replace(key, element);
    }

    @Override
    public void remove(int key) {
        albumsRecorded.remove(key);
    }
    
    @Override
    public Albums[] getModelFields(){
        ArrayList<String> payback = new ArrayList<>();
        Field[] declaredFields = Albums.class.getDeclaredFields();
        
        for(Field field : declaredFields){
            payback.add(field.getName());
        }
        
        return (Albums[]) payback.toArray();
    }

}
