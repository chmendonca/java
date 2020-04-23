/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15exerciciofuncao01;

import aula15exerciciofuncao01.Fatorial;

public class Aula15ExercicioFuncao01 {
    
    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        f.setValor(6);
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
    }
    
}
