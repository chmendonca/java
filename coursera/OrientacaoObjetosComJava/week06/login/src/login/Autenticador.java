/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 20th, 2020
 * Course: Orienta��o a objetos com Java
 * Week: 6 (classroom example)
 * Release Changes: first release
 */

package login;

public class Autenticador {
	
	public Usuario logar(String login, String senha) throws LoginException{
		if (login.equals("Cassio") && senha.equals("senhaCassio")) {
			return new Usuario(login);
		} else {
			throw new LoginException("O usuario e senha n�o batem!", login);
		}
	}

}
