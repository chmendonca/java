/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 19th, 2020
 * Course: Orientação a objetos com Java
 * Week: 5 (homework)
 * Release Changes: first release
 * Main Resources:
 * https://www.caelum.com.br/apostila-java-orientacao-objetos/interfaces/#interfaces
 */

package formasdetratamento;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAutoridade {
	
	@Test
	public void informal() {
		Informal i = new Informal();
		Autoridade a = new Autoridade("CASSIO", "MENDONCA",i);
		assertEquals("CASSIO",a.getTratamento());
	}

	@Test
	public void masculino() {
		Respeitoso r = new Respeitoso("masculino");
		Autoridade a = new Autoridade("CASSIO", "MENDONCA",r);
		assertEquals("Sr. MENDONCA",a.getTratamento());
	}

	@Test
	public void feminino() {
		Respeitoso r = new Respeitoso("feminino");
		Autoridade a = new Autoridade("DANIELA", "MENDONCA",r);
		assertEquals("Sra. MENDONCA",a.getTratamento());
	}

	@Test
	public void magnifico() {
		ComTitulo ct = new ComTitulo("Magnifico");
		Autoridade a = new Autoridade("CASSIO", "MENDONCA",ct);
		assertEquals("Magnifico CASSIO MENDONCA",a.getTratamento());
	}

}
