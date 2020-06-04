/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: june 04th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Release Changes: first release
 * Comments: This test case covers: the successful file import; an unsuccessful file import; if the seed 
 *  is correctly generated from the range of seconds; and if one word has been takes correctly and the
 *  others no. To test the seeds, it was created a for loop to generate all possible seconds has been done
 *  the assertion to the related integer on division. Since the word is aleatory, only one test case will
 *  pass (for choosen word).
 */

package embaralhador;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteBancoDePalavras {

	static BancoDePalavras bp;
	private static String palavraEscolhida;

	static int segundo;
	static int seed;
	static int indice;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//O objeto bp é criado somente uma vez porque a idéia é verificar se a palavra escolhida é uma das palavras da lista.
		// O teste irá falhar pois somente uma das palavras é que vai coincidir o assert. Se fosse criado uma nova instância
		// antes de cada teste, era possível que nenhuma das palavras fossem escolhidas pois teria que coincidir a palavra
		// escolhida com o respectivo teste.
		
		bp = new BancoDePalavras();
		palavraEscolhida = bp.getPalavra();
		//System.out.println(palavraEscolhida);
		
		//Calendar calendar = Calendar.getInstance();
		//segundo = calendar.get(Calendar.SECOND);
		//seed = segundo/6;
		//indice = seed + (int)(Math.random() * (bp.bancoDePalavras.length-seed));		
		
		//String palavra = new String(); //This returns a new object and doesn't affect the original object
		//palavra = bp.bancoDePalavras[indice];
		//System.out.println(indice + ", " + palavra.toUpperCase());
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
	public void abreArquivo() {
		assertNotNull(bp.getBancoDePalavras("frutas.txt"));
	}
	
	@Test
	public void falhaAbreArquivo() throws Exception {
		assertEquals("Arquivo não encontrado!",bp.getBancoDePalavras("_frutas.txt")[0].toString());
	}

	@Test
	public void seed() throws Exception {
		//Este teste não dependo do @BeforeClass. Este teste verifica se a lógica para escolher a seed é válida.
		for (segundo = 0; segundo <= 59; segundo++) {
			seed = segundo/6;
			if (segundo >= 0 && segundo < 6) {
				assertEquals(0,seed);
			} else if (segundo >= 6 && segundo < 12) {
				assertEquals(1,seed);
			} else if (segundo >= 12 && segundo < 18) {
				assertEquals(2,seed);
			} else if (segundo >= 18 && segundo < 24) {
				assertEquals(3,seed);
			} else if (segundo >= 24 && segundo < 30) {
				assertEquals(4,seed);
			} else if (segundo >= 30 && segundo < 36) {
				assertEquals(5,seed);
			} else if (segundo >= 36 && segundo < 42) {
				assertEquals(6,seed);
			} else if (segundo >= 42 && segundo < 48) {
				assertEquals(7,seed);
			} else if (segundo >= 48 && segundo < 54) {
				assertEquals(8,seed);
			} else if (segundo >= 54 && segundo < 59) {
				assertEquals(9,seed);
			}
			//System.out.println("segundo: " + segundo + ", seed: " + seed);
		}
	}
		
	//Os testes de palavras não possuem uma condição para identificar que a palavra não foi escolhida porque assim
	// fica possível evidenciar qual foi escolhida. Isto evita um falso negativo.
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

	@Test
	public void fruta20() throws Exception {
		assertEquals("Abacate".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta21() throws Exception {
		assertEquals("Acerola".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta22() throws Exception {
		assertEquals("Açaí".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta23() throws Exception {
		assertEquals("Graviola".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta24() throws Exception {
		assertEquals("Jaca".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta25() throws Exception {
		assertEquals("Manga".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta26() throws Exception {
		assertEquals("Jabuticaba".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta27() throws Exception {
		assertEquals("Pequi".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta28() throws Exception {
		assertEquals("Mexerica".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta29() throws Exception {
		assertEquals("Pitaia".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta30() throws Exception {
		assertEquals("Pitanga".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta31() throws Exception {
		assertEquals("Cajá".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta32() throws Exception {
		assertEquals("Caju".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta33() throws Exception {
		assertEquals("Caqui".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta34() throws Exception {
		assertEquals("Carambola".toUpperCase(),palavraEscolhida);
	}
	@Test
	public void fruta35() throws Exception {
		assertEquals("Seriguela".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta36() throws Exception {
		assertEquals("Coco".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta37() throws Exception {
		assertEquals("Cupuaçu".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta38() throws Exception {
		assertEquals("Pinha".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta39() throws Exception {
		assertEquals("Goiaba".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta40() throws Exception {
		assertEquals("Guaraná".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta41() throws Exception {
		assertEquals("Jambo".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta42() throws Exception {
		assertEquals("Jenipapo".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta43() throws Exception {
		assertEquals("Kiwi".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta44() throws Exception {
		assertEquals("Lichia".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta45() throws Exception {
		assertEquals("Maracujá".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta46() throws Exception {
		assertEquals("Marmelo".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta47() throws Exception {
		assertEquals("Morango".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta48() throws Exception {
		assertEquals("Nectarina".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta49() throws Exception {
		assertEquals("Umbu".toUpperCase(),palavraEscolhida);
	}

	@Test
	public void fruta50() throws Exception {
		assertEquals("Tamarindo".toUpperCase(),palavraEscolhida);
	}
	
}
