/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12exemplodowhile;

/**
 *
 * @author Cassio
 */
public class Aula12ExemploDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cc = 0;
        do {
            System.out.println("Cambalhota número: " + (cc+1));
            cc++;
        }while (cc<4);
        System.out.println("Cansei de dar cambalhotas!!!");
       }
    }
