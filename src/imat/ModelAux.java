/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.util.ArrayList;
import java.util.List;
import se.chalmers.ait.dat215.project.ShoppingCart;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Johan Swanberg
 */
public class ModelAux {
    
    public static void add(ShoppingItem item){
        
        ShoppingCart cart = Model.getShoppingcart();
        List<ShoppingItem> cartList = cart.getItems();
        List<Integer> container = new ArrayList<Integer>() ;
        for (ShoppingItem sci : cartList){
            container.add(sci.getProduct().getProductId());
        }
        if (!container.contains(item.getProduct().getProductId())){
            cart.addItem(item);
            
            
        } else{
             for (ShoppingItem sci : cartList){
                 if (sci.getProduct().getProductId() == item.getProduct().getProductId()){
                     System.out.println("matching product found in cart");
                     double currentAmount = sci.getAmount();
                     double addingAmount = item.getAmount() + currentAmount;
                     
                    cart.removeItem(sci);
                    cart.addItem(new ShoppingItem(sci.getProduct(), addingAmount));
                 }
            }
        }
        
    }
    
}
