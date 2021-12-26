package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.util.Objects;
import java.util.Random;

public class panelClass extends JPanel implements ActionListener {
    final  int PANEL_WIDTH=500;
    final  int PANEL_HEIGHT=500;
    int x=0,y=0,i=10,j=10,k=120,z=120;
    int xPositsiya=1;
    int yPositsiya=1;
    boolean ruuning;
    Timer timer;
    Image image;
    Image rasm;
    Image ujas;
    Image fonRasmi;
    JButton tugma;

    Random random;
    JLabel label,label1;
   public panelClass(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        timer=new Timer(0,this::actionPerformed);
        timer.start();
        image=new ImageIcon(getClass().getResource("a.png.jpg")).getImage();
       label=new JLabel();
       fonRasmi=new ImageIcon(getClass().getResource("fon.png.jpg")).getImage();
        tugma=new JButton("StopButton");
        label1=new JLabel("Empty");
        add(label1,BorderLayout.PAGE_END);
       ujas=new ImageIcon(getClass().getResource("ujas.png.jpg")).getImage();
       rasm=new ImageIcon(getClass().getResource("ujis.png.jpg")).getImage();
       rasm.setAccelerationPriority(1);

        tugma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(tugma))
                    timer.stop();
                label1.setText("Stop button clicked");
            }
        });
        javax.swing.JButton button=new JButton("runButton");
        button.getAccessibleContext();
        button.getActionListeners();
        button.setBackground(Color.BLUE);
        button.setForeground(Color.BLACK);
        button.setDebugGraphicsOptions(1);
        add(tugma,BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
                if(e.getSource().equals(button))
                    setFocusCycleRoot(true);
                i+=xPositsiya;
                repaint();
                label1.setText("Run button clicked");
            }
        });
        add(button,BorderLayout.NORTH);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d=(Graphics2D) g;

        g2d.drawImage(fonRasmi,0,0,null);
        g2d.drawImage(image,x,y,null);
       // g2d.drawImage(ujas,image.getWidth(null),image.getHeight(null),null);
        //g2d.drawImage(rasm,ujas.getWidth(null),ujas.getHeight(null),null);
    }

    public void actionPerformed(ActionEvent e) {
        if(x>PANEL_WIDTH||x<0){
            xPositsiya=xPositsiya*-1;
            yPositsiya=yPositsiya*-1;
        }
       x+=xPositsiya;
       y+=yPositsiya;
       i+=xPositsiya;
       k++;
        repaint();
    }

    }
