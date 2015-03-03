/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.models.customPanelLogic;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Johan
 */
public class BodyPanel extends JPanel{
    
    int lineWidth = 4;
    @Override
    public void paintComponent(Graphics g){
        int width = this.getWidth();
        int height = this.getHeight();
        g.setColor(new Color(200,230,200));
       for (int x=0; x<width; x++){
           for (int y=0; y<height; y++){
               if ((x+y)%lineWidth == 1){
                   g.drawLine(x, y, x, y);
               }
           }
       }
    }
    
}
