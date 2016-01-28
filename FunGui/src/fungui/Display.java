/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungui;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

/**
 *
 * @author Paul
 */
public class Display extends JPanel implements ActionListener{
    
    //inits
    private JButton print;
    private JLabel label;
    public extendedWidget things ;
    /**
     * Display constructor inherits from JPanel
     */
    public Display(){
        print = new JButton("Click ME!");
        label = new JLabel("Look at your Console");
        
        //set window size
        setPreferredSize(new Dimension(245, 136));
        // layout manager
        setLayout(null);
        
        add(print);
        add(label);
        
        print.setBounds(70, 10, 100, 25);
        label.setBounds(20,45,210,35);
        setBackground(Color.pink);
        
        print.addActionListener(this);
        
    }
    /**
     * Button action
     * @param e the event
     */
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == print){
            things = new extendedWidget();
            this.label.setText(things.name);
            
        } 
    }
}
