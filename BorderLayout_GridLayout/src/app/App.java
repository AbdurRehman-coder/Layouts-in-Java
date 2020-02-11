package app;

import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;

public class App extends JFrame {

    public App(){
        super("Border, Grid Layout");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Creat Buttons which we will Add to different Panel
        JButton button_1 = new JButton("Button 1");
        JButton button_2 = new JButton("Button 2");
        JButton button_3 = new JButton("Button 3");
        JButton button_4 = new JButton("Button 4");
        JButton button_5 = new JButton("Button 5");
        JButton button_6 = new JButton("Button 6");
        JButton button_7 = new JButton("Button 7");
        JButton button_8 = new JButton("Button 8");
        JButton button_9 = new JButton("Button 9");
        JButton button_10 = new JButton("Button 10");
        JButton button_11 = new JButton("Button 11");

        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(8,6));
        mainContainer.setBackground(Color.YELLOW);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.GREEN));

        //Top Panel in the Frame
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.GREEN);
        topPanel.setBorder(new LineBorder(Color.BLACK, 3));
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        topPanel.add(button_1);
        topPanel.add(button_2);
        topPanel.add(button_3);
        topPanel.add(button_4);
        //Add topPanel to mainContainer using BorderLayout
        mainContainer.add(topPanel, BorderLayout.NORTH);

        //Middle Panel
        JPanel middlePanel = new JPanel();
        middlePanel.setBorder(new LineBorder(Color.BLACK, 3));
        middlePanel.setLayout(new FlowLayout(4,4,4));
        middlePanel.setBackground(Color.CYAN);

        //grid Panel which is GridLayout and we take 4 rows and 1 column
        JPanel gridPanel = new JPanel();
        gridPanel.setBorder(new LineBorder(Color.BLACK,3));
        gridPanel.setLayout(new GridLayout(4,1,5,5)); // 4 rows, 1 Column and space of 5
        gridPanel.setBackground(Color.RED);
        gridPanel.add(button_5);
        gridPanel.add(button_6);
        gridPanel.add(button_7);
        gridPanel.add(button_8);
        
        middlePanel.add(gridPanel);
        mainContainer.add(middlePanel, BorderLayout.WEST);

        //Label in the Center
        JLabel label = new JLabel("Centre Box", SwingConstants.CENTER);
        label.setOpaque(true); //Opaque method allow you to add other Colors
                            //when you false it you can it add some other colors to it
        label.setBorder(new LineBorder(Color.BLACK, 3));
        mainContainer.add(label);

        //Bottom Panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        bottomPanel.setBorder(new LineBorder(Color.BLACK, 5));
        bottomPanel.setBackground(Color.PINK);
        bottomPanel.add(button_9);
        bottomPanel.add(button_10);
        bottomPanel.add(button_11);
        mainContainer.add(bottomPanel, BorderLayout.SOUTH);


        

        


        setVisible(true);
    }








    public static void main(String[] args) {
    new App();
       
    }
} 