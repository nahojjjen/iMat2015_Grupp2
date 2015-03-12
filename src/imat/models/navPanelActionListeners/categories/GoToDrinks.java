/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.models.navPanelActionListeners.categories;

import imat.IMat;
import imat.models.navPanelActionListeners.ActionCommand;
import imat.panels.contentPanels.PanelSearchResult;
import java.util.ArrayList;
import java.util.List;
import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * @author Morpheus
 */
public class GoToDrinks implements ActionCommand{

    @Override
    public void doCommand() {
        List<ProductCategory> categoryList = new ArrayList();
        categoryList.add(ProductCategory.HOT_DRINKS);
        categoryList.add(ProductCategory.COLD_DRINKS);
        
        IMat.getWindow().setContent(new PanelSearchResult(categoryList, 1));
        
    }
}
