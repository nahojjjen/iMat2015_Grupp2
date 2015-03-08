/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.models;

import java.awt.Color;
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
    
        public static Color getColor(ProductCategory category){
        if(category == ProductCategory.HERB){
            return new Color(100,200,100);
        }else if (category == ProductCategory.BERRY) {
            return new Color(100,100,250);
        }else if (category == ProductCategory.BREAD) {
            return new Color(160,160,100);
        }else if (category == ProductCategory.CABBAGE) {
            return new Color(120,200,80);
        }else if (category == ProductCategory.CITRUS_FRUIT) {
            return new Color(180,180,90);
        }else if (category == ProductCategory.COLD_DRINKS) {
            return new Color(150,100,230);
        }else if (category == ProductCategory.DAIRIES) {
            return new Color(150,150,150);
        }else if (category == ProductCategory.EXOTIC_FRUIT) {
            return new Color(150,100,150);
        }else if (category == ProductCategory.FISH) {
            return new Color(60,150,230);
        }else if (category == ProductCategory.FLOUR_SUGAR_SALT) {
            return new Color(150,150,150);
        }else if (category == ProductCategory.FRUIT) {
            return new Color(230,150,150);
        }else if (category == ProductCategory.HOT_DRINKS) {
            return new Color(200,100,100);
        }else if (category == ProductCategory.MEAT) {
            return new Color(200,100,100);
        }else if (category == ProductCategory.MELONS) {
            return new Color(200,100,100);
        }else if (category == ProductCategory.NUTS_AND_SEEDS) {
            return new Color(100,100,100);
        }else if (category == ProductCategory.PASTA) {
            return new Color(200,200,100);
        }else if (category == ProductCategory.POD) {
            return new Color(100,150,100);
        }else if (category == ProductCategory.POTATO_RICE) {
            return new Color(130,130,130);
        }else if (category == ProductCategory.ROOT_VEGETABLE) {
           return new Color(200,150,150); 
        }else if (category == ProductCategory.SWEET) {
            return new Color(160,100,180);
        }else if (category == ProductCategory.VEGETABLE_FRUIT) {
            return new Color(100,160,100);
        }
        return null;
    }
}
