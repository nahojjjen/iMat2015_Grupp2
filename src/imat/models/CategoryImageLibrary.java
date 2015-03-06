/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.models;

import javax.swing.ImageIcon;
import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * @author Johan Swanberg
 */
public class CategoryImageLibrary {
    private static ImageIcon herbs = new ImageIcon("src/resources/categories/herbs.jpg");
    private static ImageIcon berry = new ImageIcon("src/resources/categories/berry.jpg");
    private static ImageIcon bread = new ImageIcon("src/resources/categories/bread.jpg");
    private static ImageIcon cabbage = new ImageIcon("src/resources/categories/cabbage.jpg");
    private static ImageIcon citrus = new ImageIcon("src/resources/categories/citrus.jpg");
    private static ImageIcon colddrink = new ImageIcon("src/resources/categories/colddrink.jpg");
    private static ImageIcon exoticfruit = new ImageIcon("src/resources/categories/exoticfruit.jpg");
    private static ImageIcon fish = new ImageIcon("src/resources/categories/fish.jpg");
    private static ImageIcon fruits = new ImageIcon("src/resources/categories/fruits.jpg");
    private static ImageIcon hotdrinks = new ImageIcon("src/resources/categories/hotdrinks.jpg");
    private static ImageIcon meat = new ImageIcon("src/resources/categories/meat.jpg");
    private static ImageIcon melon = new ImageIcon("src/resources/categories/melon.jpg");
    private static ImageIcon milk = new ImageIcon("src/resources/categories/milk.jpg");
    private static ImageIcon nutsandseeds = new ImageIcon("src/resources/categories/nutsandseeds.jpg");
    private static ImageIcon pasta = new ImageIcon("src/resources/categories/pasta.jpg");
    private static ImageIcon peas = new ImageIcon("src/resources/categories/peas.jpg");
    private static ImageIcon potatoandrice = new ImageIcon("src/resources/categories/potatoandrice.jpg");
    private static ImageIcon rootVegetables = new ImageIcon("src/resources/categories/rootVegetables.jpg");
    private static ImageIcon sugarsaltflour = new ImageIcon("src/resources/categories/sugarsaltflour.jpg");
    private static ImageIcon sweets = new ImageIcon("src/resources/categories/sweets.jpg");
    private static ImageIcon vegetablefruit = new ImageIcon("src/resources/categories/vegetablefruit.jpg");
    
    
    public static ImageIcon getPicture(ProductCategory category){
        if(category == ProductCategory.HERB){
            return herbs;
        }else if (category == ProductCategory.BERRY) {
            return berry;
        }else if (category == ProductCategory.BREAD) {
            return bread;
        }else if (category == ProductCategory.CABBAGE) {
            return cabbage;
        }else if (category == ProductCategory.CITRUS_FRUIT) {
            return citrus;
        }else if (category == ProductCategory.COLD_DRINKS) {
            return colddrink;
        }else if (category == ProductCategory.DAIRIES) {
            return milk;
        }else if (category == ProductCategory.EXOTIC_FRUIT) {
            return exoticfruit;
        }else if (category == ProductCategory.FISH) {
            return fish;
        }else if (category == ProductCategory.FLOUR_SUGAR_SALT) {
            return sugarsaltflour;
        }else if (category == ProductCategory.FRUIT) {
            return fruits;
        }else if (category == ProductCategory.HOT_DRINKS) {
            return hotdrinks;
        }else if (category == ProductCategory.MEAT) {
            return meat;
        }else if (category == ProductCategory.MELONS) {
            return melon;
        }else if (category == ProductCategory.NUTS_AND_SEEDS) {
            return nutsandseeds;
        }else if (category == ProductCategory.PASTA) {
            return pasta;
        }else if (category == ProductCategory.POD) {
            return peas;
        }else if (category == ProductCategory.POTATO_RICE) {
            return potatoandrice;
        }else if (category == ProductCategory.ROOT_VEGETABLE) {
           return rootVegetables; 
        }else if (category == ProductCategory.SWEET) {
            return sweets;
        }else if (category == ProductCategory.VEGETABLE_FRUIT) {
            return vegetablefruit;
        }
        return null;
    }
}
