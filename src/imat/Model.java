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
    
         public static User user = new User();
         public static IMatDataHandler data =  IMatDataHandler.getInstance();
         
         public static Product getProduct(int inp){
             Product returner = data.getProduct(inp);
             
             return returner;
         }
         public static ImageIcon getImage(Product product){
                ImageIcon icon = data.getImageIcon(product);
                return icon;
         }
         
           public static ImageIcon getImage(Product product, int width, int height){
                ImageIcon icon = data.getImageIcon(product, width, height);
                return icon;
         }
         
         
         
         public static String getName(Product product){
             return product.getName();
         }
         public void setUserName(String input){
             user.setUserName(input);
        }
         
         public void setPassword(String input){
             user.setPassword(input);
         }
         
        public static void doSearch(String input){
            List<Product> results = data.findProducts(input);
           System.out.println(results.toString());
        }
       
      
}
