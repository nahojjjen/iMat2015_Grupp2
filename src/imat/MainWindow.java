/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import imat.models.Model;
import imat.models.customPanelLogic.HeaderPanel;
import imat.panels.contentPanels.PanelAccountInfo;
import imat.panels.contentPanels.PanelHome;
import imat.panels.contentPanels.PanelSearchResult;
import imat.panels.modulePanels.PanelCart;
import imat.panels.modulePanels.PanelNavigation;
import imat.panels.modulePanels.PanelSearch;
import imat.panels.modulePanels.loginDefault;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Johan
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindowdr
     */
    public MainWindow() {
        initComponents();
        cacheItems();
        addModules();
        showLogo();
        fixColors();
        setIcons();
        this.setTitle("iMat");

    }
    
    /**
     * loads all items in memory when app starts, makes first 
     * result load 0.5 seconds faster.
     */
   private void  cacheItems(){
        showSearch(Model.doSearch(""));
    }

    
    private void setIcons(){
        ImageIcon icon = new ImageIcon("src/resources/stolenicon.png");
        this.setIconImage(icon.getImage());
    }
    private void fixColors(){
        //header
        headerPanel.setBackground(IMat.getHeaderColor());
        bodyPanel.setBackground(IMat.getBackgroundColor());
        contentPanel.setBackground(IMat.getAverageColor());
        
        //behind body
        //spacec.setBackground(IMat.getBackgroundColor());
        
    }
    
    public  void refreshLoggedin(){
        accountPanel.removeAll();
        accountPanel.setLayout(new BorderLayout());
        accountPanel.add(new loginDefault());
        
    }
    /**
     * adds the logo in the upper left corner, and adds a mouse listener that
     * takes the user home if he presses the logo
     */
    private void showLogo() {
        //show the logo
        BufferedImage logo = null;
        try {
            logo = ImageIO.read(new File("src/resources/logo2.png"));
        } catch (IOException e) {
            System.out.println("failed to read image");

        }
        JLabel imageLabel = new JLabel(new ImageIcon(logo));
        imageLabel.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                IMat.getWindow().setContent("Home");
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        logoPanel.add(imageLabel);
    }

    /**
     * show the updated cart content
     */
    public void refreshCart() {
        cartPanel.removeAll();
        cartPanel.setLayout(new BorderLayout());
        cartPanel.add(new PanelCart());
    }

    /**
     * add all the default start modules to the window when starting
     */
    private void addModules() {
        navigationPanel.setLayout(new java.awt.BorderLayout());
        navigationPanel.add(new PanelNavigation());

        searchPanel.setLayout(new java.awt.BorderLayout());
        searchPanel.add(new PanelSearch());

        cartPanel.setLayout(new java.awt.BorderLayout());
        cartPanel.add(new PanelCart());

        logoPanel.setLayout(new GridLayout());

        accountPanel.setLayout(new BorderLayout());
        accountPanel.add(new loginDefault());

        setContent(new PanelHome());

        //maximize window on start
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);

    }

    /**
     * set the contentpanel to show the searchresults
     * @param input 
     */
    public void showSearch(List<Product> input) {
        contentPanel.setLayout(new BorderLayout());
        contentPanel.removeAll();
        contentPanel.add(new PanelSearchResult(input));
        this.revalidate();

    }

    /**
     * show a panel by name
     *
     * @param input
     */
    public void setContent(String input) {
        contentPanel.setLayout(new BorderLayout());
        contentPanel.removeAll();
        switch (input) {
            case ("Home"):
                contentPanel.add(new PanelHome());
                break;
            case ("Profile"):
                contentPanel.add(new PanelAccountInfo());
                break;
            case ("Debugg"):
                contentPanel.add(new PanelSearchResult());
                break;

        }
        this.revalidate();
    }
    
    public void setNavPanel(JPanel panel){
        navigationPanel.setLayout(new BorderLayout());
        navigationPanel.removeAll();
        navigationPanel.add(panel);
        revalidate();
    }

    /**
     * set content to a panel
     *
     * @param panel what panel to show
     *
     */
    public void setContent(JPanel panel) {
        contentPanel.setLayout(new BorderLayout());
        contentPanel.removeAll();
        contentPanel.add(panel);
        revalidate();
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
        headerPanel = new imat.models.customPanelLogic.HeaderPanel();
        accountPanel = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        bodyPanel = new imat.models.customPanelLogic.BodyPanel();
        cartPanel = new javax.swing.JPanel();
        navigationPanel = new javax.swing.JPanel();
        spacec = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(120);
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        headerPanel.setBackground(new java.awt.Color(102, 153, 255));
        headerPanel.setMinimumSize(new java.awt.Dimension(100, 120));
        headerPanel.setPreferredSize(new java.awt.Dimension(733, 120));
        headerPanel.setLayout(new java.awt.BorderLayout());

        accountPanel.setBackground(new java.awt.Color(102, 153, 255));
        accountPanel.setOpaque(false);
        accountPanel.setPreferredSize(new java.awt.Dimension(400, 120));

        javax.swing.GroupLayout accountPanelLayout = new javax.swing.GroupLayout(accountPanel);
        accountPanel.setLayout(accountPanelLayout);
        accountPanelLayout.setHorizontalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        accountPanelLayout.setVerticalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        headerPanel.add(accountPanel, java.awt.BorderLayout.EAST);

        logoPanel.setBackground(new java.awt.Color(102, 153, 255));
        logoPanel.setMinimumSize(new java.awt.Dimension(120, 120));
        logoPanel.setOpaque(false);
        logoPanel.setPreferredSize(new java.awt.Dimension(300, 120));
        logoPanel.setLayout(new java.awt.BorderLayout());
        headerPanel.add(logoPanel, java.awt.BorderLayout.WEST);

        searchPanel.setBackground(new java.awt.Color(102, 153, 255));
        searchPanel.setOpaque(false);
        searchPanel.setPreferredSize(new java.awt.Dimension(254, 120));

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 898, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );

        headerPanel.add(searchPanel, java.awt.BorderLayout.CENTER);

        jSplitPane1.setTopComponent(headerPanel);

        bodyPanel.setLayout(new java.awt.BorderLayout());

        cartPanel.setMinimumSize(new java.awt.Dimension(220, 100));
        cartPanel.setOpaque(false);

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 878, Short.MAX_VALUE)
        );

        bodyPanel.add(cartPanel, java.awt.BorderLayout.EAST);

        navigationPanel.setMinimumSize(new java.awt.Dimension(220, 100));
        navigationPanel.setOpaque(false);

        javax.swing.GroupLayout navigationPanelLayout = new javax.swing.GroupLayout(navigationPanel);
        navigationPanel.setLayout(navigationPanelLayout);
        navigationPanelLayout.setHorizontalGroup(
            navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        navigationPanelLayout.setVerticalGroup(
            navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 878, Short.MAX_VALUE)
        );

        bodyPanel.add(navigationPanel, java.awt.BorderLayout.WEST);

        spacec.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 50, 0, 50));
        spacec.setOpaque(false);
        spacec.setLayout(new java.awt.BorderLayout());

        contentPanel.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );

        spacec.add(contentPanel, java.awt.BorderLayout.CENTER);

        bodyPanel.add(spacec, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(bodyPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

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
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel navigationPanel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JPanel spacec;
    // End of variables declaration//GEN-END:variables
}
