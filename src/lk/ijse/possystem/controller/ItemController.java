/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.controller;

import java.util.ArrayList;
import lk.ijse.possystem.bo.BOFactory;
import lk.ijse.possystem.bo.custom.CustomerBO;
import lk.ijse.possystem.bo.custom.ItemBO;
import lk.ijse.possystem.dto.ItemDTO;

/**
 *
 * @author Jaliya Roshen
 */
public class ItemController {
    
    private static ItemBO itemBO=(ItemBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ITEM);
    
    public static boolean addItem(ItemDTO itemDTO) throws Exception{
        return itemBO.add(itemDTO);
                
    }
    
    public static ItemDTO searchItem (String code) throws Exception{
        return itemBO.search(code);
    }
    
    public static boolean deleteItem(String code) throws Exception{
        return itemBO.delete(code);
    }
    
    public static boolean updateItem (ItemDTO itemDTO) throws Exception{
        return itemBO.update(itemDTO);
    }
    
    public static ArrayList<ItemDTO> getAllItems() throws Exception{
        return itemBO.getAll();
    }
}
