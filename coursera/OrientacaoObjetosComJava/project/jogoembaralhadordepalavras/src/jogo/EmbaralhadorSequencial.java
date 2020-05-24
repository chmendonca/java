/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 21th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Release Changes: first release
 * Comments: This class shuffle the word using a sequencial logic. The words are split and and sorted in order (ASCII) then
 * returned.
 */

package jogo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmbaralhadorSequencial implements RegrasEmbaralhador {

	private String palavraEmbaralhada = "";
	//private String letras;	
	
	public String embaralhar(String palavra) {
        List<String> pd = Arrays.asList(palavra.split(""));
		StringBuilder builder = new StringBuilder();
		
		pd.sort(Comparator.naturalOrder());
		
		for (String l : pd) {
        	builder.append(l);
        }
		
		palavraEmbaralhada = builder.toString();
		//System.out.println(palavraEmbaralhada);
		//this.palavraDesordenada = letras.toString();
/*		
		for (char c : letras) {
			palavraDesordenada += c;
		}
		
		System.out.println(palavraDesordenada);
*/		
		return palavraEmbaralhada;
	}
	
	public String getPalavraEmbaralhada(String palavra) {
		embaralhar(palavra);
		return palavraEmbaralhada;
	}
	
	

}
