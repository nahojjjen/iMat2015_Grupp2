/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.contentPanels.buyingPanels;

import imat.models.CustomerModel;
import imat.IMat;
import imat.models.*;
import imat.panels.contentPanels.AccountMixes.RegisterPanel;
import imat.panels.contentPanels.PanelCreditCard;
import imat.panels.contentPanels.PanelDeliveryInfo;
import imat.panels.contentPanels.PanelHome;
import se.chalmers.ait.dat215.project.Customer;

/**
 *
 * @author Johan Swanberg
 */
public class PanelPurchaseConfirm extends javax.swing.JPanel {
    private PanelInfoForm infoPanel;
    /**
     * Creates new form PanelSelectPayment
     */
    public PanelPurchaseConfirm() {
        initComponents();
        }
    public PanelPurchaseConfirm(String name, String address, String cardNumber, int totPrice) {
        initComponents();
        nameLabel.setText("Hej " + name);
        addressLabel.setText("Dina varor kommer att skickas till " + address + ".");
        String hiddenCardNumber = "XXXX XXXX XXXX ";
        for(int i = cardNumber.length()-4; i<cardNumber.length(); i++){
            hiddenCardNumber = hiddenCardNumber + cardNumber.charAt(i);
        }
        
        cardLabel.setText("Du har valt att betala med " + hiddenCardNumber + ".");
        priceLabel.setText("Totalt pris " + totPrice + " kr");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        holder = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        cardLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        priceLabel = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 122));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bekräfta Beställning");
        jLabel3.setOpaque(true);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/s3.png"))); // NOI18N
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        holder.setOpaque(false);

        nameLabel.setText("NAMN");

        jLabel2.setText("Snart har du genomfört din beställning. Vänligen kolla så att dina uppgifter stämmer.");

        addressLabel.setText("ADRESS");

        cardLabel.setText("KORT");

        jButton1.setText("Bekräfta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        priceLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        priceLabel.setText("jLabel4");

        javax.swing.GroupLayout holderLayout = new javax.swing.GroupLayout(holder);
        holder.setLayout(holderLayout);
        holderLayout.setHorizontalGroup(
            holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(holderLayout.createSequentialGroup()
                        .addGroup(holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(addressLabel)
                            .addComponent(nameLabel)
                            .addComponent(cardLabel))
                        .addContainerGap(78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, holderLayout.createSequentialGroup()
                        .addComponent(priceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        holderLayout.setVerticalGroup(
            holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(addressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLabel)))
        );

        jPanel3.add(holder, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Model.placeOrder();
        Model.getShoppingcart().clear();
        IMat.getWindow().refreshCart();
        IMat.getWindow().setContent(new PanelDoneShopping());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel cardLabel;
    private javax.swing.JPanel holder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel priceLabel;
    // End of variables declaration//GEN-END:variables
}