/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 21th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Release Changes: first release
 * Comments: This is a basic test sequence. Since the word is aleatory, only one test case will pass (for choosen word).
 */

package jogo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
	public void p0() throws Exception {
		assertEquals("quarentena".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p1() throws Exception {
		assertEquals("isolamento".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p2() throws Exception {
		assertEquals("apartamento".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p3() throws Exception {
		assertEquals("distância".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p4() throws Exception {
		assertEquals("computador".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p5() throws Exception {
		assertEquals("programação".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p6() throws Exception {
		assertEquals("água".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p7() throws Exception {
		assertEquals("exceção".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p8() throws Exception {
		assertEquals("testes".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p9() throws Exception {
		assertEquals("construtor".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p10() throws Exception {
		assertEquals("público".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p11() throws Exception {
		assertEquals("privado".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p12() throws Exception {
		assertEquals("protegido".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p13() throws Exception {
		assertEquals("padrão".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p14() throws Exception {
		assertEquals("final".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p15() throws Exception {
		assertEquals("super".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p16() throws Exception {
		assertEquals("classe".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p17() throws Exception {
		assertEquals("colaboração".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p18() throws Exception {
		assertEquals("eclipse".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void p19() throws Exception {
		assertEquals("objetos".toUpperCase(),palavraEscolhida);
	}

}
