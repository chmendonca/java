/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 30th, 2020
 * Course: Orienta��o a objetos com Java
 * Week: 6 (course final project)
 * Comments: Esta � a interface que cont�m as regras para criar uma mec�nica de  jogo.
 * How it works: "validarEscolhaDoJogador" identifica qual o modo de jogo ou se um comando de sa�da. "iniciarJogo" �
 *  executa as primeiras a��es do jogo. "imprimirPalavraEmbaralhada" seleciona a palavra a ser apresentada para o 
 *  jogador. "compararPalavras" determina se a entrada est� correta. "pontuarRodada" cont�m informa��es sobre os pontos
 *  da rodada. "pontuarJogo" � respons�vel pela pontua��o final do jogo.
 */

package mecanicadojogo;

import java.util.HashMap;

public interface RegrasMecanicaDoJogo {
	
	public boolean escolhaDoJogador(String escolha);
	public void iniciarJogo(String escolha);
	public String imprimirPalavraEmbaralhada();
	public boolean compararPalavras(String resposta);
	public int pontuarRodada();
	public int pontuarJogo();
	public HashMap<String,String> imprimirPalavrasCertas();
	public HashMap<String,String> imprimirPalavrasErradas();

}
