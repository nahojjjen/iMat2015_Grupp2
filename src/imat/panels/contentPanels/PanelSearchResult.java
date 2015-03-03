/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.contentPanels;

import imat.models.Model;
import imat.panels.modulePanels.PanelNavigation;
import imat.panels.subItems.DetailItem;
import imat.panels.subItems.GridItem;
import imat.panels.subItems.ListItem;
import imat.panels.subItems.NoResultsPanel;
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

    /**
     * Creates new form PanelSearchResult
     */
    public PanelSearchResult(List<Product> list) {
        products = list;
        initComponents();
        fixScroll();
    }

    /**
     * show all items beloning to multiple categories used by navigation buttons
     *
     * @param categories
     * @param i bad hack, used so that method arguments dont collide with
     * list<product>
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
        }

    

    /**
     * makes the scrollspeed about 10 times faster
     */
    private void fixScroll(){
        int scrollSpeed = 50;
        detailsViewWrapper.getVerticalScrollBar().setUnitIncrement(scrollSpeed);
        gridViewWrapper.getVerticalScrollBar().setUnitIncrement(scrollSpeed);
        listViewWrapper.getVerticalScrollBar().setUnitIncrement(scrollSpeed);
    }
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

    }

    /**
     * clears all previous items in the searchresults
     */
    private void clearPreviousItems() {
        gridView.removeAll();
        flowpanel.removeAll();
        detailsView.removeAll();
    }

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
        int rows = products.size();
        int amountOfCategories = 0;
        ProductCategory category = null;
        
    
        for (Product product : products) {
            
            if (!(category == product.getCategory())) {
                category = product.getCategory();
                detailsView.add(new JLabel(category.toString()));
                rows++;
                amountOfCategories++;
            }
            
            detailsView.add(new DetailItem(product));
        }
            
            
        detailsView.setLayout(new GridLayout(rows, 1));

        int height = products.size() * 90 + amountOfCategories * 90;
        Dimension dim = new Dimension(500, height);

        detailsView.setPreferredSize(dim);
        this.revalidate();
      
    }
    
    

    /**
     * create a list of gridresults and put them in results.
     *
     * @param products
     */
    private void showGridResults(List<Product> products) {
        clearPreviousItems();
        gridView.setLayout(new FlowLayout(FlowLayout.CENTER));

        gridView.setPreferredSize(new Dimension(500, 7000));
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
        flowpanel.setLayout(new GridLayout(products.size(), 1));
        int height = products.size() * 50;
        Dimension dim = new Dimension(500, height);

        flowpanel.setPreferredSize(dim);

        for (Product product : products) {
            flowpanel.add(new ListItem(product));
        }
        this.revalidate();
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

        jPanel1 = new javax.swing.JPanel();
        groupCheckbox = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        tabPanel = new javax.swing.JTabbedPane();
        detailsViewWrapper = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        detailsView = new javax.swing.JPanel();
        listViewWrapper = new javax.swing.JScrollPane();
        flowpanel = new javax.swing.JPanel();
        listView = new javax.swing.JPanel();
        gridViewWrapper = new javax.swing.JScrollPane();
        gridView = new javax.swing.JPanel();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(677, 40));

        groupCheckbox.setText("Gruppera kategorier");
        groupCheckbox.setOpaque(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Populäritet", "Alfabetisk", "Pris" }));

        jLabel1.setText("Sortera på");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(groupCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(groupCheckbox)))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        tabPanel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabPanelStateChanged(evt);
            }
        });

        detailsViewWrapper.setBorder(null);
        detailsViewWrapper.setOpaque(false);

        jPanel2.setOpaque(false);

        javax.swing.GroupLayout detailsViewLayout = new javax.swing.GroupLayout(detailsView);
        detailsView.setLayout(detailsViewLayout);
        detailsViewLayout.setHorizontalGroup(
            detailsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        detailsViewLayout.setVerticalGroup(
            detailsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(detailsView);

        detailsViewWrapper.setViewportView(jPanel2);

        tabPanel.addTab("Detaljvy", detailsViewWrapper);

        listViewWrapper.setBorder(null);
        listViewWrapper.setOpaque(false);

        flowpanel.setOpaque(false);

        javax.swing.GroupLayout listViewLayout = new javax.swing.GroupLayout(listView);
        listView.setLayout(listViewLayout);
        listViewLayout.setHorizontalGroup(
            listViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        listViewLayout.setVerticalGroup(
            listViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        flowpanel.add(listView);

        listViewWrapper.setViewportView(flowpanel);

        tabPanel.addTab("Listvy", listViewWrapper);

        gridViewWrapper.setBorder(null);
        gridViewWrapper.setOpaque(false);

        gridView.setOpaque(false);

        javax.swing.GroupLayout gridViewLayout = new javax.swing.GroupLayout(gridView);
        gridView.setLayout(gridViewLayout);
        gridViewLayout.setHorizontalGroup(
            gridViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
        );
        gridViewLayout.setVerticalGroup(
            gridViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );

        gridViewWrapper.setViewportView(gridView);

        tabPanel.addTab("Gridvy", gridViewWrapper);

        add(tabPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tabPanelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabPanelStateChanged
        loadResult(tabPanel.getSelectedIndex());
    }//GEN-LAST:event_tabPanelStateChanged

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
                    showDetailsResultsGrouped(products);
                    break;
                case (1):
                    showListResults(products);
                    break;
                case (2):
                    showGridResults(products);
                    break;
            }

        } else {
            clearPreviousItems();
            detailsView.setLayout(new FlowLayout());
            flowpanel.setLayout(new FlowLayout());
            gridView.setLayout(new FlowLayout());
            
            detailsView.add(new NoResultsPanel());
            flowpanel.add(new NoResultsPanel());
            gridView.add(new NoResultsPanel());
            revalidate();
            repaint();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel detailsView;
    private javax.swing.JScrollPane detailsViewWrapper;
    private javax.swing.JPanel flowpanel;
    private javax.swing.JPanel gridView;
    private javax.swing.JScrollPane gridViewWrapper;
    private javax.swing.JCheckBox groupCheckbox;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel listView;
    private javax.swing.JScrollPane listViewWrapper;
    private javax.swing.JTabbedPane tabPanel;
    // End of variables declaration//GEN-END:variables
}
