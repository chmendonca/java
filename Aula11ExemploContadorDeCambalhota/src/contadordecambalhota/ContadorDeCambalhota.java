/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadordecambalhota;

/**
 *
 * @author Cassio
 */
public class ContadorDeCambalhota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cc = 0;
        while (cc < 10) {
            cc++;
            if (cc == 5 || cc == 7) {
                continue;
            }
            System.out.println("Cambalhota número: " + String.valueOf(cc+1));
        }
        System.out.println("Cansei de dar cambalhotas");
        
    }
    
}
