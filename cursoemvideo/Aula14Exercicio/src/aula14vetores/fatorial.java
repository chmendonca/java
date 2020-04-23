/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14vetores;

/**
 *
 * @author Cassio
 */
public class fatorial {
    
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    public static void setValor(int n) {
        num = n;
        int f = 1;
        for (int c = n; c > 1; c--) {
            f *= c;
            s += c + " x ";
        }
        s += "= 1 x " + s;
        fat = f;
        formula = s;
    }
    
    public static int getFatorial() {
        return fat;
    }
    
    public static String getFormula () {
        return formula;
    }
}
