package jogo;

import java.util.HashMap;

public interface RegrasMecanicaDoJogo {
	
	public boolean validarEscolhaDoJogador(String escolha);
	public void iniciarJogo(String escolha);
	public String imprimirPalavraEmbaralhada();
	public boolean compararPalavras(String resposta);
	public int pontuarRodada();
	public int pontuarJogo();

}
