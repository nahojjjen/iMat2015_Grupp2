/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.util.List;
import javax.swing.ImageIcon;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author Johan
 */
public class Model {
    
    //
    //  User and database - instances
    //
         public static User user = new User();
         public static IMatDataHandler data =  IMatDataHandler.getInstance();
         
         
    // getters
         
         /**
          * get a product by id
          * @param inp product id
          * @return a Product with the specified id
          */
         public static Product getProduct(int inp){
             Product returner = data.getProduct(inp);
             
             return returner;
         }
         
         /**
          * get the image associated with a product
          * @param product what product to find the image for
          * @return an ImageIcon corresponding the product
          */
         public static ImageIcon getImage(Product product){
                ImageIcon icon = data.getImageIcon(product);
                return icon;
         }
         
         /**
          * get the image associated with a product
          * @param product what product to find the image for
          * @param width what width the image should be scaled to
          * @param height what height the image should be scaled to
          * @return an imageicon corresponding the product with the speficfied dimensions
          */
           public static ImageIcon getImage(Product product, int width, int height){
                ImageIcon icon = data.getImageIcon(product, width, height);
                return icon;
         }
         
         
         /**
          * get the name of a product
          * @param product what product to get the name of
          * @return a String of the products name
          */
         public static String getName(Product product){
             return product.getName();
         }
         
         /**
          * set the username of whoever logs in
          * @param input what the username should be
          */
         public static void setUserName(String input){
             user.setUserName(input);
        }
         
         /**
          * get the username of user
          * @return String of username
          */
         public static String getUsername(){
             return user.getUserName();
         }
         
         /**
          * returns the current user
          * @return User 
          */
         public static User getUser(){
             return data.getUser();
         }
         /**
          * get the password of user
          * @return a string of the current password.
          */
         public static String getPassword(){
             return user.getPassword();
         }
         /**
          * set the password of the user 
          * @param input the string the username should be
          */
         public static void setPassword(String input){
             user.setPassword(input);
         }
         
         /**
          * get the creditcard of the user
          * @return Creditcard
          */
         public static CreditCard getCreditcard(){
            return data.getCreditCard();
         }
         
         /**
          * get the customer from data
          * @return a Customer
          */
         public static Customer getCustomer(){
             return data.getCustomer();
         }
         /**
          * search for a string in the database
          * @return a List<Product> of searchresults
          * @param input what string to search for
          */
         public static List<Product> doSearch(String input){
           return data.findProducts(input);
           //System.out.println(results.toString());
        }
       
        
         /**
          * return a list of all orders that have been made
          * @return  all previous orders
          */
         public static List<Order> getOrders(){
             return data.getOrders();
         }
         
         /**
          * get the current shoppingCart
          * @return Shoppingcart in use
          */
         public static ShoppingCart getShoppingcart(){
             return data.getShoppingCart();
         }
         
        /**
         * add a product to favorites
         * @param product what produt to add
         */
        public static void addFavorite(Product product){
            data.addFavorite(product);
        }
        
        /**
         * get all favorites
         * @return all favorites stored in data
         */
        public static List<Product> getAllFavorites(){
            return data.favorites();
        }
        
        /**
         * remove the product from favorites.
         * @param product what product to remove
         */
        public static void removeFavorite(Product product){
            data.removeFavorite(product);
        }
        /**
         * see if user is fully registered
         * @return true if true
         */
        public static boolean isCustomerProfileComplete(){
            return data.isCustomerComplete();
        }
        
        /**
         * returns whether the product is favorited or not
         * @param product what product to check
         * @return true if product is favorited
         */
        public static boolean isFavorited(Product product){
            return data.isFavorite(product);
        }
        
        /**
         * set the order for food
         */
        public static void placeOrder(){
            data.placeOrder();
        }
        
        /**
         * shut down the program and save the data
         */
        public static void shutDown(){
            data.shutDown();
        }
        
        
        //
        
        
        
}

