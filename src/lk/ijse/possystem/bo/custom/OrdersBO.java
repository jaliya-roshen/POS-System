/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.bo.custom;

import lk.ijse.possystem.bo.SuperBO;
import lk.ijse.possystem.dao.SuperDAO;
import lk.ijse.possystem.dto.OrderCusDTO;
import lk.ijse.possystem.entity.Orders;

/**
 *
 * @author Jaliya Roshen
 */
public interface OrdersBO extends SuperBO<OrderCusDTO, String>{
    
    public  String generateOrderId() throws Exception ;
    
}
