/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14examplevetoresforeach;

import java.util.Arrays;

public class Aula14ExampleVetoresForEach {
    
    public static void main(String[] args) {
        int num[] = {3,5,1,8,4};
        for (int valor : num){
            System.out.println("O valor da posição no vetor é: " + valor);
        }
    
        double num1[] = {3.5,5.2,-1,8.23,-4.01};
        
        Arrays.sort(num1);
        
        for (double valor1 : num1){
            System.out.println("O valor da posição no vetor é: " + valor1);
        }
        
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v:vet){
            System.out.print(v);            
        }
        System.out.println("");
        int pos = Arrays.binarySearch(vet, 1);
        System.out.println("O valor 9 esta na posição do vetor é: " + pos);
        
        int vet1[] = new int[20];
        Arrays.fill(vet1, 0);
        for (int valor : vet1){
            System.out.println("Posição preenchida com o valor: " + valor);
        }
        
        
        
            
    }
    
    
}
