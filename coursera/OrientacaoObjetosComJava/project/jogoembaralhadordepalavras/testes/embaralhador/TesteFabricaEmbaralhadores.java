/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 21th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Release Changes: first release
 * Comments: This test case invokes a new object from FabricaEmbaralhadores and verifies that it is returning a word and choosing
 *  one option of "Embaralhadores". Also it verifies that the "Embaralhadores" are returning a hashmap table containing only one 
 *  item and this item is composed by the choosen word on its key and the messed word on its value. It compares the sizes of key
 *  and value to ensure their integrity.
 */

package embaralhador;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import embaralhador.FabricaEmbaralhadores;

public class TesteFabricaEmbaralhadores {
	
	FabricaEmbaralhadores fe;
	HashMap<String,String> conjunto;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {	
		fe = new FabricaEmbaralhadores();
		conjunto = fe.getPalavraEmbaralhada();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		assertNotNull(fe);
		assertEquals(1,conjunto.size());
		for (String i : conjunto.keySet()) {
			assertEquals(i.length(),conjunto.get(i).length());
		}
	}
		

	@Test
	public void test2() {
		assertNotNull(fe);
		assertEquals(1,conjunto.size());
		for (String i : conjunto.keySet()) {
			assertEquals(i.length(),conjunto.get(i).length());
		}
	}

	@Test
	public void test3() {
		assertNotNull(fe);
		assertEquals(1,conjunto.size());
		for (String i : conjunto.keySet()) {
			assertEquals(i.length(),conjunto.get(i).length());
		}
	}	

	@Test
	public void test4() { 
		assertNotNull(fe);
		assertEquals(1,conjunto.size());
		for (String i : conjunto.keySet()) {
			assertEquals(i.length(),conjunto.get(i).length());
		}
	}
}
