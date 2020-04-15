/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.dao;

import java.util.List;

/**
 *
 * @author Jaliya Roshen
 */
public interface CrudDAO<T,ID> extends SuperDAO{
    
    public boolean add (T t) throws Exception;
    
    public boolean delete(ID id) throws Exception;
    
    public T find(ID id) throws Exception;
    
    public boolean update(T t) throws Exception;
    
    public List<T> findAll() throws Exception;
    
}
