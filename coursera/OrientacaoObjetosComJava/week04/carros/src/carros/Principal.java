/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 12th, 2020
 * Course: Orientação a objetos com Java
 * Week: 4 (classroom exercise)
 * Obs.: new release
 */

package carros;

public class Principal {

	public static void main(String[] args) {
		Corrida corridaDaAmizade = new Corrida(2000);
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroSoma_01",10,110));
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroSoma_02",8,140));
		corridaDaAmizade.adicionaCarro(new CarroMult("CarroMult_01",1.7,100));
		corridaDaAmizade.adicionaCarro(new CarroMult("CarroMult_02",1.4,110));
		corridaDaAmizade.umDoisTresEJa();
	}

}
