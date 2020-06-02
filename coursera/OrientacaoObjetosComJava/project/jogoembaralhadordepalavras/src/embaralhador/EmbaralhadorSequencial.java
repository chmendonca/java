/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 21th, 2020
 * Course: Orienta��o a objetos com Java
 * Week: 6 (course final project)
 * Comments: Esta classe embaralha as palavras classificando as letras em ordem alfab�tica (sequencial).
 * A ordem � ASCII, portanto, s�o considerados crit�rios como mai�sculo/nin�sculo, acentua��o e n�meros.
 */

package embaralhador;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmbaralhadorSequencial implements RegrasEmbaralhador {

	private String palavraEmbaralhada = "";
	//private String letras;	
	
	public String embaralhar(String palavra) {
        List<String> pd = Arrays.asList(palavra.split(""));
		StringBuilder builder = new StringBuilder(); //Usado para agrupar as letras e depois transform�-las em palavras
		
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
