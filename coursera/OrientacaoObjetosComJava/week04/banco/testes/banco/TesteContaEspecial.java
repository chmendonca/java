package banco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaEspecial extends TesteContaCorrente {
	
	@Before
	public void before() {
		cc = new ContaEspecial(100);
		cc.depositar(200);
	}
	
	@Test
	public void saqueMaiorSaldo() {
		int valorSacado = cc.sacar(550);
		assertEquals(200,cc.saldo);
		assertEquals(valorSacado,0);
	}
	
	@Test
	public void saqueMaiorSaldoMenorLimite() {
		int valorSacado = cc.sacar(250);
		assertEquals(-50,cc.saldo);
		assertEquals(valorSacado,250);
	}

}
