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
public class PanelDeliveryInfo extends javax.swing.JPanel {

    private ImageIcon ok = new ImageIcon("src/resources/ok.png");
    private ImageIcon notOk = new ImageIcon("src/resources/notOk.png");

    /**
     * Creates new form PanelDeliveryInfo
     */
    public PanelDeliveryInfo() {
        initComponents();
        setTextFields();
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

        jPanel1 = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        careOfLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        careOfTextField = new javax.swing.JTextField();
        postCodeLabel = new javax.swing.JLabel();
        postAddressLabel = new javax.swing.JLabel();
        postAddressTextField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        postCodeTextField = new javax.swing.JFormattedTextField();
        phoneNumberTextField = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        informationTextArea = new javax.swing.JTextArea();
        mobileNumberTextField = new javax.swing.JFormattedTextField();
        mobileNumberLabel = new javax.swing.JLabel();
        infoTextLabel = new javax.swing.JLabel();
        infoTipTextAreaLabel = new javax.swing.JLabel();
        lastNameOk = new javax.swing.JLabel();
        postAddressOk = new javax.swing.JLabel();
        mobileOk = new javax.swing.JLabel();
        careOfOk = new javax.swing.JLabel();
        firstNameOk = new javax.swing.JLabel();
        addressOk = new javax.swing.JLabel();
        postCodeOk = new javax.swing.JLabel();
        phoneOk = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        firstNameLabel.setText("Förnamn:");
        jPanel1.add(firstNameLabel);
        firstNameLabel.setBounds(21, 13, 56, 16);

        lastNameLabel.setText("Efternamn:");
        jPanel1.add(lastNameLabel);
        lastNameLabel.setBounds(224, 13, 64, 16);

        firstNameTextField.setToolTipText("Endast A-Z tillåtet");
        firstNameTextField.setAutoscrolls(false);
        firstNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameTextFieldKeyReleased(evt);
            }
        });
        jPanel1.add(firstNameTextField);
        firstNameTextField.setBounds(21, 36, 156, 22);

        lastNameTextField.setToolTipText("Endast A-Z tillåtet");
        lastNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastNameTextFieldKeyReleased(evt);
            }
        });
        jPanel1.add(lastNameTextField);
        lastNameTextField.setBounds(224, 36, 198, 22);

        addressLabel.setText("Gaturadress:");
        jPanel1.add(addressLabel);
        addressLabel.setBounds(21, 76, 74, 16);

        careOfLabel.setText("C/O:");
        jPanel1.add(careOfLabel);
        careOfLabel.setBounds(224, 76, 27, 16);

        addressTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addressTextFieldKeyReleased(evt);
            }
        });
        jPanel1.add(addressTextField);
        addressTextField.setBounds(21, 102, 156, 22);

        careOfTextField.setToolTipText("Valfritt");
        jPanel1.add(careOfTextField);
        careOfTextField.setBounds(224, 102, 198, 22);

        postCodeLabel.setText("Postnummer:");
        jPanel1.add(postCodeLabel);
        postCodeLabel.setBounds(21, 139, 77, 16);

        postAddressLabel.setText("Postort:");
        jPanel1.add(postAddressLabel);
        postAddressLabel.setBounds(224, 139, 45, 16);

        postAddressTextField.setToolTipText("Endast bokstäverna A-Z");
        postAddressTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                postAddressTextFieldKeyReleased(evt);
            }
        });
        jPanel1.add(postAddressTextField);
        postAddressTextField.setBounds(224, 165, 198, 22);

        phoneNumberLabel.setText("Telefon:");
        jPanel1.add(phoneNumberLabel);
        phoneNumberLabel.setBounds(21, 208, 48, 16);

        postCodeTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####"))));
        postCodeTextField.setToolTipText("5 sifror");
        postCodeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                postCodeTextFieldKeyReleased(evt);
            }
        });
        jPanel1.add(postCodeTextField);
        postCodeTextField.setBounds(21, 165, 77, 22);

        phoneNumberTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        phoneNumberTextField.setToolTipText("Endast siffror");
        phoneNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneNumberTextFieldKeyReleased(evt);
            }
        });
        jPanel1.add(phoneNumberTextField);
        phoneNumberTextField.setBounds(21, 234, 156, 22);

        informationTextArea.setColumns(20);
        informationTextArea.setRows(5);
        jScrollPane1.setViewportView(informationTextArea);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(21, 300, 401, 96);

        mobileNumberTextField.setToolTipText("Endast siffror");
        jPanel1.add(mobileNumberTextField);
        mobileNumberTextField.setBounds(224, 234, 198, 22);

        mobileNumberLabel.setText("Mobil:");
        jPanel1.add(mobileNumberLabel);
        mobileNumberLabel.setBounds(224, 208, 35, 16);

        infoTextLabel.setText("Övrig information:");
        jPanel1.add(infoTextLabel);
        infoTextLabel.setBounds(21, 271, 119, 16);

        infoTipTextAreaLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        infoTipTextAreaLabel.setText("T.ex portkod eller vånings-/lägenhetsnummer");
        jPanel1.add(infoTipTextAreaLabel);
        infoTipTextAreaLabel.setBounds(147, 274, 210, 13);

        lastNameOk.setToolTipText("Endast bokstäverna A-Z");
        jPanel1.add(lastNameOk);
        lastNameOk.setBounds(427, 36, 25, 25);

        postAddressOk.setToolTipText("Endast bokstäverna A-Z");
        jPanel1.add(postAddressOk);
        postAddressOk.setBounds(427, 162, 25, 25);
        jPanel1.add(mobileOk);
        mobileOk.setBounds(427, 231, 25, 25);
        jPanel1.add(careOfOk);
        careOfOk.setBounds(427, 99, 25, 25);

        firstNameOk.setToolTipText("Endast bokstäverna A-Z");
        jPanel1.add(firstNameOk);
        firstNameOk.setBounds(186, 36, 25, 25);

        addressOk.setToolTipText("Endast bokstäver och siffror");
        jPanel1.add(addressOk);
        addressOk.setBounds(186, 99, 25, 25);

        postCodeOk.setToolTipText("Endast siffror");
        jPanel1.add(postCodeOk);
        postCodeOk.setBounds(110, 160, 25, 25);

        phoneOk.setToolTipText("Endast siffror, inga tecken");
        jPanel1.add(phoneOk);
        phoneOk.setBounds(186, 231, 25, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel1.setText("Krävs ej");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 210, 80, 13);

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel2.setText("Krävs ej");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(290, 80, 80, 13);

        add(jPanel1);
        jPanel1.setBounds(12, 13, 452, 414);
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTextFieldKeyReleased
       setOkLabel(isFirstNameCorrect(), firstNameOk);
    }//GEN-LAST:event_firstNameTextFieldKeyReleased

    private void lastNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameTextFieldKeyReleased
       setOkLabel(isLastNameCorrect(), lastNameOk);
    }//GEN-LAST:event_lastNameTextFieldKeyReleased

    private void addressTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressTextFieldKeyReleased
       setOkLabel(isAddressCorrect(), addressOk);
    }//GEN-LAST:event_addressTextFieldKeyReleased

    private void postCodeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_postCodeTextFieldKeyReleased
        setOkLabel(isPostCodeCorrect(), postCodeOk);
    }//GEN-LAST:event_postCodeTextFieldKeyReleased

    private void postAddressTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_postAddressTextFieldKeyReleased
       setOkLabel(isPostAddressCorrect(), postAddressOk);
    }//GEN-LAST:event_postAddressTextFieldKeyReleased

    private void phoneNumberTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldKeyReleased
        setOkLabel(isPhoneNumberCorrect(), phoneOk);
    }//GEN-LAST:event_phoneNumberTextFieldKeyReleased
    private void setLabels() {
        setOkLabel(isFirstNameCorrect(), firstNameOk);
        setOkLabel(isLastNameCorrect(), lastNameOk);
        setOkLabel(isAddressCorrect(), addressOk);
        setOkLabel(isPostCodeCorrect(), postCodeOk);
        setOkLabel(isPostAddressCorrect(), postAddressOk);
        setOkLabel(isPhoneNumberCorrect(), phoneOk);
    }

    private void setTextFields() {
        firstNameTextField.setText(CustomerModel.getFirstName());
        lastNameTextField.setText(CustomerModel.getLastName());
        addressTextField.setText(CustomerModel.getAddress());
        postCodeTextField.setText(CustomerModel.getPostCode());
        postAddressTextField.setText(CustomerModel.getPostAddress());
        phoneNumberTextField.setText(CustomerModel.getPhoneNumber());
    }

    public void save() {
        CustomerModel.setFirstName(firstNameTextField.getText());
        CustomerModel.setLastName(lastNameTextField.getText());
        CustomerModel.setAddress(addressTextField.getText());
        CustomerModel.setPostCode(postCodeTextField.getText());
        CustomerModel.setPostAddress(postAddressTextField.getText());
        CustomerModel.setPhoneNumber(phoneNumberTextField.getText());
    }

    public boolean isFirstNameCorrect() {
        return (CustomerModel.firstNameTest(firstNameTextField.getText()));
    }

    public boolean isLastNameCorrect() {
        return (CustomerModel.lastNameTest(lastNameTextField.getText()));
    }

    public boolean isAddressCorrect() {
        return (CustomerModel.addressTest(addressTextField.getText()));
    }

    public boolean isPostCodeCorrect() {
        return (CustomerModel.postCodeTest(postCodeTextField.getText()));
    }

    public boolean isPostAddressCorrect() {
        return (CustomerModel.postAddressTest(postAddressTextField.getText()));
    }

    public boolean isPhoneNumberCorrect() {
        return (CustomerModel.phoneNumberTest(phoneNumberTextField.getText()));
    }

    private void setOkLabel(Boolean bool, JLabel label) {
        if (bool) {
            label.setIcon(ok);
        } else {
            label.setIcon(notOk);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel addressOk;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel careOfLabel;
    private javax.swing.JLabel careOfOk;
    private javax.swing.JTextField careOfTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel firstNameOk;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel infoTextLabel;
    private javax.swing.JLabel infoTipTextAreaLabel;
    private javax.swing.JTextArea informationTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel lastNameOk;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel mobileNumberLabel;
    private javax.swing.JFormattedTextField mobileNumberTextField;
    private javax.swing.JLabel mobileOk;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JFormattedTextField phoneNumberTextField;
    private javax.swing.JLabel phoneOk;
    private javax.swing.JLabel postAddressLabel;
    private javax.swing.JLabel postAddressOk;
    private javax.swing.JTextField postAddressTextField;
    private javax.swing.JLabel postCodeLabel;
    private javax.swing.JLabel postCodeOk;
    private javax.swing.JFormattedTextField postCodeTextField;
    // End of variables declaration//GEN-END:variables
}
