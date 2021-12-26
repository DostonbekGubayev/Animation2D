package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class otishClass extends JPanel implements ActionListener {
    int [] massiv;
    int x=500;
    int y=0;
    int size=10;
    int xVelocity=1;
    int yVelocity=1;
    Random random=new Random();
    JButton button;
    Timer timer;
    boolean running;
    Label label;
    Desktop.Action action;
    DefaultButtonModel buttonModel;
    public  otishClass(){
        buttonModel=new JToggleButton.ToggleButtonModel();
        buttonModel.isPressed();
        button=new JButton("otish tugmasi");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource().equals(button)){
                    running=true;
                xVelocity=xVelocity*-1;}

                repaint();
            }
        });
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D graf=(Graphics2D) g;
        graf.setColor(Color.BLACK);
        graf.fillOval(x,y,size,size);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        x+=xVelocity;
        repaint();

    }
}
