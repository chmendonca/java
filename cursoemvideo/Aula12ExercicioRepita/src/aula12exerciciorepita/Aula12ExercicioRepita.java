/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12exerciciorepita;

import javax.swing.JOptionPane;

public class Aula12ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*JOptionPane.showMessageDialog(null,"Olá Mundo!", "Boas Vindas", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"Olá Mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Olá Mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);*/
        
        int n;
        int sum = 0;
        int counter = 0;
        int countEven = 0;
        int countOdd = 0;
        int countAbove100 = 0;
        float avg = 0;
        
        //JOptionPane.showMessageDialog(null, "O número é : " + n);
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número <br><em>(valor 0 interrompe)</em>: </html>"));
            if (n == 0) {
                break;
            } else {
                counter++;
                sum +=n;
                avg = (float) (sum/counter);
                if ((n % 2) == 0) countEven++;
                else countOdd++;
                if (n > 100) countAbove100++;
            }
            
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr> " + 
                "<br>Somatório vale: " + sum +
                "<br>Quantidade de números pares: " + countEven +
                "<br>Quantidade de números ímpares: " + countOdd +
                "<br>Quantidade de números maiores que 100: " + countAbove100 +
                "<br>Média dos valores: " + avg + "<html>");
        
    }
    
}
