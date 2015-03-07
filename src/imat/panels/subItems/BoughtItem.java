/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.subItems;

import imat.models.Model;
import imat.models.ModelAux;
import java.awt.Color;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Johan Swanberg
 */
public class BoughtItem extends javax.swing.JPanel {
    private static boolean zebra = false;
    private ShoppingItem thisItem;
    /**
     * Creates new form BoughtItem
     */
    public BoughtItem(ShoppingItem item) {
        initComponents();
        thisItem=item;
        fixLabels();
        fixZebra();
        refreshRemoveButton();
    }
    
    private void fixZebra(){
        zebra=!zebra;
        if (zebra) {
            setBackground(new Color(250,250,250));
        }else{
            setBackground(new Color(230,230,230));
        }
    }
    private void fixLabels(){
        imageLabel.setIcon(Model.getImage(thisItem.getProduct(),90,90));
        bigNumberLabel.setText(String.valueOf((int)thisItem.getAmount()) + " "+thisItem.getProduct().getUnitSuffix());
        totalCostLabel.setText((int)thisItem.getTotal() + " kr (" + (int)thisItem.getProduct().getPrice() + " /"+thisItem.getProduct().getUnitSuffix() + ")");
        nameLabel.setText(thisItem.getProduct().getName());
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
        jPanel1 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        colorPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalCostLabel = new javax.swing.JLabel();
        bigNumberLabel = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        inputField = new javax.swing.JSpinner();
        addButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerLocation(90);
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setOpaque(false);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(imageLabel, java.awt.BorderLayout.CENTER);

        jSplitPane1.setLeftComponent(jPanel1);

        colorPanel.setBackground(new java.awt.Color(0, 0, 0));
        colorPanel.setOpaque(false);

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLabel.setText("The name of the product bought");

        jLabel3.setText("Total kostnad:");

        totalCostLabel.setText("45 kr (15/förp)");

        bigNumberLabel.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        bigNumberLabel.setForeground(new java.awt.Color(0, 102, 51));
        bigNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bigNumberLabel.setText("3");

        removeButton.setText("Ta Bort");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        inputField.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));

        addButton.setText("Lägg till");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(colorPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addGroup(colorPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalCostLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(bigNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bigNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(colorPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(totalCostLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeButton)
                            .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(colorPanel);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int amount = (int) inputField.getValue();

        ModelAux.remove(thisItem.getProduct(), amount);

        refreshRemoveButton();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        int amount = (int) inputField.getValue();
        ShoppingItem item = new ShoppingItem(thisItem.getProduct(), amount);
        ModelAux.add(item);
        refreshRemoveButton();
    }//GEN-LAST:event_addButtonActionPerformed

    private void refreshRemoveButton() {
        if (ModelAux.getAmountInCart(thisItem.getProduct()) == 0) {
            showRemoveButton(false);
        } else {
            showRemoveButton(true);
        }
    }
    
    private void showRemoveButton(boolean is){
        
        removeButton.setVisible(is);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel bigNumberLabel;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JSpinner inputField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel totalCostLabel;
    // End of variables declaration//GEN-END:variables
}
