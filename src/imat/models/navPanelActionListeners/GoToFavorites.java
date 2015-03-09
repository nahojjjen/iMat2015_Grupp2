/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.models.navPanelActionListeners;

import imat.IMat;
import imat.panels.contentPanels.PanelSearchResult;

/**
 *
 * @author Johan Swanberg
 */
public class GoToFavorites implements ActionCommand{

    @Override
    public void doCommand() {
        IMat.getWindow().setContent(new PanelSearchResult("favorites"));
    }
    
}
