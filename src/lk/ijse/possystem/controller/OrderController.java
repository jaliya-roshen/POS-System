/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.controller;

import lk.ijse.possystem.bo.BOFactory;
import lk.ijse.possystem.bo.custom.OrdersBO;
import lk.ijse.possystem.dto.OrderCusDTO;

/**
 *
 * @author Jaliya Roshen
 */
public class OrderController {
    
    private static OrdersBO ordersBO= (OrdersBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ORDERS);
    
    public static String generateOrderId() throws Exception {
      return ordersBO.generateOrderId();
    }

    public static boolean addOrder(OrderCusDTO order) throws Exception {
       return ordersBO.add(order);
    }
    
}
