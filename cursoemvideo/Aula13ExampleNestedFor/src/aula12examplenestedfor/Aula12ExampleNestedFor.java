/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12examplenestedfor;


public class Aula12ExampleNestedFor {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j <= 2; j += 2) {
                System.out.println(i +", " + j);
            }
        }
    }
    
}
