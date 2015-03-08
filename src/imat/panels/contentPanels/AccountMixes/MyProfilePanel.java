/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.contentPanels.AccountMixes;

import imat.panels.contentPanels.PanelAccountInfo;
import imat.panels.contentPanels.PanelCreditCard;
import imat.panels.contentPanels.PanelDeliveryInfo;

/**
 *
 * @author Johan Swanberg
 */
public class MyProfilePanel extends javax.swing.JPanel {

    private PanelAccountInfo accPanel = new PanelAccountInfo();
    private PanelCreditCard cardPanel = new PanelCreditCard();
    private PanelDeliveryInfo deliveryPanel = new PanelDeliveryInfo();
    /**
     * Creates new form MyProfilePanel
     */
    public MyProfilePanel() {
        initComponents();
        accHolder.add(accPanel);
        deliveryHolder.add(deliveryPanel);
        paymentHolder.add(cardPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        accHolder = new javax.swing.JPanel();
        paymentHolder = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        deliveryHolder = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(2, 2));

        jSplitPane1.setDividerLocation(500);

        accHolder.setMinimumSize(new java.awt.Dimension(400, 230));
        accHolder.setLayout(new java.awt.BorderLayout());
        jSplitPane1.setLeftComponent(accHolder);

        paymentHolder.setMinimumSize(new java.awt.Dimension(485, 300));
        paymentHolder.setLayout(new java.awt.BorderLayout());
        jSplitPane1.setRightComponent(paymentHolder);

        add(jSplitPane1);

        jSplitPane2.setDividerLocation(500);

        deliveryHolder.setMinimumSize(new java.awt.Dimension(490, 440));
        deliveryHolder.setLayout(new java.awt.BorderLayout());
        jSplitPane2.setLeftComponent(deliveryHolder);

        saveButton.setText("Save changes");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(61, 61, 61))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(59, 59, 59))
        );

        jSplitPane2.setRightComponent(jPanel4);

        add(jSplitPane2);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
       cardPanel.save();
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accHolder;
    private javax.swing.JPanel deliveryHolder;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel paymentHolder;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
