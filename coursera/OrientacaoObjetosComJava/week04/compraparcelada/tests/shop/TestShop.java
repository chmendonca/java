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

public class TestShop {

	@Test
	public void total() {
		Shop shop = new Shop(500);
		assertEquals(500,shop.total(),0.1);
		
	}

}
