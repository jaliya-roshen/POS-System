/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.view;

//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.possystem.controller.CustomerController;
import lk.ijse.possystem.controller.ItemController;
import lk.ijse.possystem.controller.OrderController;
import lk.ijse.possystem.dto.CustomerDTO;
import lk.ijse.possystem.dto.ItemDTO;
import lk.ijse.possystem.dto.ItemDetailDTO;
import lk.ijse.possystem.dto.OrderCusDTO;
import lk.ijse.possystem.dto.OrderDTO;

/**
 *
 * @author Jaliya Roshen
 */
public class ManageOrder extends javax.swing.JFrame {

    /**
     * Creates new form ManageOrder
     */
    public ManageOrder() {
        initComponents();
        LocalDate ldt = LocalDate.now();
        txtOdate.setText(ldt.toString());
        generateOrderId();
        loadAllCustomersIds();
        loadAllItemCodes();
    }

    private void generateOrderId() {

        try {
            String orderId = OrderController.generateOrderId();

            lblOid.setText(orderId);
        } catch (Exception ex) {
            Logger.getLogger(ManageOrder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadAllCustomersIds() {
        try {
            ArrayList<CustomerDTO> customers = CustomerController.getAllCustomers();
            ArrayList<String> customerIds = new ArrayList<>();
            for (CustomerDTO customer : customers) {
                customerIds.add(customer.getId());
            }
            for (String customerId : customerIds) {
                cmbCustomerId.addItem(customerId);
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadAllItemCodes() {
        try {
            ArrayList<ItemDTO> items = ItemController.getAllItems();
            ArrayList<String> codes = new ArrayList<>();
            for (ItemDTO itemDTO : items) {
                codes.add(itemDTO.getCode());
            }
            for (String codeId : codes) {
                cmbCode.addItem(codeId);
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageOrder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOdate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbCustomerId = new javax.swing.JComboBox<>();
        btnAddCustomer = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbCode = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUnitPrice = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblQtyOnHand = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableIDetails = new javax.swing.JTable();
        btnPlaceOrder = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblOid = new javax.swing.JLabel();
        PrintButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Place Oder Form");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Order Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Order Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 80, 20));

        txtOdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtOdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtOdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 160, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Customer ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 90, 20));

        cmbCustomerId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmbCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCustomerIdActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 130, 30));

        btnAddCustomer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAddCustomer.setText("New");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 70, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Customer Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 110, 20));

        lblCustomerName.setBackground(new java.awt.Color(255, 255, 255));
        lblCustomerName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCustomerName.setForeground(new java.awt.Color(255, 0, 51));
        lblCustomerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustomerName.setOpaque(true);
        getContentPane().add(lblCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 160, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Code");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 60, -1));

        cmbCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 100, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Description");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 80, -1));

        lblDescription.setBackground(new java.awt.Color(255, 255, 255));
        lblDescription.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(51, 51, 51));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setOpaque(true);
        getContentPane().add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 170, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Unit Price");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 80, 20));

        lblUnitPrice.setBackground(new java.awt.Color(255, 255, 255));
        lblUnitPrice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUnitPrice.setForeground(new java.awt.Color(51, 51, 51));
        lblUnitPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUnitPrice.setOpaque(true);
        getContentPane().add(lblUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 70, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("QtyOnHand");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        lblQtyOnHand.setBackground(new java.awt.Color(255, 255, 255));
        lblQtyOnHand.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQtyOnHand.setForeground(new java.awt.Color(51, 51, 51));
        lblQtyOnHand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQtyOnHand.setOpaque(true);
        getContentPane().add(lblQtyOnHand, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 60, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Qty");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));

        txtQty.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 120, 30));

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 80, -1));

        btnRemove.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        tableIDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Code", "Descriptin", "qty", "UnitPrice", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableIDetails);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 680, 90));

        btnPlaceOrder.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 140, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Total");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 80, 30));

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 0, 51));
        lblTotal.setOpaque(true);
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 474, 120, 40));

        lblOid.setBackground(new java.awt.Color(255, 255, 255));
        lblOid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblOid.setForeground(new java.awt.Color(255, 0, 51));
        lblOid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOid.setOpaque(true);
        getContentPane().add(lblOid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 110, 30));

        PrintButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PrintButton.setText("Print");
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PrintButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 140, 30));

        jLabel9.setText(" ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCustomerIdActionPerformed
        String customerId = cmbCustomerId.getSelectedItem().toString();
        try {
            CustomerDTO customerDTO = CustomerController.searchCustomer(customerId);
            lblCustomerName.setText(customerDTO.getName());
        } catch (Exception ex) {
            Logger.getLogger(ManageOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbCustomerIdActionPerformed

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        new ManageCustomer().setVisible(true);
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void cmbCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodeActionPerformed
        String code = cmbCode.getSelectedItem().toString();
        try {
            ItemDTO itemDTO = ItemController.searchItem(code);
            lblDescription.setText(itemDTO.getDescription());
            lblUnitPrice.setText(String.valueOf(itemDTO.getUnitPrice()));
            lblQtyOnHand.setText(Integer.toString(itemDTO.getQtyOnHand()));

        } catch (Exception ex) {
            Logger.getLogger(ManageOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbCodeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableIDetails.getModel();

        int qty = Integer.parseInt(txtQty.getText());
        double unitPrice = Double.parseDouble(lblUnitPrice.getText());
        double total = qty * unitPrice;

        int rowIndex = isAlreadyExists(cmbCode.getSelectedItem().toString());

        if (rowIndex == -1) {
            Object[] rowData = {
                cmbCode.getSelectedItem().toString(),
                lblDescription.getText(),
                qty,
                unitPrice,
                total
            };
            model.addRow(rowData);
        } else {
            qty += (int) model.getValueAt(rowIndex, 2);
            total = qty * unitPrice;
            tableIDetails.setValueAt(qty, rowIndex, 2);
            tableIDetails.setValueAt(total, rowIndex, 4);
        }

        calculateTotalValue();
        cmbCode.requestFocus();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int selectedRow = tableIDetails.getSelectedRow();

        if (selectedRow == -1) {
            return;
        }

        DefaultTableModel dtm = (DefaultTableModel) tableIDetails.getModel();
        dtm.removeRow(selectedRow);

        calculateTotalValue();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        String customerId = cmbCustomerId.getSelectedItem().toString();
        String date = txtOdate.getText();
        String orderId = lblOid.getText();
        ArrayList<ItemDetailDTO> itemDetails = new ArrayList<>();
        DefaultTableModel dtm = (DefaultTableModel) tableIDetails.getModel();

        for (int i = 0; i < dtm.getRowCount(); i++) {
            String itemCode = (String) dtm.getValueAt(i, 0);

            int qty = (int) dtm.getValueAt(i, 2);

            double unitPrice = (double) dtm.getValueAt(i, 3);

            ItemDetailDTO itemDetail = new ItemDetailDTO(orderId, itemCode, qty, unitPrice);

            itemDetails.add(itemDetail);
        }
        OrderCusDTO order = new OrderCusDTO(orderId, date, customerId, itemDetails);
        try {
            boolean isOrderAdded = OrderController.addOrder(order);
            if (isOrderAdded) {
                JOptionPane.showMessageDialog(this, "Order Added sucess");
            } else {
                JOptionPane.showMessageDialog(this, "Order Added Fail");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageOrder.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintButtonActionPerformed

//        String path = "";
//        JFileChooser jfile = new JFileChooser();
//        jfile.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//
//        int x = jfile.showSaveDialog(this);
//
//        if (x == JFileChooser.APPROVE_OPTION) {
//
//            path = jfile.getSelectedFile().getPath();
//
//        }
//
//        Document doc = new Document();
//
//        try {
//            PdfWriter.getInstance(doc, new FileOutputStream(path + "OrderDetails.pdf"));
//            doc.open();
//
//            PdfPTable table = new PdfPTable(5);
//
//            table.addCell("Code");
//            table.addCell("Description");
//            table.addCell("Quantity");
//            table.addCell("Unit Price");
//            table.addCell("Total");
//
//            for (int i = 0; i < tableIDetails.getRowCount(); i++) {
//
//                String Code = tableIDetails.getValueAt(i, 0).toString();
//                String Description = tableIDetails.getValueAt(i, 1).toString();
//                String Quantity = tableIDetails.getValueAt(i, 2).toString();
//                String UnitPrice = tableIDetails.getValueAt(i, 3).toString();
//                String Total = tableIDetails.getValueAt(i, 4).toString();
//
//                table.addCell(Code);
//                table.addCell(Description);
//                table.addCell(Quantity);
//                table.addCell(UnitPrice);
//                table.addCell(Total);
//
//            }
//
//            doc.add(table);
//
//            JOptionPane.showMessageDialog(null, "PDF saved Successfully", "ALERT MESSAGE", JOptionPane.WARNING_MESSAGE);
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ManageCustomer.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (DocumentException ex) {
//            Logger.getLogger(ManageCustomer.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        doc.close();
    }//GEN-LAST:event_PrintButtonActionPerformed
    private int isAlreadyExists(String itemCode) {

        DefaultTableModel dtm = (DefaultTableModel) tableIDetails.getModel();

        for (int i = 0; i < dtm.getRowCount(); i++) {
            String code = (String) dtm.getValueAt(i, 0);
            if (code.equals(itemCode)) {
                return i;
            }
        }

        return -1;

    }

    private void calculateTotalValue() {

        DefaultTableModel dtm = (DefaultTableModel) tableIDetails.getModel();

        double total = 0;
        for (int i = 0; i < dtm.getRowCount(); i++) {
            total += (double) dtm.getValueAt(i, 4);
        }

        lblTotal.setText(total + "");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PrintButton;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> cmbCode;
    private javax.swing.JComboBox<String> cmbCustomerId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblOid;
    private javax.swing.JLabel lblQtyOnHand;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUnitPrice;
    private javax.swing.JTable tableIDetails;
    private javax.swing.JTextField txtOdate;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
}
