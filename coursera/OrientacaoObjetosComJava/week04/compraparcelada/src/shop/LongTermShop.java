/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 18th, 2020
 * Course: Orientação a objetos com Java
 * Week: 4 (optional homework)
 * Release Changes: first release
 * Main Resources: N/A
 */

package shop;

public class LongTermShop extends Shop {
	
	int numberOfMonths;
	double interest;

	public LongTermShop(double value, int numberOfMonths, double interest) {
		super(value);
		this.numberOfMonths = numberOfMonths;
		this.interest = interest;
	}

	public int getNumberOfMonths() {
		return numberOfMonths;
	}

	public void setNumberOfMonths(int numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	public double total() {
		double finalValue = value * Math.pow((1 + interest/100),numberOfMonths);
		return finalValue;
	}

}
