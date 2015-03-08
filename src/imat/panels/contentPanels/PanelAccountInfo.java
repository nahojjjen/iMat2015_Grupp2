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
public class PanelAccountInfo extends javax.swing.JPanel {

    private ImageIcon ok = new ImageIcon("src/resources/ok.png");
    private ImageIcon notOk = new ImageIcon("src/resources/notOk.png");

    /**
     * Creates new form PanelAccount
     */
    public PanelAccountInfo() {
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

        emailLabel = new javax.swing.JLabel();
        repeatEmailLabel = new javax.swing.JLabel();
        repeatEmailTextField = new javax.swing.JTextField();
        newPasswordLabel = new javax.swing.JLabel();
        repeatPasswordLabel = new javax.swing.JLabel();
        newPasswordTextField = new javax.swing.JPasswordField();
        repeatPasswordTextField = new javax.swing.JPasswordField();
        passwordErrorLabel = new javax.swing.JLabel();
        emailOk = new javax.swing.JLabel();
        repeatEmailOk = new javax.swing.JLabel();
        passOk = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        repeatPassOk = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(400, 230));
        setOpaque(false);
        setLayout(null);

        emailLabel.setText("E-post:");
        add(emailLabel);
        emailLabel.setBounds(12, 13, 41, 16);

        repeatEmailLabel.setText("Repetera e-post:");
        add(repeatEmailLabel);
        repeatEmailLabel.setBounds(12, 68, 97, 16);

        repeatEmailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                repeatEmailTextFieldKeyReleased(evt);
            }
        });
        add(repeatEmailTextField);
        repeatEmailTextField.setBounds(12, 91, 308, 30);

        newPasswordLabel.setText("Nytt lösenord:");
        add(newPasswordLabel);
        newPasswordLabel.setBounds(12, 149, 80, 16);

        repeatPasswordLabel.setText("Repetera lösenord:");
        add(repeatPasswordLabel);
        repeatPasswordLabel.setBounds(186, 149, 110, 16);

        newPasswordTextField.setToolTipText("Minst 4 tecken långt");
        newPasswordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                newPasswordTextFieldKeyReleased(evt);
            }
        });
        add(newPasswordTextField);
        newPasswordTextField.setBounds(12, 170, 130, 30);

        repeatPasswordTextField.setToolTipText("Minst 4 tecken långt");
        repeatPasswordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                repeatPasswordTextFieldKeyReleased(evt);
            }
        });
        add(repeatPasswordTextField);
        repeatPasswordTextField.setBounds(186, 172, 130, 30);

        passwordErrorLabel.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        add(passwordErrorLabel);
        passwordErrorLabel.setBounds(12, 137, 334, 5);

        emailOk.setToolTipText("Måste innehålla @ och . samt vara minst 7 tecken långt");
        add(emailOk);
        emailOk.setBounds(330, 40, 25, 25);

        repeatEmailOk.setToolTipText("Måste innehålla @ och . samt vara minst 7 tecken långt");
        add(repeatEmailOk);
        repeatEmailOk.setBounds(330, 90, 25, 25);
        add(passOk);
        passOk.setBounds(151, 172, 25, 25);

        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyReleased(evt);
            }
        });
        add(emailTextField);
        emailTextField.setBounds(12, 36, 308, 30);

        repeatPassOk.setToolTipText("Minst 4 tecken långt");
        add(repeatPassOk);
        repeatPassOk.setBounds(321, 172, 25, 25);
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyReleased
        setOkLabel(isEmailCorrect(), emailOk);
    }//GEN-LAST:event_emailTextFieldKeyReleased

    private void repeatEmailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repeatEmailTextFieldKeyReleased
         setOkLabel(isBothEmailCorrect(), repeatEmailOk);
    }//GEN-LAST:event_repeatEmailTextFieldKeyReleased

    private void newPasswordTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPasswordTextFieldKeyReleased
        setOkLabel(isPasswordCorrect(), passOk);
    }//GEN-LAST:event_newPasswordTextFieldKeyReleased

    private void repeatPasswordTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repeatPasswordTextFieldKeyReleased
               setOkLabel(isBothPasswordCorrect(), repeatPassOk);
        if(!isBothPasswordCorrect()){
            passwordErrorLabel.setText("Lösenorden stämmer inte överrens");
        }
    }//GEN-LAST:event_repeatPasswordTextFieldKeyReleased
    private void setLabels() {
        setOkLabel(isPasswordCorrect(), passOk);
        setOkLabel(isBothPasswordCorrect(), repeatPassOk);
        setOkLabel(isEmailCorrect(), emailOk);
        setOkLabel(isBothEmailCorrect(), repeatEmailOk);
    }

    private void setTextFields() {
        emailTextField.setText(CustomerModel.getEmail());
        newPasswordTextField.setText(CustomerModel.getPassword());
    }

    /**
     * Saves both fields
     */
    public void save() {
        CustomerModel.setPassword(newPasswordTextField.getText());
        CustomerModel.setEmail(emailTextField.getText());
    }

    /**
     * check if email is filled in correctly
     *
     * @return true if both emails are correct
     */
    public boolean isEmailCorrect() {
        return (CustomerModel.emailTest(emailTextField.getText()));
    }

    /**
     * check if both email addresses is filled in correctly
     *
     * @return true if both emails are correct
     */
    public boolean isBothEmailCorrect() {
        return (CustomerModel.emailTest(emailTextField.getText())
                && emailTextField.getText().equals(repeatEmailTextField.getText()));
    }

    /**
     * check if passwordfield is correct
     *
     * @return true if correct
     */
    public boolean isPasswordCorrect() {
        return (CustomerModel.passwordTest(newPasswordTextField.getText()));
    }

    /**
     * check if both passwordfields are correct
     *
     * @return true if both are correct and matching
     */
    public boolean isBothPasswordCorrect() {
        return (newPasswordTextField.getText().equals(repeatPasswordTextField.getText())
                && CustomerModel.passwordTest(newPasswordTextField.getText()));
    }

    private void setOkLabel(Boolean bool, JLabel label) {
        if (bool) {
            label.setIcon(ok);
        } else {
            label.setIcon(notOk);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailOk;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JPasswordField newPasswordTextField;
    private javax.swing.JLabel passOk;
    private javax.swing.JLabel passwordErrorLabel;
    private javax.swing.JLabel repeatEmailLabel;
    private javax.swing.JLabel repeatEmailOk;
    private javax.swing.JTextField repeatEmailTextField;
    private javax.swing.JLabel repeatPassOk;
    private javax.swing.JLabel repeatPasswordLabel;
    private javax.swing.JPasswordField repeatPasswordTextField;
    // End of variables declaration//GEN-END:variables
}
