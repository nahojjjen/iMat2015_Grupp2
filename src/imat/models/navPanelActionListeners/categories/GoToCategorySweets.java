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
 * @author Johan Swanberg
 */
public class GoToCategorySweets implements ActionCommand{

    @Override
    public void doCommand() {
        
        ///ska ändras tillbaka till sweets, men detta e en template för hur man gör multikategorier 
        /**
         
        List<ProductCategory> categoryList = new ArrayList();
        categoryList.add(ProductCategory.POD);
        categoryList.add(ProductCategory.BERRY);
        
        IMat.getWindow().setContent(new PanelSearchResult(categoryList, 1));
        System.out.println("trying to go to sweets");
        * **/
        
        IMat.getWindow().setContent(new PanelSearchResult(ProductCategory.SWEET));
        
        
        
        
    }
    
}
