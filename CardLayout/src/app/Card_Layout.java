package app;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Card_Layout implements ActionListener {
    JFrame frame = new JFrame();
    CardLayout c_Layout;
    JPanel mainPanel, firstPanel, secondPanel;
    JButton but1, but2;
  Card_Layout() {
  

    frame.setSize(600, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());
    frame.setVisible(true);

    but1 = new JButton("firstCard");
    but2 = new JButton("secCard");
    but1.setBackground(Color.CYAN);
    but2.setBackground(Color.MAGENTA);
    //Add buttons to frame in BorderLayout
    frame.add(but1, BorderLayout.EAST);
    frame.add(but2, BorderLayout.WEST);
    // Create first Panel of GridLayout which is 2_row and 2_Coloumn
    firstPanel = new JPanel(new GridLayout(2,2));
    firstPanel.setBorder(new LineBorder(Color.BLACK, 3));
    secondPanel = new JPanel(new BorderLayout());
    secondPanel.setBorder(new LineBorder(Color.BLACK, 3));
    // Add buttons to firstPanel which is in GridLayout
    firstPanel.add(new JButton("1"));
    firstPanel.add(new JButton("2"));
    firstPanel.add(new JButton("3"));
    firstPanel.add(new JButton("4"));
    // Add three buttons to secondPanel which is in BorderLayout
    secondPanel.add(new JButton("5"), BorderLayout.NORTH);
    secondPanel.add(new JButton("6"), BorderLayout.SOUTH);
    secondPanel.add(new JButton("7"), BorderLayout.WEST);
    secondPanel.add(new JButton("8"), BorderLayout.EAST);
    secondPanel.add(new JButton("9"), BorderLayout.CENTER);
    
    
    // instaniate the CardLayout
    c_Layout = new CardLayout(40,30);
    mainPanel = new JPanel(c_Layout);  // Set CardLayout to main Panel
    //Add both Panel to main Panel
    mainPanel.add(firstPanel, "firstLayout");
    mainPanel.add(secondPanel, "SecondLayout");
    frame.add(mainPanel, BorderLayout.CENTER);  //keep main Panel it centre

    but1.addActionListener(this);
    but2.addActionListener(this);

  }


  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == but1){
      c_Layout.show(mainPanel, "firstLayout"); //if but1 click than firstPanel will open

    }
    else{
      c_Layout.show(mainPanel, "SecondLayout"); //if but2 click than secondPanle will open
    }
  }


  
  public static void main(String[] args) {
    new Card_Layout();
  }
}