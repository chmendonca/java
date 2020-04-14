/*
 * Class: 6
 * Class example
 * Objective: To use the primitive values and basic ways to set them
 * @author Cassio - 14Apr2020
 * help: 
 */

package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota = 8.5f;
        String nome = "Cassio";
        System.out.println("A nota é " + nota);
        System.out.printf("A nota é %.2f \n", nota);
        System.out.printf("A nota de %s é %.3f\n", nome, nota);
        System.out.format("A nota de %s é %.2f\n", nome, nota);
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nomeIn = entrada.nextLine();
        System.out.print("Digite a nota do Aluno: ");
        float notaIn = entrada.nextFloat();
        System.out.println("A nota é " + notaIn);
        System.out.printf("A nota é %.2f \n", notaIn);
        System.out.printf("A nota de %s é %.3f\n", nomeIn, notaIn);
        System.out.format("A nota de %s é %.2f\n", nomeIn, notaIn);
    }
    
}
