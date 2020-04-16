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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.possystem.controller.CustomerController;
import lk.ijse.possystem.dto.CustomerDTO;

/**
 *
 * @author Jaliya Roshen
 */
public class ManageCustomer extends javax.swing.JFrame {

    /**
     * Creates new form ManageCustomer
     */
    public ManageCustomer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AddressTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCustomer = new javax.swing.JTable();
        saveButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Manage Customer");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText(" CID");

        idTextField.setText(" ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText(" Name");

        nameTextField.setText(" ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText(" Address");

        AddressTextField.setText(" ");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText(" Salary");

        salaryTextField.setText(" ");

        TableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Salary"
            }
        ));
        jScrollPane1.setViewportView(TableCustomer);

        saveButton.setText(" Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText(" Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        viewButton.setText(" View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        printButton.setText(" Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        searchButton.setText(" Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(saveButton)
                        .addGap(35, 35, 35)
                        .addComponent(RemoveButton)
                        .addGap(34, 34, 34)
                        .addComponent(UpdateButton)
                        .addGap(46, 46, 46)
                        .addComponent(viewButton)
                        .addGap(50, 50, 50)
                        .addComponent(printButton)
                        .addGap(54, 54, 54)
                        .addComponent(searchButton)))
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(RemoveButton)
                    .addComponent(UpdateButton)
                    .addComponent(viewButton)
                    .addComponent(printButton)
                    .addComponent(searchButton))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {

            boolean isAdded = CustomerController.addCustomer(new CustomerDTO(idTextField.getText(),
                    nameTextField.getText(),
                    AddressTextField.getText(),
                    Double.parseDouble(salaryTextField.getText()))
            );
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Customer Added ok");
            } else {
                JOptionPane.showMessageDialog(this, "Customer Added Fail");
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        try {
            boolean isUpdate = CustomerController.updateCustomer(new CustomerDTO(idTextField.getText(),
            nameTextField.getText(), AddressTextField.getText(), Double.parseDouble(salaryTextField.getText())));
            
            if(isUpdate){
                JOptionPane.showMessageDialog(this, " Update sucess");
            }else{
                JOptionPane.showMessageDialog(this, "Update fail");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ManageCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
             try {
                 
            ArrayList<CustomerDTO> customers=CustomerController.getAllCustomers();
            
            DefaultTableModel dtm=(DefaultTableModel)TableCustomer.getModel();
            dtm.setRowCount(0);
            
            for (CustomerDTO customer : customers) {
               Object [] ab={customer.getId(),customer.getName(),customer.getAddress(),customer.getSalary()}; 
               dtm.addRow(ab);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage()); 
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        String id = idTextField.getText();

        try {
            boolean isDeleted = CustomerController.deleteCustomer(id);

            if (isDeleted) {
                JOptionPane.showMessageDialog(this, "Deleted Success");
            } else {
                JOptionPane.showMessageDialog(this, "Deleted Fail");
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
            String id = idTextField.getText();
            
            CustomerDTO customerDTO;
        try {
            customerDTO = CustomerController.searchCustomer(id);
            if (customerDTO != null){
                
                nameTextField.setText(customerDTO.getName());
                AddressTextField.setText(customerDTO.getAddress());
                salaryTextField.setText(String.valueOf(customerDTO.getSalary()));
            }else{
                JOptionPane.showMessageDialog(this, "No Such Customer");
            } 
            
        } catch (Exception ex) {
            Logger.getLogger(ManageCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
       
//        String path ="";
//        JFileChooser jfile = new JFileChooser();
//        jfile.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        
//        int x = jfile.showSaveDialog(this);
//        
//        if (x == JFileChooser.APPROVE_OPTION){
//            
//            path = jfile.getSelectedFile().getPath();
//            
//        }
//        
//        Document doc = new Document();
//        
//        try {
//            PdfWriter.getInstance(doc, new FileOutputStream(path+"Doc.pdf"));
//            doc.open();
//            
//            PdfPTable table = new PdfPTable(4);
//            
//            table.addCell("ID");
//            table.addCell("Name");
//            table.addCell("Address");
//            table.addCell("salary");
//            
//            
//            for (int i = 0; i < TableCustomer.getRowCount(); i++) {
//                
//                String id = TableCustomer.getValueAt(i, 0).toString();
//                String Name = TableCustomer.getValueAt(i, 1).toString();
//                String Address = TableCustomer.getValueAt(i, 2).toString();
//                String Salary = TableCustomer.getValueAt(i, 3).toString();
//                
//                table.addCell(id);
//                table.addCell(Name);
//                table.addCell(Address);
//                table.addCell(Salary);
//                
//                
//                
//            }
//            
//            doc.add(table);
//            
//            JOptionPane.showMessageDialog(null, "Pdf saved Successfully","ALERT MESSAGE",JOptionPane.WARNING_MESSAGE);
//            
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ManageCustomer.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (DocumentException ex) {
//            Logger.getLogger(ManageCustomer.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        doc.close();
        
        
    }//GEN-LAST:event_printButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JTable TableCustomer;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTextField idTextField;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton printButton;
    private javax.swing.JTextField salaryTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
