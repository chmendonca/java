/*
 * Class: 10
 * Class examples
 * Objective: To implement a nested decision if, else if 
 * @author Cassio - 17Apr2020
 * help: 
 * Obs.: 
 */

package aula10exemploidadeeleitoral;

import java.util.Scanner;

public class Aula10ExemploIdadeEleitoral {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com o ano de Nascimento: ");
        int nasc = teclado.nextInt();
        int idade = 2020 - nasc;
        System.out.println(String.format("Sua idade é: %d", idade));
        if (idade<16) {
            System.out.println("NÃO VOTA");
        } else {
            if (idade>=16 && idade<18 || idade>70) {
                System.out.println("VOTO OPCIONAL");
            } else {
                System.out.println("VOTO OBRIGATÓRIO");
            }
        }
    }
    
}
