/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 12th, 2020
 * Course: Orientação a objetos com Java
 * Week: 4 (classroom exercise)
 * Obs.: new release
 */

package cadeiaconstrutores;

public class DoMeio extends PaiDeTodos {

	public DoMeio() {
		super("string");
		System.out.println("Construtor do meio");
	}
	
	public void acelera() {
		System.out.println("Acelera do meio");
	}

}
