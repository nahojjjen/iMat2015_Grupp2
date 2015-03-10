/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.subItems;

import imat.IMat;
import imat.models.Model;
import imat.models.ModelAux;
import imat.panels.DetailPopUp;
import imat.panels.ProductDetailPopUp;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Morpheus
 */
public class ListItem extends javax.swing.JPanel {
    private static boolean zebra = false;
    private Product product;
    private Frame MainWindow = IMat.getWindow();
    private ImageIcon favIcon = new ImageIcon("src/resources/fav.png");
    private ImageIcon unFavIcon = new ImageIcon("src/resources/unfav.png");
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
        setJLabelUnderlined(productName);
        productPrice.setText(String.valueOf(product.getPrice())+ " " + product.getUnit());
        fixFav();
        refreshRemoveButton();
        this.setBackground(getZebra());
    }

    private Color getZebra(){
        if (zebra){
            zebra = false;
            return new Color(230,230,230);
        }else{
            zebra = true;
            return new Color(250,250,250);
        }
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
    
    private void refreshRemoveButton() {
        if (ModelAux.getAmountInCart(product) == 0) {
            removeButton.setEnabled(false);
        } else {
            removeButton.setEnabled(true);
        }
    }
    
    private void setJLabelUnderlined(JLabel label){
        Font font = label.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        label.setFont(font.deriveFont(attributes));
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
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        favoriteLabel = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();

        productName.setText("Produktnamn");
        productName.setToolTipText("Tryck för detaljerad vy");
        productName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedHandler(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedHandler(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredHandler(evt);
            }
        });

        productPrice.setText("Pris");

        ammountSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        buyButton.setBackground(new java.awt.Color(255, 255, 255));
        buyButton.setToolTipText("Lägg till i kundvagn");
        buyButton.setLabel("Lägg till");
        buyButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        favoriteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/unfav.png"))); // NOI18N
        favoriteLabel.setToolTipText("Favorite");
        favoriteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favoriteLabelMouseClicked(evt);
            }
        });

        removeButton.setText("Ta bort");
        removeButton.setToolTipText("Ta bort vald mängd");
        removeButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(favoriteLabel)
                .addGap(18, 18, 18)
                .addComponent(productPrice)
                .addGap(8, 8, 8)
                .addComponent(ammountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buyButton)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ammountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(removeButton)
                        .addComponent(buyButton)
                        .addComponent(productPrice))
                    .addComponent(favoriteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        int amount;
        amount = (int)ammountSpinner.getValue();
        if(amount > 0){
            ShoppingItem item = new ShoppingItem(product, amount);
            ModelAux.add(item);
        } else {
            //Vi ska inte kunna komma hit, då spinnern endast tar värden 1-99
        }
        removeButton.setEnabled(true);
    }//GEN-LAST:event_buyButtonActionPerformed

    private void mouseEnteredHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEnteredHandler
        // TODO add your handling code here
        this.productName.setForeground(Color.BLUE);
    }//GEN-LAST:event_mouseEnteredHandler

    private void mouseExitedHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExitedHandler
        // TODO add your handling code here:
        this.productName.setForeground(Color.BLACK);
    }//GEN-LAST:event_mouseExitedHandler

    private void mouseClickedHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedHandler
        // TODO add your handling code here:
        JDialog popup = new JDialog(IMat.getWindow());
        
        int width = IMat.getWindow().getWidth();
        int height =IMat.getWindow().getHeight();
        popup.setLocation((width/2)-400, height/2 - 300);
        popup.setUndecorated(true);
          
        popup.setSize(766, 770);
      
        popup.add(new ProductDetailPopUp(product, popup));
        popup.setVisible(true);
    }//GEN-LAST:event_mouseClickedHandler

    private void favoriteLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoriteLabelMouseClicked
        // TODO add your handling code here:
        toggleFavorite();
    }//GEN-LAST:event_favoriteLabelMouseClicked

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        int amount = (int) ammountSpinner.getValue();
        
        ModelAux.remove(product, amount);
        
        refreshRemoveButton();
    }//GEN-LAST:event_removeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ammountSpinner;
    private javax.swing.JButton buyButton;
    private javax.swing.JLabel favoriteLabel;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productPrice;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables
}
