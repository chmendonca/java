/*
 * Class: 7
 * Class example
 * Objective: To demonstrate aritmethical operators, class Math, random nunbers
 * @author Cassio - 15Apr2020
 * help: 
 */

package operardoresaritmeticos;

/**
 *
 * @author Cassio
 */
public class OperardoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        //float m = n1 + n2/2;
        System.out.println("A média é igual a " + m);
        
        int numero = 5;
        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);
        
        int valor = 5 + numero++;
        System.out.println(valor);
        System.out.println(numero);
        int valor2 = 5 + ++numero;
        System.out.println(valor2);
        
        int num2 = 10;
        int valor3 = 4 + num2--;
        System.out.println(valor3);
        System.out.println(num2);
        
        int x = 4;
        x += 2;
        System.out.println(x);
        x -= 2;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        x /= 4;
        System.out.println(x);
        x %= 2;
        System.out.println(x);
        
        float raizQuadrada = (float) Math.sqrt(x + 9);
        System.out.println(raizQuadrada);
        
        double ale = Math.random();
        System.out.println(ale);
        
        int ale1 = (int) (5 + ale * (10 - 5));
        System.out.println(ale1);
        float ale2 = (float) (0 + ale * (20 - 0));
        System.out.println(ale2);
        int ale3 = (int) Math.round(ale2);
        System.out.println(ale3);
        
        
                
    }
    
}
