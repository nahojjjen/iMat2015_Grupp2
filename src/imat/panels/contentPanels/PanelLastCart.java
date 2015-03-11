/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.contentPanels;

import imat.IMat;
import imat.models.Model;
import imat.models.ModelAux;
import imat.models.sorters.OrderByDateSort;
import imat.panels.subItems.BoughtItem;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import se.chalmers.ait.dat215.project.Order;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Johan Swanberg
 */
public class PanelLastCart extends javax.swing.JPanel {

    private Order lastOrder;
    /**
     * Creates new form PanelLastCart
     */
    public PanelLastCart() {
        initComponents();
        List<Order> orders = Model.getOrders();
        Collections.sort(orders, new OrderByDateSort());
        try {
             lastOrder = orders.get(0);
        } catch (NullPointerException e) {
            System.out.println("no previous order");
             lastOrder = new Order();
        }
        List<ShoppingItem> items = lastOrder.getItems();
        
        for (ShoppingItem item : items){
            holder.add(new BoughtItem(item));
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

        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        holder = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(imat.IMat.getAccentColor());
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setLayout(new java.awt.BorderLayout());

        nameLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(250, 250, 250));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Pågående Beställning");
        jPanel1.add(nameLabel, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setBorder(null);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setOpaque(false);

        jPanel2.setOpaque(false);

        holder.setOpaque(false);
        holder.setLayout(new java.awt.GridLayout(0, 1));
        jPanel2.add(holder);

        jScrollPane1.setViewportView(jPanel2);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 70));

        jButton1.setText("Redigera köp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Om du ser något fel i din beställning så kan du redigera den.");

        jLabel2.setText("Notera att du då");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("måste");

        jLabel4.setText("gå igenom kassan igen, du debiteras bara för det senaste köpet.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addContainerGap())
        );

        add(jPanel3, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("backend cannot remove order, pretend that it does!");
         
        List<ShoppingItem> items = lastOrder.getItems();
        Model.getShoppingcart().clear();
        for (ShoppingItem item : items){
            ModelAux.add(item);
        }
        IMat.getWindow().setContent(new PanelHome());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel holder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}
