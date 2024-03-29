/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.contentPanels.homeSubContent;

import imat.IMat;
import imat.panels.contentPanels.AccountMixes.MyProfilePanel;
import imat.panels.contentPanels.AccountMixes.MyProfilePanelHolder;
import imat.panels.contentPanels.PanelAccountInfo;
import imat.panels.contentPanels.PanelEarlierCarts;
import imat.panels.contentPanels.PanelFAQ;
import imat.panels.contentPanels.PanelHome;
import imat.panels.contentPanels.PanelLastCart;
import imat.panels.contentPanels.PanelSearchResult;
import java.awt.Color;
import javax.swing.ImageIcon;
import resources.homeButtons.PanelHomeButtons;
import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * @author Johan
 */
public class loggedInHome extends javax.swing.JPanel {
    
    private static Color almostWhite = new Color(200, 200, 200);
    private static Color hoverStripe = new Color(160, 160, 160);
    private static Color whiteStripe = new Color(120,120,120);
    private static Color blackStripe = new Color(80,80,80);
    
    private ImageIcon onGoingImage = new ImageIcon("src/resources/homeButtons/onGoingImage.png");
    private ImageIcon earlierImage = new ImageIcon("src/resources/homeButtons/earlierImage.png");
    private ImageIcon profileImage = new ImageIcon("src/resources/homeButtons/profileImage.png");
    private ImageIcon howToImage = new ImageIcon("src/resources/homeButtons/howToImage.png");
    private ImageIcon faqImage = new ImageIcon("src/resources/homeButtons/faqImage.png");
    
    private PanelHomeButtons onGoingOrder = new PanelHomeButtons(onGoingImage, "Nuvarande beställning");
    private PanelHomeButtons earlierOrders = new PanelHomeButtons(earlierImage ,"Tidigare beställningar");
    private PanelHomeButtons myAccount = new PanelHomeButtons(profileImage ,"Mitt konto");
    private PanelHomeButtons howTo = new PanelHomeButtons(howToImage ,"Hur gör man?");
    private PanelHomeButtons faq = new PanelHomeButtons(faqImage ,"Frågor och Svar");
    private PanelHomeButtons offers = new PanelHomeButtons(faqImage ,"Erbjudanden");
    
    /**
     * Creates new form loggedInHome
     */
    public loggedInHome() {
        initComponents();
        
        onGoingPanel.add(onGoingOrder);
        earlierPanel.add(earlierOrders);
        profilePanel.add(myAccount);
        howToPanel.add(howTo);
        faqPanel.add(faq);
        offerPanel.add(offers);
        
        onGoingOrder.setBackground(blackStripe);
        earlierOrders.setBackground(blackStripe);
        myAccount.setBackground(blackStripe);
        howTo.setBackground(blackStripe);
        faq.setBackground(blackStripe);
        offers.setBackground(blackStripe);
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
        onGoingPanel = new javax.swing.JPanel();
        earlierPanel = new javax.swing.JPanel();
        profilePanel = new javax.swing.JPanel();
        howToPanel = new javax.swing.JPanel();
        faqPanel = new javax.swing.JPanel();
        offerPanel = new javax.swing.JPanel();

        setOpaque(false);

        holder.setOpaque(false);
        holder.setLayout(new java.awt.GridLayout(2, 3, 5, 5));

        onGoingPanel.setBackground(new java.awt.Color(0, 0, 0));
        onGoingPanel.setOpaque(false);
        onGoingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onGoingPanelMouseClicked(evt);
            }
        });
        onGoingPanel.setLayout(new java.awt.BorderLayout());
        holder.add(onGoingPanel);

        earlierPanel.setBackground(new java.awt.Color(0, 0, 0));
        earlierPanel.setOpaque(false);
        earlierPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                earlierPanelMouseClicked(evt);
            }
        });
        earlierPanel.setLayout(new java.awt.BorderLayout());
        holder.add(earlierPanel);

        profilePanel.setBackground(new java.awt.Color(0, 0, 0));
        profilePanel.setOpaque(false);
        profilePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilePanelMouseClicked(evt);
            }
        });
        profilePanel.setLayout(new java.awt.BorderLayout());
        holder.add(profilePanel);

        howToPanel.setBackground(new java.awt.Color(0, 0, 0));
        howToPanel.setOpaque(false);
        howToPanel.setLayout(new java.awt.BorderLayout());
        holder.add(howToPanel);

        faqPanel.setBackground(new java.awt.Color(0, 0, 0));
        faqPanel.setOpaque(false);
        faqPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faqPanelMouseClicked(evt);
            }
        });
        faqPanel.setLayout(new java.awt.BorderLayout());
        holder.add(faqPanel);

        offerPanel.setBackground(new java.awt.Color(0, 0, 0));
        offerPanel.setOpaque(false);
        offerPanel.setLayout(new java.awt.BorderLayout());
        holder.add(offerPanel);

        add(holder);
    }// </editor-fold>//GEN-END:initComponents

    private void onGoingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onGoingPanelMouseClicked
        // TODO add your handling code here:
        onGoingPanel.setBackground(blackStripe);
        IMat.getWindow().setContent(new PanelLastCart());
    }//GEN-LAST:event_onGoingPanelMouseClicked

    private void earlierPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earlierPanelMouseClicked
        // TODO add your handling code here:
        earlierPanel.setBackground(blackStripe);
        IMat.getWindow().setContent(new PanelEarlierCarts());
    }//GEN-LAST:event_earlierPanelMouseClicked

    private void profilePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilePanelMouseClicked
        // TODO add your handling code here:
        profilePanel.setBackground(blackStripe);
        IMat.getWindow().setContent(new MyProfilePanelHolder());
    }//GEN-LAST:event_profilePanelMouseClicked

    private void faqPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqPanelMouseClicked
        // TODO add your handling code here:
        faqPanel.setBackground(blackStripe);
        IMat.getWindow().setContent(new PanelFAQ());
    }//GEN-LAST:event_faqPanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel earlierPanel;
    private javax.swing.JPanel faqPanel;
    private javax.swing.JPanel holder;
    private javax.swing.JPanel howToPanel;
    private javax.swing.JPanel offerPanel;
    private javax.swing.JPanel onGoingPanel;
    private javax.swing.JPanel profilePanel;
    // End of variables declaration//GEN-END:variables
}
