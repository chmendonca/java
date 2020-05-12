/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 12th, 2020
 * Course: Orientação a objetos com Java
 * Week: 4 (classroom exercise)
 * Obs.: modified from previous week
 */

package carros;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCarroSoma {
	
	CarroDeCorrida c;
	
	@Before
	public void before() {
		c = new CarroSoma("TESTE",10,100);
	}
	
	@Test
	public void testCarroParado() {
		assertEquals(0,c.getVelocidade());
		assertEquals(5,c.getVelocidade());
	}

	@Test
	public void testAcelerar() {
		c.acelerar();
		assertEquals(10,c.getVelocidade());
	}

	@Test
	public void testAcelerarAteVelocidadeMaxima() {
		for (int i = 0; i < 15; i++) {
			c.acelerar();
		}
		c.acelerar();
		assertEquals(100,c.getVelocidade());
	}
	
	@Test
	public void testFrear() {
		c.acelerar();
		c.frear();
		//Frear até 0 km/h
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0,c.getVelocidade());
		
		
	}

}
