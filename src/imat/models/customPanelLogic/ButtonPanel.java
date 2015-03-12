/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat.models.customPanelLogic;

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
public class ButtonPanel extends JPanel {
private BufferedImage image;
    public ButtonPanel(String imagePath, String word) {

        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException ex) {
            System.out.println("cannot find header image");
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
