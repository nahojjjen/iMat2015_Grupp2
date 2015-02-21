/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.subItems;

import imat.Model;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Johan
 */
public class CartItem extends javax.swing.JPanel {

    private ShoppingItem item;
    /**
     * Creates new form cartItem
     */
    public CartItem() {
        initComponents();
    }
    
      /**
     * Creates new form cartItem
     */
    public CartItem(ShoppingItem item) {
        initComponents();
        amountInput.setText(String.valueOf(item.getAmount()));
        nameLabel.setText(item.getProduct().getName());
        suffixAmount.setText(item.getProduct().getUnitSuffix());
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        removeStuff = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        amountStuff = new javax.swing.JPanel();
        amountInput = new javax.swing.JTextField();
        suffixAmount = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jButton1.setText("x");
        jButton1.setMaximumSize(new java.awt.Dimension(39, 20));
        jButton1.setMinimumSize(new java.awt.Dimension(39, 20));
        jButton1.setPreferredSize(new java.awt.Dimension(39, 20));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removeStuffLayout = new javax.swing.GroupLayout(removeStuff);
        removeStuff.setLayout(removeStuffLayout);
        removeStuffLayout.setHorizontalGroup(
            removeStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeStuffLayout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        removeStuffLayout.setVerticalGroup(
            removeStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        add(removeStuff, java.awt.BorderLayout.EAST);

        amountStuff.setMinimumSize(new java.awt.Dimension(30, 100));

        amountInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountInputActionPerformed(evt);
            }
        });

        suffixAmount.setText("   ");

        javax.swing.GroupLayout amountStuffLayout = new javax.swing.GroupLayout(amountStuff);
        amountStuff.setLayout(amountStuffLayout);
        amountStuffLayout.setHorizontalGroup(
            amountStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amountStuffLayout.createSequentialGroup()
                .addComponent(amountInput, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suffixAmount)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        amountStuffLayout.setVerticalGroup(
            amountStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amountStuffLayout.createSequentialGroup()
                .addComponent(suffixAmount)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(amountInput, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        add(amountStuff, java.awt.BorderLayout.WEST);

        nameLabel.setText("name of stuff");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(nameLabel)
                .addGap(0, 86, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void amountInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountInputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Model.getShoppingcart().removeItem(item);
        System.out.println("trying to remove item, but failing.");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountInput;
    private javax.swing.JPanel amountStuff;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel removeStuff;
    private javax.swing.JLabel suffixAmount;
    // End of variables declaration//GEN-END:variables
}
