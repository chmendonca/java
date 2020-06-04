/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: June 3rd, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Comments: This class is used to demonstrate that the "EmbaralhadorSequencial" is working properly. The manner to demonstrate
 *  that was to create another method (dissimilar) to set the letters in a sequencial logic. The project class uses the method
 *  "sort" available on Java, while the test class uses the a manual method. This ensures dissimilarity of code thus it fits
 *  well to demonstrate that the code is working properly.
 *  Resources:
 *  https://www.tutorialspoint.com/how-to-sort-a-string-in-java-alphabetically-in-java
 *  https://www.devmedia.com.br/java-string-manipulando-metodos-da-classe-string/29862
 *  https://www.guj.com.br/t/como-converter-list-em-string/87369/4
 *  https://www.geeksforgeeks.org/java-string-tochararray-example/
 *  https://qastack.com.br/software/147134/how-should-i-test-randomness
 */

package embaralhador;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteEmbaralhadorSequencial {
	
	EmbaralhadorSequencial es;
	BancoDePalavrasOld bp;
	StringBuilder builder;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		es = new EmbaralhadorSequencial();
		bp = new BancoDePalavrasOld();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	public String chamadaDoEmbaralhadorSequencial(String p) {
		String palavra =  es.getPalavraEmbaralhada(p);
		//System.out.println(palavra);
		return palavra;
	}
	
	public String embaralhadorDissimilar(String p) {
		List<String> listaLetras = new ArrayList<String>(p.length());
		String palavra = "";	
			
		//Transforma a palavra em um array de caracteres
		char[] letras = p.toCharArray();
		
		//Para cada letra no array de caracteres
		for (int i = 0; i < p.length(); i++) {
			for(int j = i+1; j < p.length(); j++) {
				if(letras[i]>letras[j]) {
					char temp = letras[i];
	                letras[i] = letras[j];
	                letras[j] = (char) temp;
	            }
			}
		}    
		
		for (int i = 0; i < p.length(); i++) {
			listaLetras.add(Character.toString(letras[i]));
		}
		//System.out.println(listaLetras);
		
		//Transforma o array de letras em uma palavra novamente
		for (String l : listaLetras) {
			palavra += l;
		}
		//System.out.println(palavra);
		return palavra;

	}
		
	@Test
	public void testeDeDissimilaridade() {
		for (String p : bp.getBancoDePalavras()) {			
			p = p.toUpperCase();
			assertEquals(chamadaDoEmbaralhadorSequencial(p),embaralhadorDissimilar(p));
		}
	}
	
}
