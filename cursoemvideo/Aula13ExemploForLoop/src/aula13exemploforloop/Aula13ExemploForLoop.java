/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13exemploforloop;

/**
 *
 * @author Cassio
 */
public class Aula13ExemploForLoop {

    public static void main(String[] args) {
        for (int cc = 0;cc <= 3;cc++) {
            System.out.println("Cambalhota número: " + (cc+1));
        }
        System.out.println("Cansei de dar cambalhotas!");
        
        for (int cc = 3;cc <= 10;cc++) {
            System.out.println("Cambalhota número: " + (cc+1));
        }
        System.out.println("Cansei de dar cambalhotas!");
        
        for (int cc = 3;cc <= 10;cc+=2) {
            System.out.println("Cambalhota número: " + (cc++));
        }
        System.out.println("Cansei de dar cambalhotas!");
        
        for (int cc = 3;cc <= 10;cc+=2) {
            System.out.println("Cambalhota número: " + (cc));
        }
        System.out.println("Cansei de dar cambalhotas!");
        
        for (int cc = 15;cc >= 5;cc-=2) {
            System.out.println("Cambalhota número: " + (cc));
        }
        System.out.println("Cansei de dar cambalhotas!");
        
        for (int cc = 1;cc <= 100;cc+=10) {
            System.out.println("Cambalhota número: " + (cc));
        }
        System.out.println("Cansei de dar cambalhotas!");
        
        for (int cc = 0;cc <= 100;cc+=10) {
            System.out.println("Cambalhota número: " + (cc));
        }
        System.out.println("Cansei de dar cambalhotas!");
    }
    
}
