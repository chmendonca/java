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

public class TestProd {

	@Before
	public void setUp() throws Exception {
		;
	}

	@Test
	public void testingSameProds(){
		Prod p1 = new Prod("CPTS","Pants",25.99);				
		Prod p2 = new Prod("CPTS","Pants",25.99);
						
		//assertNotEquals(p1,p2); //With no equals override
		assertEquals(p1,p2); //With equals override
	}

	@Test
	public void testingSameProdsDifferentPrices(){
		Prod p1 = new Prod("CPTS","Pants",25.99);				
		Prod p2 = new Prod("CPTS","Pants",26.99);
						
		//assertNotEquals(p1,p2); //With no equals override
		assertEquals(p1,p2); //With equals override
	}

	@Test
	public void testingDifferentProds() {
		Prod p1 = new Prod("SSNKRS","Sneakers",25.99);				
		Prod p2 = new Prod("CPTS","Pants",25.99);
						
		//assertNotEquals(p1,p2); //With no equals override
		assertNotEquals(p1.getId(),p2.getId()); //With equals override
	}
	
	@Test
	public void prodListSameProds() {
		List<Prod> listProd = new ArrayList<Prod>();
		Prod p1 = new Prod("CPTS","Pants",25.99);				
		Prod p2 = new Prod("CPTS","Pants",26.99);
		listProd.add(p1);
		listProd.add(p2);
		
		assertEquals(2,listProd.size()); //With equals override
		//System.out.println(listProd);
	}
	
	@Test
	public void prodListSameProdsCheckIfThereIsProd() {
		List<Prod> listProd = new ArrayList<Prod>();
		Prod p1 = new Prod("CPTS","Pants",25.99);				
		Prod p2 = new Prod("CPTS","Pants",26.99);
		listProd.add(p1);
		if (!listProd.contains(p2)) {
			listProd.add(p2); //Since id is already in the list by p1 addition, it won't be added
		}
		
		assertEquals(1,listProd.size()); //With equals override
		//System.out.println(listProd);
	}
	
	@Test
	public void prodHashSetSameProds() {
		Collection<Prod> hashSetProd = new HashSet<Prod>();
		Prod p1 = new Prod("CPTS","Pants",25.99);				
		Prod p2 = new Prod("CPTS","Pants",26.99);
		hashSetProd.add(p1);
		hashSetProd.add(p2);
		
		//assertEquals(2,hashSetProd.size()); //With no hashcode override
		assertEquals(1,hashSetProd.size()); //With hashcode override
		//hashSetProd.forEach(System.out::println);
	}
	
	@Test
	public void prodHashSetDifferentProds() {
		Collection<Prod> hashSetProd = new HashSet<Prod>();
		Prod p1 = new Prod("SSNKRS","Sneakers",25.99);		
		Prod p2 = new Prod("CPTS","Pants",26.99);
		Prod p3 = new Prod("SSNDLLS","Sandalls",10.99);
		hashSetProd.add(p1);
		hashSetProd.add(p2);
		hashSetProd.add(p3);
		
		//assertEquals(2,hashSetProd.size()); //With no hashcode override
		assertEquals(3,hashSetProd.size()); //With hashcode override
		//hashSetProd.forEach(System.out::println);
	}
	
	@Test
	public void prodHashSetDifferentProdsOneCodeNull() {
		Collection<Prod> hashSetProd = new HashSet<Prod>();
		Prod p1 = new Prod(null,"Sneakers",25.99);		
		Prod p2 = new Prod("CPTS","Pants",26.99);
		Prod p3 = new Prod("SSNDLLS","Sandalls",10.99);
		hashSetProd.add(p1);
		hashSetProd.add(p2);
		hashSetProd.add(p3);
		
		//The result is 3 because the logic to avoid null was not implemented
		// because it was not required on the homework description
		assertEquals(3,hashSetProd.size()); //With hashcode override
	}

}
