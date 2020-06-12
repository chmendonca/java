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

public class Autoridade {
	
	private String nome;
	private String sobrenome;
	private FormatadorNome formatador;
	
	public Autoridade(String nome, String sobrenome, FormatadorNome formatador) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatador = formatador;
	}
	
	public String getTratamento(){
		return this.formatador.formatarNome(this.nome, this.sobrenome);
	}
}
