package jogo;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteListaPalavras {
	
	ListaPalavras lp;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		lp = new ListaPalavras();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void lista10Palavras() {
		lp.criarDicionarioPalavrasEmbaralhadas(10);
		assertEquals(10,lp.dicionario.size());
	}

	@Test
	public void lista20Palavras() {
		lp.criarDicionarioPalavrasEmbaralhadas(20);
		assertEquals(20,lp.dicionario.size());
	}

}
