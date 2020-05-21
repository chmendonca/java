/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 21th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Release Changes: first release
 * Comments: This test case invokes a new object from FabricaEmbaralhadores and verifies that it is returning a word and choosing
 * one option of "Embaralhadores". For a while, the "Embaralhadores" logics were not implemented.
 */

package jogo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteFabricaEmbaralhadores {
	
	FabricaEmbaralhadores fe;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {	
		fe = new FabricaEmbaralhadores();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		assertNotNull(fe);
		fe.qualEmbaralhador();
	}

	@Test
	public void test2() {
		assertNotNull(fe);
		fe.qualEmbaralhador();
	}

	@Test
	public void test3() {
		assertNotNull(fe);
		fe.qualEmbaralhador();
	}
}
