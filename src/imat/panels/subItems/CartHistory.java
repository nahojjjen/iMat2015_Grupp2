/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.subItems;

import imat.IMat;
import imat.models.Model;
import imat.models.ModelAux;
import imat.panels.OrderHistoryPopup;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import se.chalmers.ait.dat215.project.Order;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingCart;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Johan Swanberg
 */
public class CartHistory extends javax.swing.JPanel {
    private Color zebra1 = new Color(245,245,245);
    private Color zebra2 = new Color(250,250,250);
    private Order order;
    private boolean buzy = false;
    private static boolean zebra = false;
    /**
     * Creates new form CartHistory
     */
    public CartHistory(Order inputOrder ) {
        initComponents();
        this.order = inputOrder;
        initLabels();
        toggleZebra();
        fixZebraColor();
        setImages();
    }
    
    private void setImages(){
        List<ShoppingItem> items = order.getItems();
        Product item1 = null;
        Product item2 = null;
        try {
            
        item1 = items.get(0).getProduct();
        item2 = items.get(1).getProduct();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index outa bounds - someone ordered 0 items once");
        }
        try {
            
        image1.setIcon(Model.getImage(item1, 70, 70));
        image2.setIcon(Model.getImage(item2, 70, 70));
        } catch (NullPointerException e) {
            System.out.println("null pointer, someone ordered 0 items once");
        }
        
    }
    private void fixZebraColor(){
        if(zebra){
            this.setBackground(zebra1);
        }else{
            this.setBackground(zebra2);
        }
    }

    private void toggleZebra(){
        if (zebra){
            zebra = false;
        }else{
            zebra = true;
        }
    }
    private void initLabels(){
        dateLabel.setText(order.getDate().toString());
        orderIDLabel.setText(String.valueOf(order.getOrderNumber()));
       
        double price = 0;
        
        //get the total cost of a list of shopping items
        List<ShoppingItem> items = order.getItems();
        for (ShoppingItem item : items){
            price += item.getTotal();
        }
        priceLabel.setText(String.valueOf((int)price));
    }
    private String getPartialOrder() {
        String returner = "";
        List<ShoppingItem> items = order.getItems();
        int cntr = 0;
        for (ShoppingItem item : items){
            returner = returner + item.getProduct().getName() + ", " ;
            cntr++;
            if (cntr > 4){
                break;
            }
        }
        
        return returner;
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
        dateLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        orderIDLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        image1 = new javax.swing.JLabel();
        image2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Datum av köp:");

        dateLabel.setText("datum som kan bli långt");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Order ID:");

        orderIDLabel.setText("Id#");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Pris:");

        priceLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        priceLabel.setText("pris");

        jButton1.setText("Visa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Lägg till");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        saveButton.setText("Spara");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(image1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(dateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(orderIDLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(priceLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(saveButton))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      //showOldItemsAsSearch();
        openOldItemsPopup(order);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void openOldItemsPopup(Order order){
          JDialog popup = new JDialog(IMat.getWindow());
          int width = IMat.getWindow().getWidth();
          int height =IMat.getWindow().getHeight();
          popup.setLocation((width/2)-400, height/2 - 300);
          popup.setUndecorated(true);
          int size = order.getItems().size()*120;
          if(size > 600){
              size = 600;
          }else if(size < 300){
              size =300;
          }
          popup.setSize(600, size);
          
          popup.add(new OrderHistoryPopup(order, popup));
          popup.setVisible(true);
    }
    
    private void showOldItemsAsSearch(){
          List<ShoppingItem> items = order.getItems();
        List<Product> prodItems = new ArrayList();
        
        for (ShoppingItem item:items){
            prodItems.add(item.getProduct());
        }
        IMat.getWindow().showSearch(prodItems);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       List <ShoppingItem> items = order.getItems();
       if(buzy == false){
           buzy = true;
            for(ShoppingItem item:items){
                ModelAux.add(item);
            }    
       buzy = false;
       }
       
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (saveButton.getText().equals("Spara")) {
            
        saveButton.setText("Ångra");
        }else{
            saveButton.setText("Spara");
        }
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel orderIDLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
