package jogo;

import java.util.Arrays;

public class FabricaEmbaralhadoresSub01 extends FabricaEmbaralhadores implements Embaralhador {

	private String palavraDesordenada = "";
	private char letra;
	
	public String embaralhar(String palavra) {
		char[] letras = new char[palavra.length()];
		for (int i = 0; i <= palavra.length(); i++) {
			letra = palavra.charAt(i);
			letras[i] = letra;
			System.out.println(letras);
		}
			
		Arrays.sort(letras);
		System.out.println(letras);
		
		for (char c : letras) {
			palavraDesordenada += c;
		}
		
		System.out.println(palavraDesordenada);
		
		return palavraDesordenada;
		
	}

}
