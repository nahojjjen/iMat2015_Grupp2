/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.util.ArrayList;
import java.util.List;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingCart;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Johan Swanberg
 */
public class ModelAux {

    /**
     * add an amount of items to the cart
     * this method is more intelligent than the backend method
     * since it does not allow duplicates.
     * @param product what product to add
     * @param amount what amount of the product to add
     */
    public static void add(Product product, double amount){
        ShoppingItem temp = new ShoppingItem(product, amount);
        add(temp);
    }
    
    /**
     * add a ShoppingIem (Product with number) to the shoppingcart
     *
     * @param item
     */
    public static void add(ShoppingItem item) {

        ShoppingCart cart = Model.getShoppingcart();
        List<ShoppingItem> cartList = cart.getItems();
        List<Integer> container = getIdList();
        if (!container.contains(item.getProduct().getProductId())) {
            cart.addItem(item);

        } else {
            for (ShoppingItem sci : cartList) {
                if (sci.getProduct().getProductId() == item.getProduct().getProductId()) {
                    double currentAmount = sci.getAmount();
                    double addingAmount = item.getAmount() + currentAmount;

                    cart.removeItem(sci);
                    cart.addItem(new ShoppingItem(sci.getProduct(), addingAmount));
                }
            }
        }
    }
    
    
    
    /**
     * method used by other methods in this class, gets a list to
     * cross reference a product to whether its in the cart or not
     * @return 
     */
    public static List<Integer> getIdList(){
        ShoppingCart cart = Model.getShoppingcart();
        List<ShoppingItem> cartList = cart.getItems();
        List<Integer> container = new ArrayList<Integer>();
        for (ShoppingItem sci : cartList) {
            container.add(sci.getProduct().getProductId());
        }
        return container;
    }
    
    
    /**
     * get how many of an item is in the shoppingcart
     * @param product what product to check for
     */
    public static int getAmountInCart(Product product){
         ShoppingCart cart = Model.getShoppingcart();
        List<ShoppingItem> cartList = cart.getItems();
        List<Integer> contents = getIdList();
        for (ShoppingItem sci : cartList) {
            if (sci.getProduct().getProductId() == product.getProductId()){
                return (int)sci.getAmount();
            }
        }
          return 0;
    }
    
    /**
     * removes all of a specified product from the shoppingcart
     * the default backend already knows how to do this well, 
     * only here so that you can call same class for removing 
     * some items and all items
    */
    public static void removeAllOfProductFromCart(ShoppingItem product){
        //remove(product.getProduct(), getAmountInCart(product.getProduct()));
        Model.getShoppingcart().removeItem(product);
    }
    /**
     * remove an amount of items from the cart
     * @param item
     * @param removeAmount 
     */
    public static void remove(Product item, int removeAmount) {

        //get the current items in the cart as a list
        ShoppingCart cart = Model.getShoppingcart();
        List<ShoppingItem> cartList = cart.getItems();
        //cycle through all items, and remove the item that fits
        for (ShoppingItem sci : cartList) {
            if (sci.getProduct().getProductId() == item.getProductId()) {
                double currentAmount = sci.getAmount();
                double resultAmount = currentAmount - removeAmount;

                cart.removeItem(sci);
                
                // only add it back if there are some items left
                if (resultAmount > 0){
                    cart.addItem(new ShoppingItem(item, resultAmount));
                }
               
            }
        }

    }

}
