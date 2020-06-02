/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 30th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Comments: Esta é a interface que contém as regras para criar um embaralhador
 * How it works: "embaralhar" é onde a lógica do embaralhador vai ser implementada. "getPalavraEmbaralhada" é o 
 *  método que vai chamar o método "embaralhar" e que deve ser usado como o relacionamento desta classe para outras
 *  classes.
 */

package embaralhador;

public interface RegrasEmbaralhador {

	public String embaralhar (String palavra);
	public String getPalavraEmbaralhada (String palavra);

}
