/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresternarios;

/**
 *
 * @author Cassio
 */
public class OperadoresTernarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 14, n2 = 8, r, r1, r2;
        r = (n1>n2)?0:1;
        System.out.println(r);
        r1 = (n1>n2)?n1:n2;
        System.out.println(r1);
        r2 = (n1>n2)?n1+n2:n1-n2;
        System.out.println(r2);
    }
    
}
