package app;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import static java.lang.System.exit;
import javax.swing.*;

public class BoxLayout extends JFrame implements WindowListener, LayoutManager {

    Button buttons[];
    public BoxLayout() 
    {
        buttons = new Button[5];
        for (int i = 0; i < 5; i++) {
            buttons[i] = new Button("Button " + (i + 1));
            add(buttons[i]);
            buttons[i].setBackground(Color.orange);
        }

        
        setSize(400, 400);
        setLayout(new BoxLayout());
        setVisible(true);
        addWindowListener(this);
            
    }

    public static void main(String args[]) {
        new BoxLayout();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
      exit(0);
      //sir G we can also used dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addLayoutComponent(String name, Component comp) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeLayoutComponent(Component comp) {
        // TODO Auto-generated method stub

    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void layoutContainer(Container parent) {
        // TODO Auto-generated method stub

    }
}
