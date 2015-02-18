/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import javax.swing.JLabel;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Johan
 */
public class Controller {
    
    //This is the controller class, this class should only include method 
    //calls to our model class.
    
    public static int counter = 1;
    
    public static void fireTestButton(JLabel label){
        Product product = Model.getProduct(counter);
        counter++;
        label.setIcon(Model.getImage(product,300,300));
   
    }
    
}
