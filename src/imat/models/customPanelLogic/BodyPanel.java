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
    
    
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(210,220,210));
        g.fillRect(0, 0, 2000, 2000);
         Color lineColor = new Color(210,210,200);
       
        drawStripes(g, lineColor, 4);
        
    }
    
    private void drawStripes(Graphics g, Color c, int lineWidth){
       
            int width = this.getWidth();
        int height = this.getHeight();
        g.setColor(c);
       for (int x=0; x<width; x++){
           for (int y=0; y<height; y++){
               if ((x+y)%lineWidth == 1){
                   g.drawLine(x, y, x, y);
               }
           }
       }
    }
    
}
