package net.johhny.blueshift;

import net.johhny.blueshift.Components.RButton;
import net.johhny.blueshift.Components.RFrame;
import net.johhny.blueshift.Components.RPanel;

/**
 * Created by johhnyhax
 *     on 06.02.17.
 */
public class Start {

    private RPanel panel;
    private RFrame frame;
    private RButton button;

    public static void main(String[] args){

        System.out.println("           Made By Johhnyhax          ");
        System.out.println("--------------------------------------");
        System.out.println("https://github.com/johhnyhax/Blueshift");
        System.out.println("--------------------------------------");

        RPanel panel = new RPanel();
        RFrame frame = new RFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setContentPane(panel);

    }
}
