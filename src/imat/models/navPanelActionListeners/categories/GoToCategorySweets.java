/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.models.navPanelActionListeners.categories;

import imat.IMat;
import imat.models.navPanelActionListeners.ActionCommand;
import imat.panels.contentPanels.PanelSearchResult;
import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * @author Johan Swanberg
 */
public class GoToCategorySweets implements ActionCommand{

    @Override
    public void doCommand() {
        IMat.getWindow().setContent(new PanelSearchResult(ProductCategory.SWEET));
        System.out.println("trying to go to sweets");
    }
    
}
