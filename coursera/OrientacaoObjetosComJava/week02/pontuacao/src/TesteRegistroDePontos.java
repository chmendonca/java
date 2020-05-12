import junit.framework.TestCase;


public class TesteRegistroDePontos extends TestCase {
	
	@Test
	public int pontosCriarTopico(){
		Usuario u = new Usuario();
		u.nome = "Cassio";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos,5);
		
	}

}
