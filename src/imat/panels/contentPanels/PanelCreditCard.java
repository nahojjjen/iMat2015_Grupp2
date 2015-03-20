/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.contentPanels;

import imat.models.CustomerModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Viktor
 */
public class PanelCreditCard extends javax.swing.JPanel {
    
    ///// setOkLabel(isCardNumberCorrect(), cardNumberOkLabel);////
    private ImageIcon ok = new ImageIcon("src/resources/ok.png");
    private ImageIcon notOk = new ImageIcon("src/resources/notOk.png");
    private String tempRealCardNbr;
    private String tempFakeCardNbr;
    /**
     * Creates new form PanelCreditCard
     */
    public PanelCreditCard() {
        initComponents();
        setCardInfo();
        setLabels();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardTypeButtonGroup = new javax.swing.ButtonGroup();
        visaMasterRadioButton = new javax.swing.JRadioButton();
        americanRadioButton = new javax.swing.JRadioButton();
        cardTypeLabel = new javax.swing.JLabel();
        carNumberLabel = new javax.swing.JLabel();
        cardHolderLabel = new javax.swing.JLabel();
        cardExpireLabel = new javax.swing.JLabel();
        cardSecurityLabel = new javax.swing.JLabel();
        digitsInCardNumberLabel = new javax.swing.JLabel();
        monthComboBox = new javax.swing.JComboBox();
        yearComboBox = new javax.swing.JComboBox();
        securityReminderLabel = new javax.swing.JLabel();
        cardHolderReminderLabel = new javax.swing.JLabel();
        securityNumberTextField = new javax.swing.JFormattedTextField();
        cardNumberOkLabel = new javax.swing.JLabel();
        holderNameOkLabel = new javax.swing.JLabel();
        secNumberOkLabel = new javax.swing.JLabel();
        cardHolderTextField = new javax.swing.JTextField();
        cardInput1 = new javax.swing.JTextField();
        cardInput3 = new javax.swing.JTextField();
        cardInput2 = new javax.swing.JTextField();
        cardInput4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(485, 300));
        setOpaque(false);

        visaMasterRadioButton.setText("VISA/MasterCard");
        visaMasterRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaMasterRadioButtonActionPerformed(evt);
            }
        });

        americanRadioButton.setText("American Express");
        americanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                americanRadioButtonActionPerformed(evt);
            }
        });

        cardTypeLabel.setText("Korttyp:");

        carNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        carNumberLabel.setText("Kortnummer:");

        cardHolderLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cardHolderLabel.setText("Kortinnehavare:");

        cardExpireLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cardExpireLabel.setText("Giltighetstid:");

        cardSecurityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cardSecurityLabel.setText("CVV2-nummer:");

        digitsInCardNumberLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        digitsInCardNumberLabel.setText("16 siffror");

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Januari", "Februari", "Mars", "April", "Maj", "Juni", "Juli", "Augusti", "September", "Oktober", "November", "December" }));

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));

        securityReminderLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        securityReminderLabel.setText("Sista 3 siffrorna på kortets baksida");

        cardHolderReminderLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        cardHolderReminderLabel.setText("Namn på kortet");

        securityNumberTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
        securityNumberTextField.setToolTipText("Endast siffror");
        securityNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                securityNumberTextFieldKeyReleased(evt);
            }
        });

        cardNumberOkLabel.setToolTipText("Bara siffror, inga andra tecken");

        holderNameOkLabel.setToolTipText("Minst 3 tecken");

        secNumberOkLabel.setToolTipText("3 siffror");

        cardHolderTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cardHolderTextFieldKeyPressed(evt);
            }
        });

        cardInput1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cardInput1KeyReleased(evt);
            }
        });

        cardInput3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cardInput3KeyReleased(evt);
            }
        });

        cardInput2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cardInput2KeyReleased(evt);
            }
        });

        cardInput4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardInput4KeyTyped(evt);
            }
        });

        jLabel1.setText("-");

        jLabel3.setText("-");

        jLabel4.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardSecurityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardExpireLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardHolderLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carNumberLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(securityNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(secNumberOkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(securityReminderLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(monthComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cardHolderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(holderNameOkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cardInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel1)
                                .addGap(1, 1, 1)
                                .addComponent(cardInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3)
                                .addGap(1, 1, 1)
                                .addComponent(cardInput3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4)
                                .addGap(1, 1, 1)
                                .addComponent(cardInput4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cardNumberOkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(digitsInCardNumberLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardHolderReminderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(cardTypeLabel)
                .addGap(48, 48, 48)
                .addComponent(visaMasterRadioButton)
                .addGap(36, 36, 36)
                .addComponent(americanRadioButton)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cardTypeLabel))
                    .addComponent(visaMasterRadioButton)
                    .addComponent(americanRadioButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(carNumberLabel))
                            .addComponent(cardNumberOkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cardInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardInput4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(cardInput3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(digitsInCardNumberLabel)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cardHolderLabel))
                    .addComponent(cardHolderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cardHolderReminderLabel)
                        .addComponent(holderNameOkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cardExpireLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(cardSecurityLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(securityNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(securityReminderLabel)
                                .addComponent(secNumberOkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void visaMasterRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaMasterRadioButtonActionPerformed
        CustomerModel.setCardType("VISA/MasterCard");
        setDigitsLabel("VISA/MasterCard");
        setOkLabel(isCardNumberCorrect(), cardNumberOkLabel);
    }//GEN-LAST:event_visaMasterRadioButtonActionPerformed

    private void americanRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americanRadioButtonActionPerformed
        CustomerModel.setCardType("American Express");
        setDigitsLabel("American Express");
        setOkLabel(isCardNumberCorrect(), cardNumberOkLabel);
    }//GEN-LAST:event_americanRadioButtonActionPerformed

    private void securityNumberTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_securityNumberTextFieldKeyReleased
        setOkLabel(isSecNumberCorrect(), secNumberOkLabel);
      
    }//GEN-LAST:event_securityNumberTextFieldKeyReleased

    private void cardHolderTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardHolderTextFieldKeyPressed
        setOkLabel(isCardHolderNameCorrect(), holderNameOkLabel);
    }//GEN-LAST:event_cardHolderTextFieldKeyPressed

    private void cardInput4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardInput4KeyTyped
        if (cardInput4.getText().length() > 3){
            String totalText = cardInput4.getText().substring(0, 3);
            cardInput4.setText(totalText);
        }
        setOkLabel(isCardNumberCorrect(), cardNumberOkLabel);
    }//GEN-LAST:event_cardInput4KeyTyped

    private void cardInput1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardInput1KeyReleased
        if (cardInput1.getText().length() == 4){
           cardInput2.requestFocus();
        }
        setOkLabel(isCardNumberCorrect(), cardNumberOkLabel);
    }//GEN-LAST:event_cardInput1KeyReleased

    private void cardInput2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardInput2KeyReleased
         if (cardInput2.getText().length() == 4){
           cardInput3.requestFocus();
        }
        setOkLabel(isCardNumberCorrect(), cardNumberOkLabel);
    }//GEN-LAST:event_cardInput2KeyReleased

    private void cardInput3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardInput3KeyReleased
         if (cardInput3.getText().length() == 4){
           cardInput4.requestFocus();
        }
        setOkLabel(isCardNumberCorrect(), cardNumberOkLabel);
    }//GEN-LAST:event_cardInput3KeyReleased
    private void setCardInfo() {        
        cardHolderTextField.setText(CustomerModel.getCardHolderName());
        //securityNumberTextField.setText("" + CustomerModel.getCardVerification());
        monthComboBox.setSelectedIndex(CustomerModel.getCardMonth());
        yearComboBox.setSelectedIndex(CustomerModel.getCardYear());
        cardTypeButtonGroup.add(americanRadioButton);
        cardTypeButtonGroup.add(visaMasterRadioButton);
        setSelectedCardType(CustomerModel.getCardType());        
        securityNumberTextField.setText(CustomerModel.getCardVerification());
              
        cardInput1.setText("****");
        cardInput2.setText("****");
        cardInput3.setText("****");
        if(CustomerModel.getCardNumber().length()>12){
            cardInput4.setText(CustomerModel.getCardNumber().substring(12));
       }        
    }
    public void clearCardInfo() {        
        cardHolderTextField.setText("");
        securityNumberTextField.setText("");
        monthComboBox.setSelectedIndex(0);
        yearComboBox.setSelectedIndex(0);
        cardTypeButtonGroup.add(americanRadioButton);
        cardTypeButtonGroup.add(visaMasterRadioButton);
        //setSelectedCardType(CustomerModel.getCardType());
        cardInput1.setText(""); 
        cardInput2.setText(""); 
        cardInput3.setText(""); 
        cardInput4.setText("");         
    }

    public void setLabels() {
        setOkLabel(isCardNumberCorrect(), cardNumberOkLabel);
        setOkLabel(isCardHolderNameCorrect(), holderNameOkLabel);
        setOkLabel(isSecNumberCorrect(), secNumberOkLabel);
        setDigitsLabel(CustomerModel.getCardType());
    }

    /**
     * saves the checked card type
     */
    private void setSelectedCardType(String str) {
        if (str.equals("American Express")) {
            americanRadioButton.setSelected(true);
        } else {
            visaMasterRadioButton.setSelected(true);
        }
    }

    /**
     * sets reminder label for card numbers
     */
    private void setDigitsLabel(String str) {
        if (str.equals("American Express")) {
            digitsInCardNumberLabel.setText("15 siffror");
        } else {
            digitsInCardNumberLabel.setText("16 siffror");
        }
    }

    /**
     * saves all field data
     */
    public void save() {        
        CustomerModel.setCardVerification(Integer.parseInt(securityNumberTextField.getText()));
        CustomerModel.setCardHolderName(cardHolderTextField.getText());
        CustomerModel.setCardMonth(monthComboBox.getSelectedIndex());
        CustomerModel.setCardYear(yearComboBox.getSelectedIndex());        
        CustomerModel.setCardNumber(getCardText());
        
    }

    private String getCardText(){        
        return cardInput1.getText()+ cardInput2.getText()+ cardInput3.getText()+ cardInput4.getText();
    }
    /**
     * @return true if card number is filled correctly
     */
    public boolean isCardNumberCorrect() {
        return (CustomerModel.cardNumberTest(getCardText()));
    }

    /**
     * @return true if security number is filled correctly
     */
    public boolean isSecNumberCorrect() {
        return (CustomerModel.cardVerificationTest(securityNumberTextField.getText()));
    }

    /**
     * @return true if card holder name is filled correctly
     */
    public boolean isCardHolderNameCorrect() {
        return (CustomerModel.cardHolderNameTest(cardHolderTextField.getText()));
    }

    public boolean isAllCorrect(){
        return(isSecNumberCorrect() && isCardHolderNameCorrect() && isCardNumberCorrect());            
    }
    
    private void setOkLabel(Boolean bool, JLabel label) {
        if (bool) {
            label.setIcon(ok);
        } else {
            label.setIcon(notOk);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton americanRadioButton;
    private javax.swing.JLabel carNumberLabel;
    private javax.swing.JLabel cardExpireLabel;
    private javax.swing.JLabel cardHolderLabel;
    private javax.swing.JLabel cardHolderReminderLabel;
    private javax.swing.JTextField cardHolderTextField;
    private javax.swing.JTextField cardInput1;
    private javax.swing.JTextField cardInput2;
    private javax.swing.JTextField cardInput3;
    private javax.swing.JTextField cardInput4;
    private javax.swing.JLabel cardNumberOkLabel;
    private javax.swing.JLabel cardSecurityLabel;
    private javax.swing.ButtonGroup cardTypeButtonGroup;
    private javax.swing.JLabel cardTypeLabel;
    private javax.swing.JLabel digitsInCardNumberLabel;
    private javax.swing.JLabel holderNameOkLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox monthComboBox;
    private javax.swing.JLabel secNumberOkLabel;
    private javax.swing.JFormattedTextField securityNumberTextField;
    private javax.swing.JLabel securityReminderLabel;
    private javax.swing.JRadioButton visaMasterRadioButton;
    private javax.swing.JComboBox yearComboBox;
    // End of variables declaration//GEN-END:variables
}
