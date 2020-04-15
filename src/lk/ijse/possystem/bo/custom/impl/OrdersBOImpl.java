/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.bo.custom.impl;

import java.util.ArrayList;
import lk.ijse.possystem.bo.custom.OrdersBO;
import lk.ijse.possystem.dao.DAOFactory;
import lk.ijse.possystem.dao.custom.ItemDAO;
import lk.ijse.possystem.dao.custom.ItemDetailDAO;
import lk.ijse.possystem.dao.custom.OrderDAO;
import static lk.ijse.possystem.db.DBConnection.connection;
import lk.ijse.possystem.dto.ItemDetailDTO;
import lk.ijse.possystem.dto.OrderCusDTO;
import lk.ijse.possystem.entity.ItemDetail;
import lk.ijse.possystem.entity.Orders;

/**
 *
 * @author Jaliya Roshen
 */
public class OrdersBOImpl implements OrdersBO {

    private static OrderDAO orderDAO = (OrderDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ORDERS);

    private static ItemDetailDAO itemdetailDAO = (ItemDetailDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEMDETAIL);

    private static ItemDAO itemDAO = (ItemDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEM);

    @Override
    public String generateOrderId() throws Exception {

        return orderDAO.generateOrderId();
    }

    @Override
    public boolean add(OrderCusDTO order) throws Exception {

        Orders orders = new Orders(order.getOrderId(), order.getDate(), order.getCustomerId());
        ArrayList<ItemDetailDTO> items = order.getItems();
        ItemDetail itemdetail = null;
        boolean isItemDetailsUpdate = false;
        boolean isItemUpdate = false;

        try {
            connection.setAutoCommit(false);

            if (orderDAO.add(orders)) {
                for (ItemDetailDTO item : items) {
                    itemdetail = new ItemDetail(item.getOId(), item.getICode(), item.getQty(), item.getUnitprice());
                    isItemDetailsUpdate = itemdetailDAO.add(itemdetail);
                    if (!isItemDetailsUpdate) {
                        return false;
                    }
                }

                if (isItemDetailsUpdate) {
                    for (ItemDetailDTO item1 : items) {
                        itemdetail = new ItemDetail(item1.getOId(), item1.getICode(), item1.getQty(), item1.getUnitprice());
                        isItemUpdate = itemDAO.updateStock(itemdetail);
                        if (!isItemUpdate) {
                            return false;
                        }
                    }
                }

                if (isItemUpdate) {
                 connection.commit();
                    return true;
                }
            }
           // System.out.println("nnnn");
            connection.rollback();
            return false;
        } finally {
          connection.setAutoCommit(true);
        }
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrderCusDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(OrderCusDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<OrderCusDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
