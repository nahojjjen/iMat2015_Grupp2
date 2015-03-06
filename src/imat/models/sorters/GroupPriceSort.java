/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.models.sorters;

import java.util.Comparator;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Johan Swanberg
 */
public class GroupPriceSort implements Comparator<Product>{

    @Override
    public int compare(Product pr1, Product pr2) {
        if (pr1.getCategory().toString().compareTo(pr2.getCategory().toString()) != 0){
            return pr1.getCategory().toString().compareTo(pr2.getCategory().toString());
        }else if (pr1.getPrice() > pr2.getPrice()){
            return -1;
        }else if(pr1.getPrice() == pr2.getPrice()){
            return 0;
        }else{
            return 1;
        }
    }
    
}
