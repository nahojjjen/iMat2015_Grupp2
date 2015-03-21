/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.modulePanels;

import imat.IMat;
import imat.models.customPanelLogic.CustomButton2;
import imat.models.navPanelActionListeners.ExpandCategories;
import imat.models.navPanelActionListeners.GoToFaq;
import imat.models.navPanelActionListeners.GoToFavorites;
import imat.models.navPanelActionListeners.GoToHistory;
import imat.models.navPanelActionListeners.GoToHome;
import imat.models.navPanelActionListeners.GoToLastOrder;
import imat.models.navPanelActionListeners.GoToProfile;
import imat.models.navPanelActionListeners.GoToShowAll;
import imat.models.navPanelActionListeners.categories.GoToCategorySweets;
import imat.models.navPanelActionListeners.categories.GoToDrinks;
import imat.models.navPanelActionListeners.categories.GoToDryProducts;
import imat.models.navPanelActionListeners.categories.GoToFruktOGront;
import imat.models.navPanelActionListeners.categories.GoToMeat;
import imat.models.navPanelActionListeners.categories.GoToMejeri;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Johan
 */
public class PanelNavigation2 extends javax.swing.JPanel {

    private static boolean expanded = false;
    
    //all icon declerations will be here:
    private ImageIcon fisk = new ImageIcon("src/resources/fisk.jpg");
     private ImageIcon godis = new ImageIcon("src/resources/godis.jpg");
      private ImageIcon order = new ImageIcon("src/resources/order.jpg");
    private ImageIcon test1 = new ImageIcon("src/resources/1.png");
    private ImageIcon test2 = new ImageIcon("src/resources/1.png");
    private ImageIcon test3 = new ImageIcon("src/resources/1.png");
    private ImageIcon tt1 = new ImageIcon("src/resources/1.png");
    private ImageIcon tt2 = new ImageIcon("src/resources/2.png");
    
    private ImageIcon home = new ImageIcon("src/resources/navButtons/hem.png");
    private ImageIcon homeP = new ImageIcon("src/resources/navButtons/hem.png");
    private ImageIcon homeH = new ImageIcon("src/resources/navButtons/hemHovered.png");
    
    private ImageIcon category = new ImageIcon("src/resources/navButtons/kategori.png");
    private ImageIcon categoryH = new ImageIcon("src/resources/navButtons/kategoriHovered.png");
    private ImageIcon categoryP = new ImageIcon("src/resources/navButtons/kategori.png");
    
    private ImageIcon search = new ImageIcon("src/resources/navButtons/search.png");
    private ImageIcon searchH = new ImageIcon("src/resources/navButtons/searchH.png");
    private ImageIcon searchP = new ImageIcon("src/resources/navButtons/searchP.png");
    
     private ImageIcon favorites = new ImageIcon("src/resources/navButtons/favorites.png");
    private ImageIcon favoritesH = new ImageIcon("src/resources/navButtons/favoritesh.png");
    private ImageIcon favoritesP = new ImageIcon("src/resources/navButtons/favoritesp.png");
    
     private ImageIcon profile = new ImageIcon("src/resources/navButtons/profile.png");
    private ImageIcon profileH = new ImageIcon("src/resources/navButtons/profilh.png");
    private ImageIcon profileP = new ImageIcon("src/resources/navButtons/profilp.png");
    
     private ImageIcon earlier = new ImageIcon("src/resources/navButtons/earlier.png");
    private ImageIcon earlierH = new ImageIcon("src/resources/navButtons/earlierH.png");
    private ImageIcon earlierP = new ImageIcon("src/resources/navButtons/earlierP.png");
    
    
     private ImageIcon faq = new ImageIcon("src/resources/navButtons/faq.png");
    private ImageIcon faqh = new ImageIcon("src/resources/navButtons/faqh.png");
    private ImageIcon faqp = new ImageIcon("src/resources/navButtons/faqp.png");
    
     private ImageIcon showAll = new ImageIcon("src/resources/navButtons/showall.jpg");
    private ImageIcon showAllH = new ImageIcon("src/resources/navButtons/showallH.jpg");
    private ImageIcon showAllP = new ImageIcon("src/resources/navButtons/showallP.jpg");
    
    private ImageIcon homePic = new ImageIcon("src/resources/menyPictures/home.png");
    private ImageIcon showAllPic = new ImageIcon("src/resources/menyPictures/search.png");
    private ImageIcon productsPic = new ImageIcon("src/resources/menyPictures/list.png");
    private ImageIcon profilePic = new ImageIcon("src/resources/menyPictures/profile.png");
    private ImageIcon historyPic = new ImageIcon("src/resources/menyPictures/previousCart.png");
    private ImageIcon favPic = new ImageIcon("src/resources/menyPictures/favPicOnMeny.png");
    private ImageIcon orderPic = new ImageIcon("src/resources/menyPictures/cart4.png");
    private ImageIcon faqPic = new ImageIcon("src/resources/menyPictures/questionMark.png");
    
    
    /**
     * Creates new form PanelNavigation2
     */
    public PanelNavigation2() {
        initComponents();
        addShowingButtons();
       
    }

    private void addShowingButtons(){
        //debugg code:
       
       
        
         //add static buttons (including giving them listeners)
         addStaticButtons1();
         
         //add dynamic buttons, aka check if categories are expanded.
         addShowingCategoryButtons();
      
         //add last static buttons
         addStaticButtons2();
    }
        private void addStaticButtons1(){
         //CustomButton homebutton = new CustomButton(home, homeH, homeP, new GoToHome());
        CustomButton2 homebutton = new CustomButton2(new GoToHome(), homePic, "Hem");
        CustomButton2 showAllButton = new CustomButton2(new GoToShowAll(), showAllPic, "Visa Alla Varor");
        CustomButton2 categoryButton = new CustomButton2(new ExpandCategories(), productsPic, "Produkter");
        
        
        holder.add(homebutton);
        holder.add(showAllButton);
        holder.add(categoryButton);
    }
        
        
    private void addShowingCategoryButtons(){
        if (expanded) {
            CustomButton2 fruitNGreenButton = new CustomButton2(new GoToFruktOGront(), null, "Frukt & Grönt",true);
            CustomButton2 candyButton = new CustomButton2(new GoToCategorySweets(), null, "Godis",true);
            CustomButton2 btn12 = new CustomButton2(new GoToMeat(), null, "Fisk & Kött",true);
            CustomButton2 btnTorrVaror = new CustomButton2(new GoToDryProducts(), null, "Torrvaror", true);
            CustomButton2 btnDrycker = new CustomButton2(new GoToDrinks(), null, "Drycker", true);
            CustomButton2 btnMejeri = new CustomButton2(new GoToMejeri(), null, "Mejeri", true);
            
            holder.add(candyButton);
            holder.add(btn12);
            holder.add(fruitNGreenButton);
            holder.add(btnTorrVaror);
            holder.add(btnDrycker);
            holder.add(btnMejeri);
        }
    }
    

    private void addStaticButtons2(){
           holder.add(new JLabel(""));
         CustomButton2 favoritesButton = new CustomButton2(new GoToFavorites(), favPic, "Favoriter");
         CustomButton2 profileButton = new CustomButton2(new GoToProfile(), profilePic, "Profil");
         CustomButton2 lastOrderButton = new CustomButton2(new GoToLastOrder(), orderPic, "Min beställning");
        CustomButton2 historyButton = new CustomButton2(new GoToHistory(), historyPic, "Historik");
        CustomButton2 faqButton = new CustomButton2(new GoToFaq(), faqPic, "F.A.Q.");
     
        holder.add(profileButton);
        holder.add(historyButton);  
        holder.add(favoritesButton);
           holder.add(lastOrderButton);
     
           holder.add(new JLabel(""));
        holder.add(faqButton);
        
    }
    /**
     * call this whenever the panel should force-update
     */
    private  void refresh(){
        holder.removeAll();
        addShowingButtons();
        revalidate();
        repaint();
        
    }
    
    public static void toggleExpanded(){
        expanded = !expanded;
        System.out.println("expanded = " + expanded);
        IMat.getWindow().refreshNavBox();
        
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
        jLabel1 = new javax.swing.JLabel();
        holder = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 0, 0));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(imat.IMat.getAccentColor());
        jPanel1.setPreferredSize(new java.awt.Dimension(71, 42));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Navigation");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.NORTH);

        holder.setOpaque(false);
        holder.setLayout(new java.awt.GridLayout(16, 1));
        add(holder, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel holder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
