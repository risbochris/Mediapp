/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.Map;

/**
 *
 * @author risbochris
 */
public interface AbstractDao<T> {
    
    public T getEntity(Class<T> cl, Long id);
    public T saveEntity(T object);
    public boolean updateEntity(T object);
    public boolean deleteEntity(T object);
    public List<T> query(String hsql, Map<String, Object> params);
    public List<T> getAll(Class<T> objClass);   
}
