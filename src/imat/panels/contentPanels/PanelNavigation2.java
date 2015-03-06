/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.contentPanels;

import imat.models.navPanelActionListeners.Debug2;
import imat.models.navPanelActionListeners.debug;
import imat.panels.subItems.CustomButton;
import javax.swing.ImageIcon;

/**
 *
 * @author Johan
 */
public class PanelNavigation2 extends javax.swing.JPanel {

    //all icon declerations will be here:
    private ImageIcon test1 = new ImageIcon("src/resources/logoH.png");
    private ImageIcon test2 = new ImageIcon("src/resources/logoH.png");
    private ImageIcon test3 = new ImageIcon("src/resources/logoH.png");
    private ImageIcon tt1 = new ImageIcon("src/resources/1.png");
    private ImageIcon tt2 = new ImageIcon("src/resources/2.png");
    
    
    /**
     * Creates new form PanelNavigation2
     */
    public PanelNavigation2() {
        initComponents();
        addShowingButtons();
       
    }

    private void addShowingButtons(){
        //debugg code:
        CustomButton btn = new CustomButton(tt1, tt2, test1, new Debug2());
        
        holder.add(btn);
         
         //add static buttons (including giving them listeners)
         addStaticButtons1();
         //add dynamic buttons, aka check if categories are expanded.
         addShowingCategoryButtons();
         
         //add last static buttons
         addStaticButtons2();
    }
    
    private void addShowingCategoryButtons(){
        System.out.println("navpanel: trying to add categoryButtons");
    }
    
    private void addStaticButtons1(){
        System.out.println("navpanel: trying to add static buttons 1");
    }
    private void addStaticButtons2(){
        System.out.println("navpanel: trying to add static buttons 2");
    }
    /**
     * call this whenever the panel should force-update
     */
    private void refresh(){
        holder.removeAll();
        addShowingButtons();
        revalidate();
        repaint();
        
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
