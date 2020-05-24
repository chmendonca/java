package jogo;

import java.util.HashMap;
import java.util.Scanner;

public class MecanicaDoJogo implements RegrasMecanicaDoJogo {

	public boolean respostaCerta;
	public boolean rodando;
	public int pontosRodada = 0;
	public String imprimir = "";
	public String palavra;
	
	public String modo;
	public int passo = 0;
	public int somatorioPontos[] = {0};
	public int pontosTotais = 0;
	

	public Runnable runnable;
	public Thread tcr;
	public ListaPalavras lp = new ListaPalavras();
	
	public HashMap<String,String> listaPalavras = new HashMap<String,String>();
	public HashMap<String,String> listaPalavrasCertas = new HashMap<String,String>();
	public HashMap<String,String> listaPalavrasErradas = new HashMap<String,String>();
	
	public MecanicaDoJogo() {
		super();
	}

	public boolean validarEscolhaDoJogador(String escolha) {
		if (escolha.equals("1") || escolha.equals("2")) {
			return true;
		} else {
			return false;
		}
	}
	
	public void iniciarJogo(String escolha){
		if (escolha.equals("1")) {
			listaPalavras = lp.criarDicionarioPalavrasEmbaralhadas(10);
			modo = "Normal";
		} else if (escolha.equals("2")) {
			listaPalavras = lp.criarDicionarioPalavrasEmbaralhadas(20);
			modo = "Contra-Tempo";
		}
	}
	
	public String imprimirPalavraEmbaralhada() {
		if (modo == "Normal") {
			if (passo < 10) {
				//System.out.println(passo);
				for(String p : listaPalavras.keySet()) {
					palavra = p;
					int item = passo + 1;
					imprimir = "Palavra embaralhada " + item + ": " + listaPalavras.get(palavra)+" --> ";
					break;
				}
				listaPalavras.remove(palavra);
				//System.out.println(listaPalavras);
			} else {
				return "FIM DE JOGO";
			}
		} else if (modo == "Contra-Tempo"){
			runnable = new ThreadContadorRegressivo();
			tcr = new Thread(runnable);
			tcr.start();
			if (passo < 20) {
				for(String p : listaPalavras.keySet()) {
					palavra = p;
					int item = passo + 1;
					imprimir = "Palavra embaralhada " + item + ": " + listaPalavras.get(palavra)+" --> ";
					break;
				}
				listaPalavras.remove(palavra);
			} else {
				tcr.interrupt();
				return "FIM DE JOGO";
			}
		}
		return imprimir;
	}
	
	public boolean cronometro() {
		return tcr.isAlive();
	}
	
	public boolean compararPalavras(String resposta) {
		if (palavra.equalsIgnoreCase(resposta)) {
			respostaCerta = true;
		} else {
			respostaCerta = false;
		}
		tcr.interrupt();
		return respostaCerta;
	}
	
	public int pontuarRodada() {
		if (modo == "Normal") {
			if (respostaCerta) {
				pontosRodada = 5;
			} else {
				pontosRodada = -3;
			}
		} else if (modo == "Contra-Tempo") {
			if (rodando && respostaCerta) {
				pontosRodada = 7;
			} else if (!rodando && respostaCerta) {
				pontosRodada = 3;
			} else if (rodando && !respostaCerta) {
				pontosRodada = -3;
			} else {
				pontosRodada = -7;
			}
		}
		
		passo++;
		pontuarJogo();
		return pontosRodada;
	}
	
	public int pontuarJogo() {
		pontosTotais += somatorioPontos[0]+pontosRodada;
		//System.out.println("pontuarJogo: "+pontosTotais);
		return pontosTotais;
	}
	
	
	
}