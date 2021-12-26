package com.company;

import javax.swing.*;
import java.awt.*;

public class oynaClass extends JFrame {
    public oynaClass(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocation(250,150);
        this.setSize(500,500);
        this.add(new panelClass(), BorderLayout.CENTER);
       com.company. otishClass otishClass = new otishClass();
       //add(otishClass,BorderLayout.BEFORE_FIRST_LINE);
    }
}
