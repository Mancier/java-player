/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

/**
 *
 * @author victor
 */
public interface BaseController<T> {
    public void insert(T element);
    public T[] get();
    public T getByKey(int key);
    public void update(int key, T element);
    public void remove(int key);
    public T[] getModelFields();
}
