/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.dao.custom.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import lk.ijse.possystem.dao.custom.OrderDAO;
import lk.ijse.possystem.db.DBConnection;
import lk.ijse.possystem.entity.Orders;

/**
 *
 * @author Jaliya Roshen
 */
public class OrderDAOImpl implements OrderDAO {

    @Override
    public String generateOrderId() throws Exception {
        PreparedStatement pstm = DBConnection.getConnection().prepareStatement("SELECT id FROM Orders ORDER BY id DESC LIMIT 1");

        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {

            String orderID = rst.getString(1);
            orderID = orderID.split("[A-Z]")[1];
            orderID = (Integer.parseInt(orderID) + 1) + "";
            return "D" + orderID;
        } else {
            return "D001";
        }
    }

    @Override
    public boolean add(Orders orders) throws Exception {

        PreparedStatement pstm = DBConnection.getConnection().prepareStatement("insert into orders values(?,?,?)");
        pstm.setObject(1, orders.getId());
        pstm.setObject(2, orders.getDate());
        pstm.setObject(3, orders.getCustomerID());

        return pstm.executeUpdate() > 0;
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Orders find(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Orders t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Orders> findAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
