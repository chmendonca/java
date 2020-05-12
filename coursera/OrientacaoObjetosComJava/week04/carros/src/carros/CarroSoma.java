/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 12th, 2020
 * Course: Orientação a objetos com Java
 * Week: 4 (classroom exercise)
 * Obs.: modified from previous week
 */

package carros;

public class CarroSoma extends CarroDeCorrida {
	
	private int potencia;
	
	public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = potencia;
	}

	@Override
	public void acelerar() {
		if (velocidade < velocidadeMaxima) {
			velocidade += potencia;
		}
	}
}


