/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.util.List;
import se.chalmers.ait.dat215.project.*;



/**
 *
 * @author Johan
 */
public class IMat {

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
}
