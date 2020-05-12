/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 12th, 2020
 * Course: Orientação a objetos com Java
 * Week: 4 (classroom exercise)
 * Obs.: new release
 */

package carros;

public abstract class CarroDeCorrida {

	public abstract void acelerar();

	protected int velocidade;
	protected int velocidadeMaxima;
	protected String nome;
	
	public CarroDeCorrida(String nome, int velocidadeMaxima) {
		this.velocidade = 0;
		this.velocidadeMaxima = velocidadeMaxima;
		this.nome = nome;
	}
	
	public void frear() {
		velocidade = velocidade / 2;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public String getNome() {
		return nome;
	}

}
