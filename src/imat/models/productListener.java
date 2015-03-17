/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.models;

import imat.IMat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Johan Swanberg
 */
public class productListener implements ActionListener{

    private Product thisItem;
    public productListener(Product product){
        thisItem = product;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       IMat.getWindow().openProductPopup(thisItem);
    }
    
}
