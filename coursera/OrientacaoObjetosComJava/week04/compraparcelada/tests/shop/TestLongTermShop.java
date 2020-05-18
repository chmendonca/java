/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 18th, 2020
 * Course: Orientação a objetos com Java
 * Week: 4 (optional homework)
 * Release Changes: first release
 * Main Resources: N/A
 */

package shop;

import static org.junit.Assert.*;


import org.junit.Test;

public class TestLongTermShop {

	@Test
	public void oneMonth() {
		LongTermShop lt = new LongTermShop(500,1,3);
		assertEquals(1,lt.getNumberOfMonths());
		assertEquals(3,lt.getInterest(),0.1);
		assertEquals(515.00,lt.total(),1.0);
	}

	@Test
	public void twoMonths() {
		LongTermShop lt = new LongTermShop(500,2,3);
		assertEquals(2,lt.getNumberOfMonths());
		assertEquals(3,lt.getInterest(),0.1);
		assertEquals(530.45,lt.total(),1.0);
	}

	@Test
	public void fiveMonths() {
		LongTermShop lt = new LongTermShop(500,5,3);
		assertEquals(5,lt.getNumberOfMonths());
		assertEquals(3,lt.getInterest(),0.1);
		assertEquals(579.64,lt.total(),1.0);
	}

	@Test
	public void tenMonths() {
		LongTermShop lt = new LongTermShop(500,10,3);
		assertEquals(10,lt.getNumberOfMonths());
		assertEquals(3,lt.getInterest(),0.1);
		assertEquals(671.96,lt.total(),1.0);
	}

}
