/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.controller;

import java.util.ArrayList;
import lk.ijse.possystem.bo.BOFactory;
import lk.ijse.possystem.bo.custom.CustomerBO;
import lk.ijse.possystem.dto.CustomerDTO;

/**
 *
 * @author Jaliya Roshen
 */
public class CustomerController  {
    
    private static CustomerBO customerBO = (CustomerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);
    
    public static boolean addCustomer(CustomerDTO customer) throws Exception{
        return customerBO.add(customer);
    }
    
    public static boolean deleteCustomer(String id) throws Exception{
        return customerBO.delete(id);
    }
    
    public static CustomerDTO searchCustomer(String id) throws Exception{
        return customerBO.search(id);
    }
    
    public static boolean updateCustomer(CustomerDTO customerDTO) throws Exception{
        return customerBO.update(customerDTO);
    }
    
    public static ArrayList<CustomerDTO> getAllCustomers() throws Exception{
        return customerBO.getAll();
    }
    
    
}
