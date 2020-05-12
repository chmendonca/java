package pizzaria;


import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PizzaTeste {
	Pizza p;
	Pizza p1;
	Pizza p2;
	Pizza p3;
	CarrinhoCompras c;
	
	@Before
	public void before() {
		System.out.println("\n* PizzaTeste: @Before");
		p = new Pizza();
		p1 = new Pizza();
		p2 = new Pizza();
		p3 = new Pizza();
		c = new CarrinhoCompras();
		
		p.contabilizaTotal.clear(); //reset the static list to an empty state before each test
	}
	
	/*
	 * The homework requirements ask to avoid tests of pizza price and the toppings
	 * 	being appended to the roll on the same test. But, the price of the pizza depends
	 *  of the number of the toppings requested, thus, creating separate tests would
	 *  increase the workload and will not make too much sense.
	 * The test cases were structured in a sequence to facilitate their understand and to
	 * 	easily identify the test cases.
	 * The first part of the test, the intent is to demonstrate the correct counting of 
	 *  the number of toppings on a single pizza and its correct addition to the shop
	 *  cart. Also, it was verified that the system behavior if no topping is added.
	 * The second part of the test verifies many combinations of pizzas on the cart,
	 * 	ensuring that the quantity and the price based on the number of toppings are
	 * 	correct. These tests includes cases with no toppings on the pizza
	 * */
	 
	/* 
	 * ### Part 1 ###
	 * Test cases:
	 * p: no topping
	 * p: one topping
	 * p: two toppings
	 * p: three toppings
	 * p: four toppings, but with double Garlic
	 * p: five toppings
	 * p: six toppings
	 * p: six toppings, but with double Garlic and double Bacon
	 * */
	
	//This method verifies that if not topping has been added
	//	the system does not contabilize this topping and the
	//	shop cart is not updated.
	@Test
	public void noToppingsAdded() {
		//No toppings
		p.adicionaIngrediente();
		
		//Verifies that the topping is not counted to the pizza toppings list
		assertEquals(0,p.quantidadeIngredientesPizza);
		//Verifies that the topping is not put in the pizza toppings list
		assertTrue(p.ingredientesPizza.isEmpty());
		//Verifies that the topping is not put in the full list of consumed toppings
		assertTrue(p.contabilizaTotal.isEmpty());
		//Verifies that the price on shopcart is not updated
		assertEquals(0,c.Compras(p.getPreco()));
		String print = "O preço total da compra ficou em: R$0";
		assertEquals(print,c.imprimePrecoTotalCompra());
		
	}
	
	//The next methods test the value of the pizza based on 
	//	number of its toppings
	@Test
	public void valueOneTopping() {
		//one topping
		p.ingrediente = "Mozzarella";
		p.adicionaIngrediente();
		
		//Verifies that one topping was counted to the pizza toppings list
		assertEquals(1,p.quantidadeIngredientesPizza);
		//Verifies that one topping was put in the pizza toppings list
		assertEquals(1,p.ingredientesPizza.size());
		//Verifies that one topping was put in the full list of consumed toppings
		assertEquals(1,p.contabilizaTotal.size());
		//Verifies the price on the cart
		assertEquals(15,c.Compras(p.getPreco()));
		String print = "O preço total da compra ficou em: R$15";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	@Test
	public void valueTwoToppings() {
		//two toppings
		p.ingrediente = "Mozzarella";
		p.adicionaIngrediente();
		p.ingrediente = "Tomatoes";
		p.adicionaIngrediente();
		
		//Verifies that two toppings were counted to the pizza toppings list
		assertEquals(2,p.quantidadeIngredientesPizza);
		//Verifies that two toppings were put in the pizza toppings list
		assertEquals(2,p.ingredientesPizza.size());
		//Verifies that two toppings were put in the full list of consumed toppings
		assertEquals(2,p.contabilizaTotal.size());
		//Verifies the price on the cart
		assertEquals(15,c.Compras(p.getPreco()));
		String print = "O preço total da compra ficou em: R$15";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	@Test
	public void valueThreeToppings() {
		//three toppings
		String pizza[] = {"Mozzarella","Tomatoes","Garlic"};
		for (String add : pizza) {
			p.ingrediente = add;
			p.adicionaIngrediente();
		}
		
		//Verifies that three toppings were counted to the pizza toppings list
		assertEquals(3,p.quantidadeIngredientesPizza);
		//Verifies that three toppings were put in the pizza toppings list
		assertEquals(3,p.ingredientesPizza.size());
		//Verifies that three toppings were put in the full list of consumed toppings
		assertEquals(3,p.contabilizaTotal.size());
		//Verifies the price on the cart
		assertEquals(20,c.Compras(p.getPreco()));
		String print = "O preço total da compra ficou em: R$20";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	@Test
	public void valueFourToppings() {
		//four toppings, in this case, I am asking for extra garlic
		String pizza[] = {"Mozzarella","Tomatoes","Garlic","Garlic"};
		for (String add : pizza) {
			p.ingrediente = add;
			p.adicionaIngrediente();
		}
		
		//Verifies that four toppings were counted to the pizza toppings list
		//In this case, the toppings counter was updated because it was doubled
		//	the garlic, but the pizza toppings list remained equal
		assertEquals(4,p.quantidadeIngredientesPizza);
		//Verifies that three toppings were put in the pizza toppings list. Garlic
		//	was inserted only once, but counted twice
		assertEquals(3,p.ingredientesPizza.size());
		//Verifies that three toppings were put in the full list of consumed toppings
		//The number of toppings remained the same because the garlic was doubled but
		//	it was updated the number of times that it was requested and not the number 
		//	of toppings
		assertEquals(3,p.contabilizaTotal.size());
		//Verifies the price on the cart
		//The price will remain the same, but the number of toppings now is 4
		assertEquals(20,c.Compras(p.getPreco()));
		String print = "O preço total da compra ficou em: R$20";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	@Test
	public void valueFiveToppings() {
		//five toppings
		String pizza[] = {"Mozzarella","Tomatoes","Garlic","Olives","Bacon"};
		for (String add : pizza) {
			p.ingrediente = add;
			p.adicionaIngrediente();
		}
		
		//Verifies that five toppings were counted to the pizza toppings list
		assertEquals(5,p.quantidadeIngredientesPizza);
		//Verifies that five toppings were put in the pizza toppings list
		assertEquals(5,p.ingredientesPizza.size());
		//Verifies that five toppings were put in the full list of consumed toppings
		assertEquals(5,p.contabilizaTotal.size());
		//Verifies the price on the cart
		//The price will remain the same, but the number of toppings now is 5
		assertEquals(20,c.Compras(p.getPreco()));
		String print = "O preço total da compra ficou em: R$20";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	@Test
	public void valueSixToppings() {
		//six toppings
		String pizza[] = {"Mozzarella","Tomatoes","Garlic","Olives","Bacon","Basil"};
		for (String add : pizza) {
			p.ingrediente = add;
			p.adicionaIngrediente();
		}
		
		//Verifies that five toppings were counted to the pizza toppings list
		assertEquals(6,p.quantidadeIngredientesPizza);
		//Verifies that five toppings were put in the pizza toppings list
		assertEquals(6,p.ingredientesPizza.size());
		//Verifies that five toppings were put in the full list of consumed toppings
		assertEquals(6,p.contabilizaTotal.size());
		//Verifies the price on the cart
		//The price will remain the same, but the number of toppings now is 5
		assertEquals(23,c.Compras(p.getPreco()));
		String print = "O preço total da compra ficou em: R$23";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	@Test
	public void valueSixToppingsWithDouble() {
		//six toppings, in this case, I am asking for extra garlic and extra bacon
		String pizza[] = {"Mozzarella","Tomatoes","Garlic","Garlic","Bacon","Bacon"};
		for (String add : pizza) {
			p.ingrediente = add;
			p.adicionaIngrediente();
		}
		
		//Verifies that six toppings were counted to the pizza toppings list
		//In this case, the toppings counter was updated because it was doubled
		//	the garlic, but the pizza toppings list remained equal
		assertEquals(6,p.quantidadeIngredientesPizza);
		//Verifies that four toppings were put in the pizza toppings list
		assertEquals(4,p.ingredientesPizza.size());
		//Verifies that four toppings were put in the full list of consumed toppings
		//The number of toppings remained the same because the garlic and bacon were 
		//	doubled but they were updated the number of times that it was requested and not
		//	the number of toppings
		assertEquals(4,p.contabilizaTotal.size());
		//Verifies the price on the cart
		//The price will remain the same, but the number of toppings now is 4
		assertEquals(23,c.Compras(p.getPreco()));
		String print = "O preço total da compra ficou em: R$23";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	/* 
	 * ### Part 2 ###
	 * Test cases:
	 * p1: one topping and p2: no topping
	 * p1: one topping and p2: one topping
	 * p1: one topping and p2: three toppings (changing price)
	 * p1: one topping and p2: six toppings (changing price)
	 * p1: two toppings, p2: one topping and p3: one topping
	 * p1: two toppings, p2: two toppings and p3: three toppings
	 * p1: two toppings, p2: four toppings and p3: six toppings
	 * p1: three toppings, p2: six toppings and p3: six toppings
	 * p1: six toppings, p2: six toppings and p3: no toppings
	 * p1: six toppings, p2: six toppings and p3: six toppings
	 * */
	
	@Test
	public void oneToppingNoTopping() {
		//two pizzas, one with single topping and the other with no topping
		p1.ingrediente = "Mozzarella";
		p1.adicionaIngrediente();
		p2.adicionaIngrediente();
		
		c.Compras(p1.getPreco());
		c.Compras(p2.getPreco());
		
		//Verify that cart sets the price for only one pizza of R$15
		//	and sets a warning to the client
		String print = "O preço total da compra ficou em: R$15";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	@Test
	public void oneToppingOneTopping() {
		//two pizzas, both with single topping
		p1.ingrediente = "Mozzarella";
		p1.adicionaIngrediente();
		p2.ingrediente = "Mozzarella";
		p2.adicionaIngrediente();
		
		c.Compras(p1.getPreco());
		c.Compras(p2.getPreco());
		c.imprimePrecoTotalCompra();
		
		//Verify that cart sets the price for two pizzas of R$15 each
		String print = "O preço total da compra ficou em: R$30";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	@Test
	public void oneToppingThreeToppings() {
		//two pizzas, one with single topping and the other with 3 toppings
		p1.ingrediente = "Mozzarella";
		p1.adicionaIngrediente();
		String pizza[] = {"Mozzarella","Tomatoes","Garlic"};
		for (String add : pizza) {
			p2.ingrediente = add;
			p2.adicionaIngrediente();
		}
		
		c.Compras(p1.getPreco());
		c.Compras(p2.getPreco());
		//Verify that cart sets the price for two pizzas one of R$15 and other of R$20
		String print = "O preço total da compra ficou em: R$35";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	@Test
	public void oneToppingSixToppings() {
		//two pizzas, one with single topping and the other with six toppings
		p1.ingrediente = "Mozzarella";
		p1.adicionaIngrediente();
		String pizza[] = {"Mozzarella","Tomatoes","Garlic","Olives","Bacon","Basil"};
		for (String add : pizza) {
			p2.ingrediente = add;
			p2.adicionaIngrediente();
		}
		
		c.Compras(p1.getPreco());
		c.Compras(p2.getPreco());
		//Verify that cart sets the price for two pizzas, one of R$15 and other of R$23
		String print = "O preço total da compra ficou em: R$38";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	@Test
	public void twoToppingsOneToppingOneTopping() {
		//three pizzas, two with single topping and one with two toppings 
		String pizza[] = {"Mozzarella","Tomatoes"};
		for (String add : pizza) {
			p1.ingrediente = add;
			p1.adicionaIngrediente();
		}
		p2.ingrediente = "Mozzarella";
		p2.adicionaIngrediente();
		p3.ingrediente = "Mozzarella";
		p3.adicionaIngrediente();
		
		c.Compras(p1.getPreco());
		c.Compras(p2.getPreco());
		c.Compras(p3.getPreco());
		//Verify that cart sets the price for three pizzas of R$15 each
		String print = "O preço total da compra ficou em: R$45";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	@Test
	public void twoToppingsTwoToppingsThreeToppings() {
		//three pizzas, two with two toppings and one with three toppings
		String pizza1[] = {"Mozzarella","Tomatoes"};
		for (String add : pizza1) {
			p1.ingrediente = add;
			p1.adicionaIngrediente();
		}
		String pizza2[] = {"Mozzarella","Tomatoes"};
		for (String add : pizza2) {
			p2.ingrediente = add;
			p2.adicionaIngrediente();
		}
		String pizza3[] = {"Mozzarella","Tomatoes","Garlic"};
		for (String add : pizza3) {
			p3.ingrediente = add;
			p3.adicionaIngrediente();
		}
		
		c.Compras(p1.getPreco());
		c.Compras(p2.getPreco());
		c.Compras(p3.getPreco());
		//Verify that cart sets the price for three pizzas, two of R$15 each and other of R$20
		String print = "O preço total da compra ficou em: R$50";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	@Test
	public void twoToppingsFourToppingsSixToppings() {
		//three pizzas, one with two toppings, one with four toppings and one with six toppings
		String pizza1[] = {"Mozzarella","Tomatoes"};
		for (String add : pizza1) {
			p1.ingrediente = add;
			p1.adicionaIngrediente();
		}
		String pizza2[] = {"Mozzarella","Tomatoes","Garlic","Olive"};
		for (String add : pizza2) {
			p2.ingrediente = add;
			p2.adicionaIngrediente();
		}
		String pizza3[] = {"Mozzarella","Tomatoes","Garlic","Garlic","Bacon","Bacon"};
		for (String add : pizza3) {
			p3.ingrediente = add;
			p3.adicionaIngrediente();
		}
		
		c.Compras(p1.getPreco());
		c.Compras(p2.getPreco());
		c.Compras(p3.getPreco());
		//Verify that cart sets the price for three pizzas, one of R$15, one of R$20 and one of R$23
		String print = "O preço total da compra ficou em: R$58";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	@Test
	public void threeToppingsSixToppingsSixToppings() {
		//three pizzas, one with three toppings and two with six toppings
		String pizza1[] = {"Mozzarella","Tomatoes","Bacon"};
		for (String add : pizza1) {
			p1.ingrediente = add;
			p1.adicionaIngrediente();
		}
		String pizza2[] = {"Mozzarella","Tomatoes","Garlic","Olive","Basil","Bacon"};
		for (String add : pizza2) {
			p2.ingrediente = add;
			p2.adicionaIngrediente();
		}
		String pizza3[] = {"Mozzarella","Tomatoes","Garlic","Garlic","Bacon","Bacon"};
		for (String add : pizza3) {
			p3.ingrediente = add;
			p3.adicionaIngrediente();
		}
		
		c.Compras(p1.getPreco());
		c.Compras(p2.getPreco());
		c.Compras(p3.getPreco());
		//Verify that cart sets the price for three pizzas, one of R$20 and two of R$23
		String print = "O preço total da compra ficou em: R$66";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	@Test
	public void sixToppingsSixToppingsNoToppings() {
		//three pizzas, one with three toppings and two with six toppings
		String pizza1[] = {"Mozzarella","Tomatoes","Bacon","Bacon","Olive","Garlic"};
		for (String add : pizza1) {
			p1.ingrediente = add;
			p1.adicionaIngrediente();
		}
		String pizza2[] = {"Mozzarella","Tomatoes","Garlic","Olive","Basil","Bacon"};
		for (String add : pizza2) {
			p2.ingrediente = add;
			p2.adicionaIngrediente();
		}
		p3.adicionaIngrediente();
				
		c.Compras(p1.getPreco());
		c.Compras(p2.getPreco());
		c.Compras(p3.getPreco());
		//Verify that cart sets the price for two pizzas of R$23 each
		String print = "O preço total da compra ficou em: R$46";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
	
	@Test
	public void sixToppingsSixToppingsSixToppings() {
		//three pizzas with six toppings each
		String pizza1[] = {"Mozzarella","Tomatoes","Bacon","Bacon","Olive","Garlic"};
		for (String add : pizza1) {
			p1.ingrediente = add;
			p1.adicionaIngrediente();
		}
		String pizza2[] = {"Mozzarella","Tomatoes","Garlic","Olive","Basil","Bacon"};
		for (String add : pizza2) {
			p2.ingrediente = add;
			p2.adicionaIngrediente();
		}
		String pizza3[] = {"Mozzarella","Tomatoes","Garlic","Garlic","Bacon","Bacon"};
		for (String add : pizza3) {
			p3.ingrediente = add;
			p3.adicionaIngrediente();
		}
		
		c.Compras(p1.getPreco());
		c.Compras(p2.getPreco());
		c.Compras(p3.getPreco());
		//Verify that cart sets the price for three pizzas of R$23 each
		String print = "O preço total da compra ficou em: R$69";
		assertEquals(print,c.imprimePrecoTotalCompra());
	}
}