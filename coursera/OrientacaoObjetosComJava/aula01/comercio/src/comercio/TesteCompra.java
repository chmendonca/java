package comercio;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompra {

	@Test
	public void CompraAVista() {
		Compra c = Compra(500);
		assertEquals(1,c.numParcelas());
	}

}
