/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: June 3rd, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Comments: This class try, but not proves completely, to demonstrate that the "EmbaralhadorShuffle" is shuffling the letters
 *  correctly and that none word is returned in the right order. To increase the number of samples, it was inserted a 50 times
 *  loop to run the "BancoDePalavras", thus it shows that in 50 times, the words were shuffled correctly.
 */

package embaralhador;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import embaralhador.EmbaralhadorShuffle;

public class TesteEmbaralhadorShuffle {
	
	EmbaralhadorShuffle es;
	BancoDePalavrasOld bp;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		es = new EmbaralhadorShuffle();
		bp = new BancoDePalavrasOld();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void palavrasEmbaralhadas() {
		for (int i = 0; i < 50; i++) {
			for (String p : bp.getBancoDePalavras()) {
				p = p.toUpperCase();
				String palavraEmbaralhada = es.getPalavraEmbaralhada(p);
				//System.out.println("palavra: " + p + ", embaralhada: " + palavraEmbaralhada);
				assertNotEquals(p,palavraEmbaralhada);
			}
		}
	}
}
