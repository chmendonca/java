/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 21th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Release Changes: first release
 * Comments: This version was created using only one array of strings and is getting a random word on the array
 */

package jogo;

import java.util.Random;

public class BancoDePalavras {

	private String bancoDePalavras[] = {"quarentena","isolamento","apartamento","distância","computador",
			"programação","água","exceção","testes","construtor",
			"público","privado","protegido","padrão","final",
			"super","classe","colaboração","eclipse","objetos"};

	public String getPalavra() {
		Random random = new Random();
		String palavra = new String(); //This returns a new object and doesn't affect the original object
		int indice = random.nextInt(bancoDePalavras.length);
		palavra = bancoDePalavras[indice];
		System.out.println(indice + ", " + palavra.toUpperCase());
		return palavra.toUpperCase();
	}
	
}
