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

    private static final Color headerColor = new Color(123,123,240);
    private static final Color headerShadowColor = new Color(80,80,160);
    private static final Color highlightButtonColor = new Color(200,200,255);
    
    private static final Color backgroundColor = new Color(123,123,123);
    private static final Color averageColor = new Color(230,230,230);
    private static final Color foregroundColor = new Color(245,245,245);
    
    private static boolean loggedIn = false;
    private static MainWindow program;
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
    }

    /**
     * @return the headerColor
     */
    public static Color getHeaderColor() {
        return headerColor;
    }

    /**
     * @return the headerShadowColor
     */
    public static Color getHeaderShadowColor() {
        return headerShadowColor;
    }

    /**
     * @return the highlightButtonColor
     */
    public static Color getHighlightButtonColor() {
        return highlightButtonColor;
    }

    /**
     * @return the backgroundColor
     */
    public static Color getBackgroundColor() {
        return backgroundColor;
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
}
