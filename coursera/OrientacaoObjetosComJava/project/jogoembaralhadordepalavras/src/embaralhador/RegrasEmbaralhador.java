/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 30th, 2020
 * Course: Orienta��o a objetos com Java
 * Week: 6 (course final project)
 * Comments: Esta � a interface que cont�m as regras para criar um embaralhador
 * How it works: "embaralhar" � onde a l�gica do embaralhador vai ser implementada. "getPalavraEmbaralhada" � o 
 *  m�todo que vai chamar o m�todo "embaralhar" e que deve ser usado como o relacionamento desta classe para outras
 *  classes.
 */

package embaralhador;

import java.util.HashMap;

public interface RegrasEmbaralhador {

	public HashMap<String,String> getPalavraEmbaralhada();

}
