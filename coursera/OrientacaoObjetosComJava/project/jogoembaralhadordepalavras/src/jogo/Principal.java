/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 30th, 2020
 * Course: Orienta��o a objetos com Java
 * Week: 6 (course final project)
 * Comments: This is the main class. It is responsible to get the user inputs to share with "FabricaMecanicaDoJogo". Also, this class
 *  provides information to the user on the screen. No other class can interface with the user directly. This class talks exclusively
 *  with "FabricaMecanicaDeJogo".
 */

package jogo;

import java.util.HashMap;

import java.util.Scanner;

import mecanicadojogo.FabricaMecanicaDoJogo;

public class Principal {

	public static void main(String[] args) {
		
		boolean cronometro;
		String escolha;
		String sair;
		
		FabricaMecanicaDoJogo fmj;		
		Scanner teclado = new Scanner(System.in);
		
		//apresentando o jogo e pedindo para escolher uma op�o
		System.out.println("Ol�, voc� iniciou o jogo 'Embaralhador de Palavras'.\n"
			+ "\nNeste jogo voc� ter� que escolher qual dos modos voc� ir� jogar (NORMAL ou CONTRA-TEMPO).\n"
			+ "\nNo modo NORMAL 10 palavras (frutas) ser�o apresentadas para voc� que ter� uma chance de acertar cada\n"
			+ "palavra. Ap�s as 10 palavras o jogo � encerrado e sua pontua��o � mostrada.\n"
			+ "\nNo modo CONTRA-TEMPO ser�o apresentadas 10 palavras (frutas) cada um por 10 segundos. Voc� ter�\n"
			+ "uma chance de acertar cada palavra. Caso o tempo termine e um valor v�lido n�o seja entrado, a "
			+ "palavra ser� considerada errada.\n"
			+ "\nNas duas modalidades os sistema n�o � case sensitive, mas acentua��o � obrigat�ria");
		
		
		//loop de escolha das op��es de jogo
		while (true) {
			 fmj= new FabricaMecanicaDoJogo();
			//informando a escolha
			System.out.print("\n\n**********************************************");
			System.out.print("\nModo NORMAL: 1; Modo CONTRA-TEMPO: 2; Sair: 3: ");
			///System.out.print("**********************************************");
			escolha = teclado.next();
			//Se o usu�rio escolher sair, a classe Principal confirma a op��o.
			if (!fmj.escolhaDoJogador(escolha)) {
				System.out.print("Voc� escolheu sair do jogo. Sair mesmo? 'S' / 'N': ");
				sair = teclado.next();
				//Se o usu�rio quiser mesmo sair, a classe Principal sai do jogo.
				if (sair.toUpperCase().equals("S")) {
					System.out.println("\n\nQue pena que saiu! Mas obrigado por jogar comigo.");
					break;
				//Se o usu�rio quiser continuar, a classe principal retorna ao jogo.
				} else {
					System.out.println("\n\nQue bom! Aqui vamos n�s de novo!\n");
					continue;
				}

			} else {
				fmj.iniciarJogo(escolha);

				String retorno = "";
				String resposta = "";
				while (true) {
					retorno = fmj.imprimirPalavraEmbaralhada();
					//System.out.print(retorno);
					if (retorno != "********** FIM DE JOGO") {
						System.out.print(retorno);
						resposta = teclado.next();
						//System.out.println("resposta: " + resposta);
						if (fmj.compararPalavras(resposta)) {
							System.out.println("!!!RESPOSTA CERTA!!!\n");
						} else {
							System.out.println("# RESPOSTA ERRADA! #\n");
						}
						int pontos = fmj.pontuarRodada();
						//System.out.println("Sua pontua��o nesta rodada: " + pontos + "pontos\n");
					} else {
						System.out.println("--------------------------------------------------------------------------------------------");
						System.out.print(retorno);
						break;
					}

				}
			}
			
			System.out.println(" - SUA PONTUA��O NO JOGO: " + fmj.pontuarJogo() + " pontos. **********");
			System.out.println("--------------------------------------------------------------------------------------------");

			HashMap<String,String> palavrasErradas = fmj.imprimirPalavrasErradas();
			System.out.println("\nVoc� errou as seguintes palavras:");
			for (String pe : palavrasErradas.keySet()) {
				System.out.println(pe + ": " + palavrasErradas.get(pe));
			}	
			
			//Provis�o caso queira imprimir a lista de palavras certas
			//HashMap<String,String> palavrasCertas = fmj.imprimirPalavrasCertas();
			//System.out.println(palavrasErradas);			
			//System.out.println("\nVoc� acertou as seguintes palavras:");
			//for (String pc : palavrasCertas.keySet()) {
			//	System.out.println(palavrasCertas.get(pc) + ": " + pc);
			//}
		}
		teclado.close();
	}

}
