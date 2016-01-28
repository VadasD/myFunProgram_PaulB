/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungui;
import java.util.Scanner;
/**
 *extends the widget class
 * @author Paul
 */
public class extendedWidget extends Wiget {
    /**
     * public string variable name
     */
    public String name;
    /**
     * Scanner asking for name
     */
     public extendedWidget(){
        
        Scanner scan = new Scanner(System.in);
                System.out.println("Please enter you name");
                name = scan.nextLine();
                
    }
    
}

