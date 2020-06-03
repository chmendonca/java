/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 30th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Comments: Esta é a interface que contém as regras para criar uma mecânica de  jogo.
 * How it works: "validarEscolhaDoJogador" identifica qual o modo de jogo ou se um comando de saída. "iniciarJogo" é
 *  executa as primeiras ações do jogo. "imprimirPalavraEmbaralhada" seleciona a palavra a ser apresentada para o 
 *  jogador. "compararPalavras" determina se a entrada está correta. "pontuarRodada" contém informações sobre os pontos
 *  da rodada. "pontuarJogo" é responsável pela pontuação final do jogo.
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
