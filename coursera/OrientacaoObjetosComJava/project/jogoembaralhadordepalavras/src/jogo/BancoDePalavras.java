/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 21th, 2020
 * Course: Orienta��o a objetos com Java
 * Week: 6 (course final project)
 * Release Changes: first release
 * Comments: This version was created using only one array of strings and is getting a random word on the array
 */

package jogo;

import java.util.Random;

public class BancoDePalavras {

	private String bancoDePalavras[] = {"quarentena","isolamento","apartamento","dist�ncia","computador",
			"programa��o","�gua","exce��o","testes","construtor",
			"p�blico","privado","protegido","padr�o","final",
			"super","classe","colabora��o","eclipse","objetos"};

	public String getPalavra() {
		Random random = new Random();
		String palavra = new String(); //This returns a new object and doesn't affect the original object
		int indice = random.nextInt(bancoDePalavras.length);
		palavra = bancoDePalavras[indice];
		System.out.println(indice + ", " + palavra.toUpperCase());
		return palavra.toUpperCase();
	}
	
}
