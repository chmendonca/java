/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 20th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (classroom example)
 * Release Changes: first release
 */

package login;

public class LoginException extends Exception {
	
	private String login;
	
	public LoginException(String message, String login) {
		super(message);
		this.login = login;
	}

	public String getLogin() {
		return login;
	}
}
