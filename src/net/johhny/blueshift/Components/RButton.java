package net.johhny.blueshift.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by johhnyhax
 *     on 06.02.17.
 */

public class RButton extends JButton implements ActionListener{

    private int buttonX,buttonY,buttonWidth,buttonHeight;
    private String buttonTxt = "";
    private Color ForegroundColor,backgroundColor;

    public RButton(int x, int y, int width, int height)
    {
       this.buttonX = x;
       this.buttonY = y;
       this.buttonWidth = width;
       this.buttonHeight = height;
       this.setBounds(buttonX,buttonY,buttonWidth,buttonHeight);
       this.setActionListener();
    }

    public RButton(String buttonTxt1,int buttonWidth, int buttonHeight, int x, int y)
    {
        this.buttonTxt = buttonTxt1;
        this.setText(buttonTxt);
        this.buttonX = x;
        this.buttonY = y;
        this.buttonWidth = buttonWidth;
        this.buttonHeight = buttonHeight;
    }

    public RButton(String buttonTxt1,Color foregroundColor,Color backgroundColor,int buttonWidth, int buttonHeight, int x, int y)
    {
       this.buttonTxt = buttonTxt1;
       this.setForeground(foregroundColor);
       this.setBackground(backgroundColor);
       this.buttonWidth = buttonWidth;
       this.buttonHeight = buttonHeight;
       this.buttonX = x;
       this.buttonY = y;
    }

    private void setActionListener()
    {
        this.addActionListener(this);
    }

    public void setText(String text)
    {
        super.setText(text);
        buttonTxt = text;
    }


    public void setBounds(int x, int y, int width, int height)
    {
        super.setBounds(x,y,width,height);
        this.buttonX = x;
        this.buttonY = y;
        this.buttonWidth = width;
        this.buttonHeight = height;
    }


    public void actionPerformed(ActionEvent e) {

    }
}
