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
        cardNumberTextField = new javax.swing.JFormattedTextField();
        cardHolderTextField = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(485, 300));
        setOpaque(false);
        setLayout(null);

        visaMasterRadioButton.setText("VISA/MasterCard");
        visaMasterRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaMasterRadioButtonActionPerformed(evt);
            }
        });
        add(visaMasterRadioButton);
        visaMasterRadioButton.setBounds(146, 42, 127, 25);

        americanRadioButton.setText("American Express");
        americanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                americanRadioButtonActionPerformed(evt);
            }
        });
        add(americanRadioButton);
        americanRadioButton.setBounds(291, 42, 131, 25);

        cardTypeLabel.setText("Korttyp:");
        add(cardTypeLabel);
        cardTypeLabel.setBounds(58, 46, 45, 16);

        carNumberLabel.setText("Kortnummer:");
        add(carNumberLabel);
        carNumberLabel.setBounds(27, 94, 76, 16);

        cardHolderLabel.setText("Kortinnehavare:");
        add(cardHolderLabel);
        cardHolderLabel.setBounds(12, 131, 91, 16);

        cardExpireLabel.setText("Giltighetstid:");
        add(cardExpireLabel);
        cardExpireLabel.setBounds(32, 174, 71, 16);

        cardSecurityLabel.setText("CVV2-nummer:");
        add(cardSecurityLabel);
        cardSecurityLabel.setBounds(14, 214, 89, 16);

        digitsInCardNumberLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        digitsInCardNumberLabel.setText("16 siffror");
        add(digitsInCardNumberLabel);
        digitsInCardNumberLabel.setBounds(360, 100, 39, 13);

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Januari", "Februari", "Mars", "April", "Maj", "Juni", "Juli", "Augusti", "September", "Oktober", "November", "December" }));
        add(monthComboBox);
        monthComboBox.setBounds(121, 171, 80, 22);

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        add(yearComboBox);
        yearComboBox.setBounds(246, 171, 75, 22);

        securityReminderLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        securityReminderLabel.setText("Sista 3 siffrorna på kortets baksida");
        add(securityReminderLabel);
        securityReminderLabel.setBounds(230, 220, 153, 13);

        cardHolderReminderLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        cardHolderReminderLabel.setText("Namn på kortet");
        add(cardHolderReminderLabel);
        cardHolderReminderLabel.setBounds(360, 140, 70, 13);

        securityNumberTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
        securityNumberTextField.setToolTipText("Endast siffror");
        securityNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                securityNumberTextFieldKeyReleased(evt);
            }
        });
        add(securityNumberTextField);
        securityNumberTextField.setBounds(120, 211, 66, 30);

        cardNumberOkLabel.setToolTipText("Bara siffror, inga andra tecken");
        add(cardNumberOkLabel);
        cardNumberOkLabel.setBounds(330, 90, 25, 25);

        holderNameOkLabel.setToolTipText("Endast bokstäverna A-Z");
        add(holderNameOkLabel);
        holderNameOkLabel.setBounds(330, 130, 25, 25);

        secNumberOkLabel.setToolTipText("Endast siffror");
        add(secNumberOkLabel);
        secNumberOkLabel.setBounds(200, 210, 25, 25);

        cardNumberTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        cardNumberTextField.setToolTipText("Endast siffror");
        cardNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cardNumberTextFieldKeyReleased(evt);
            }
        });
        add(cardNumberTextField);
        cardNumberTextField.setBounds(120, 91, 200, 30);

        cardHolderTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cardHolderTextFieldKeyPressed(evt);
            }
        });
        add(cardHolderTextField);
        cardHolderTextField.setBounds(120, 130, 200, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void visaMasterRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaMasterRadioButtonActionPerformed
        CustomerModel.setCardType("VISA/MasterCard");
        setDigitsLabel("VISA/MasterCard");
    }//GEN-LAST:event_visaMasterRadioButtonActionPerformed

    private void americanRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americanRadioButtonActionPerformed
        CustomerModel.setCardType("American Express");
        setDigitsLabel("American Express");
    }//GEN-LAST:event_americanRadioButtonActionPerformed

    private void cardNumberTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNumberTextFieldKeyReleased
        setOkLabel(isCardNumberCorrect(), cardNumberOkLabel);
    }//GEN-LAST:event_cardNumberTextFieldKeyReleased

    private void securityNumberTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_securityNumberTextFieldKeyReleased
        setOkLabel(isSecNumberCorrect(), secNumberOkLabel);
    }//GEN-LAST:event_securityNumberTextFieldKeyReleased

    private void cardHolderTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardHolderTextFieldKeyPressed
        setOkLabel(isCardHolderNameCorrect(), holderNameOkLabel);
    }//GEN-LAST:event_cardHolderTextFieldKeyPressed
    private void setCardInfo() {
        
        cardHolderTextField.setText(CustomerModel.getCardHolderName());
        securityNumberTextField.setText("" + CustomerModel.getCardVerification());
        monthComboBox.setSelectedIndex(CustomerModel.getCardMonth());
        yearComboBox.setSelectedIndex(CustomerModel.getCardYear());
        cardTypeButtonGroup.add(americanRadioButton);
        cardTypeButtonGroup.add(visaMasterRadioButton);
        setSelectedCardType(CustomerModel.getCardType());
        if(CustomerModel.getCardNumber().length() < 14){
            tempRealCardNbr = CustomerModel.getCardNumber();
            try{
                tempFakeCardNbr = "**** **** **** " + tempRealCardNbr.substring(15);
            }catch(StringIndexOutOfBoundsException e){                
            }
            cardNumberTextField.setText(tempFakeCardNbr);
        }
        
    }

    private void setLabels() {
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
        if (cardNumberTextField.getText().equals(tempFakeCardNbr)){
            CustomerModel.setCardNumber(tempRealCardNbr);
        } else{
            CustomerModel.setCardNumber(cardNumberTextField.getText());
        }
    }

    /**
     * @return true if card number is filled correctly
     */
    public boolean isCardNumberCorrect() {
        if (cardNumberTextField.getText().equals(tempFakeCardNbr)){
            return true;
        }
        return (CustomerModel.cardNumberTest(cardNumberTextField.getText()));
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
    private javax.swing.JLabel cardNumberOkLabel;
    private javax.swing.JFormattedTextField cardNumberTextField;
    private javax.swing.JLabel cardSecurityLabel;
    private javax.swing.ButtonGroup cardTypeButtonGroup;
    private javax.swing.JLabel cardTypeLabel;
    private javax.swing.JLabel digitsInCardNumberLabel;
    private javax.swing.JLabel holderNameOkLabel;
    private javax.swing.JComboBox monthComboBox;
    private javax.swing.JLabel secNumberOkLabel;
    private javax.swing.JFormattedTextField securityNumberTextField;
    private javax.swing.JLabel securityReminderLabel;
    private javax.swing.JRadioButton visaMasterRadioButton;
    private javax.swing.JComboBox yearComboBox;
    // End of variables declaration//GEN-END:variables
}
