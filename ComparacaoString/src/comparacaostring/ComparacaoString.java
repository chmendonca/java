/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Cassio
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String resultado;
        resultado = (nome1 == nome2)? "igual" : "diferente";
        System.out.println(resultado);
        resultado = (nome1 == nome3)? "igual" : "diferente";
        System.out.println(resultado);
        resultado = (nome1.equals(nome2))? "igual" : "diferente";
        System.out.println(resultado);
        resultado = (nome1.equals(nome3))? "igual" : "diferente";
        System.out.println(resultado);
    }
    
}
