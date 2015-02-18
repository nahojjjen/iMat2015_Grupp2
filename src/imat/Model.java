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
         public void setUserName(String input){
             user.setUserName(input);
        }
         
         /**
          * set the password of the user 
          * @param input the string the username should be
          */
         public void setPassword(String input){
             user.setPassword(input);
         }
         
         
         /**
          * search for a string in the database
          * @param input what string to search for
          */
        public static void doSearch(String input){
            List<Product> results = data.findProducts(input);
           System.out.println(results.toString());
        }
       
      
}
