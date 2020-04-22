/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12exemplodowhilenumeros;

import java.util.Scanner;

/**
 *
 * @author Cassio
 */
public class Aula12ExemploDoWhileNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s +=n;
            System.out.print("Quer continuar [S/N]: ");
            resp = teclado.next(); //Poderia ser nextLine para ler uma string, mas se usado depois de um nextInt ele dá um erro
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é " + s);
    }
    
}
