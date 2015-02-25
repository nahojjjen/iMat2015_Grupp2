/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.contentPanels;

import imat.IMat;
import imat.contentPanels.homeSubContent.loggedInHome;
import imat.contentPanels.homeSubContent.loggedOutHome;

/**
 *
 * @author Johan
 */
public class PanelHome extends javax.swing.JPanel {

    /**
     * Creates new form PanelHome
     */
    public PanelHome() {
        initComponents();
        if (IMat.isLoggedin()) {

            bodyPanel.add(new loggedInHome());

        } else {
            bodyPanel.add(new loggedOutHome());
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(60);
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Välkommen till iMat!");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setTopComponent(jPanel1);

        bodyPanel.setLayout(new java.awt.BorderLayout());
        jSplitPane1.setRightComponent(bodyPanel);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
