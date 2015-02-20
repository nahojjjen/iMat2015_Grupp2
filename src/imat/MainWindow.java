/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import imat.panels.PanelCart;
import imat.panels.PanelNavigation;
import imat.panels.PanelResultTest;
import imat.panels.PanelSearch;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Johan this is the main window, it should only house other panels that
 * change.
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindowdr
     */
    public MainWindow() {
        initComponents();
        navigationPanel.setLayout(new java.awt.BorderLayout());
        navigationPanel.add(new PanelNavigation());
        searchPanel.setLayout(new java.awt.BorderLayout());
        searchPanel.add(new PanelSearch());
        cartPanel.setLayout(new java.awt.BorderLayout());
        cartPanel.add(new PanelCart());
        contentPanel.setLayout(new java.awt.BorderLayout());
        contentPanel.add(new PanelResultTest());
        logoPanel.setLayout(new GridLayout());

        //show the logo
        BufferedImage logo = null;
        try {
            logo = ImageIO.read(new File("src/resources/logo.jpg"));
        } catch (IOException e) {
            System.out.println("failed to read image");
            
        }
        JLabel imageLabel = new JLabel(new ImageIcon(logo));
        logoPanel.add(imageLabel);
        
    }

    public void showSearch(List<Product> input) {
        System.out.println("MainWindow trying to showsearch");
        contentPanel.setLayout(new BorderLayout());
        contentPanel.removeAll();
        contentPanel.add(new PanelResultTest(input));
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

        spacePanel = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        accountPanel = new javax.swing.JPanel();
        cartPanel = new javax.swing.JPanel();
        navigationPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 700));

        spacePanel.setBackground(new java.awt.Color(51, 51, 255));
        spacePanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 0, 20));
        spacePanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        spacePanel.add(contentPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(spacePanel, java.awt.BorderLayout.CENTER);

        headerPanel.setBackground(new java.awt.Color(102, 255, 102));
        headerPanel.setPreferredSize(new java.awt.Dimension(200, 120));
        headerPanel.setLayout(new java.awt.BorderLayout());

        logoPanel.setBackground(new java.awt.Color(255, 51, 255));
        logoPanel.setPreferredSize(new java.awt.Dimension(250, 150));

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        headerPanel.add(logoPanel, java.awt.BorderLayout.WEST);

        searchPanel.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        headerPanel.add(searchPanel, java.awt.BorderLayout.CENTER);

        accountPanel.setBackground(new java.awt.Color(51, 51, 255));
        accountPanel.setPreferredSize(new java.awt.Dimension(250, 0));

        javax.swing.GroupLayout accountPanelLayout = new javax.swing.GroupLayout(accountPanel);
        accountPanel.setLayout(accountPanelLayout);
        accountPanelLayout.setHorizontalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        accountPanelLayout.setVerticalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        headerPanel.add(accountPanel, java.awt.BorderLayout.EAST);

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        cartPanel.setPreferredSize(new java.awt.Dimension(220, 464));

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        getContentPane().add(cartPanel, java.awt.BorderLayout.EAST);

        navigationPanel.setPreferredSize(new java.awt.Dimension(220, 464));

        javax.swing.GroupLayout navigationPanelLayout = new javax.swing.GroupLayout(navigationPanel);
        navigationPanel.setLayout(navigationPanelLayout);
        navigationPanelLayout.setHorizontalGroup(
            navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        navigationPanelLayout.setVerticalGroup(
            navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        getContentPane().add(navigationPanel, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountPanel;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel navigationPanel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JPanel spacePanel;
    // End of variables declaration//GEN-END:variables
}
