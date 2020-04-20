/*
 * Class: 4 (exercises)
 * Second homework
 * Objective: To create a code to get the screen resolution
 * @author Cassio - 09Apr2020
 * help: http://alvinalexander.com/blog/post/jfc-swing/how-determine-get-screen-size-java-swing-app/
 */

package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //System.out.println(screenSize.getHeight());
        //System.out.println(screenSize.getWidth());
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        //System.out.println(screenHeight);
        //System.out.println(screenWidth);
        
        System.out.print("Sua tela tem resolução ");
        System.out.print(screenHeight);
        System.out.print(" x ");
        System.out.println(screenWidth);
        
        
        
               
        
    }
    
}
