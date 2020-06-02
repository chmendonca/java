/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 30th, 2020
 * Course: Orienta��o a objetos com Java
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
	private String bancoDePalavras[] = {"quarentena","isolamento","apartamento","dist�ncia","computador",
			"programa��o","�gua","exce��o","testes","construtor",
			"p�blico","privado","protegido","padr�o","final",
			"super","classe","colabora��o","eclipse","objetos"};
*/
	
	//frutas
	private String bancoDePalavras[] = {"Ma��","Banana","Damasco","Mirtilo","Amora",
			"Framboesa","Cereja","Figo","Lim�o","Mel�o", //10
			"Laranja","Mam�o","Abacaxi","Ameixa","Rom�",
			"P�ra","P�ssego","Melancia","Uvas","T�mara", //20
			"Abacate","Acerola","A�a�","Graviola","Jaca",
			"Manga","Jabuticaba","Pequi","Mexerica","Pitaia", //30
			"Pitanga","Caj�","Caju","Caqui","Carambola",
			"Seriguela","Coco","Cupua�u","Pinha","Goiaba", //40
			"Guaran�","Jambo","Jenipapo","Kiwi","Lichia",
			"Maracuj�","Marmelo","Morango","Nectarina","Umbu", //50
			"Tamarindo"}; 

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
		int indice = seed + (int)(Math.random() * bancoDePalavras.length-seed);		
		
		String palavra = new String(); //This returns a new object and doesn't affect the original object
		palavra = bancoDePalavras[indice];
		//System.out.println(indice + ", " + palavra.toUpperCase());
		
		return palavra.toUpperCase();
	}
	
}
