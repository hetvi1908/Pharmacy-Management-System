/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;

/**
 *
 * @author Shilpi
 */
public class FirstScreen extends javax.swing.JFrame {

    /**
     * Creates new form FirstScreen
     */
    public FirstScreen() {
        initComponents();
        getContentPane().setBackground(new Color(0,204,204));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addStock = new javax.swing.JButton();
        viewStock = new javax.swing.JButton();
        employeeDetails = new javax.swing.JButton();
        purchaseHistory = new javax.swing.JButton();
        addCompany = new javax.swing.JButton();
        generateInvoice = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        addStock.setText("Add Stock");
        addStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStockActionPerformed(evt);
            }
        });

        viewStock.setText("View Stock");
        viewStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStockActionPerformed(evt);
            }
        });

        employeeDetails.setText("View Employee Details");
        employeeDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeDetailsActionPerformed(evt);
            }
        });

        purchaseHistory.setText("Customer Purchase History");
        purchaseHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseHistoryActionPerformed(evt);
            }
        });

        addCompany.setText("Add a Company");
        addCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCompanyActionPerformed(evt);
            }
        });

        generateInvoice.setText("Generate Invoice");
        generateInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateInvoiceActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Pharmacy Management System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(employeeDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addCompany, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(purchaseHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generateInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(234, 234, 234))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStock, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchaseHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewStock, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStockActionPerformed
        // TODO add your handling code here:
        StockScreen addStock=new StockScreen();
        addStock.setVisible(true);
    }//GEN-LAST:event_addStockActionPerformed

    private void viewStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStockActionPerformed
        // TODO add your handling code here:
        viewstocks viewStock = new viewstocks();
        viewStock.setVisible(true);
    }//GEN-LAST:event_viewStockActionPerformed

    private void employeeDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeDetailsActionPerformed
        // TODO add your handling code here:
        adminlogin employeeDetails = new adminlogin();
        employeeDetails.setVisible(true);
    }//GEN-LAST:event_employeeDetailsActionPerformed

    private void purchaseHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseHistoryActionPerformed
        // TODO add your handling code here:
        PurchaseHistory purchaseHistory = new PurchaseHistory();
        purchaseHistory.setVisible(true);
    }//GEN-LAST:event_purchaseHistoryActionPerformed

    private void addCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCompanyActionPerformed
        // TODO add your handling code here:
        companyform addCompany = new companyform();
        addCompany.setVisible(true);
    }//GEN-LAST:event_addCompanyActionPerformed

    private void generateInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateInvoiceActionPerformed
        // TODO add your handling code here:
        InvoiceScreen generateInvoice  = new InvoiceScreen();
        generateInvoice.setVisible(true);
    }//GEN-LAST:event_generateInvoiceActionPerformed

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
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCompany;
    private javax.swing.JButton addStock;
    private javax.swing.JButton employeeDetails;
    private javax.swing.JButton generateInvoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton purchaseHistory;
    private javax.swing.JButton viewStock;
    // End of variables declaration//GEN-END:variables

    private static class background extends Container {

        public background(ImageIcon imageIcon) {
        }
    }
}
