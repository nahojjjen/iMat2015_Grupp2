/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels;

import imat.models.Model;
import imat.models.ModelAux;
import imat.panels.subItems.GridItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Morpheus
 */
public class DetailPopUp extends javax.swing.JDialog {

    private Product product;
    private List<Product> productList;
    /**
     * Creates new form DetailPopUp
     */
    public DetailPopUp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public DetailPopUp(java.awt.Frame parent, boolean modal, Product product){
        super(parent, modal);
        initComponents();
        this.product=product;
        initialize(product);
        initializeBottomPanel();
    }
    private void initialize (Product product){
        productImage.setIcon(Model.getImage(product,150,150));
        productName.setText(product.getName());
        priceLabel.setText(String.valueOf(product.getPrice())+ " " + product.getUnit());
    }
    private void initializeBottomPanel(){
        for (int i =0;i<3;i++){
            int randInt = randomNumber();
            moreProductsPane.add(new GridItem(productList.get(randInt)));
        }
    }
    
    
    private int randomNumber (){
        return (int) Math.random()*130;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productName = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        productImage = new javax.swing.JLabel();
        moreProductsPane = new javax.swing.JPanel();
        infoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoText = new javax.swing.JTextArea();
        info1Label = new javax.swing.JLabel();
        info1Svar = new javax.swing.JLabel();
        info2Label = new javax.swing.JLabel();
        info2Svar = new javax.swing.JLabel();
        info3Label = new javax.swing.JLabel();
        info3Svar = new javax.swing.JLabel();
        amountSpinner = new javax.swing.JSpinner();
        priceLabel = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        productName.setText("Produktnamn");
        productName.setSize(new java.awt.Dimension(100, 20));

        closeButton.setText("X");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        productImage.setText("Produktbild");

        moreProductsPane.setLayout(new java.awt.GridLayout(1, 3));

        infoLabel.setText("Information:");

        infoText.setColumns(20);
        infoText.setRows(5);
        infoText.setText("Random Info Text");
        jScrollPane1.setViewportView(infoText);

        info1Label.setText("Ekologiskt:");

        info1Svar.setText("Ja");

        info2Label.setText("Land:");

        info2Svar.setText("Spanien");

        info3Label.setText("Allergivarning:");

        info3Svar.setText("Jordnötter, Baljväxter osv");

        amountSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));

        priceLabel.setText("Pris per kg");

        buyButton.setText("Köp");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(productName)
                                    .addComponent(productImage)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(info1Label)
                                        .addComponent(infoLabel))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(info2Label)
                                .addComponent(info3Label)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(info1Svar)
                                    .addComponent(info2Svar))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(closeButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(info3Svar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(priceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buyButton))))
                    .addComponent(moreProductsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productName)
                    .addComponent(closeButton))
                .addGap(38, 38, 38)
                .addComponent(productImage)
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(info1Svar)
                    .addComponent(info1Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(info2Svar)
                    .addComponent(info2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buyButton)
                        .addComponent(amountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(priceLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(info3Label)
                        .addComponent(info3Svar)))
                .addGap(18, 18, 18)
                .addComponent(moreProductsPane, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        int amount;
        amount = (int)amountSpinner.getValue();
        if(amount <0){
            ShoppingItem item = new ShoppingItem(product, amount);
            ModelAux.add(item);
        } else {
            //Vi ska inte kunna komma hit, då spinnern endast tar värden 1-99
        }
    }//GEN-LAST:event_buyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DetailPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetailPopUp dialog = new DetailPopUp(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner amountSpinner;
    private javax.swing.JButton buyButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel info1Label;
    private javax.swing.JLabel info1Svar;
    private javax.swing.JLabel info2Label;
    private javax.swing.JLabel info2Svar;
    private javax.swing.JLabel info3Label;
    private javax.swing.JLabel info3Svar;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JTextArea infoText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel moreProductsPane;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel productImage;
    private javax.swing.JLabel productName;
    // End of variables declaration//GEN-END:variables
}
