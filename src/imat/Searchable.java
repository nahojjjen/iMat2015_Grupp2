/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.util.List;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Johan
 */
public interface Searchable {
    
    public abstract void ShowProducts(List<Product> input);
}
