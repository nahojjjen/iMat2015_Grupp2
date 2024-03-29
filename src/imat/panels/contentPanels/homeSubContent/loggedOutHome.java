/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.contentPanels.homeSubContent;

import imat.IMat;
import imat.panels.contentPanels.PanelFAQ;
import java.awt.Color;
import javax.swing.ImageIcon;
import resources.homeButtons.PanelHomeButtons;

/**
 *
 * @author Johan
 */
public class loggedOutHome extends javax.swing.JPanel {

    
    private static Color almostWhite = new Color(200, 200, 200);
    private static Color hoverStripe = new Color(160, 160, 160);
    private static Color whiteStripe = new Color(120,120,120);
    private static Color blackStripe = new Color(80,80,80);
    
    private ImageIcon howToImage = new ImageIcon("src/resources/homeButtons/howToImage.png");
    private ImageIcon faqImage = new ImageIcon("src/resources/homeButtons/faqImage.png");
    
    private PanelHomeButtons howTo = new PanelHomeButtons(howToImage ,"Hur gör man?");
    private PanelHomeButtons faq = new PanelHomeButtons(faqImage ,"Frågor och Svar");
    private PanelHomeButtons offers = new PanelHomeButtons(faqImage ,"Erbjudanden");
   
    /**
     * Creates new form loggedOutHome
     */
    public loggedOutHome() {
        initComponents();
        howToPanel.add(howTo);
        faqPanel.add(faq);
        offerPanel.add(offers);
        
        howTo.setBackground(almostWhite);
        faq.setBackground(whiteStripe);
        offers.setBackground(almostWhite);
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
        howToPanel = new javax.swing.JPanel();
        faqPanel = new javax.swing.JPanel();
        offerPanel = new javax.swing.JPanel();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        howToPanel.setLayout(new java.awt.BorderLayout());
        holder.add(howToPanel);

        faqPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faqPanelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                faqPanelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                faqPanelMouseEntered(evt);
            }
        });
        faqPanel.setLayout(new java.awt.BorderLayout());
        holder.add(faqPanel);

        offerPanel.setLayout(new java.awt.BorderLayout());
        holder.add(offerPanel);

        add(holder, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void faqPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqPanelMouseClicked
        // TODO add your handling code here:
        faqPanel.setBackground(blackStripe);
        IMat.getWindow().setContent(new PanelFAQ());
    }//GEN-LAST:event_faqPanelMouseClicked

    private void faqPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqPanelMouseEntered
        // TODO add your handling code here:
        faqPanel.setBackground(hoverStripe);
    }//GEN-LAST:event_faqPanelMouseEntered

    private void faqPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqPanelMouseExited
        // TODO add your handling code here:
        faqPanel.setBackground(whiteStripe);
    }//GEN-LAST:event_faqPanelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel faqPanel;
    private javax.swing.JPanel holder;
    private javax.swing.JPanel howToPanel;
    private javax.swing.JPanel offerPanel;
    // End of variables declaration//GEN-END:variables
}
