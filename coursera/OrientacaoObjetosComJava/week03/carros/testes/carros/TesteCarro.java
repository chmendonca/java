package carros;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarro {
	
	@Test
	public void testCarroParado() {
		Carro c = new Carro();
		assertEquals(0,c.getVelocidade());
		assertEquals(5,c.getVelocidade());
	}

	@Test
	public void testAcelerar() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		assertEquals(10,c.getVelocidade());
	}
	
	@Test
	public void testFrear() {
		Carro c = new Carro();
		c.potencia = 12;
		c.acelerar();
		c.frear();
		assertEquals(6,c.getVelocidade());
		//Frear até 0 km/h
		c.frear();
		assertEquals(3,c.getVelocidade());
		c.frear();
		assertEquals(1,c.getVelocidade());
		c.frear();
		assertEquals(0,c.getVelocidade());
		
		
	}

}
