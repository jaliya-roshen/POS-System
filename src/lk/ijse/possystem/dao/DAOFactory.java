/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.dao;

import lk.ijse.possystem.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.possystem.dao.custom.impl.ItemDAOImpl;
import lk.ijse.possystem.dao.custom.impl.ItemDetailDAOImpl;
import lk.ijse.possystem.dao.custom.impl.OrderDAOImpl;

/**
 *
 * @author Jaliya Roshen
 */
public class DAOFactory {
    
    private static DAOFactory daoFactory;
    
    public enum DAOTypes{
       CUSTOMER,ITEM,ORDER,ORDER_DETAILS,QUERY, ORDERS, ITEMDETAIL
    }

    public DAOFactory() {
    }
    
    public static DAOFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    
    public SuperDAO getDAO(DAOTypes daotypes){
        
        switch(daotypes){
            case CUSTOMER : return new CustomerDAOImpl();
            case ITEM : return new ItemDAOImpl();
            //case QUERY : return new QueryDAOImpl();
            case ORDERS: return new OrderDAOImpl();
            case ITEMDETAIL: return new ItemDetailDAOImpl();
            
            default:return null;
        }
    }
}
