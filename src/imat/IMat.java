/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import imat.models.Model;
import java.awt.Color;
import se.chalmers.ait.dat215.project.IMatDataHandler;



/**
 *
 * @author Johan
 */
public class IMat {

    private static final Color headerColor = new Color(80,150,240);
    private static final Color redAccent = new Color(80,200,80);
    
    private static final Color backgroundColor = new Color(200,200,200);
    private static final Color averageColor = new Color(220,220,220);
    private static final Color foregroundColor = new Color(240,240,240);
    
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
                    Model.shutDown();
                }
            }, "SaveOnShutDown"));
    }
    
    /**
     * get the current running Mainwindow
     * @return MainWindow currently running
     */
    public static MainWindow getWindow(){
        return program;
    }
    
    /**
     * get whether the user has logged in or not
     * @return true if user is logged in
     */
    public static boolean isLoggedin(){
        return loggedIn;
    }
    
    /**
     * log in or log out the user
     * @param isLoggedin true if user logged in
     */
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
