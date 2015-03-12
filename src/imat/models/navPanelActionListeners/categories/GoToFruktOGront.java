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
public class GoToFruktOGront implements ActionCommand {
    
    @Override
    public void doCommand() {
        List<ProductCategory> categoryList = new ArrayList();
        categoryList.add(ProductCategory.FRUIT);
        categoryList.add(ProductCategory.POD);
        categoryList.add(ProductCategory.BERRY);
        categoryList.add(ProductCategory.CITRUS_FRUIT);
        categoryList.add(ProductCategory.EXOTIC_FRUIT);
        categoryList.add(ProductCategory.VEGETABLE_FRUIT);
        categoryList.add(ProductCategory.CABBAGE);
        categoryList.add(ProductCategory.MELONS);
        categoryList.add(ProductCategory.ROOT_VEGETABLE);
        categoryList.add(ProductCategory.HERB);
        
        
        IMat.getWindow().setContent(new PanelSearchResult(categoryList, 1));
        
    }
    
}
