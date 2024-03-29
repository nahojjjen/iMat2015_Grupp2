/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.contentPanels.buyingPanels;

import imat.IMat;
import imat.models.CustomerModel;
import imat.panels.contentPanels.PanelAccountInfo;
import imat.panels.contentPanels.PanelCreditCard;
import imat.panels.contentPanels.PanelDeliveryInfo;
import java.util.Locale;

/**
 *
 * @author Johan
 */
public class PanelInfoFill extends javax.swing.JPanel {

    private PanelCreditCard card;
    private PanelDeliveryInfo delivery;
    private PanelAccountInfo acc = new PanelAccountInfo();
    private BuyForm buyPanel = new BuyForm();
    private boolean accVisible = false;
    /**
     * Creates new form PanelConfirm
     */
    public PanelInfoFill() {

        initComponents();
        BuyForm buyPanel = new BuyForm();
        card = buyPanel.getCardPanel();
        delivery = buyPanel.getDeliveryPanel();
        if(IMat.isLoggedin()){
            registerCheckbox.setEnabled(false);
        }

        cartViewer.add(buyPanel);
        cartViewer.add(acc);
        acc.setVisible(false);

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
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        holder = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        cartViewer = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        registerCheckbox = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(500, 44));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(500, 530));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 70));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(imat.IMat.getAccentColor());
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 250, 250));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bekräfta Kundvagn");
        jPanel4.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        jLabel1.setBackground(imat.IMat.getAccentColor());
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/wizardsteps/2.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, java.awt.BorderLayout.SOUTH);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        holder.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 4));

        jPanel3.setOpaque(false);

        cartViewer.setOpaque(false);
        cartViewer.setLayout(new java.awt.GridLayout(1, 1));
        jPanel3.add(cartViewer);
        jPanel3.add(jSeparator1);

        jScrollPane1.setViewportView(jPanel3);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);
        jScrollPane1.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nästa steg: Bekräfta betalningsInfo");

        jButton1.setBackground(new java.awt.Color(201, 80, 148));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Nästa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        registerCheckbox.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        registerCheckbox.setText("Spara mina uppgifter");
        registerCheckbox.setOpaque(false);
        registerCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerCheckboxActionPerformed(evt);
            }
        });

        jButton2.setText("Tillbaka");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout holderLayout = new javax.swing.GroupLayout(holder);
        holder.setLayout(holderLayout);
        holderLayout.setHorizontalGroup(
            holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
            .addGroup(holderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(holderLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registerCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addGroup(holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        holderLayout.setVerticalGroup(
            holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holderLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(holderLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(registerCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        add(holder, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          if (registerCheckbox.isSelected()&& acc.isBothPasswordCorrect()&& acc.isBothEmailCorrect()) {
            if (card.isAllCorrect() && delivery.isAllCorrect()) {
                unloggedinCheckout();
                buyPanel.setFirstVisit(false);
                IMat.getWindow().setWizardStep(3);
            }
        } else if (registerCheckbox.isSelected()==false){
            if (card.isAllCorrect() && delivery.isAllCorrect()) {
                loggedinCheckout();
                buyPanel.setFirstVisit(false);
                IMat.getWindow().setWizardStep(3);
            }
        }
          

    }//GEN-LAST:event_jButton1ActionPerformed

    private void unloggedinCheckout(){
         IMat.setLoggedin(true);
          card.save();
                delivery.save();
                acc.save();
                IMat.getWindow().refreshLoggedin();
                goToNext();
    }
    
    private void loggedinCheckout(){
        card.save();
        delivery.save();
        goToNext();
    }
    private void registerCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCheckboxActionPerformed
         
        acc.setVisible(registerCheckbox.isSelected());
       
    }//GEN-LAST:event_registerCheckboxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        IMat.getWindow().setContent(new PanelConfirm());
        buyPanel.setFirstVisit(true);
        IMat.getWindow().setWizardStep(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void goToNext() {
        IMat.getWindow().setContent(new ConfirmOrderInfo());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cartViewer;
    private javax.swing.JPanel holder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JCheckBox registerCheckbox;
    // End of variables declaration//GEN-END:variables
}
