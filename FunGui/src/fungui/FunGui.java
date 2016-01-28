/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungui;
import javax.swing.JFrame;

/**
 *
 * @author Paul
 */
public class FunGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("X-Files");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // inits the display and populates the frame
        frame.getContentPane().add(new Display());
        //places the buttons where we told it to
        frame.pack();
        
        frame.setVisible(true);
        
    }
    
}
