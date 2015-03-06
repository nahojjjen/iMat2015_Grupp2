/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.contentPanels;

import imat.models.Model;
import imat.panels.subItems.DetailItem;
import imat.panels.subItems.GridItem;
import imat.panels.subItems.ListItem;
import imat.panels.subItems.NoResultsPanel;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JLabel;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * @author Johan
 */
public class PanelSearchResult extends javax.swing.JPanel {

    private List<Product> products;
    private CardLayout card;
    
    ////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////
    /////////////////////   Constructors               /////////////////////
    ////////////////////////////////////////////////////////////////////////
    /**
     * Creates new form PanelSearchResult
     * @param list - products to show
     */
    public PanelSearchResult(List<Product> list) {
        products = list;
        initComponents();
        card = (CardLayout) cardPanel.getLayout();
        fixScroll();
        loadResult(0);
    }

    /**
     * show all items beloning to multiple categories used by navigation buttons
     *
     * @param categories
     * @param i bad hack, used so that method arguments dont collide with
     */
    public PanelSearchResult(List<ProductCategory> categories, int i) {
      
        List<Product> list = Model.doSearch("");
        List<Product> categoryList = Model.doSearch("dirtyhacksaredirty!!!");
        for (Product product : list) {
            for (ProductCategory category : categories) {
                if (product.getCategory() == category) {
                    categoryList.add(product);
                }
            }

        }
        products = categoryList;
        initComponents();
          card = (CardLayout) cardPanel.getLayout();

    }

    public PanelSearchResult(String fav) {
        List<Product> list = Model.doSearch("");
        List<Product> favoriteList = Model.doSearch("dirtyhacksaredirty!!!");
        for (Product product : list) {

            if (Model.isFavorited(product)) {
                favoriteList.add(product);
            }
        }

        products = favoriteList;
        initComponents();
          card = (CardLayout) cardPanel.getLayout();
    }

    /**
     * makes the scrollspeed about 10 times faster
     */
    /**
     * Shows a category
     *
     * @param category
     */
    public PanelSearchResult(ProductCategory category) {
        clearPreviousItems();
        List<Product> list = Model.doSearch("");
        List<Product> categoryList = Model.doSearch("dirtyhacksaredirty!!!");
        for (Product product : list) {
            if (product.getCategory() == category) {
                categoryList.add(product);
            }
        }
        products = categoryList;
        initComponents();
          card = (CardLayout) cardPanel.getLayout();

    }

    ////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////
    ///////////////////    Search methods     //////////////////////////////
    ////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////
    
    
    /**
     * create the list of detailitems and put them in the retults
     *
     * @param products what products to show
     */
    private void showDetailsResults(List<Product> products) {
        clearPreviousItems();
        detailsView.setLayout(new GridLayout(products.size(), 1));
        int height = products.size() * 85;
        Dimension dim = new Dimension(500, height);

        detailsView.setPreferredSize(dim);

        for (Product product : products) {
            detailsView.add(new DetailItem(product));
        }
        this.revalidate();
    }

    /**
     * create the list of detailitems and put them in the results
     *
     * @param products what products to show
     */
    private void showDetailsResultsGrouped(List<Product> products) {

        clearPreviousItems();

        card.show(cardPanel, "detailsViewWrapper");

        ProductCategory category = null;
        boolean varyCat = true;
       

        for (Product product : products) {
            if (!(category == product.getCategory())) {
                category = product.getCategory();
                varyCat = !varyCat;
                if (varyCat){
                    
                detailsView2.add(new JLabel(category.toString()));
                }else{
                    
                detailsView.add(new JLabel(category.toString()));
                }
                
            }
            if (varyCat){
                
            detailsView2.add(new DetailItem(product));
            }else{
                
            detailsView.add(new DetailItem(product));
            }
        }


        this.revalidate();

    }

    /**
     * create a list of gridresults and put them in results.
     *
     * @param products
     */
    private void showGridResults(List<Product> products) {
        clearPreviousItems();

        //Fixade att den löser sig självt. >> satte grid layout på grid panelen med columns = 4, rows = 0
        //gridView.setLayout(new FlowLayout(FlowLayout.CENTER));
        //gridView.setPreferredSize(new Dimension(500, 7000));
        for (Product product : products) {
            gridView.add(new GridItem(product));
        }

        this.revalidate();

    }

    /**
     * create a list of listresultitems and put them in resultview
     *
     * @param products what products to show
     */
    private void showListResults(List<Product> products) {
        clearPreviousItems();
        listView.setLayout(new GridLayout(products.size(), 1));
        int height = products.size() * 50;
        Dimension dim = new Dimension(500, height);

        listView.setPreferredSize(dim);

        for (Product product : products) {
            listView.add(new ListItem(product));
        }
        this.revalidate();
    }

    ///////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////
    //////////////////////////    Helper methods   ////////////////////
    ///////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////
    private void fixScroll() {
        int scrollSpeed = 50;
        detailsViewWrapper.getVerticalScrollBar().setUnitIncrement(scrollSpeed);
        gridViewWrapper.getVerticalScrollBar().setUnitIncrement(scrollSpeed);
        listViewWrapper.getVerticalScrollBar().setUnitIncrement(scrollSpeed);
    }

    /**
     * clears all previous items in the searchresults
     */
    private void clearPreviousItems() {
        gridView.removeAll();
        listView.removeAll();
        detailsView.removeAll();
    }
    
       /**
     * makes the search load when the user clicks, instead of loading them all
     * at once when the user loads.
     *
     * @param i which tab to load, starting at index 0
     */
    private void loadResult(int i) {
        if (products.size() > 0) {
            switch (i) {
                case (0):
                    card.show(cardPanel, "detailsCard");
                    showDetailsResultsGrouped(products);
                    break;
                case (1):
                    card.show(cardPanel, "listCard");
                    showListResults(products);
                    break;
                case (2):
                    
                    card.show(cardPanel, "gridCard");
                    showGridResults(products);
                    break;
            }

        } else {
            clearPreviousItems();
            detailsView.setLayout(new FlowLayout());
            listView.setLayout(new FlowLayout());
            gridView.setLayout(new FlowLayout());

            detailsView.add(new NoResultsPanel());
            listView.add(new NoResultsPanel());
            gridView.add(new NoResultsPanel());
            revalidate();
            repaint();
        }
    }

    /**
     * Creates new form PanelSearchResult
     */
    public PanelSearchResult() {
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

        headerPanel = new javax.swing.JPanel();
        groupCheckbox = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        detailsViewWrapper = new javax.swing.JScrollPane();
        detailsPanelHolder = new javax.swing.JPanel();
        detailsView = new javax.swing.JPanel();
        detailsView2 = new javax.swing.JPanel();
        listViewWrapper = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        listView = new javax.swing.JPanel();
        gridViewWrapper = new javax.swing.JScrollPane();
        gridView = new javax.swing.JPanel();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        headerPanel.setBackground(imat.IMat.getAccentColor());
        headerPanel.setPreferredSize(new java.awt.Dimension(677, 40));

        groupCheckbox.setText("Gruppera kategorier");
        groupCheckbox.setOpaque(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Populäritet", "Alfabetisk", "Pris" }));

        jLabel1.setText("Sortera på");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/detailsViewIcon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/listViewIcon.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gridViewIcon.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(250, 250, 250));
        jLabel5.setText("Sökresultat:");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(groupCheckbox)
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(groupCheckbox)
                    .addComponent(jLabel3)
                    .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        add(headerPanel, java.awt.BorderLayout.PAGE_START);

        cardPanel.setLayout(new java.awt.CardLayout());

        detailsViewWrapper.setBorder(null);

        detailsPanelHolder.setLayout(new java.awt.GridLayout(0, 2));

        detailsView.setLayout(new java.awt.GridLayout(0, 1));
        detailsPanelHolder.add(detailsView);

        detailsView2.setLayout(new java.awt.GridLayout(0, 1));
        detailsPanelHolder.add(detailsView2);

        detailsViewWrapper.setViewportView(detailsPanelHolder);

        cardPanel.add(detailsViewWrapper, "detailsCard");

        listViewWrapper.setBorder(null);

        listView.setLayout(new java.awt.GridLayout(0, 1));
        jPanel3.add(listView);

        listViewWrapper.setViewportView(jPanel3);

        cardPanel.add(listViewWrapper, "listCard");

        gridViewWrapper.setBorder(null);

        gridView.setLayout(new java.awt.GridLayout(0, 4));
        gridViewWrapper.setViewportView(gridView);

        cardPanel.add(gridViewWrapper, "gridCard");

        add(cardPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        loadResult(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        loadResult(1);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        loadResult(2);
    }//GEN-LAST:event_jLabel4MouseClicked

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardPanel;
    private javax.swing.JPanel detailsPanelHolder;
    private javax.swing.JPanel detailsView;
    private javax.swing.JPanel detailsView2;
    private javax.swing.JScrollPane detailsViewWrapper;
    private javax.swing.JPanel gridView;
    private javax.swing.JScrollPane gridViewWrapper;
    private javax.swing.JCheckBox groupCheckbox;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel listView;
    private javax.swing.JScrollPane listViewWrapper;
    // End of variables declaration//GEN-END:variables
}
