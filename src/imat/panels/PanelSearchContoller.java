/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.panels;

import imat.Model;
import java.util.List;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Johan
 */
public class PanelSearchContoller {
   
    public static void doSearch(String input){
        List<Product> list = Model.doSearch(input);
        System.out.println(list.toString());
        
    }
}
