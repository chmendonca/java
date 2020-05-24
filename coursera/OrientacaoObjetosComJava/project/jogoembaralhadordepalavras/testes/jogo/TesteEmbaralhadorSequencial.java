package jogo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteEmbaralhadorSequencial {
	
	EmbaralhadorSequencial es;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		es = new EmbaralhadorSequencial();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void primeiraLetraMaiuscula() {
		assertNotEquals("Cassio",es.embaralhar("Cassio"));
	}

	@Test
	public void todasLetrasMaiusculas() {
		assertNotEquals("CASSIO",es.embaralhar("CASSIO"));
	}

	@Test
	public void primeiraLetraMaiusculaDani() {
		assertNotEquals("Daniela",es.embaralhar("Daniela"));
	}

	@Test
	public void todasLetrasMaiusculasDani() {
		assertNotEquals("DANIELA",es.embaralhar("DANIELA"));
	}

}
