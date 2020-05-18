/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 18th, 2020
 * Course: Orientação a objetos com Java
 * Week: 4 (homework)
 * Release Changes: first release
 * Main Resources:
 * http://www.matera.com/blog/post/desvendando-os-metodos-equals-e-hashcode
 * https://blog.cvinicius.com.br/2017/03/melhorando-sobrescrita-dos-metodos.html
 * http://www.linhadecodigo.com.br/artigo/3669/trabalhando-com-a-interface-set-no-java.aspx
 * https://www.devmedia.com.br/sobrescrevendo-o-metodo-hashcode-em-java/26488
 * https://blog.algaworks.com/entendendo-o-equals-e-hashcode/
 */

package products;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestProdSize {

	@Before
	public void setUp() throws Exception {
		;
	}

	@Test
	public void testingSameProdsSameSizes() {
		ProdSize p1 = new ProdSize("CPTS","Pants",25.99,"s");				
		ProdSize p2 = new ProdSize("CPTS","Pants",25.99,"S");
								
		//assertEquals(p1,p2); //With no equals override on ProdSize but in Prod
		assertEquals(p1,p2); //With equals override on ProdSize
	}

	@Test
	public void testingSameProdsSizesDifferentSizes(){
		ProdSize p1 = new ProdSize("CPTS","Pants",25.99,"M");				
		ProdSize p2 = new ProdSize("CPTS","Pants",26.99,"L");
						
		//assertEquals(p1,p2); //With no equals override on ProdSize but in Prod
		assertNotEquals(p1,p2); //With equals override on ProdSize
	}
	
	@Test
	public void testingDifferentProdsSameSizes() {
		ProdSize p1 = new ProdSize("CTSHT","T-Shirt",25.99,"S");				
		ProdSize p2 = new ProdSize("CPTS","Pants",25.99,"S");
						
		//assertEquals(p1,p2); //With no equals override on ProdSize but in Prod
		assertNotEquals(p1,p2); //With equals override on ProdSize
	}
	
	@Test
	public void testingDifferentProdsDifferentSizes() {
		ProdSize p1 = new ProdSize("CTSHT","T-Shirt",25.99,"S");				
		ProdSize p2 = new ProdSize("CPTS","Pants",25.99,"S");
						
		//assertEquals(p1,p2); //With no equals override on ProdSize but in Prod
		assertNotEquals(p1,p2); //With equals override on ProdSize
	}

	@Test
	public void testingDifferentProdsAndSizes() {
		ProdSize p1 = new ProdSize("SSNKRS","Sneakers",25.99,"41");				
		ProdSize p2 = new ProdSize("CPTS","Pants",25.99,"XL");
						
		//assertNotEquals(p1,p2); //With no equals override on ProdSize but in Prod
		assertNotEquals(p1,p2); //With equals override on ProdSize
	}
	
	@Test
	public void prodSizeListSameProdsSameSize() {
		List<Prod> listProd = new ArrayList<Prod>();
		ProdSize p1 = new ProdSize("CPTS","Pants",25.99,"M");				
		ProdSize p2 = new ProdSize("CPTS","Pants",26.99,"M");
		listProd.add(p1);
		listProd.add(p2);
		
		//On List two equals ids should be accepted.
		//To avoid it, is necessary to confirm if they are on the list and
		//  do not insert it (see example on TestProd.java)
		assertEquals(2,listProd.size()); //With equals override on ProdSize
	}
	
	@Test
	public void proSizedHashSetSameProdsSameSizes() {
		Collection<ProdSize> hashSetProd = new HashSet<ProdSize>();
		ProdSize p1 = new ProdSize("CPTS","Pants",25.99,"M");				
		ProdSize p2 = new ProdSize("CPTS","Pants",26.99,"M");
		hashSetProd.add(p1);
		hashSetProd.add(p2);
		
		//assertEquals(2,hashSetProd.size()); //With no hashcode override
		assertEquals(1,hashSetProd.size()); //With hashcode override
	}
	
	@Test
	public void proSizedHashSetSameProdsDifferentSizes() {
		Collection<ProdSize> hashSetProd = new HashSet<ProdSize>();
		ProdSize p1 = new ProdSize("CPTS","Pants",25.99,"M");				
		ProdSize p2 = new ProdSize("CPTS","Pants",26.99,"L");
		hashSetProd.add(p1);
		hashSetProd.add(p2);
		
		//assertEquals(2,hashSetProd.size()); //With no hashcode override
		assertEquals(2,hashSetProd.size()); //With hashcode override
	}
	
	@Test
	public void proSizedHashSetDifferentProdsSameSizes() {
		Collection<ProdSize> hashSetProd = new HashSet<ProdSize>();
		ProdSize p1 = new ProdSize("CPTS","Pants",25.99,"M");				
		ProdSize p2 = new ProdSize("CTSHT","T-Shirt",25.99,"M");
		hashSetProd.add(p1);
		hashSetProd.add(p2);
		
		//assertEquals(2,hashSetProd.size()); //With no hashcode override
		assertEquals(2,hashSetProd.size()); //With hashcode override
	}
	
	@Test
	public void proSizedHashSetDifferentProdsDifferentSizes() {
		Collection<ProdSize> hashSetProd = new HashSet<ProdSize>();
		ProdSize p1 = new ProdSize("SSNKRS","Sneakers",25.99,"41");				
		ProdSize p2 = new ProdSize("CTSHT","T-Shirt",25.99,"M");
		hashSetProd.add(p1);
		hashSetProd.add(p2);
		
		//assertEquals(2,hashSetProd.size()); //With no hashcode override
		assertEquals(2,hashSetProd.size()); //With hashcode override
	}

}
