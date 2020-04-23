/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14examplevetoresmesesdoano;

import java.util.Scanner;

/**
 *
 * @author Cassio
 */
public class Aula14ExampleVetoresMesesDoAno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ano;
        int fev;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o ano que você quer verificar os dias: ");
        ano = teclado.nextInt();
        
        if ((ano % 4) == 0) {
            if ((ano % 100) != 0) {
                System.out.println(ano + " é um ano bissexto!");
                fev = 29;
            } else if ((ano % 400) == 0) { 
                System.out.println(ano + " é um ano bissexto!");
                fev = 29;
            } else { 
                System.out.println(ano + " não é um ano bissexto.");
                fev = 28;
            }
        } else {
            System.out.println(ano + " não é um ano bissexto.");
            fev = 28;
        }
        
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun",
            "Jul","Ago","Set","Out","Nov","Dez"};
        int dias[] = {31,fev,31,30,31,30,31,31,30,31,30,31};
        for (int c = 0; c < mes.length; c++){
            System.out.println("O mês de " + mes[c] +
                    " tem " + dias[c] + " dias.");
        }
    
}
}
