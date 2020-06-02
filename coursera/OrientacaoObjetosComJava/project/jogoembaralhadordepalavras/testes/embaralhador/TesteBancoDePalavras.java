/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 21th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Release Changes: first release
 * Comments: This is a basic test sequence. Since the word is aleatory, only one test case will pass (for choosen word).
 */

package embaralhador;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import embaralhador.BancoDePalavras;

public class TesteBancoDePalavras {

	static BancoDePalavras bp;
	private static String palavraEscolhida;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		bp = new BancoDePalavras();
		palavraEscolhida = bp.getPalavra();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void fruta0() throws Exception {
		assertEquals("Maçã".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta1() throws Exception {
		assertEquals("Banana".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta2() throws Exception {
		assertEquals("Damasco".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta3() throws Exception {
		assertEquals("Mirtilo".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta4() throws Exception {
		assertEquals("Amora".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta5() throws Exception {
		assertEquals("Framboesa".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta6() throws Exception {
		assertEquals("Cereja".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta7() throws Exception {
		assertEquals("Figo".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta8() throws Exception {
		assertEquals("Limão".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta9() throws Exception {
		assertEquals("Melão".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta10() throws Exception {
		assertEquals("Laranja".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta11() throws Exception {
		assertEquals("Mamão".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta12() throws Exception {
		assertEquals("Abacaxi".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta13() throws Exception {
		assertEquals("Ameixa".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta14() throws Exception {
		assertEquals("Romã".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta15() throws Exception {
		assertEquals("Pêra".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta16() throws Exception {
		assertEquals("Pêssego".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta17() throws Exception {
		assertEquals("Melancia".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta18() throws Exception {
		assertEquals("Uvas".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta19() throws Exception {
		assertEquals("Tâmara".toUpperCase(),palavraEscolhida);
	}

}
