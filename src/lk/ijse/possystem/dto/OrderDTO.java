/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.dto;

/**
 *
 * @author Jaliya Roshen
 */
public class OrderDTO {

    private String id;
    private String date;
    private String customerID;

    public OrderDTO() {
    }

    public OrderDTO(String id, String date, String customerID) {
        this.id = id;
        this.date = date;
        this.customerID = customerID;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the customerID
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    
     @Override
    public String toString() {
        return "OrderDTO{" + "oid=" + id + ", date=" + date + ", customerId=" + customerID + '}';
    }
    
    
}
