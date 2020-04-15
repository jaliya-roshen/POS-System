/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.dto;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class OrderCusDTO {

    String orderId;
    String date;
    String customerId;
    ArrayList<ItemDetailDTO> items;

    public OrderCusDTO() {
    }

    public OrderCusDTO(String orderId, String date, String customerId, ArrayList<ItemDetailDTO> items) {
        this.orderId = orderId;
        this.date = date;
        this.customerId = customerId;
        this.items = items;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getDate() {
        return date;
    }

    public String getCustomerId() {
        return customerId;
    }

    public ArrayList<ItemDetailDTO> getItems() {
        return items;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setItems(ArrayList<ItemDetailDTO> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "OrderCusDTO{" + "orderId=" + orderId + ", date=" + date + ", customerId=" + customerId + ", items=" + items + '}';
    }
    

}
