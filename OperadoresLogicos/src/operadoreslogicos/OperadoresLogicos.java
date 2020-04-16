/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author Cassio
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, z;
        x = 4; y = 7; z = 12;
        boolean r, r1, r2, r3, r4;
        r = (x<y && y<z)?true:false;
        System.out.println(r);
        r1 = (x<y && y==z)?true:false;
        System.out.println(r1);
        r2 = (x<y || y==z)?true:false;
        System.out.println(r2);
        r3 = (x<y ^ y==z)?true:false;
        System.out.println(r3);
        r4 = (x<y ^ y==z)?true:false;
        System.out.println(r4);
        
    }
    
}
