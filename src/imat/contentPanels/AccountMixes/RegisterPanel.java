/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.contentPanels.AccountMixes;

import imat.IMat;
import imat.contentPanels.PanelAccountInfo;
import imat.contentPanels.PanelHome;

/**
 *
 * @author Johan Swanberg
 */
public class RegisterPanel extends javax.swing.JPanel {

    private PanelAccountInfo accPanel = new PanelAccountInfo();
    /**
     * Creates new form RegisterPanel
     */
    public RegisterPanel() {
        initComponents();
        holderPanel.add(accPanel);
        this.revalidate();
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
        joinButton = new javax.swing.JButton();
        holderPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        joinButton.setText("Gå med!");
        joinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(joinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(joinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        holderPanel.setLayout(new java.awt.BorderLayout());
        add(holderPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void joinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButtonActionPerformed
        if (accPanel.isEmailCorrect() && accPanel.isPasswordCorrect()){
            accPanel.save();
            IMat.setLoggedin(true);
            IMat.getWindow().setContent(new PanelHome());
            
        } else{
            if(!accPanel.isEmailCorrect()){
                accPanel.showEmailError();
            }
            if(!accPanel.isPasswordCorrect()){
                accPanel.showPassError();
            }
        }
    }//GEN-LAST:event_joinButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel holderPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton joinButton;
    // End of variables declaration//GEN-END:variables
}