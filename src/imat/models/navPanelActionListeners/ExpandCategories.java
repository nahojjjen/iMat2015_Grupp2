/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.models.navPanelActionListeners;

import imat.panels.modulePanels.PanelNavigation2;

/**
 *
 * @author Johan Swanberg
 */
public class ExpandCategories implements ActionCommand{

    @Override
    public void doCommand() {
        PanelNavigation2.toggleExpanded();
        
    }
    
}
