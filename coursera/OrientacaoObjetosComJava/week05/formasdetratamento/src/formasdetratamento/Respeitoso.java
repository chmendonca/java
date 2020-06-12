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

public class Respeitoso implements FormatadorNome{
	
	private String tratamento;
	
	public Respeitoso(String tratamento) {
		this.tratamento = tratamento;
	}

	public String formatarNome(String nome, String sobrenome) {
		if (this.tratamento == "masculino") {
			return "Sr. " + sobrenome;
		} else {
			return "Sra. " + sobrenome;
		}
	}
}

