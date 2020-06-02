/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 22th, 2020
 * Course: Orienta��o a objetos com Java
 * Week: 6 (course final project)
 * Release Changes: first release
 * Comments: This class is responsible to create a dictionary of words and shuffle words to provide to the user. It requests from
 *  "FabricaEmbaralhadores" the shuffled words. It does not have any influence on how the words have been shuffled. It only ensures
 *  a dictionary with the required length and no repeated words. 
 */

package mecanicadojogo;

import java.util.HashMap;

import embaralhador.FabricaEmbaralhadores;

public class ListaPalavras implements RegrasListaPalavras {
	
	private int increment = 0;
	private String palavra;
	private String palavraEmbaralhada;
	private FabricaEmbaralhadores fe;
	private HashMap<String,String> conjunto; //Este � o par de palavras retornado de FabricaEmbaralhadores
	protected HashMap<String,String> dicionario = new HashMap<String,String>(); //Este � o dicionario de palavras que ser� montado para ser apresentado ao jogador
	
	public HashMap<String,String> criarDicionarioPalavrasEmbaralhadas(int quantidadeDePalavras) {
		while (increment < quantidadeDePalavras) {
			fe = new FabricaEmbaralhadores();
			conjunto = fe.getPalavraEmbaralhada();
			for (String p : conjunto.keySet()) {
				palavra = p;
				palavraEmbaralhada = conjunto.get(p);
			}
			//Adiciona a palavra e a palavraEmbaralhada ao dicion�rio
			dicionario.put(palavra, palavraEmbaralhada);
			
			//Se a palavra j� estiver no dicion�rio ela n�o � adicionada novamente, 
			// portanto s� deve ser incrementada a contagem se a palavra for adicionada.
			if (increment+1 == dicionario.size()) {
				increment++;			
			} 
		}
		
			//System.out.println("listaPalavras: "+dicionario);
		return dicionario;	
	}
	

}
