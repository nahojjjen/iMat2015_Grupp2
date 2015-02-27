/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels;

import imat.IMat;
import imat.Model;
import imat.contentPanels.buyingPanels.PanelConfirm;
import imat.panels.subItems.CartItem;
import imat.panels.subItems.FillerItem;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import se.chalmers.ait.dat215.project.CartEvent;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingCartListener;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Johan
 */
public class PanelCart extends javax.swing.JPanel implements ShoppingCartListener {

    /**
     * Creates new form PanelCart
     */
    public PanelCart() {
        initComponents();
        Model.getShoppingcart().addShoppingCartListener(this);
        refreshCartContent();
        fixColor();
    }

    
    private void fixColor(){
        filler.setBackground(IMat.getAverageColor());
        this.setBackground(IMat.getAverageColor());
        
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
        buyButton = new javax.swing.JButton();
        detailButton = new javax.swing.JButton();
        filler = new javax.swing.JPanel();
        totalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        cartContent = new javax.swing.JPanel();

        jLabel1.setText("Kundvagn:");

        buyButton.setText("Gå till kassan");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        detailButton.setText("Detaljer");
        detailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailButtonActionPerformed(evt);
            }
        });

        filler.setPreferredSize(new java.awt.Dimension(220, 200));

        javax.swing.GroupLayout fillerLayout = new javax.swing.GroupLayout(filler);
        filler.setLayout(fillerLayout);
        fillerLayout.setHorizontalGroup(
            fillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        fillerLayout.setVerticalGroup(
            fillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        totalLabel.setText("jLabel2");

        javax.swing.GroupLayout cartContentLayout = new javax.swing.GroupLayout(cartContent);
        cartContent.setLayout(cartContentLayout);
        cartContentLayout.setHorizontalGroup(
            cartContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cartContentLayout.setVerticalGroup(
            cartContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(cartContent);

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(detailButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buyButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(filler, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(totalLabel)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalLabel)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        IMat.getWindow().setContent(new PanelConfirm());
    }//GEN-LAST:event_buyButtonActionPerformed

    private void detailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailButtonActionPerformed
       
       List<ShoppingItem> cartItems = Model.getShoppingcart().getItems();
       List cart = new ArrayList<Product>();
       for(ShoppingItem item:cartItems){
           cart.add(item.getProduct());
       }
        IMat.getWindow().showSearch(cart);
    }//GEN-LAST:event_detailButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buyButton;
    private javax.swing.JPanel cartContent;
    private javax.swing.JButton detailButton;
    private javax.swing.JPanel filler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void shoppingCartChanged(CartEvent ce) {
        refreshCartContent();
    }
    
    private void refreshCartContent() {
        cartContent.removeAll();
        List<ShoppingItem> cart = Model.getShoppingcart().getItems();
        GridLayout layout = new GridLayout();
        layout.setColumns(1);
        layout.setRows(cart.size());
        cartContent.setLayout(layout);
        int height = cart.size()*30;
        Dimension dimension = new Dimension(200,height);
        cartContent.setPreferredSize(dimension);
        for (ShoppingItem item : cart) {
            CartItem adder = new CartItem(item);
            cartContent.add(adder);
        }
        
        double price = Model.getShoppingcart().getTotal();
        totalLabel.setText("Total: " + String.valueOf((int)price) + " kr");
        
        if (price <= 0){
            disableBuyButton();
            cartContent.add(new JLabel());
        }else{
            enableBuyButton();
        }
        this.revalidate();
        
    }
    
    public void disableBuyButton(){
        buyButton.setEnabled(false);
        detailButton.setEnabled(false);
    }
    public void enableBuyButton(){
        buyButton.setEnabled(true);
        detailButton.setEnabled(true);
    }
}
