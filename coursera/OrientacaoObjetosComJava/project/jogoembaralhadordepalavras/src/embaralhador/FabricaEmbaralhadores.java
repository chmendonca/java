/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 21th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Release Changes: first release
 * Comments: This class is responsible for picking up a word (request) from "BancoDePalavras", choose randomly one "Embaralhador"
 *  and ask for the shuffled word. This class will perform these activities when requested by one of the implementation of the
 *  "MecanicaDoJogo".
 */

package embaralhador;

//import java.util.Calendar;

import java.util.HashMap;

import java.util.Random;

public class FabricaEmbaralhadores implements RegrasEmbaralhador {
	
	private String palavra;
	private String palavraEmbaralhada;
	private HashMap<String,String> palavras = new HashMap<String,String>();
	
	BancoDePalavras bp = new BancoDePalavras();
	
	public FabricaEmbaralhadores() {
		//super();
		this.palavra = bp.getPalavra(); //importa do banco de palavras uma palavra a ser embaralhada
	}

	private String qualEmbaralhador () {
		Random random = new Random(); //aleatóriamente escolhe um embaralhador
		int opcao = random.nextInt(2);
		if (opcao == 0) {
			//System.out.println("Sequencial");
			EmbaralhadorSequencial es = new EmbaralhadorSequencial();
			palavraEmbaralhada = es.getPalavraEmbaralhada(this.palavra);
		} else if (opcao == 1){
			//System.out.println("Shuffle");
			EmbaralhadorShuffle es = new EmbaralhadorShuffle();
			palavraEmbaralhada = es.getPalavraEmbaralhada(this.palavra);
		}
		return palavraEmbaralhada;
	}
	
	public HashMap<String,String> getPalavraEmbaralhada() {
		qualEmbaralhador();
		palavras.put(this.palavra,palavraEmbaralhada);
		//System.out.println(palavras);
		return palavras;
	}
}	
