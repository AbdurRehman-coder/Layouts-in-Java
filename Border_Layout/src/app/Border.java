package app;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

import java.awt.BorderLayout;

public class Border implements ActionListener {
    JFrame frame = new JFrame();
    JButton but1 = new JButton("North button");
    JButton but2 = new JButton("South button");
    JButton but3 = new JButton("East button");
    JButton but4 = new JButton("West button");
    JButton but5 = new JButton("Center button");
    JButton but6 = new JButton("Another button");

    public Border() {
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout(5, 10));

        but1.setBackground(Color.RED);
        but2.setBackground(Color.BLUE);
        but3.setBackground(Color.YELLOW);
        but4.setBackground(Color.green);
        but5.setBackground(Color.LIGHT_GRAY);
        frame.add(but1, "North");
        frame.add(but2, "South");
        frame.add(but3, "East");
        frame.add(but6, "East");
        frame.add(but4, "West");
        frame.add(but5, "Center");
        frame.setVisible(true);

        but1.addActionListener(this);
    }

    public static void main(String[] args) {
        Border bor = new Border();

    }

  

    @Override
    public void actionPerformed(ActionEvent e) {
       but1.setVisible(false);
        

    }

   
 
}