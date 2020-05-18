/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 18th, 2020
 * Course: Orientação a objetos com Java
 * Week: 4 (optional homework)
 * Release Changes: first release
 * Main Resources: N/A
 */

package shop;

public class Shop {
	
	double value;
	
	public Shop(double value){
		this.value = value;
	}

	public double total() {
		return this.value;
	}

}
