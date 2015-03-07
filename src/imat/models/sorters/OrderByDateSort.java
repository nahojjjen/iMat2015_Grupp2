/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.models.sorters;

import java.util.Comparator;
import se.chalmers.ait.dat215.project.Order;

/**
 *
 * @author Johan Swanberg
 */
public class OrderByDateSort implements Comparator<Order>{

    @Override
    public int compare(Order o1, Order o2) {
        return -1*o1.getDate().compareTo(o2.getDate());
    }
    
    
}
