/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 30th, 2020
 * Course: Orienta��o a objetos com Java
 * Week: 6 (course final project)
 * Comments: Esta � a interface que cont�m as regras para criar uma mec�nica de  jogo.
 * How it works: "validarEscolhaDoJogador" identifica se o valor inserido pelo jogador � um mode de jogo v�lido
 *  ou inv�lido. Em caso de um modo inv�lido, ele entende que pode ser um comando para sa�da. "iniciarJogo" �
 *  chamado assim que o sistema identifica uma entrada v�lida de jogo e neste m�todo � criada a lista de palavras
 *  que ser� usada. "imprimirPalavraEmbaralhada" seleciona a primeira palavra e respectiva palavra embaralhada
 *  da lista montada e envia para impress�o na tela. Esta palavra � retirada da lista de palavras. No caso do
 *  modo Contra-Tempo, esta fun��o ativa o contador em paralelo; se o tempo esgotar, envia mensagem avisando que
 *  o tempo foi esgotado. "compararPalavras" compara a resposta com o valor esperado (fruta), resultado em uma
 *  informa��o de certo ou errado. "pontuarRodada" indica para o jogo qual o valor da pontua��o das palavras certas
 *  e erradas (uma a uma) de acordo com o modo de jogo. "pontuarJogo" soma a pontua��o de cada rodada e ao final �
 *  apresentado ao jogador.
 */

package mecanicadojogo;

import java.util.HashMap;
import java.util.Scanner;

public class MecanicaDoJogo {
	

	private int passo = 0;
	private int quantidadePalavrasModo1 = 10;
	private int quantidadePalavrasModo2 = 10;
	private String modo;

	private HashMap<String,String> listaPalavras = new HashMap<String,String>();
	
	protected boolean respostaCerta;
	protected boolean rodando;
	protected int pontosRodada = 0;
	protected int pontosTotais = 0;
	protected String imprimir = "";
	protected String palavra;
	protected String palavraEmbaralhada;
	
	protected int somatorioPontos[] = {0};

	protected Runnable runnable;
	protected Thread tcr;
	protected ListaPalavras lp = new ListaPalavras();
	
	protected static HashMap<String,String> listaPalavrasCertas = new HashMap<String,String>();
	protected static HashMap<String,String> listaPalavrasErradas = new HashMap<String,String>();
	
	protected MecanicaDoJogo() {
		super();
	}

	protected boolean validarEscolhaDoJogador(String escolha) {
		//precisa ter as op��es de 1 e 2 porque valores inv�lidos s�o entendidos como pedido de sa�da do jogo.
		if (escolha.equals("1") || escolha.equals("2")) {
			return true;
		} else {
			return false;
		}
	}
	
	private void limpaListaPalavras() {
		listaPalavrasCertas.clear();
		listaPalavrasErradas.clear();
	}
	protected void iniciarJogo(String escolha){
		if (escolha.equals("1")) {
			listaPalavras = lp.criarDicionarioPalavrasEmbaralhadas(quantidadePalavrasModo1);
			modo = "Normal";
		} else if (escolha.equals("2")) {
			listaPalavras = lp.criarDicionarioPalavrasEmbaralhadas(quantidadePalavrasModo2);
			modo = "Contra-Tempo";
		}
		limpaListaPalavras();
	}
	
	private void imprimePrimeiraPalavraDaLista() {
		for(String p : listaPalavras.keySet()) {
			palavra = p;
			palavraEmbaralhada = listaPalavras.get(palavra);
			int item = passo + 1;
			imprimir = "Palavra embaralhada " + item + ": " + listaPalavras.get(palavra)+" --> ";
			break;
		}
	}
	protected String imprimirPalavraEmbaralhada() {
		if (modo == "Normal") {
			if (passo < quantidadePalavrasModo1) {
				imprimePrimeiraPalavraDaLista();
				//System.out.println(passo);
				//for(String p : listaPalavras.keySet()) {
					//palavra = p;
					//palavraEmbaralhada = listaPalavras.get(palavra);
					//int item = passo + 1;
					//imprimir = "Palavra embaralhada " + item + ": " + listaPalavras.get(palavra)+" --> ";
					//break;
				//}
				listaPalavras.remove(palavra);
				//System.out.println(listaPalavras);
			} else {
				return "********** FIM DE JOGO";
			}
		} else if (modo == "Contra-Tempo"){
			runnable = new ThreadContadorRegressivo(quantidadePalavrasModo2);
			tcr = new Thread(runnable);
			tcr.start();
			if (passo < quantidadePalavrasModo2) {
				imprimePrimeiraPalavraDaLista();
				//for(String p : listaPalavras.keySet()) {
					//palavra = p;
					//palavraEmbaralhada = listaPalavras.get(palavra);
					//int item = passo + 1;
					//imprimir = "Palavra embaralhada " + item + ": " + listaPalavras.get(palavra)+" --> ";
					//break;
				//}
				listaPalavras.remove(palavra);
				
			} else {
				tcr.interrupt();
				return "********** FIM DE JOGO";
			}
		}
		return imprimir;
	}
	
	protected boolean compararPalavras(String resposta) {
		if (palavra.equalsIgnoreCase(resposta)) {
			respostaCerta = true;
			listaPalavrasCertas.put(palavraEmbaralhada, palavra);
		} else {
			respostaCerta = false;
			listaPalavrasErradas.put(palavraEmbaralhada, palavra);
			//System.out.println("lista: " + listaPalavrasErradas);
		}
		if (modo == "Contra-Tempo") {
			tcr.interrupt();
		}
		
		return respostaCerta;
	}
	
	protected int pontuarRodada() {
		if (modo == "Normal") {
			if (respostaCerta) {
				pontosRodada = 5;
			} else {
				pontosRodada = -3;
			}
		} else if (modo == "Contra-Tempo") {
			if (respostaCerta) {
				pontosRodada = 7;
			} else {
				pontosRodada = -3;
			}
		}
		
		passo++;
		pontuarJogo();
		return pontosRodada;
	}
	
	protected int pontuarJogo() {
		pontosTotais += somatorioPontos[0]+pontosRodada;
		//System.out.println("pontuarJogo: "+pontosTotais);
		return pontosTotais;
	}
	
	
	
}