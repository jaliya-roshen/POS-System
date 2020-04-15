/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.dao.custom;

import lk.ijse.possystem.dao.CrudDAO;
import lk.ijse.possystem.entity.Orders;

/**
 *
 * @author Jaliya Roshen
 */
public interface OrderDAO extends CrudDAO<Orders, String> {
    
    public String generateOrderId() throws Exception;
    
}
