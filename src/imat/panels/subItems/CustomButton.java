/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.subItems;

import javax.swing.ImageIcon;

/**
 *
 * @author Johan
 */
public class CustomButton extends javax.swing.JPanel {
    
    private ImageIcon normal;
    private ImageIcon hover;
    private ImageIcon pressed;

      /**
     * Creates new form CustomButton
     */
    public CustomButton(ImageIcon normali, ImageIcon hoveri, ImageIcon pressedi) {
        initComponents();
        normal=normali;
        hover = hoveri;
        pressed = pressedi;
        thisButton.setText("");
        thisButton.setIcon(normal);
    }
    
    private void setIcon(ImageIcon icon){
        thisButton.setIcon(icon);
    }
    /**
     * Creates new form CustomButton
     */
    public CustomButton() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        thisButton = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        thisButton.setText("jLabel1");
        thisButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thisButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                thisButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                thisButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                thisButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                thisButtonMouseReleased(evt);
            }
        });
        add(thisButton, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void thisButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thisButtonMousePressed
        setIcon(pressed);// TODO add your handling code here:
    }//GEN-LAST:event_thisButtonMousePressed

    private void thisButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thisButtonMouseReleased
        setIcon(normal); // TODO add your handling code here:
    }//GEN-LAST:event_thisButtonMouseReleased

    private void thisButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thisButtonMouseExited
        setIcon(normal);        // TODO add your handling code here:
    }//GEN-LAST:event_thisButtonMouseExited

    private void thisButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thisButtonMouseEntered
        setIcon(hover);        // TODO add your handling code here:
    }//GEN-LAST:event_thisButtonMouseEntered

    private void thisButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thisButtonMouseClicked
      
    }//GEN-LAST:event_thisButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel thisButton;
    // End of variables declaration//GEN-END:variables
}
