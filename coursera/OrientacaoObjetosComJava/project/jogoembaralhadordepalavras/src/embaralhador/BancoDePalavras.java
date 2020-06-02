/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 30th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Comments: This version was created using only one array of strings and is getting a random word on the array
 * How it works: It gets the second of the system time and divides by 6 getting an integer between 0 and 9. Then
 *  it sets this number as a seed for a random number that will be taken from the seed to the end of the array.
 *  It creates a new instance of the word to protect the system against inadvertent access then returns this word.
 */

package embaralhador;

import java.util.Calendar;
import java.util.Random;

public class BancoDePalavras {
	
	
/*  //quarentena + Java
	private String bancoDePalavras[] = {"quarentena","isolamento","apartamento","distância","computador",
			"programação","água","exceção","testes","construtor",
			"público","privado","protegido","padrão","final",
			"super","classe","colaboração","eclipse","objetos"};
*/
	
	//frutas
	private String bancoDePalavras[] = {"Maçã","Banana","Damasco","Mirtilo","Amora",
			"Framboesa","Cereja","Figo","Limão","Melão", //10
			"Laranja","Mamão","Abacaxi","Ameixa","Romã",
			"Pêra","Pêssego","Melancia","Uvas","Tâmara", //20
			"Abacate","Acerola","Açaí","Graviola","Jaca",
			"Manga","Jabuticaba","Pequi","Mexerica","Pitaia", //30
			"Pitanga","Cajá","Caju","Caqui","Carambola",
			"Seriguela","Coco","Cupuaçu","Pinha","Goiaba", //40
			"Guaraná","Jambo","Jenipapo","Kiwi","Lichia",
			"Maracujá","Marmelo","Morango","Nectarina","Umbu", //50
			"Tamarindo"}; 

	protected String getPalavra() {
		//Se utilizar a classe "Random random = new Random();" a sequencia de palavras sempre será a mesma porque 
		// a seed desta função é fixa
		//Random random = new Random();
		//int indice = random.nextInt(bancoDePalavras.length);
		
		//Foi então implementado uma função randômica que recebe uma semente diferente baseada na hora (segundo) do computador. 
		// Como a lista de palavras tem que ter no mínimo vinte palavras, é utilizado o inteiro resultando do segundo atual
		// (0 a 59) dividido por 6 (seeds variam de 0 a 10). Esta função vai receber um número entre a seed (10) e o comprimento
		// da lista de palavras, ou seja, é um número aleatório gerado a partir de uma seed aleatória que depende do horário do
		// sistema.
		Calendar calendar = Calendar.getInstance();
		int segundo = calendar.get(Calendar.SECOND);
		int seed = segundo/6;
		int indice = seed + (int)(Math.random() * bancoDePalavras.length-seed);		
		
		String palavra = new String(); //This returns a new object and doesn't affect the original object
		palavra = bancoDePalavras[indice];
		//System.out.println(indice + ", " + palavra.toUpperCase());
		
		return palavra.toUpperCase();
	}
	
}
