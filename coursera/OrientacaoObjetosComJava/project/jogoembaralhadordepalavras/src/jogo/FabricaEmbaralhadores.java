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

package jogo;

import java.util.Random;

public class FabricaEmbaralhadores {
	
	BancoDePalavras bp = new BancoDePalavras();
	protected String palavra;
	
	public FabricaEmbaralhadores() {
		super();
		this.palavra = bp.getPalavra();
	}

	public void qualEmbaralhador () {
		Random random = new Random();
		int opcao = random.nextInt(2);
		if (opcao == 0) {
			System.out.println("0");			
		} else if (opcao == 1){
			System.out.println("1");
		}
	}

}
