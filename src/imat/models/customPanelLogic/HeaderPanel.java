/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.models.customPanelLogic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Johan
 */
public class HeaderPanel extends JPanel{
    
        BufferedImage leftImage;
        BufferedImage rightImage;
        

    public HeaderPanel() {
         try {                
          leftImage = ImageIO.read(new File("src/resources/headerleft.png"));
          rightImage = ImageIO.read(new File("src/resources/headerright.png"));
       } catch (IOException ex) {
             System.out.println("cannot find header image");
       }
         
      
    }
    @Override
    public  void paintComponent(Graphics g){
        super.paintComponent(g);
        int screenWidth = this.getWidth();
        int screenHeight = this.getHeight();
        int rightImageWidth = rightImage.getWidth();
        int rightImageHeight = rightImage.getHeight();
        g.setColor(new Color(120,150,80));
        g.fillRect(0, 0, screenWidth, 120);
        
        g.drawImage(leftImage, 0, 0, this);
        g.drawImage(rightImage, screenWidth-rightImageWidth, screenHeight-rightImageHeight, this);
        
        
    }
}
