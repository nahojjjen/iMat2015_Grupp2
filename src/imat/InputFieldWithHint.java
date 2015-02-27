/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

/**
 *
 * @author Johan
 */
public class InputFieldWithHint extends JTextField implements FocusListener{

    private String hint;
    
    public InputFieldWithHint(String input){
        hint = input;
    }
    
    @Override
    public void focusGained(FocusEvent e) {
          if(this.getText().equals(hint)){
            this.setText("");
            this.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
               if(this.getText().equals("")){
            this.setForeground(new Color(80,80,80));
            this.setText(hint);
        }
    }
    
    
}
