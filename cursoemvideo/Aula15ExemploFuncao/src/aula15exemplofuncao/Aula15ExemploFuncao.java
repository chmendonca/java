/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15exemplofuncao;

/**
 *
 * @author Cassio
 */
public class Aula15ExemploFuncao {
    
    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s);
    }
    
    static int sum(int a, int b) {
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        System.out.println("Começou o programa - este bloco é o primeiro a ser executado");
        soma(5,2);
        System.out.println("O valor da soma é: " + sum(4,9));
        int sm = sum(3,2);
        System.out.println("O int da soma é:" + sm);
    }
    
}
