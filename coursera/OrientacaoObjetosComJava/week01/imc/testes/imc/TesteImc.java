/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 13th, 2020
 * Course: Orientação a objetos com Java
 * Week: 3 (optional homework)
 * Obs.: new release
 */

package imc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteImc {
	
	Paciente p;
	
	@Test
	public void baixoPesoMuitoGrave() {
		p = new Paciente(30,1.7);
		assertEquals(10.38,p.Imc(),0.1);
		assertEquals("Baixo peso muito grave",p.Diagnostic());
	}
	
	@Test
	public void baixoPesoGrave() {
		p = new Paciente(48,1.7);
		assertEquals(16.6,p.Imc(),0.1);
		assertEquals("Baixo peso grave",p.Diagnostic());
	}
	
	@Test
	public void baixoPeso() {
		p = new Paciente(52,1.7);
		assertEquals(17.9,p.Imc(),0.1);
		assertEquals("Baixo Peso",p.Diagnostic());
	}
	
	@Test
	public void pesoNormal() {
		p = new Paciente(70,1.7);
		assertEquals(24.2,p.Imc(),0.1);
		assertEquals("Peso normal",p.Diagnostic());
	}
	
	@Test
	public void sobrepeso() {
		p = new Paciente(85,1.7);
		assertEquals(29.4,p.Imc(),0.1);
		assertEquals("Sobrepeso",p.Diagnostic());
	}
	
	@Test
	public void obesidadeGrauI() {
		p = new Paciente(94,1.7);
		assertEquals(32.5,p.Imc(),0.1);
		assertEquals("Obesidade grau I",p.Diagnostic());
	}
	
	@Test
	public void obesidadeGrauII() {
		p = new Paciente(102,1.7);
		assertEquals(35.2,p.Imc(),0.1);
		assertEquals("Obesidade grau II",p.Diagnostic());
	}
	
	@Test
	public void obesidadeGrauIII() {
		p = new Paciente(118,1.7);
		assertEquals(40.8,p.Imc(),0.1);
		assertEquals("Obesidade grau III (obesidade mórbida)",p.Diagnostic());
	}

}

/*
diagnostic = "Baixo peso grave";
}
else if (calculation >= 17 && calculation <= 18.49) {
	diagnostic = "Baixo Peso";
}
else if (calculation >= 18.5 && calculation <= 24.99) {
	diagnostic = "Peso normal"; 
}
else if (calculation >= 25 && calculation <= 29.99) {
	diagnostic = "Sobrepeso";
}
else if (calculation >= 30 && calculation <= 34.99) {
	diagnostic = "Obesidade grau I";
}
else if (calculation >= 35 && calculation <= 39.99) {
	diagnostic = "Obesidade grau II";
}
else {diagnostic = "Obesidade grau III (obesidade mórbida)";
}
*/