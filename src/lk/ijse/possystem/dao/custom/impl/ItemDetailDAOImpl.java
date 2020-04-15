/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.dao.custom.impl;

import java.sql.PreparedStatement;
import java.util.List;
import lk.ijse.possystem.dao.custom.ItemDetailDAO;
import lk.ijse.possystem.db.DBConnection;
import lk.ijse.possystem.entity.ItemDetail;

/**
 *
 * @author Jaliya Roshen
 */
public class ItemDetailDAOImpl implements ItemDetailDAO{

    @Override
    public boolean add(ItemDetail item) throws Exception {
        
        PreparedStatement pst = DBConnection.getConnection().prepareStatement("insert into itemdetail values(?,?,?,?)");
        pst.setObject(1, item.getOrderId());
        pst.setObject(2, item.getItemCode());
        pst.setObject(3, item.getQty());
        pst.setObject(4, item.getUnitPrice());
        return  pst.executeUpdate()>0;
         
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemDetail find(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ItemDetail t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItemDetail> findAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
