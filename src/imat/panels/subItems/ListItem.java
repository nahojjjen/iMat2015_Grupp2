/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.subItems;

import javax.swing.SwingConstants;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Morpheus
 */
public class ListItem extends javax.swing.JPanel {

    /**
     * Creates new form ListItem
     */
    public ListItem() {
        initComponents();
    }
    
    public ListItem(Product product) {
        initComponents();
        productName.setText(product.getName());
        productPrice.setText(String.valueOf(product.getPrice()));
        productName.setHorizontalAlignment(SwingConstants.LEFT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        productName = new javax.swing.JLabel();
        productPrice = new javax.swing.JLabel();
        ammountSpinner = new javax.swing.JSpinner();
        buyButton = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        productName.setText("Produktnamn");
        add(productName, new java.awt.GridBagConstraints());

        productPrice.setText("Pris");
        add(productPrice, new java.awt.GridBagConstraints());

        ammountSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        add(ammountSpinner, new java.awt.GridBagConstraints());

        buyButton.setText("Köp");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        add(buyButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ammountSpinner;
    private javax.swing.JButton buyButton;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productPrice;
    // End of variables declaration//GEN-END:variables
}