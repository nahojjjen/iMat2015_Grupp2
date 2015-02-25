/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.contentPanels;

import imat.CustomerModel;

/**
 *
 * @author Viktor
 */
public class PanelCreditCard extends javax.swing.JPanel {

    /**
     * Creates new form PanelCreditCard
     */
    public PanelCreditCard() {
        initComponents();
        cardNumberTextField.setText(CustomerModel.getCardNumber());
        cardHolderTextField.setText(CustomerModel.getCardHolderName());
        securityNumberTextField.setText("" + CustomerModel.getCardVerification());
        monthComboBox.setSelectedIndex(CustomerModel.getCardMonth());
        yearComboBox.setSelectedIndex(CustomerModel.getCardYear());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visaMasterRadioButton = new javax.swing.JRadioButton();
        americanRadioButton2 = new javax.swing.JRadioButton();
        cardTypeLabel = new javax.swing.JLabel();
        carNumberLabel = new javax.swing.JLabel();
        cardHolderLabel = new javax.swing.JLabel();
        cardExpireLabel = new javax.swing.JLabel();
        cardSecurityLabel = new javax.swing.JLabel();
        cardNumberTextField = new javax.swing.JTextField();
        digitsInCardNumberLabel = new javax.swing.JLabel();
        cardHolderTextField = new javax.swing.JTextField();
        monthComboBox = new javax.swing.JComboBox();
        yearComboBox = new javax.swing.JComboBox();
        securityReminderLabel = new javax.swing.JLabel();
        cardHolderReminderLabel = new javax.swing.JLabel();
        securityNumberTextField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();

        visaMasterRadioButton.setText("VISA/MasterCard");
        visaMasterRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaMasterRadioButtonActionPerformed(evt);
            }
        });

        americanRadioButton2.setText("American Express");

        cardTypeLabel.setText("Korttyp:");

        carNumberLabel.setText("Kortnummer:");

        cardHolderLabel.setText("Kortinnehavare:");

        cardExpireLabel.setText("Giltighetstid:");

        cardSecurityLabel.setText("CVV2-nummer:");

        digitsInCardNumberLabel.setText("16 siffror");

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Januari", "Februari", "Mars", "April", "Maj", "Juni", "Juli", "Augusti", "September", "Oktober", "November", "December" }));

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));

        securityReminderLabel.setText("Sista 3 siffrorna på kortets baksida");

        cardHolderReminderLabel.setText("Namn på kortet");

        securityNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityNumberTextFieldActionPerformed(evt);
            }
        });

        confirmButton.setText("Bekräfta");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardTypeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(carNumberLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cardHolderLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cardExpireLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cardSecurityLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(visaMasterRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(americanRadioButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(securityNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(securityReminderLabel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                            .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cardHolderTextField)
                                        .addComponent(cardNumberTextField))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(digitsInCardNumberLabel)
                                        .addComponent(cardHolderReminderLabel)))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visaMasterRadioButton)
                    .addComponent(americanRadioButton2)
                    .addComponent(cardTypeLabel))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carNumberLabel)
                    .addComponent(cardNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digitsInCardNumberLabel))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardHolderLabel)
                    .addComponent(cardHolderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardHolderReminderLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardExpireLabel)
                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardSecurityLabel)
                    .addComponent(securityReminderLabel)
                    .addComponent(securityNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void visaMasterRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaMasterRadioButtonActionPerformed
        CustomerModel.setCardType("VISA/MasterCard");
    }//GEN-LAST:event_visaMasterRadioButtonActionPerformed

    private void securityNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityNumberTextFieldActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        CustomerModel.setCardNumber(cardNumberTextField.getText());
        CustomerModel.setCardHolderName(cardHolderTextField.getText());
        CustomerModel.setCardMonth(monthComboBox.getSelectedIndex());
        CustomerModel.setCardYear(yearComboBox.getSelectedIndex());
        CustomerModel.setCardVerification(Integer.parseInt(securityNumberTextField.getText()));
    }//GEN-LAST:event_confirmButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton americanRadioButton2;
    private javax.swing.JLabel carNumberLabel;
    private javax.swing.JLabel cardExpireLabel;
    private javax.swing.JLabel cardHolderLabel;
    private javax.swing.JLabel cardHolderReminderLabel;
    private javax.swing.JTextField cardHolderTextField;
    private javax.swing.JTextField cardNumberTextField;
    private javax.swing.JLabel cardSecurityLabel;
    private javax.swing.JLabel cardTypeLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel digitsInCardNumberLabel;
    private javax.swing.JComboBox monthComboBox;
    private javax.swing.JTextField securityNumberTextField;
    private javax.swing.JLabel securityReminderLabel;
    private javax.swing.JRadioButton visaMasterRadioButton;
    private javax.swing.JComboBox yearComboBox;
    // End of variables declaration//GEN-END:variables
}
