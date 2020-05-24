package jogo;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteFabricaMecanicaDoJogo {
	
	FabricaMecanicaDoJogo fmj;
	
	Scanner teclado = new Scanner(System.in);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		fmj = new FabricaMecanicaDoJogo();		
	}

	@After
	public void tearDown() throws Exception {
	}
/*
	@Test
	public void escolhaDoJogador1() {
		assertTrue(fmj.escolhaDoJogador(1));
	}

	@Test
	public void escolhaDoJogador2() {
		assertTrue(fmj.escolhaDoJogador(2));
	}

	@Test
	public void escolhaDoJogador3() {
		assertFalse(fmj.escolhaDoJogador(3));
	}

	@Test
	public void escolhaDoJogador4() {
		//Testando um número que não está na lista. É para dar as opções de saída
		assertFalse(fmj.escolhaDoJogador(4));
	}

	@Test
	public void iniciarJogoNormal() {
		fmj.iniciarJogo(1);	
		assertEquals("Normal",fmj.mj.modo);
	}

	@Test
	public void iniciarJogoContraTempo() {
		fmj.iniciarJogo(2);	
		assertEquals("Contra-Tempo",fmj.mj.modo);
	}

	@Test
	public void imprimirPalavraEmbaralhadaModoNormal() {
		fmj.iniciarJogo(1);	
		System.out.println(fmj.imprimirPalavraEmbaralhada());
		assertEquals(0,fmj.mj.passo);
	}

	@Test
	public void compararPalavrasCertas() {
		fmj.iniciarJogo(1);	
		System.out.print(fmj.imprimirPalavraEmbaralhada());
		String resposta = teclado.next();
		assertTrue(fmj.mj.compararPalavras(resposta));
	}
	
	@Test
	public void compararPalavrasErradas() {
		fmj.iniciarJogo(1);	
		System.out.print(fmj.imprimirPalavraEmbaralhada());
		//String resposta = teclado.next(); //Substituída pela entrada fixa 'errada' para garantir um false
		assertFalse(fmj.mj.compararPalavras("errada"));
	}
	
	@Test
	public void compararPalavrasCertas() {
		fmj.iniciarJogo(1);	
		System.out.print(fmj.imprimirPalavraEmbaralhada());
		String resposta = teclado.next();
		fmj.mj.compararPalavras(resposta);
		int pontosRodada = fmj.mj.pontuarRodada();
		assertEquals(5,pontosRodada);
		assertEquals(5,fmj.mj.pontosTotais);
	}

	@Test
	public void compararPalavrasErradas() {
		fmj.iniciarJogo(1);	
		System.out.print(fmj.imprimirPalavraEmbaralhada());
		//String resposta = teclado.next(); //Substituída pela entrada fixa 'errada' para garantir um false
		fmj.mj.compararPalavras("errada");
		int pontosRodada = fmj.mj.pontuarRodada();
		assertEquals(-3,pontosRodada);
		assertEquals(1,fmj.mj.passo);
		assertEquals(-3,fmj.mj.pontosTotais);
	}

	@Test
	public void compararPalavrasDuasCertas() {
		fmj.iniciarJogo(1);	
		System.out.print(fmj.imprimirPalavraEmbaralhada());
		assertEquals(9,fmj.mj.listaPalavras.size());
		String resposta = teclado.next();
		fmj.mj.compararPalavras(resposta);
		int pontosRodada = fmj.mj.pontuarRodada();
		assertEquals(5,pontosRodada);
		assertEquals(1,fmj.mj.passo);
		assertEquals(5,fmj.mj.pontosTotais);
		System.out.print(fmj.imprimirPalavraEmbaralhada());
		assertEquals(8,fmj.mj.listaPalavras.size());
		resposta = teclado.next();
		fmj.mj.compararPalavras(resposta);
		pontosRodada = fmj.mj.pontuarRodada();
		assertEquals(5,pontosRodada);
		assertEquals(2,fmj.mj.passo);
		assertEquals(10,fmj.mj.pontosTotais);
	}

	@Test
	public void compararPalavrasUmaCertaUmaErrada() {
		fmj.iniciarJogo(1);	
		System.out.print(fmj.imprimirPalavraEmbaralhada());
		assertEquals(9,fmj.mj.listaPalavras.size());
		String resposta = teclado.next();
		fmj.mj.compararPalavras(resposta);
		int pontosRodada = fmj.mj.pontuarRodada();
		assertEquals(5,pontosRodada);
		assertEquals(1,fmj.mj.passo);
		assertEquals(5,fmj.mj.pontosTotais);
		System.out.print(fmj.imprimirPalavraEmbaralhada());
		assertEquals(8,fmj.mj.listaPalavras.size());
		//resposta = teclado.next();
		fmj.mj.compararPalavras("errada");
		pontosRodada = fmj.mj.pontuarRodada();
		assertEquals(-3,pontosRodada);
		assertEquals(2,fmj.mj.passo);
		assertEquals(2,fmj.mj.pontosTotais);
	}


	@Test
	public void testeTodasErradasModoNormal() {
		fmj.iniciarJogo(1);
		while (true) {
			System.out.print(fmj.imprimirPalavraEmbaralhada());
			System.out.println("comprimento lista palavras: " + fmj.mj.listaPalavras.size());
			int size = 10-fmj.mj.passo-1;
			System.out.println("resultado da conta do passo: " + size);
			assertEquals(10-fmj.mj.passo-1,fmj.mj.listaPalavras.size());
			//String resposta = teclado.next();
			fmj.mj.compararPalavras("errada");
			int pontosRodada = fmj.mj.pontuarRodada();
			System.out.println(fmj.mj.passo);
			assertEquals(-3,pontosRodada);
			assertEquals(fmj.mj.passo*1,fmj.mj.passo);
			assertEquals(fmj.mj.passo*(-3),fmj.mj.pontosTotais);
			if (fmj.mj.listaPalavras.isEmpty()) {
				break;
			}
		}
		System.out.println("Sua pontuação foi: " + fmj.mj.pontosTotais);
	}
*/
}
