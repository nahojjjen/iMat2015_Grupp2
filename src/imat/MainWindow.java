/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import imat.models.Model;
import imat.panels.ProductDetailPopUp;
import imat.panels.contentPanels.AccountMixes.MyProfilePanelHolder;
import imat.panels.contentPanels.AccountMixes.RegisterPanel;
import imat.panels.contentPanels.PanelEarlierCarts;
import imat.panels.contentPanels.PanelFAQ;
import imat.panels.contentPanels.PanelHome;
import imat.panels.contentPanels.PanelLastCart;
import imat.panels.modulePanels.PanelNavigation2;
import imat.panels.contentPanels.PanelSearchResult;
import imat.panels.contentPanels.buyingPanels.ConfirmOrderInfo;
import imat.panels.contentPanels.buyingPanels.PanelConfirm;
import imat.panels.contentPanels.buyingPanels.PanelDoneShopping;
import imat.panels.contentPanels.buyingPanels.PanelInfoFill;
import imat.panels.modulePanels.PanelCart;
import imat.panels.modulePanels.PanelSearch;
import imat.panels.modulePanels.loginDefault;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Johan Swanberg
 */
public class MainWindow extends javax.swing.JFrame {

    private  JLabel imageLabel;
    private ImageIcon logo;
    private ImageIcon logoH;
    private PanelCart cartModule = new PanelCart();
    private JDialog currentDialog;
    private static int wizardStep = 0;
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        cacheItems();
        addModules();
        showLogo();
        fixColors();
        setIcons();
        this.setTitle("iMat");
        refreshLoggedin();
        imageLabel.requestFocusInWindow(); //makes sure "search" prompt is active when program first started
        

    }
    
    public void setWizardStep(int i){
        wizardStep = i;
    }
    public int getWizardstep(){
        return wizardStep;
    }
    
    public JMenu getRecentlyDeletedMenu(){
        return recentlyDeletedMenu;
    }
            
            /**
     * loads all items in memory when app starts, makes first 
     * result load 0.5 seconds faster.
     */
   private void  cacheItems(){
        showSearch(Model.doSearch(""));
    }

    /**
     * set the icon in the program decoration and tasbar 
     */
    private void setIcons(){
        ImageIcon icon = new ImageIcon("src/resources/Icon.png");
        this.setIconImage(icon.getImage());
    }
    
    /**
     * set the colors of the program to the defined palette, unused
     */
    private void fixColors(){
        //header
        //headerPanel.setBackground(IMat.getHeaderColor());
        //bodyPanel.setBackground(IMat.getBackgroundColor());
        //contentPanel.setBackground(IMat.getAverageColor());
    }
    
    
    /**
     * removes and creates a new logged in panel in the upper right corner, 
     * the panel changes depending on if the user is logged in or not
     */
    public  void refreshLoggedin(){
        menuLogout.setEnabled(false);
        loginMenu.setEnabled(IMat.isLoggedin());
        
        accountPanel.removeAll();
        accountPanel.setLayout(new BorderLayout());
        accountPanel.add(new loginDefault());
        
    }
    
    /**
     * removes and creates a new nav-box, used when expanding categories
     */
    public void refreshNavBox(){
        navigationPanel.removeAll();
        navigationPanel.add(new PanelNavigation2());
        revalidate();
        repaint();
    }
    
    /**
     * adds the logo in the upper left corner, and adds a mouse listener that
     * takes the user home if he presses the logo
     */
    private void showLogo() {
        //show the logo
        BufferedImage blogo = null;
        BufferedImage blogoH = null;
        try {
            blogo = ImageIO.read(new File("src/resources/logo.png"));
            blogoH = ImageIO.read(new File("src/resources/logoH.png"));
            logo = new ImageIcon(blogo);
            logoH = new ImageIcon(blogoH);
        } catch (IOException e) {
            System.out.println("failed to read image");

        }
        imageLabel = new JLabel(logo);
        imageLabel.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                IMat.getWindow().setContent(new PanelHome());
                
        IMat.getWindow().requestFocus();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                imageLabel.setIcon(logoH);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                imageLabel.setIcon(logo);
            }
        });
        logoPanel.add(imageLabel);
    }

    public void openProductPopup(Product product){
        closeCurrentPopup();
        
        JDialog popup = new JDialog(IMat.getWindow());
        popup.setAlwaysOnTop(true);
        currentDialog = popup;
        
        int width = IMat.getWindow().getWidth();
        int height =IMat.getWindow().getHeight();
        popup.setLocation((width/2)-400, height/2 - 350);
        popup.setUndecorated(true);
          
        popup.setSize(780, 780);
      
        popup.add(new ProductDetailPopUp(product, popup));
        popup.setVisible(true);
    }

    private void closeCurrentPopup(){
        if (currentDialog != null){
            currentDialog.dispose();
        }
    }
    /**
     * show the updated cart content by removing and creating a new cart
     */
    public void refreshCart() {
        cartPanel.removeAll();
        cartPanel.setLayout(new BorderLayout());
        cartPanel.add(cartPanel);
    }

    /**
     * get the current cart module
     * @return 
     */
    public PanelCart getCart(){
        return cartModule;
    }
    
    /**
     * add all the default start modules to the window when starting
     */
    private void addModules() {
        navigationPanel.setLayout(new java.awt.BorderLayout());
        //navigationPanel.add(new PanelNavigation());
        navigationPanel.add(new PanelNavigation2());
        searchPanel.setLayout(new java.awt.BorderLayout());
        searchPanel.add(new PanelSearch());

        cartPanel.setLayout(new java.awt.BorderLayout());
        cartPanel.add(cartModule);

        logoPanel.setLayout(new GridLayout());

        accountPanel.setLayout(new BorderLayout());
        accountPanel.add(new loginDefault());

        setContent(new PanelHome());

        //maximize window on start
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);

    }

    /**
     * set the contentpanel to show a searchresultpane with the specified items
     * @param input 
     */
    public void showSearch(List<Product> input) {
        contentPanel.setLayout(new BorderLayout());
        contentPanel.removeAll();
        contentPanel.add(new PanelSearchResult(input));
        this.revalidate();
    }
    /**
     * set the contentpanel to show a searchresultpane with the specified items, and changes the title
     * @param input 
     */
    public void showSearch(List<Product> input, String searchTerm) {
        contentPanel.setLayout(new BorderLayout());
        contentPanel.removeAll();
        contentPanel.add(new PanelSearchResult(input, searchTerm));
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

        views = new javax.swing.ButtonGroup();
        sortingWays = new javax.swing.ButtonGroup();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        iMat = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenuItem();
        loginMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        avsluta = new javax.swing.JMenuItem();
        redigera = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        recentlyDeletedMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem6 = new javax.swing.JRadioButtonMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        groupedCheckbox = new javax.swing.JCheckBoxMenuItem();
        visa = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        Om = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBackground(imat.IMat.getBackgroundColor());
        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerLocation(120);
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        headerPanel.setBackground(new java.awt.Color(102, 255, 51));
        headerPanel.setMinimumSize(new java.awt.Dimension(100, 120));
        headerPanel.setOpaque(false);
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
        searchPanel.setRequestFocusEnabled(false);

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        headerPanel.add(searchPanel, java.awt.BorderLayout.CENTER);

        jSplitPane1.setTopComponent(headerPanel);

        bodyPanel.setOpaque(false);
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
            .addGap(0, 859, Short.MAX_VALUE)
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
            .addGap(0, 859, Short.MAX_VALUE)
        );

        bodyPanel.add(navigationPanel, java.awt.BorderLayout.WEST);

        spacec.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 25, 10, 25));
        spacec.setOpaque(false);
        spacec.setLayout(new java.awt.BorderLayout());

        contentPanel.setBackground(imat.IMat.getAverageColor());

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 839, Short.MAX_VALUE)
        );

        spacec.add(contentPanel, java.awt.BorderLayout.CENTER);

        bodyPanel.add(spacec, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(bodyPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        iMat.setText("iMat");

        menuLogout.setText("Logga in");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        iMat.add(menuLogout);

        loginMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        loginMenu.setText("Logga ut");
        loginMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuActionPerformed(evt);
            }
        });
        iMat.add(loginMenu);
        iMat.add(jSeparator1);

        avsluta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        avsluta.setMnemonic('1');
        avsluta.setText("Avsluta");
        avsluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avslutaActionPerformed(evt);
            }
        });
        iMat.add(avsluta);

        jMenuBar1.add(iMat);

        redigera.setText("Redigera");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Rensa varukorg");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        redigera.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Ångra rensa");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        redigera.add(jMenuItem4);
        redigera.add(jSeparator2);

        recentlyDeletedMenu.setText("Nyligen borttagna");
        redigera.add(recentlyDeletedMenu);

        jMenuBar1.add(redigera);

        jMenu2.setText("Sök");

        jRadioButtonMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        views.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Visa GridVy");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem1);

        jRadioButtonMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        views.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setText("Visa ListVy");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem2);

        jRadioButtonMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        views.add(jRadioButtonMenuItem3);
        jRadioButtonMenuItem3.setText("Visa DetaljVy");
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem3);
        jMenu2.add(jSeparator3);

        jRadioButtonMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        sortingWays.add(jRadioButtonMenuItem4);
        jRadioButtonMenuItem4.setText("Sortera på Pris");
        jRadioButtonMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem4);

        jRadioButtonMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        sortingWays.add(jRadioButtonMenuItem5);
        jRadioButtonMenuItem5.setText("Sortera Alfabetiskt");
        jRadioButtonMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem5);

        jRadioButtonMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
        sortingWays.add(jRadioButtonMenuItem6);
        jRadioButtonMenuItem6.setSelected(true);
        jRadioButtonMenuItem6.setText("Sortera på sortiment ID");
        jRadioButtonMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem6);
        jMenu2.add(jSeparator5);

        groupedCheckbox.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        groupedCheckbox.setSelected(true);
        groupedCheckbox.setText("Gruppera sökresultat");
        groupedCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupedCheckboxActionPerformed(evt);
            }
        });
        jMenu2.add(groupedCheckbox);

        jMenuBar1.add(jMenu2);

        visa.setText("Navigering");

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Hem");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        visa.add(jMenuItem11);
        visa.add(jSeparator7);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Profil");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        visa.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Historik");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        visa.add(jMenuItem13);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Pågående beställning");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        visa.add(jMenuItem14);
        visa.add(jSeparator4);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem16.setText("Visa alla varor");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        visa.add(jMenuItem16);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Min nuvarande kundvagn");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        visa.add(jMenuItem1);
        visa.add(jSeparator6);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Gå till köp");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        visa.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Nästa köpsteg");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        visa.add(jMenuItem6);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Tidigare köpsteg");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        visa.add(jMenuItem9);

        jMenuBar1.add(visa);

        Om.setText("Hjälp");

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setText("F.A.Q");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        Om.add(jMenuItem15);

        jMenuBar1.add(Om);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avslutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avslutaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_avslutaActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        PanelSearchResult.setLoadWay(2);
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        IMat.getWindow().getCart().clearCart();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       IMat.getWindow().getCart().regretClear();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        IMat.getWindow().setContent(new PanelFAQ());
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       IMat.getWindow().setContent(new PanelHome());
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        if(IMat.isLoggedin()){
            IMat.getWindow().setContent(new MyProfilePanelHolder());
        }else{
             IMat.getWindow().setContent(new RegisterPanel());
        }
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
       IMat.getWindow().setContent(new PanelEarlierCarts());
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        IMat.getWindow().setContent(new PanelLastCart());
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        IMat.getWindow().showSearch(Model.doSearch(""), "Alla varor");
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if (Model.getShoppingcart().getItems().size() > 0){
            IMat.getWindow().setContent(new PanelConfirm());
        }
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        int wizardStep=IMat.getWindow().getWizardstep();
        if (wizardStep < 4) {
            openWizardStep(wizardStep+1);
            IMat.getWindow().setWizardStep(wizardStep+1);
        }
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
           int wizardStep=IMat.getWindow().getWizardstep();
        if (wizardStep > 0) {
            openWizardStep(wizardStep-1);
            IMat.getWindow().setWizardStep(wizardStep-1);
        }
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
       PanelSearchResult.setLoadWay(1);
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
        PanelSearchResult.setLoadWay(0);
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void jRadioButtonMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem4ActionPerformed
        PanelSearchResult.setSortWay(2);
    }//GEN-LAST:event_jRadioButtonMenuItem4ActionPerformed

    private void jRadioButtonMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem6ActionPerformed
       PanelSearchResult.setSortWay(0);
    }//GEN-LAST:event_jRadioButtonMenuItem6ActionPerformed

    private void jRadioButtonMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem5ActionPerformed
        PanelSearchResult.setSortWay(1);
    }//GEN-LAST:event_jRadioButtonMenuItem5ActionPerformed

    private void groupedCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupedCheckboxActionPerformed
        PanelSearchResult.setGrouped(groupedCheckbox.isSelected());
    }//GEN-LAST:event_groupedCheckboxActionPerformed

    private void loginMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuActionPerformed
       IMat.setLoggedin(false);
       refreshLoggedin();
       revalidate();
       repaint();
    }//GEN-LAST:event_loginMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        List<ShoppingItem> items = Model.getShoppingcart().getItems();
        List<Product> products = new ArrayList();
        for (ShoppingItem item : items){
            products.add(item.getProduct());
        }
        
        IMat.getWindow().showSearch(products, "Min kundvagn");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    private void openWizardStep(int i){
        switch (i){
            case (1): IMat.getWindow().setContent(new PanelConfirm());;break;
            case (2): IMat.getWindow().setContent(new PanelInfoFill());;break;
            case (3): IMat.getWindow().setContent(new ConfirmOrderInfo());;break;
            case (4): IMat.getWindow().setContent(new PanelDoneShopping());;break;
        }
    }
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
    private javax.swing.JMenu Om;
    private javax.swing.JPanel accountPanel;
    private javax.swing.JMenuItem avsluta;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JCheckBoxMenuItem groupedCheckbox;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JMenu iMat;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JMenuItem loginMenu;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JPanel navigationPanel;
    private javax.swing.JMenu recentlyDeletedMenu;
    private javax.swing.JMenu redigera;
    private javax.swing.JPanel searchPanel;
    private javax.swing.ButtonGroup sortingWays;
    private javax.swing.JPanel spacec;
    private javax.swing.ButtonGroup views;
    private javax.swing.JMenu visa;
    // End of variables declaration//GEN-END:variables
}
