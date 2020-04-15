/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.dao.custom;

import lk.ijse.possystem.dao.CrudDAO;
import lk.ijse.possystem.entity.Item;
import lk.ijse.possystem.entity.ItemDetail;

/**
 *
 * @author Jaliya Roshen
 */
public interface ItemDAO extends CrudDAO<Item, String>{
    
    public boolean updateStock(ItemDetail itemdetail) throws Exception;
        
    
}
