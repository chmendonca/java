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

public class Autoridade implements FormatadorNome{
	
	private String nome;
	private String sobrenome;
	private String tratamento;
	
	public Autoridade(String nome, String sobrenome, String tratamento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tratamento = tratamento;
	}

	public String formatarNome(String nome, String sobrenome) {
		if (this.tratamento == "Informal") {
			return this.nome;
		} else if (this.tratamento == "masculino") {
			return "Sr. " + this.sobrenome;
		} else if (this.tratamento == "feminino"){
			return "Sra. " + this.sobrenome;
		} else {
			return this.tratamento + " " + this.nome + " " + this.sobrenome;
		}
	}

	public String getTratamento(){
		FormatadorNome fn = new Autoridade(this.nome,this.sobrenome,this.tratamento);
		String autoridade = fn.formatarNome(this.nome, this.sobrenome);
		System.out.println(autoridade);
		return autoridade;
	}
}
