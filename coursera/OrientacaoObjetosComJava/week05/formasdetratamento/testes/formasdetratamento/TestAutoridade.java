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
		Autoridade a = new Autoridade("CASSIO", "MENDONCA","Informal");
		assertEquals("CASSIO",a.getTratamento());
	}

	@Test
	public void masculino() {
		Autoridade a = new Autoridade("CASSIO", "MENDONCA","masculino");
		assertEquals("Sr. MENDONCA",a.getTratamento());
	}

	@Test
	public void feminino() {
		Autoridade a = new Autoridade("DANIELA", "MENDONCA","feminino");
		assertEquals("Sra. MENDONCA",a.getTratamento());
	}

	@Test
	public void magnifico() {
		Autoridade a = new Autoridade("CASSIO", "MENDONCA","Magnifico");
		assertEquals("Magnifico CASSIO MENDONCA",a.getTratamento());
	}

}
