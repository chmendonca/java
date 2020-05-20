/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 20th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (classroom example)
 * Release Changes: first release
 */

package excessoes;

public class Principal {

	public static void main(String[] args) throws Exception {
		a(100);
		System.out.println("Finalizando a mensagem de main()");
	}
/*	
	public static void a(int i) throws Exception {
		System.out.println("Executando a() " + i);
		b(i);
	}
*/

	public static void a(int i){
		System.out.println("Executando a() " + i);
		try {
			b(i);
		} catch (Exception e) {
			System.out.println("Tratando a excessão em a(): " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Finalizando a execução de a()");
	}
	
	public static void b(int i) throws Exception {
		System.out.println("Executando b() " + i);
		if (i < 0)
			throw new Exception ("Mensagem em b()");
		System.out.println("Finalizando a execução de b()");
	}

}
