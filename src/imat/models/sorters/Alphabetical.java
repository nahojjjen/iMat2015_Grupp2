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
public class Alphabetical implements Comparator<Product>{
    @Override
    public int compare(Product pr1, Product pr2) {
    return pr1.getName().compareTo(pr2.getName());
    }
    
}
