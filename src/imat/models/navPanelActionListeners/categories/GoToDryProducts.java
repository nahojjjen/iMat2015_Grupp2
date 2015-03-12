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
public class GoToDryProducts implements ActionCommand{

    @Override
    public void doCommand() {
        List<ProductCategory> categoryList = new ArrayList();
        categoryList.add(ProductCategory.BREAD);
        categoryList.add(ProductCategory.FLOUR_SUGAR_SALT);
        categoryList.add(ProductCategory.NUTS_AND_SEEDS);
        categoryList.add(ProductCategory.PASTA);
        categoryList.add(ProductCategory.POTATO_RICE);
        
        IMat.getWindow().setContent(new PanelSearchResult(categoryList, 1));
        
    }
}
