/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.models.navPanelActionListeners;

/**
 *
 * @author Johan
 */
public class Debug2 implements ActionCommand{

    @Override
    public void doCommand() {
        System.out.println("Button clicked!!!");
    }
    
}
