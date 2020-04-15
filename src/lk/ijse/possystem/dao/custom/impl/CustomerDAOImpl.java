/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.possystem.dao.custom.CustomerDAO;
import lk.ijse.possystem.db.DBConnection;
import lk.ijse.possystem.entity.Customer;

/**
 *
 * @author Jaliya Roshen
 */
public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public boolean add(Customer customer) throws Exception {
         Connection connection = DBConnection.getConnection();
         PreparedStatement stm = connection.prepareStatement("insert into customer values(?,?,?,?)");
         stm.setObject(1, customer.getId());
         stm.setObject(2, customer.getName());
         stm.setObject(3, customer.getAddress());
         stm.setObject(4, customer.getSalary());
         
         return stm.executeUpdate()>0;
    }

    @Override
    public boolean delete(String id) throws Exception {
         
        PreparedStatement pstm =  DBConnection.getConnection().prepareStatement("delete from customer where id=?");
        pstm.setObject(1, id);
        return pstm.executeUpdate()>0;
    }

    @Override
    public Customer find(String id) throws Exception {
         
       PreparedStatement pst = DBConnection.getConnection().prepareStatement("select * from customer where id=?");
        pst.setObject(1, id);
        ResultSet rst = pst.executeQuery();
        return (rst.next()) ? new Customer(rst.getString("id"), rst.getString("name"), rst.getString("address"), rst.getDouble("salary")) : null;
        
    }

    @Override
    public boolean update(Customer customer) throws Exception {
        PreparedStatement pstm = DBConnection.getConnection().prepareStatement("update customer set name=?,address=?,salary=? where id=?");
        pstm.setObject(1, customer.getName());
        pstm.setObject(2, customer.getAddress());
        pstm.setObject(3, customer.getSalary());
        pstm.setObject(4, customer.getId());
        return pstm.executeUpdate()>0;
        
         
    }

    @Override
    public List<Customer> findAll() throws Exception {
         
        PreparedStatement pstm = DBConnection.getConnection().prepareStatement("Select * from customer");
        ResultSet rst = pstm.executeQuery();
        ArrayList<Customer> customerList = new ArrayList<>();
        
        while(rst.next()){
            
            customerList.add(new Customer(rst.getString("id"), rst.getString("name"), rst.getString("address"), rst.getDouble("salary")));
        }
        return customerList;
    }
    
}
