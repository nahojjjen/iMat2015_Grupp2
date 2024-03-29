/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels.contentPanels;

import imat.IMat;
import imat.models.Model;
import imat.models.sorters.OrderByDateSort;
import imat.panels.subItems.CartHistory;
import java.util.Collections;
import java.util.List;
import javax.swing.JLabel;
import se.chalmers.ait.dat215.project.Order;

/**
 *
 * @author Johan Swanberg
 */
public class PanelEarlierCarts extends javax.swing.JPanel {

    /**
     * Creates new form PanelEarlierCarts
     */
    public PanelEarlierCarts() {
        initComponents();
        List<Order> orders = Model.getOrders();
        Collections.sort(orders, new OrderByDateSort());
        for (Order order : orders) {
            if (order.getItems().size() > 0){
                cartList.add(new CartHistory(order));
            }
            
        }
        if (orders.isEmpty() ){
            cartList.add(new JLabel("Du har inga tidigare beställningar."));
            
        }
        this.revalidate();
        earlierOrderLabel.setBackground(IMat.getAccentColor());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        filler = new javax.swing.JPanel();
        cartList = new javax.swing.JPanel();
        earlierOrderLabel = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        filler.setBackground(new java.awt.Color(204, 204, 204));
        filler.setOpaque(false);

        cartList.setLayout(new java.awt.GridLayout(0, 1));
        filler.add(cartList);

        jScrollPane1.setViewportView(filler);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        earlierOrderLabel.setBackground(new java.awt.Color(102, 255, 102));
        earlierOrderLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        earlierOrderLabel.setForeground(new java.awt.Color(255, 255, 255));
        earlierOrderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        earlierOrderLabel.setText("Tidigare beställningar");
        earlierOrderLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        earlierOrderLabel.setOpaque(true);
        earlierOrderLabel.setPreferredSize(new java.awt.Dimension(250, 75));
        add(earlierOrderLabel, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cartList;
    private javax.swing.JLabel earlierOrderLabel;
    private javax.swing.JPanel filler;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
