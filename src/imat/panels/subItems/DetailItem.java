/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.subItems;

import imat.IMat;
import imat.models.Model;
import imat.models.ModelAux;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Johan Swanberg
 */
public class DetailItem extends javax.swing.JPanel {

    private Product product;
    private ImageIcon favIcon = new ImageIcon("src/resources/fav.png");
    private ImageIcon unFavIcon = new ImageIcon("src/resources/unfav.png");

    /**
     * Creates new form DetailItem
     */
    public DetailItem(Product product) {
        initComponents();
        this.product = product;
        initiate();
        fixColor();
        fixFav();
        refreshRemoveButton();
    }

    private void fixFav() {
        if (Model.isFavorited(product)) {
            favoriteLabel.setIcon(favIcon);
        }
    }

    private void toggleFavorite() {
        if (Model.isFavorited(product)) {
            Model.removeFavorite(product);
            favoriteLabel.setIcon(unFavIcon);
        } else {
            Model.addFavorite(product);
            favoriteLabel.setIcon(favIcon);
        }
    }

    private void fixColor() {
        jPanel1.setBackground(IMat.getForegroundColor());
        jPanel2.setBackground(IMat.getForegroundColor());
    }

    private void initiate() {
        imageLabel.setIcon(Model.getImage(product, 80, 80));
        nameLabel.setText(Model.getName(product));
        priceLabel.setText(String.valueOf(product.getPrice() + " " + product.getUnit()));

    }

    /**
     * Creates new form DetailItem
     */
    public DetailItem() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        priceLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        inputField = new javax.swing.JSpinner();
        warningLabel = new javax.swing.JLabel();
        favoriteLabel = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerLocation(90);
        jSplitPane1.setDividerSize(0);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel2.setLayout(null);

        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        priceLabel.setText("jLabel1");
        jPanel2.add(priceLabel);
        priceLabel.setBounds(260, 10, 130, 14);

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLabel.setText("jLabel1");
        jPanel2.add(nameLabel);
        nameLabel.setBounds(10, 10, 75, 17);

        descriptionLabel.setForeground(new java.awt.Color(102, 102, 102));
        descriptionLabel.setText("Produktens beskrivning ...");
        jPanel2.add(descriptionLabel);
        descriptionLabel.setBounds(10, 33, 157, 24);

        addButton.setText("Lägg till");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addButton);
        addButton.setBounds(310, 50, 90, 33);

        inputField.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        jPanel2.add(inputField);
        inputField.setBounds(270, 50, 39, 33);

        warningLabel.setText("   ");
        jPanel2.add(warningLabel);
        warningLabel.setBounds(195, 47, 9, 33);

        favoriteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/unfav.png"))); // NOI18N
        favoriteLabel.setToolTipText("Favorite");
        favoriteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favoriteLabelMouseClicked(evt);
            }
        });
        jPanel2.add(favoriteLabel);
        favoriteLabel.setBounds(10, 64, 15, 20);

        removeButton.setText("Ta Bort");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        jPanel2.add(removeButton);
        removeButton.setBounds(180, 50, 90, 30);

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int amount;
        amount = (int) inputField.getValue();
        if (amount > 0) {
            //Model.getShoppingcart().addProduct(product, amount);
            ShoppingItem item = new ShoppingItem(product, amount);
            ModelAux.add(item);
        } else {
            warningLabel.setText("t.ex. 1");
        }
        refreshRemoveButton();

    }//GEN-LAST:event_addButtonActionPerformed

    /**
     * calls togglefavorite
     * @param evt 
     */
    private void favoriteLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoriteLabelMouseClicked
        toggleFavorite();
    }//GEN-LAST:event_favoriteLabelMouseClicked

    /**
     * 
     */
    private void refreshRemoveButton() {
        if (ModelAux.getAmountInCart(product) == 0) {
            showRemoveButton(false);
        } else {
            showRemoveButton(true);
        }
    }
    
    /**
     * removes the specified amount of items from the cart
     * @param evt 
     */
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int amount = (int) inputField.getValue();
        
        ModelAux.remove(product, amount);
        
        refreshRemoveButton();

    }//GEN-LAST:event_removeButtonActionPerformed

    private void showRemoveButton(boolean is) {
        removeButton.setVisible(is);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel favoriteLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JSpinner inputField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
