/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.bo.custom.impl;

import java.util.ArrayList;
import lk.ijse.possystem.bo.custom.CustomerBO;
import lk.ijse.possystem.dao.DAOFactory;
import lk.ijse.possystem.dao.custom.CustomerDAO;
import lk.ijse.possystem.dto.CustomerDTO;
import lk.ijse.possystem.entity.Customer;

/**
 *
 * @author Jaliya Roshen
 */
public class CustomerBOImpl implements CustomerBO{
    
    private static CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    @Override
    public boolean add(CustomerDTO customerdto) throws Exception {
         
        return customerDAO.add(new Customer(customerdto.getId(),customerdto.getName(),customerdto.getAddress(),customerdto.getSalary()));
    }

    @Override
    public boolean delete(String id) throws Exception {
         return customerDAO.delete(id);
    }

    @Override
    public CustomerDTO search(String id) throws Exception {
         Customer customer = customerDAO.find(id);
        return new CustomerDTO(customer.getId(), customer.getName(), customer.getAddress(), customer.getSalary());
    }

    @Override
    public boolean update(CustomerDTO customerDTO) throws Exception {
        
        return customerDAO.update(new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getSalary()));
         
    }

    @Override
    public ArrayList<CustomerDTO> getAll() throws Exception {
         
        ArrayList<Customer> customers = (ArrayList<Customer>) customerDAO.findAll();
        ArrayList<CustomerDTO> customersDTO = new ArrayList<>();
        
        for(Customer customer : customers){
            customersDTO.add(new CustomerDTO(customer.getId(),customer.getName(),customer.getAddress(),customer.getSalary()));
        }
        return customersDTO;
    }
    
    
    
    
}
