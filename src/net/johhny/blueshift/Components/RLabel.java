package net.johhny.blueshift.Components;

import javax.swing.*;
import java.awt.*;

/**
 * Created by johhnyhax
 *     on 06.02.17.
 */
public class RLabel extends JLabel{

    private int labelX,labelY,labelWidth,labelHeight;
    private String labelTxt = "";
    private Color ForegroundColor,backgroundColor;

    public RLabel(int x, int y, int width, int height)
    {
        this.labelX = x;
        this.labelY = y;
        this.labelWidth = width;
        this.labelHeight = height;
        this.setBounds(labelX,labelY,labelWidth,labelHeight);
    }

    public RLabel(String labelTxt1,int labelWidth, int labelHeight, int x, int y)
    {
        this.labelTxt = labelTxt1;
        this.setText(labelTxt);
        this.labelX = x;
        this.labelY = y;
        this.labelWidth = labelWidth;
        this.labelHeight = labelHeight;
    }

    public RLabel(String labelTxt1,Color foregroundColor,Color backgroundColor,int labelWidth, int labelHeight, int x, int y)
    {
        this.labelTxt = labelTxt1;
        this.setForeground(foregroundColor);
        this.setBackground(backgroundColor);
        this.labelWidth = labelWidth;
        this.labelHeight = labelHeight;
        this.labelX = x;
        this.labelY = y;
    }

    public void setText(String text)
    {
        super.setText(text);
        labelTxt = text;
    }


    public void setBounds(int x, int y, int width, int height)
    {
        super.setBounds(x,y,width,height);
        this.labelX = x;
        this.labelY = y;
        this.labelWidth = width;
        this.labelHeight = height;
    }

}
