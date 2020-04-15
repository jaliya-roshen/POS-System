/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.bo;

import lk.ijse.possystem.bo.custom.impl.CustomerBOImpl;
import lk.ijse.possystem.bo.custom.impl.ItemBOImpl;
import lk.ijse.possystem.bo.custom.impl.OrdersBOImpl;

/**
 *
 * @author Jaliya Roshen
 */
public class BOFactory {
 
    private static BOFactory boFactory;

    public static class BoTypes {

        public BoTypes() {
        }
    }
    
    public enum BOTypes{
        CUSTOMER,ITEM,ORDERS,ORDER_DETAILS,QUERY
    }

    private BOFactory() {
    }
    
    public static BOFactory getInstance(){
        if (boFactory == null) {
            boFactory= new BOFactory();
        }
        return boFactory;
    }
    
    public SuperBO getBO(BOTypes boTypes){
        switch(boTypes){
            case CUSTOMER : return new CustomerBOImpl();
            case ITEM : return new ItemBOImpl();
            case ORDERS : return new OrdersBOImpl();
            default:return null;
        }
    } 
    
}
