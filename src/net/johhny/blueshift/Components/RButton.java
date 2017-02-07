package net.johhny.blueshift.Components;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by johhnyhax
 *     on 06.02.17.
 */

public class RButton extends JButton implements ActionListener{

private void setActionListener()
{
    this.addActionListener(this);
}


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
