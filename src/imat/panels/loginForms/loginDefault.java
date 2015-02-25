/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.loginForms;

import imat.CustomerModel;
import imat.IMat;
import imat.Model;
import imat.contentPanels.AccountMixes.RegisterPanel;
import java.awt.Color;

/**
 *
 * @author Johan
 */
public class loginDefault extends javax.swing.JPanel {

    private boolean visible = true;

    /**
     * Creates new form loginDefault
     */
    public loginDefault() {
        initComponents();
        fixLogin();
        toggleVisibleButtons();
        fixColor();
        
    }

    private void fixLogin(){
        if (IMat.isLoggedin()){
            toggleTexts();
        }
    }
    private void fixColor(){
        System.out.println("sdasda");
        formPanel.setBackground(IMat.getHeaderColor());
        buttonPanel.setBackground(IMat.getHeaderColor());
        filler.setBackground(IMat.getHeaderColor());
    
    }
    private void toggleVisibleButtons() {

        if (visible == false) {
            usernameInput.setVisible(true);
            passwordInput.setVisible(true);
            okLoginButton.setVisible(true);
            visible = true;
        } else {
            usernameInput.setVisible(false);
            passwordInput.setVisible(false);
            okLoginButton.setVisible(false);
            visible=false;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        joinButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        formPanel = new javax.swing.JPanel();
        usernameInput = new javax.swing.JTextField();
        filler = new javax.swing.JPanel();
        passwordInput = new javax.swing.JPasswordField();
        okLoginButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        buttonPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 20, 0, 20));
        buttonPanel.setPreferredSize(new java.awt.Dimension(300, 40));
        buttonPanel.setLayout(new java.awt.GridLayout(1, 2, 20, 10));

        joinButton.setText("Gå med");
        joinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(joinButton);

        loginButton.setText("Logga in");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(loginButton);

        add(buttonPanel, java.awt.BorderLayout.NORTH);

        formPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 20, 20));
        formPanel.setPreferredSize(new java.awt.Dimension(300, 80));
        formPanel.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        usernameInput.setText("Email");
        usernameInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameInputFocusLost(evt);
            }
        });
        formPanel.add(usernameInput);

        javax.swing.GroupLayout fillerLayout = new javax.swing.GroupLayout(filler);
        filler.setLayout(fillerLayout);
        fillerLayout.setHorizontalGroup(
            fillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        fillerLayout.setVerticalGroup(
            fillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        formPanel.add(filler);

        passwordInput.setText("Password");
        passwordInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordInputFocusGained(evt);
            }
        });
        formPanel.add(passwordInput);

        okLoginButton.setText("Ok");
        okLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okLoginButtonActionPerformed(evt);
            }
        });
        formPanel.add(okLoginButton);

        add(formPanel, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if (IMat.isLoggedin()){
            IMat.setLoggedin(false);
            System.out.println("logged out");
            toggleTexts();
        }
        toggleVisibleButtons();
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void joinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButtonActionPerformed
        IMat.getWindow().setContent(new RegisterPanel());
    }//GEN-LAST:event_joinButtonActionPerformed

    private void okLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okLoginButtonActionPerformed
      
        
        
        if(usernameInput.getText().equals(CustomerModel.getEmail()) && passwordInput.getText().equals(CustomerModel.getPassword())){
           System.out.println("match, loggin in");
           usernameInput.setBackground(Color.white);
           passwordInput.setBackground(Color.white);
           toggleVisibleButtons();
           loginButton.setText("Logout");
           joinButton.setText("Profil");
           IMat.setLoggedin(true);
           
       }else{
           System.out.println("username is " + CustomerModel.getEmail());
           System.out.println("password is " + CustomerModel.getPassword());
           Color errorColor = new Color(255,180,180);
           usernameInput.setBackground(errorColor);
           passwordInput.setBackground(errorColor);
       }
    }//GEN-LAST:event_okLoginButtonActionPerformed

    private void usernameInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameInputFocusGained
        if(usernameInput.getText().equals("Email")){
            usernameInput.setText("");
        }
    }//GEN-LAST:event_usernameInputFocusGained

    private void usernameInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameInputFocusLost
         if(usernameInput.getText().equals("")){
            usernameInput.setText("Email");
        }
    }//GEN-LAST:event_usernameInputFocusLost

    private void passwordInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordInputFocusGained
        passwordInput.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputFocusGained

    private void toggleTexts(){
        if(IMat.isLoggedin()){
            loginButton.setText("Logout");
        joinButton.setText("Profil");
        }else{
        loginButton.setText("Logga in");
        joinButton.setText("Gå med");
    }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel filler;
    private javax.swing.JPanel formPanel;
    private javax.swing.JButton joinButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton okLoginButton;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JTextField usernameInput;
    // End of variables declaration//GEN-END:variables
}
