/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.bo.custom.impl;

import java.util.ArrayList;
import lk.ijse.possystem.bo.custom.ItemBO;
import lk.ijse.possystem.dao.DAOFactory;
import lk.ijse.possystem.dao.custom.ItemDAO;
import lk.ijse.possystem.dto.ItemDTO;
import lk.ijse.possystem.entity.Item;

/**
 *
 * @author Jaliya Roshen
 */
public class ItemBOImpl implements ItemBO{
    
    private static ItemDAO itemDAO = (ItemDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEM);

    @Override
    public boolean add(ItemDTO itemDTO) throws Exception {
        Item item = new Item(itemDTO.getCode(), itemDTO.getDescription(), itemDTO.getUnitPrice(), itemDTO.getQtyOnHand());
        return itemDAO.add(item);
         
    }

    @Override
    public boolean delete(String code) throws Exception {
        return itemDAO.delete(code);
         
    }

    @Override
    public ItemDTO search(String code) throws Exception {
         Item item = itemDAO.find(code);
         return new ItemDTO(item.getCode(), item.getDescription(), item.getUnitPrice(), item.getQtyOnHand());
         
    }

    @Override
    public boolean update(ItemDTO itemDTO) throws Exception {
        
        return itemDAO.update(new Item(itemDTO.getCode(), itemDTO.getDescription(), itemDTO.getUnitPrice(), itemDTO.getQtyOnHand()));
    }

    @Override
    public ArrayList<ItemDTO> getAll() throws Exception {
         ArrayList<Item> items = (ArrayList<Item>) itemDAO.findAll();
         ArrayList<ItemDTO> itemsdto = new ArrayList<>();
         for (Item item : items){
             
             itemsdto.add(new ItemDTO(item.getCode(), item.getDescription(), item.getUnitPrice(), item.getQtyOnHand()));
         }
         return itemsdto;
    }
    
}
