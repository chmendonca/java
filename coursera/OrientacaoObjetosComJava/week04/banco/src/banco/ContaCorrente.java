/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 12th, 2020
 * Course: Orientação a objetos com Java
 * Week: 4 (classroom exercise)
 */

package banco;

public class ContaCorrente {

	int saldo;
	
	public int sacar(int valor) {
		if (valor > saldo) {
			return 0;
		} else {
			saldo -= valor;
			return valor;
		}
	}
	
	public void depositar(int valor) {
		saldo += valor;
	}
}
