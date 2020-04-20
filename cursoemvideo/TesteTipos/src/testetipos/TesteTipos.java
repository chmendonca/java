/*
 * Class: 6
 * Class example
 * Objective: To convert primitive values and their errors
 * @author Cassio - 14Apr2020
 * help: 
 */

package testetipos;

/**
 *
 * @author Cassio
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade = 20;
        //String valor = idade; //incompativeis
        //String valor = (String) idade //incompativeis
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        String valor2 = "50";
        //int idade = valor; //incompativeis
        //int idade = (int) valor; //incompatíveis
        int idade2 = Integer.parseInt(valor2);
        System.out.println("A idade convertida de string é " + idade2);
        
        String valor3 = "50.5";
        //int idade = valor; //incompativeis
        //int idade = (int) valor; //incompatíveis
        float idade3 = Float.parseFloat(valor3);
        System.out.println("A idade convertida de string é " + idade3);
    }
    
}
