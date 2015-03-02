/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.util.List;
import se.chalmers.ait.dat215.project.*;



/**
 *
 * @author Johan
 */
public class IMat {

    private static final Color headerColor = new Color(80,150,240);
    //private static final Color headerShadowColor = new Color(80,80,160);
    //private static final Color highlightButtonColor = new Color(200,200,255);
    private static final Color redAccent = new Color(80,200,80);
    
    private static final Color backgroundColor = new Color(240,240,240);
    private static final Color averageColor = new Color(245,245,245);
    private static final Color foregroundColor = new Color(250,250,250);
    
    private static boolean loggedIn = false;
    private static MainWindow program;
    
    private static boolean groupSearchItems = true;
    private static int sortingType = 0;
    /**
     * @param args unused
     */
    public static void main(String[] args) {

     //Starts the program
        program = new MainWindow();
        program.setVisible(true);  
        
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
                public void run() {
                    
                    System.out.println("Saving & exiting....... \n \n");
                    Model.shutDown();
                }
            }, "SaveOnShutDown"));
    }
    public static MainWindow getWindow(){
        return program;
    }
    
    public static boolean isLoggedin(){
        return loggedIn;
    }
    public static void setLoggedin(boolean isLoggedin){
        loggedIn = isLoggedin;
        program.refreshLoggedin();
    }

    /**
     * @return the headerColor
     */
    public static Color getHeaderColor() {
        return headerColor;
    }



    /**
     * @return the backgroundColor
     */
    public static Color getBackgroundColor() {
        return backgroundColor;
    }

       /**
     * @return the backgroundColor
     */
    public static Color getAccentColor() {
        return redAccent;
    }

    
    /**
     * @return the averageColor
     */
    public static Color getAverageColor() {
        return averageColor;
    }

    /**
     * @return the foregroundColor
     */
    public static Color getForegroundColor() {
        return foregroundColor;
    }

    /**
     * @return the groupSearchItems
     */
    public static boolean isGroupSearchItems() {
        return groupSearchItems;
    }

    /**
     * @param aGroupSearchItems the groupSearchItems to set
     */
    public static void setGroupSearchItems(boolean aGroupSearchItems) {
        groupSearchItems = aGroupSearchItems;
    }

    /**
     * @return the sortingType
     */
    public static int getSortingType() {
        return sortingType;
    }

    /**
     * @param aSortingType the sortingType to set
     */
    public static void setSortingType(int aSortingType) {
        sortingType = aSortingType;
    }
}
