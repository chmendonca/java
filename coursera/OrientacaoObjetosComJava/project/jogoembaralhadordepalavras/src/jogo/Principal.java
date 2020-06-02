/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 30th, 2020
 * Course: Orientação a objetos com Java
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
		
		//apresentando o jogo e pedindo para escolher uma opão
		System.out.println("Olá, você iniciou o jogo 'Embaralhador de Palavras'.\n"
			+ "\nNeste jogo você terá que escolher qual dos modos você irá jogar (NORMAL ou CONTRA-TEMPO).\n"
			+ "\nNo modo NORMAL 10 palavras (frutas) serão apresentadas para você que terá uma chance de acertar cada\n"
			+ "palavra. Após as 10 palavras o jogo é encerrado e sua pontuação é mostrada.\n"
			+ "\nNo modo CONTRA-TEMPO serão apresentadas 10 palavras (frutas) cada um por 10 segundos. Você terá\n"
			+ "uma chance de acertar cada palavra. Caso o tempo termine e um valor válido não seja entrado, a "
			+ "palavra será considerada errada.\n"
			+ "\nNas duas modalidades os sistema não é case sensitive, mas acentuação é obrigatória");
		
		
		//loop de escolha das opções de jogo
		while (true) {
			 fmj= new FabricaMecanicaDoJogo();
			//informando a escolha
			System.out.print("\n\n**********************************************");
			System.out.print("\nModo NORMAL: 1; Modo CONTRA-TEMPO: 2; Sair: 3: ");
			///System.out.print("**********************************************");
			escolha = teclado.next();
			//Se o usuário escolher sair, a classe Principal confirma a opção.
			if (!fmj.escolhaDoJogador(escolha)) {
				System.out.print("Você escolheu sair do jogo. Sair mesmo? 'S' / 'N': ");
				sair = teclado.next();
				//Se o usuário quiser mesmo sair, a classe Principal sai do jogo.
				if (sair.toUpperCase().equals("S")) {
					System.out.println("\n\nQue pena que saiu! Mas obrigado por jogar comigo.");
					break;
				//Se o usuário quiser continuar, a classe principal retorna ao jogo.
				} else {
					System.out.println("\n\nQue bom! Aqui vamos nós de novo!\n");
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
						//System.out.println("Sua pontuação nesta rodada: " + pontos + "pontos\n");
					} else {
						System.out.println("--------------------------------------------------------------------------------------------");
						System.out.print(retorno);
						break;
					}

				}
			}
			
			System.out.println(" - SUA PONTUAÇÃO NO JOGO: " + fmj.pontuarJogo() + " pontos. **********");
			System.out.println("--------------------------------------------------------------------------------------------");

			HashMap<String,String> palavrasErradas = fmj.imprimirPalavrasErradas();
			System.out.println("\nVocê errou as seguintes palavras:");
			for (String pe : palavrasErradas.keySet()) {
				System.out.println(pe + ": " + palavrasErradas.get(pe));
			}	
			
			//Provisão caso queira imprimir a lista de palavras certas
			//HashMap<String,String> palavrasCertas = fmj.imprimirPalavrasCertas();
			//System.out.println(palavrasErradas);			
			//System.out.println("\nVocê acertou as seguintes palavras:");
			//for (String pc : palavrasCertas.keySet()) {
			//	System.out.println(palavrasCertas.get(pc) + ": " + pc);
			//}
		}
		teclado.close();
	}

}
