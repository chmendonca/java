/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: June 04th, 2020
 * Course: Orienta��o a objetos com Java
 * Week: 6 (course final project)
 * Comments: This version was created using only one array of strings and is getting a random word on the array
 * How it works: It imports a given text file with the words to be read. Once the file has been transformed in an
 *  String array, it gets the second of the system time (hour) and divides by 6 getting an integer between 0 and 9.
 *  This integer is used as seed for a random number that will be taken from the seed to the end of the array.
 *  It creates a new instance of the word to protect the system against inadvertent access then returns this word.
 */

package embaralhador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class BancoDePalavras {
		
	private List<String[]> lista = new ArrayList<>(); 
	private String[] bancoDePalavras;
	
	protected String[] palavrasDoArquivo(String file) {
		try {

			FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String str;
            while((str = br.readLine()) != null){
                lista.add(str.split(","));

            } 
    		
            br.close();
            
		} catch(IOException e) {
			System.out.println("Arquivo n�o encontrado!");
			
		}
		
		
		//lista.forEach(a -> System.out.println("a: " + Arrays.toString(a)));  
		for (String[] s : lista) {
			bancoDePalavras = s;
			
			System.out.println(bancoDePalavras.length);

			//System.out.println(bancoDePalavras[0]);	
			//System.out.println(bancoDePalavras[1]);
			//System.out.println(bancoDePalavras[5]);
			
			//System.out.println(Arrays.deepToString(s));
			
		}
		System.out.println(bancoDePalavras != null);
		if (bancoDePalavras != null) {
			System.out.println("notNull");
			for (int i = 0; i < bancoDePalavras.length; i++) {
				bancoDePalavras[i] = bancoDePalavras[i].replaceAll("\"","");
				//System.out.println(bancoDePalavras[i]);
			}
		
		}
		//lista.forEach(a -> System.out.println(a));  
		//System.out.println(bancoDePalavras.toString());
		return bancoDePalavras;     
	}

	protected String[] getBancoDePalavras(String file) {
		palavrasDoArquivo(file); //"frutas.txt"
		return bancoDePalavras;
	}



	protected String getPalavra() {
		
		//Se utilizar a classe "Random random = new Random();" a sequencia de palavras sempre ser� a mesma porque 
		// a seed desta fun��o � fixa
		//Random random = new Random();
		//int indice = random.nextInt(bancoDePalavras.length);
		
		//Foi ent�o implementado uma fun��o rand�mica que recebe uma semente diferente baseada na hora (segundo) do computador. 
		// Como a lista de palavras tem que ter no m�nimo vinte palavras, � utilizado o inteiro resultando do segundo atual
		// (0 a 59) dividido por 6 (seeds variam de 0 a 10). Esta fun��o vai receber um n�mero entre a seed (10) e o comprimento
		// da lista de palavras, ou seja, � um n�mero aleat�rio gerado a partir de uma seed aleat�ria que depende do hor�rio do
		// sistema.
		Calendar calendar = Calendar.getInstance();
		int segundo = calendar.get(Calendar.SECOND);
		int seed = segundo/6;
		
		getBancoDePalavras("frutas.txt");		
		
		int indice = seed + (int)(Math.random() * (bancoDePalavras.length-seed));		
		
		String palavra = new String(); //This returns a new object and doesn't affect the original object
		palavra = bancoDePalavras[indice]; //This gets the word with the aleatory indice
		System.out.println(indice + ", " + palavra.toUpperCase());
		
		return palavra.toUpperCase(); //The upper case was chosen as a pattern
	}


}
