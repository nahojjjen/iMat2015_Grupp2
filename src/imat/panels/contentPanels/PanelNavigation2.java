/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.contentPanels;

import imat.panels.subItems.CustomButton;
import javax.swing.ImageIcon;

/**
 *
 * @author Johan
 */
public class PanelNavigation2 extends javax.swing.JPanel {

    private ImageIcon test1 = new ImageIcon("src/resources/logoH.png");
    private ImageIcon test2 = new ImageIcon("src/resources/logoH.png");
    private ImageIcon test3 = new ImageIcon("src/resources/logoH.png");
    /**
     * Creates new form PanelNavigation2
     */
    public PanelNavigation2() {
        initComponents();
        for (int i = 0; i<10; i++){
            holder.add(new CustomButton(test1, test2, test3));
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

        holder = new javax.swing.JPanel();

        setOpaque(false);

        holder.setLayout(new java.awt.GridLayout(10, 1));
        add(holder);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel holder;
    // End of variables declaration//GEN-END:variables
}
