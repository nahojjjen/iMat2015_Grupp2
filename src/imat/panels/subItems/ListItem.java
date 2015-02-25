/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.subItems;

import imat.ModelAux;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Morpheus
 */
public class ListItem extends javax.swing.JPanel {

    private Product product;
    /**
     * Creates new form ListItem
     */
    public ListItem() {
        initComponents();
    }
    
    public ListItem(Product product) {
        initComponents();
        this.product = product;
        productName.setText(product.getName());
        productPrice.setText(String.valueOf(product.getPrice())+ " " + product.getUnit());
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
        productPrice = new javax.swing.JLabel();
        ammountSpinner = new javax.swing.JSpinner();
        buyButton = new javax.swing.JButton();

        productName.setText("Produktnamn");
        add(productName);

        productPrice.setText("Pris");
        add(productPrice);

        ammountSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        add(ammountSpinner);

        buyButton.setText("Köp");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });
        add(buyButton);
    }// </editor-fold>//GEN-END:initComponents

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        int amount;
        amount = (int)ammountSpinner.getValue();
        if(amount > 0){
            ShoppingItem item = new ShoppingItem(product, amount);
            ModelAux.add(item);
        } else {
            System.out.println("Asasdasd");
            //Vi ska inte kunna komma hit, då spinnern endast tar värden 1-99
        }
    }//GEN-LAST:event_buyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ammountSpinner;
    private javax.swing.JButton buyButton;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productPrice;
    // End of variables declaration//GEN-END:variables
}
