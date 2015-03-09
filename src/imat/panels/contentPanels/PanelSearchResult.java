/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.contentPanels;

import imat.models.CategoryImageLibrary;
import imat.models.Model;
import imat.models.sorters.Alphabetical;
import imat.models.sorters.GroupPriceSort;
import imat.models.sorters.GroupedAlphabetical;
import imat.models.sorters.PriceDecending;
import imat.models.sorters.ProductIDSort;
import imat.panels.subItems.DetailItem;
import imat.panels.subItems.GridItem;
import imat.panels.subItems.ListItem;
import imat.panels.subItems.NoResultsPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
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
    private static boolean grouped = true;
    private static int sortingWay = 0;
    private static int loadWay = 0;
    private ImageIcon grid1= new ImageIcon("src/resources/views/grid1.png");
    private ImageIcon grid2= new ImageIcon("src/resources/views/grid2.png");
    private ImageIcon list1= new ImageIcon("src/resources/views/list1.png");
    private ImageIcon list2= new ImageIcon("src/resources/views/list2.png");
    private ImageIcon details1= new ImageIcon("src/resources/views/details1.png");
    private ImageIcon details2= new ImageIcon("src/resources/views/details2.png");
    
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
        loadResult(loadWay);
    }
    
        /**
     * Creates new form PanelSearchResult
     * @param list - products to show
     */
    public PanelSearchResult(List<Product> list, String string) {
        products = list;
        initComponents();
        card = (CardLayout) cardPanel.getLayout();
        fixScroll();
        loadResult(loadWay);
        searchLabel.setText("Sökresultat: " + string);
    }

    /**
     * load all items in several categories into products list
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
        fixScroll();
        loadResult(loadWay);

    }
    /**
     * fill the product list with favorites
     * @param fav can be anything, will load favorites regardless
     */
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
        fixScroll();
        loadResult(loadWay);
    }


    /**
     * creates the panel and sets products to a category
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
        fixScroll();
        loadResult(loadWay);

    }

    ////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////
    ///////////////////    Search methods     //////////////////////////////
    ////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////
    
    
    /**
     * create the list of detailitems and put them in the retults
     *
     * @param products what products to show
     */
    private void showDetailsResults(List<Product> products) {
        clearPreviousItems();
        for (Product product : products) {
            detailsView.add(new DetailItem(product));
        }
          detailsView.add(new JLabel("                                                                                                                                                                       "));
        this.revalidate();
    }



    /**
     * create a list of gridresults and put them in results.
     *
     * @param products
     */
    private void showGridResults(List<Product> products) {
        clearPreviousItems();
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
        /**
     * create the list of detailitems and put them in the results
     *
     * @param products what products to show
     */
    private void showDetailsResultsGrouped(List<Product> products) {
        clearPreviousItems();
        ProductCategory category = null;
        for (Product product : products) {
            if (!(category == product.getCategory())) {
                detailsView.add(new JLabel(""));
                category = product.getCategory();
                JLabel tmpLabel = new JLabel(CategoryImageLibrary.getPicture(category));
                tmpLabel.setToolTipText(category.toString());
                detailsView.add(tmpLabel);
                
            }
            detailsView.add(new DetailItem(product));
        }
        
                detailsView.add(new JLabel());
        detailsView.add(new JLabel("                                                                                                                                                                       "));
        this.revalidate();
    }
        /**
     * create a list of listresultitems and put them in resultview
     *
     * @param products what products to show
     */
    private void showListResultsGrouped(List<Product> products) {
    clearPreviousItems();
    listView.setLayout(new GridLayout(0, 1));
        ProductCategory category = null;
        for (Product product : products) {
            if (!(category == product.getCategory())) {
                category = product.getCategory();
                JLabel categoryLabel = new JLabel(category.toString());
                categoryLabel.setBackground(CategoryImageLibrary.getColor(category));
                categoryLabel.setOpaque(true);
                categoryLabel.setForeground(new Color(250,250,250));
                listView.add(new JLabel());
                listView.add(categoryLabel);
            }
            listView.add(new ListItem(product));
        }
        revalidate();
    }

    ///////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////
    //////////////////////////    Helper methods   ////////////////////
    ///////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////
    /**
     * increase the scroll speed in all scrollpanels
     */
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
        sortProductList();
        if (products.size() > 0) {
            switch (i) {
                case (0):
                    card.show(cardPanel, "detailsCard");
                    if (grouped) {                        
                        showDetailsResultsGrouped(products);
                    }else{
                        showDetailsResults(products);
                    }
                    break;
                case (1):
                    card.show(cardPanel, "listCard");
                    if (grouped) {
                        showListResultsGrouped(products);
                    }else{
                    showListResults(products);
                    }
                    break;
                case (2):
                    
                    card.show(cardPanel, "gridCard");
                    showGridResults(products);
                    break;
            }

        } else {
            clearPreviousItems();
            detailsView.add(new NoResultsPanel());
            listView.add(new NoResultsPanel());
            gridView.add(new NoResultsPanel());
            revalidate();
            repaint();
        }
    }

    private void sortProductList(){
        if (!grouped){
            switch(sortingWay){
            case(0): Collections.sort(products, new ProductIDSort());break;
            case(1): Collections.sort(products, new Alphabetical()); break;
            case(2): Collections.sort(products, new PriceDecending()); break;
            }
        }else{
            switch(sortingWay){
                case(0): Collections.sort(products, new ProductIDSort());break;
                case(1): Collections.sort(products, new GroupedAlphabetical()); break;
                case(2): Collections.sort(products, new GroupPriceSort()); break;
            }
        }
        
    }
    private void toggleGrouped(){
        grouped =  !grouped;
        clearPreviousItems();
        loadResult(0);
    }
    private void resetViewIcons(){
        listLabel.setIcon(list1);
        gridLabel.setIcon(grid1);
        detailsLabel.setIcon(details1);
    }
    private void setSortingMethod(){
        sortingWay = sortingCombobox.getSelectedIndex();
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
        sortingCombobox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        detailsLabel = new javax.swing.JLabel();
        listLabel = new javax.swing.JLabel();
        gridLabel = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        detailsViewWrapper = new javax.swing.JScrollPane();
        detailsPanelHolder = new javax.swing.JPanel();
        detailsView = new javax.swing.JPanel();
        listViewWrapper = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        listView = new javax.swing.JPanel();
        gridViewWrapper = new javax.swing.JScrollPane();
        gridView = new javax.swing.JPanel();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        headerPanel.setBackground(imat.IMat.getAccentColor());
        headerPanel.setPreferredSize(new java.awt.Dimension(677, 40));

        groupCheckbox.setSelected(grouped);
        groupCheckbox.setText("Gruppera kategorier");
        groupCheckbox.setOpaque(false);
        groupCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupCheckboxActionPerformed(evt);
            }
        });

        sortingCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Product ID", "Alfabetisk", "Pris" }));
        sortingCombobox.setSelectedIndex(sortingWay);
        sortingCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortingComboboxActionPerformed(evt);
            }
        });

        jLabel1.setText("Sortera på");

        detailsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/views/details1.png"))); // NOI18N
        detailsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailsLabelMouseClicked(evt);
            }
        });

        listLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/views/list1.png"))); // NOI18N
        listLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listLabelMouseClicked(evt);
            }
        });

        gridLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/views/grid1.png"))); // NOI18N
        gridLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridLabelMouseClicked(evt);
            }
        });

        searchLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(250, 250, 250));
        searchLabel.setText("Sökresultat:");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(groupCheckbox)
                .addGap(46, 46, 46)
                .addComponent(detailsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortingCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(groupCheckbox)
                    .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sortingCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listLabel)
                    .addComponent(detailsLabel)
                    .addComponent(gridLabel)))
        );

        add(headerPanel, java.awt.BorderLayout.PAGE_START);

        cardPanel.setOpaque(false);
        cardPanel.setLayout(new java.awt.CardLayout());

        detailsViewWrapper.setBorder(null);
        detailsViewWrapper.setOpaque(false);

        detailsPanelHolder.setOpaque(false);

        detailsView.setOpaque(false);
        detailsView.setLayout(new java.awt.GridLayout(0, 1));
        detailsPanelHolder.add(detailsView);

        detailsViewWrapper.setViewportView(detailsPanelHolder);

        cardPanel.add(detailsViewWrapper, "detailsCard");

        listViewWrapper.setBorder(null);
        listViewWrapper.setOpaque(false);

        listView.setLayout(new java.awt.GridLayout(0, 1));
        jPanel3.add(listView);

        listViewWrapper.setViewportView(jPanel3);

        cardPanel.add(listViewWrapper, "listCard");

        gridViewWrapper.setBorder(null);
        gridViewWrapper.setOpaque(false);

        gridView.setLayout(new java.awt.GridLayout(0, 5));
        gridViewWrapper.setViewportView(gridView);

        cardPanel.add(gridViewWrapper, "gridCard");

        add(cardPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void detailsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsLabelMouseClicked
        resetViewIcons();
        detailsLabel.setIcon(details2);
        loadWay = 0;
        loadResult(loadWay);
    }//GEN-LAST:event_detailsLabelMouseClicked

    private void listLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listLabelMouseClicked
        resetViewIcons();
        listLabel.setIcon(list2);
        loadWay = 1;
        loadResult(loadWay);
    }//GEN-LAST:event_listLabelMouseClicked

    private void gridLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridLabelMouseClicked
        resetViewIcons();
        gridLabel.setIcon(grid2);
        loadWay = 2;
        loadResult(loadWay);
    }//GEN-LAST:event_gridLabelMouseClicked

    private void groupCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupCheckboxActionPerformed
        toggleGrouped();
    }//GEN-LAST:event_groupCheckboxActionPerformed

    private void sortingComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortingComboboxActionPerformed
        setSortingMethod();
        clearPreviousItems();
        loadResult(loadWay);
    }//GEN-LAST:event_sortingComboboxActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardPanel;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JPanel detailsPanelHolder;
    private javax.swing.JPanel detailsView;
    private javax.swing.JScrollPane detailsViewWrapper;
    private javax.swing.JLabel gridLabel;
    private javax.swing.JPanel gridView;
    private javax.swing.JScrollPane gridViewWrapper;
    private javax.swing.JCheckBox groupCheckbox;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel listLabel;
    private javax.swing.JPanel listView;
    private javax.swing.JScrollPane listViewWrapper;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JComboBox sortingCombobox;
    // End of variables declaration//GEN-END:variables
}
