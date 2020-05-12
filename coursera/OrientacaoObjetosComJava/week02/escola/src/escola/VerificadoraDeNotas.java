/*
 * Esta classe foi eliminada após refatoração das classes. Os cálculos feitos aqui foram passados
 * para a classe Aluno porque ele tem que saber a sua média e se passou ou não de ano. * 
 */

package escola;

public class VerificadoraDeNotas {
	
	public static int mediaAluno(Aluno a) {
		int total = 0;
		total += a.bim1;
		total += a.bim2;
		total += a.bim3;
		total += a.bim4;
		return total / 4;
	}
	
	public static boolean passouDeAno(Aluno a) {
		int media = mediaAluno(a);
		if (media >= 60) {
			return true;
		} else;
			return false;
	}

}
