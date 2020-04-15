/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.dao.custom.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.possystem.dao.custom.ItemDAO;
import lk.ijse.possystem.db.DBConnection;
import lk.ijse.possystem.entity.Item;
import lk.ijse.possystem.entity.ItemDetail;

/**
 *
 * @author Jaliya Roshen
 */
public class ItemDAOImpl implements ItemDAO {

    @Override
    public boolean updateStock(ItemDetail item) throws Exception {

        PreparedStatement pstm = DBConnection.getConnection().prepareStatement("update item set qtyOnHand=qtyOnHand-? where code=?");
        pstm.setObject(2, item.getItemCode());
        pstm.setObject(1, item.getQty());
        return pstm.executeUpdate() > 0;
    }

    @Override
    public boolean add(Item item) throws Exception {
        PreparedStatement pstm = DBConnection.getConnection().prepareStatement("insert into item values(?,?,?,?)");
        pstm.setObject(1, item.getCode());
        pstm.setObject(2, item.getDescription());
        pstm.setObject(3, item.getUnitPrice());
        pstm.setObject(4, item.getQtyOnHand());

        return pstm.executeUpdate() > 0;
    }

    @Override
    public boolean delete(String code) throws Exception {
        PreparedStatement pstm = DBConnection.getConnection().prepareStatement("delete from item where code=?");
        pstm.setObject(1, code);
        return pstm.executeUpdate() > 0;

    }

    @Override
    public Item find(String code) throws Exception {
        PreparedStatement pstm = DBConnection.getConnection().prepareStatement("select * from item where code=?");
        pstm.setObject(1, code);
        ResultSet rst = pstm.executeQuery();

        if (rst.next()) {

            return new Item(rst.getString("code"), rst.getString("description"), rst.getDouble("unitPrice"), rst.getInt("qtyOnHand"));

        } else {

            return null;
        }
    }

    @Override
    public boolean update(Item item) throws Exception {

        PreparedStatement pstm = DBConnection.getConnection().prepareStatement("update item set description=?,unitPrice=?,qtyOnHand=? where code=?");
        pstm.setObject(4, item.getCode());
        pstm.setObject(1, item.getDescription());
        pstm.setObject(2, item.getUnitPrice());
        pstm.setObject(3, item.getQtyOnHand());

        return pstm.executeUpdate() > 0;
    }

    @Override
    public List<Item> findAll() throws Exception {
        
        PreparedStatement pstm = DBConnection.getConnection().prepareStatement("select * from item");
        ResultSet rst = pstm.executeQuery();
        
        ArrayList<Item> itemList = new ArrayList<>();
        while (rst.next()){
            itemList.add(new Item(rst.getString("code"), rst.getString("description"), rst.getDouble("unitPrice"), rst.getInt("qtyOnHand")));
        }
        return itemList;
    }

}
