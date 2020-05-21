/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 20th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (classroom example)
 * Release Changes: first release
 */

package login;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteUsuario {

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("Cassio", "senhaCassio");
		assertEquals("Cassio",u.getLogin());
	}

	@Test (expected = LoginException.class)
	public void loginSemSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("Cassio", "senhaErradaCassio");
		System.out.println(u.getLogin());
		assertEquals("Cassio",u.getLogin());
	}

	@Test
	public void informaçaoDoErro() {
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("Cassio", "senhaErradaCassio");
			fail();
		} catch (LoginException e) {
			assertEquals("Cassio",e.getLogin());
		}
	}

	@Test
	public void informaçaoDoErroFail() {
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("Cassio", "senhaCassio");
			fail();
		} catch (LoginException e) {
			assertEquals("Cassio",e.getLogin());
		}
	}

}
