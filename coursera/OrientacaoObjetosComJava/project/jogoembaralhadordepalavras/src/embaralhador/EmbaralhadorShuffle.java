/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 21th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Comments: Esta classe usa o embaralhador padrão do Java (shuffle)
 * MainResources: 
 * https://www.quickprogrammingtips.com/java/how-to-shuffle-a-word-in-java.html
 * https://www.devmedia.com.br/a-classe-stringbuilder-em-java/25609
 * https://self-learning-java-tutorial.blogspot.com/2019/05/java-shuffle-characters-in-string.html
 */

package embaralhador;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralhadorShuffle {

	private String palavraEmbaralhada = "";
	//private char letra;	
	
	private String embaralhar(String palavra) {
        List<String> pd = Arrays.asList(palavra.split(""));
        StringBuilder builder = new StringBuilder(); //Usado para agrupar as letras e depois transformá-las em palavras
        
        Collections.shuffle(pd);
        
        for (String letra : pd) {
        	builder.append(letra);
        }
        palavraEmbaralhada = builder.toString();
        //System.out.println(palavraEmbaralhada);
        return palavraEmbaralhada;
	}
	
	protected String getPalavraEmbaralhada(String palavra) {
		//Esta lógica garante que a palavra embaralhada é diferente da palavra
		//Palavras pequenas têm grande chance de serem embaralhadas automaticamente e o resultado ser a palavra original
		// sendo assim foi inserido um while de 3 vezes para tentar garantir que a palavra foi realmente embaralhada.
		int i = 0;
		embaralhar(palavra);
		while (i < 3) {
			if (palavra.equals(palavraEmbaralhada)) {
				embaralhar(palavra);
				System.out.println(palavra);
				i++;
			} else {
				break;
			}
	}
		
		return palavraEmbaralhada;
	}

}
