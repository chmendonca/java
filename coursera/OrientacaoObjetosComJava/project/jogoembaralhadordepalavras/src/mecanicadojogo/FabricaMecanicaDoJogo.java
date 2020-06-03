/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 22th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Comments: Is the responsible for the interface between class "Principal" and class "MecanicaDoJogo". There are no game functions
 *  implemented on this class, only connection commands.
 */

package mecanicadojogo;

import java.util.HashMap;

public class FabricaMecanicaDoJogo implements RegrasMecanicaDoJogo {
	
	MecanicaDoJogo mj = new MecanicaDoJogo();

	public boolean escolhaDoJogador(String escolha) {
		return mj.validarEscolhaDoJogador(escolha);
	}

	public void iniciarJogo(String escolha) {
		mj.iniciarJogo(escolha);
	}
	
	public String imprimirPalavraEmbaralhada() {
		return mj.imprimirPalavraEmbaralhada();
	}
	
	public boolean compararPalavras(String resposta) {
		return mj.compararPalavras(resposta);
	}
	
	public int pontuarRodada() {
		return mj.pontuarRodada();
	}
	
	public int pontuarJogo() {
		return mj.pontosTotais;
	}
	
	public HashMap<String,String> imprimirPalavrasCertas(){
		return mj.listaPalavrasCertas;
	}
	
	public HashMap<String,String> imprimirPalavrasErradas(){
		return mj.listaPalavrasErradas;
	}
		

}
