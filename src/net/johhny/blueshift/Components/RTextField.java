package net.johhny.blueshift.Components;

import javax.swing.*;

/**
 * Created by johhnyhax
 *     on 06.02.17.
 */
public class RTextField extends JTextField{
    private int TextFieldX,TextFieldY,TextFieldWidth,TextFieldHeight;
    private String TextFieldTxt = "";

    public RTextField(int x, int y, int width, int height)
    {
        this.TextFieldX = x;
        this.TextFieldY = y;
        this.TextFieldWidth = width;
        this.TextFieldHeight = height;
        this.setBounds(TextFieldX,TextFieldY,TextFieldWidth,TextFieldHeight);
    }

    public RTextField(String TextFieldTxt1,int TextFieldWidth, int TextFieldHeight, int x, int y)
    {
        this.TextFieldTxt = TextFieldTxt1;
        this.setText(TextFieldTxt);
        this.TextFieldX = x;
        this.TextFieldY = y;
        this.TextFieldWidth = TextFieldWidth;
        this.TextFieldHeight = TextFieldHeight;
    }

    public void setText(String text)
    {
        super.setText(text);
        TextFieldTxt = text;
    }


    public void setBounds(int x, int y, int width, int height)
    {
        super.setBounds(x,y,width,height);
        this.TextFieldX = x;
        this.TextFieldY = y;
        this.TextFieldWidth = width;
        this.TextFieldHeight = height;
    }
    
}
