/*
 * Class: 9
 * Class examples
 * Objective: To learn about multiple if conditions
 * @author Cassio - 17Apr2020
 * help: https://stackoverflow.com/questions/12421444/how-to-format-a-number-0-9-to-display-with-2-digits-its-not-a-date
 * Obs.: 
 */

package aula09exemplo01;

import java.util.Scanner;

/**
 *
 * @author Cassio
 */
public class Aula09Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n1, n2, media;
        n1 = (float) (7+ Math.random() * (10 - 7));
        n2 = (float) (8+ Math.random() * (10 - 8));
        System.out.println(String.format("As notas são %.2f e %.2f", n1, n2));
        media = (n1+n2)/2;
        System.out.println(String.format("A média do aluno é: %.2f", media));
        String check = (media >=9) ? "PARABÉNS" : "";
        System.out.println(check);
        System.out.println("");
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float n1t = teclado.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2t = teclado.nextFloat();
        float mt = (n1t + n2t) / 2;
        System.out.println(String.format("A média é: %.2f", mt));
        if (mt>=9){
            System.out.println("PARABÉNS");
        }
        System.out.println("");
        
        System.out.println("Digite o seu ano de nascimento (YYYY): ");
        int nasc = teclado.nextInt();
        int id = 2020 - nasc;
        System.out.println(String.format("A sua idade é %d", id));
        if (id>=18){
            System.out.println("Você é MAIOR de idade");
    } else {
            System.out.println("Você é MENOR de idade");
        }
        System.out.println("");
        
        
                
}
}
    