/*
 * Class: 10
 * Class examples
 * Objective: This example implements a decision based on switch/case 
 * @author Cassio - 17Apr2020
 * help: 
 * Obs.: 
 */

package aula10exemplonumerodepernas;

import java.util.Scanner;

public class Aula10ExemploNumeroDePernas {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de pernas do ser: ");
        int pernas = teclado.nextInt();
        String ente;
        System.out.print("Isso é um(a) ");
        switch (pernas) {
            case 1:
                ente = "Saci";
                break;
            case 2:
                ente = "Bípede";
                break;
            case 4:
                ente = "Quadrúpede";
                break;
            case 6:
                ente = "Aranha";
                break;
            default:
                ente = "ET";
        }
        System.out.println(ente);
    }
    
}
