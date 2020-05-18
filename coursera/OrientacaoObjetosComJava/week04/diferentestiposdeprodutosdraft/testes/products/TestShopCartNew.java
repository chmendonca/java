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

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestShopCartNew {
	
	static Collection<ProdSize> hashSetProd;
	HashMap<String,Integer> testShopCartProdMap;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ProdSize p1 = new ProdSize("CPTS","Pants",25.99,"s"); 				
		ProdSize p2 = new ProdSize("CPTS","Pants",25.99,"S"); //equals p1
		ProdSize p3 = new ProdSize("CPTS","Pants",25.99,"M");				
		ProdSize p4 = new ProdSize("CPTS","Pants",26.99,"l");
		ProdSize p5 = new ProdSize("CTSHT","T-Shirt",25.99,"S");				
		ProdSize p6 = new ProdSize("CPTS","Pants",25.99,"S"); //equals p1
		ProdSize p7 = new ProdSize("CTSHT","T-Shirt",25.99,"S"); //equals p5		
		ProdSize p8 = new ProdSize("CPTS","Pants",25.99,"S"); //equals p1
		ProdSize p9 = new ProdSize("SSNKRS","Sneakers",25.99,"41");				
		ProdSize p10 = new ProdSize("CPTS","Pants",25.99,"XL");
		ProdSize p11 = new ProdSize("CPTS","Pants",25.99,"M");	//equals p3			
		ProdSize p12 = new ProdSize("CPTS","Pants",26.99,"M");	//equals p3
		ProdSize p13 = new ProdSize("CPTS","Pants",25.99,"M");	//equals p3
		ProdSize p14 = new ProdSize("CPTS","Pants",26.99,"L");	//equals p4
		ProdSize p15 = new ProdSize("CPTS","Pants",25.99,"M");	//equals p3
		ProdSize p16 = new ProdSize("CTSHT","T-Shirt",25.99,"M");
		ProdSize p17 = new ProdSize("SSNKRS","Sneakers",25.99,"41"); //equals p9
		ProdSize p18 = new ProdSize("CTSHT","T-Shirt",25.99,"M"); //equals p16
		
		hashSetProd = new HashSet<ProdSize>();
		hashSetProd.add(p1);
		hashSetProd.add(p2);
		hashSetProd.add(p3);
		hashSetProd.add(p4);
		hashSetProd.add(p5);
		hashSetProd.add(p6);
		hashSetProd.add(p7);
		hashSetProd.add(p8);
		hashSetProd.add(p9);
		hashSetProd.add(p10);
		hashSetProd.add(p11);
		hashSetProd.add(p12);
		hashSetProd.add(p13);
		hashSetProd.add(p14);
		hashSetProd.add(p15);
		hashSetProd.add(p16);
		hashSetProd.add(p17);
		hashSetProd.add(p18);
		
		System.out.println("My list of available products to buy is:");
		hashSetProd.forEach(p -> System.out.println(p));
		System.out.println("");
	}

	@Before
	public void setUp() throws Exception {
		//Creating a products map using the subclass ProdSize.
		testShopCartProdMap = new HashMap<String,Integer>();
		testShopCartProdMap.clear();
	}
	
	public boolean confirmAvailability(Object obj) {
		//Confirming if there is the product on my storage
		for (ProdSize ps : hashSetProd) {
			if (ps.equals(obj)) {
				return true;
			}
		}
		return false;
	}

	@Test
	public void confirmLenghOfProductsSet() {
		//This set has only 7 products besides of the attempt to fill with 18 products.
		// It happens because many of them are repeated by code and size, as implemented
		// on subclass ProdSize.
		//This test is used to confirm that the test ProdSize has been worked correctly.
		assertEquals(7,hashSetProd.size());
	}
	
	@Test
	public void newEmptyCartHashMap() {
		//This test is only to ensure that the hashMap has been cleaned before each test
		// to confirm that the shop cart is empty
		assertEquals(0,testShopCartProdMap.size());
	}
	
	@Test
	public void addingOneAvailableProductAtCart() {
		//Creating an instance (object) product to insert in my shopcart
		ProdSize p = new ProdSize("CPTS","Pants",25.99,"s");
		
		//Cofirming its availability
		assertTrue(confirmAvailability(p));
		
		//Creating an instance (object) shopcart
		ShopCart myCart = new ShopCart();
		myCart.selectedProduct = p;
		myCart.qty = 1;
		myCart.unitPrice = p.price;
		myCart.isAvailable = confirmAvailability(p);
		myCart.addProduct();
		
		assertEquals(1,myCart.shopCartContents.size());
	}
	
	@Test
	public void addingOneUnavailableProductAtCart() {
		//Creating an instance (object) product to insert in my shopcart
		ProdSize p = new ProdSize("CPTSS","Pants",25.99,"s");
		
		//Cofirming its availability
		assertFalse(confirmAvailability(p));
		
		//Creating an instance (object) shopcart
		ShopCart myCart = new ShopCart();
		myCart.selectedProduct = p;
		myCart.qty = 1;
		myCart.unitPrice = p.price;
		myCart.isAvailable = confirmAvailability(p);
		myCart.addProduct();
		
		assertEquals(0,myCart.shopCartContents.size());
	}

	@Test
	public void addingSameTwoProductsAtOnceAtCart() {
		//Creating an instance (object) product to insert in my shopcart
		ProdSize p = new ProdSize("CPTS","Pants",25.99,"s");
		
		//Creating an instance (object) shopcart
		ShopCart myCart = new ShopCart();
		myCart.selectedProduct = p;
		myCart.qty = 2;
		myCart.unitPrice = p.price;
		myCart.isAvailable = confirmAvailability(p);
		myCart.addProduct();
		
		//Getting the product quantity
		int quantity = myCart.shopCartContents.get(p);
		
		assertEquals(1,myCart.shopCartContents.size());
		assertEquals(2,quantity);
	}

	@Test
	public void addingSameTwoProductsAtCart() {
		//Creating two instances (objects) of same product to insert in my shopcart
		ProdSize p1 = new ProdSize("CPTS","Pants",25.99,"s");
		ProdSize p2 = new ProdSize("CPTS","Pants",25.99,"S");
		
		//Creating an instance (object) shopcart
		ShopCart myCart = new ShopCart();
		myCart.selectedProduct = p1;
		myCart.qty = 1;
		myCart.unitPrice = p1.price;
		myCart.isAvailable = confirmAvailability(p1);
		myCart.addProduct();
		
		myCart.selectedProduct = p2;
		myCart.qty = 1;
		myCart.unitPrice = p2.price;
		myCart.isAvailable = confirmAvailability(p2);
		myCart.addProduct();
		
		//Getting the product quantity
		int quantity1 = myCart.shopCartContents.get(p1);
		int quantity2 = myCart.shopCartContents.get(p2);
		
		assertEquals(1,myCart.shopCartContents.size());
		assertEquals(2,quantity1);
		assertEquals(2,quantity2); //since p1 identical to p2, the quantity is the same doesn't matter for which
	}	

	@Test
	public void addingDifferentTwoProductsAtCart() {
		//Creating different instances of objects
		ProdSize p1 = new ProdSize("CPTS","Pants",25.99,"s");
		ProdSize p2 = new ProdSize("CPTS","Pants",25.99,"M");
		
		//Creating an instance (object) shopcart
		ShopCart myCart = new ShopCart();
		myCart.selectedProduct = p1;
		myCart.qty = 1;
		myCart.unitPrice = p1.price;
		myCart.isAvailable = confirmAvailability(p1);
		myCart.addProduct();
		
		myCart.selectedProduct = p2;
		myCart.qty = 1;
		myCart.unitPrice = p2.price;
		myCart.isAvailable = confirmAvailability(p2);
		myCart.addProduct();
			
		//Getting the products quantity
		int quantity1 = myCart.shopCartContents.get(p1);
		int quantity2 = myCart.shopCartContents.get(p2);
		
		assertEquals(2,myCart.shopCartContents.size());
		assertEquals(1,quantity1);
		assertEquals(1,quantity2);
	}

	@Test
	public void removingProductOneProductOfTwoDifferentProducts(){
		//Creating different instances of objects
		ProdSize p1 = new ProdSize("CPTS","Pants",25.99,"s");
		ProdSize p2 = new ProdSize("CPTS","Pants",25.99,"M");
		
		//Creating an instance (object) shopcart
		ShopCart myCart = new ShopCart();
		myCart.selectedProduct = p1;
		myCart.qty = 1;
		myCart.unitPrice = p1.price;
		myCart.isAvailable = confirmAvailability(p1);
		myCart.addProduct();
		
		myCart.selectedProduct = p2;
		myCart.qty = 1;
		myCart.unitPrice = p2.price;
		myCart.isAvailable = confirmAvailability(p2);
		myCart.addProduct();
		
		myCart.selectedProduct = p1;
		
		myCart.removeProduct(); //It will remove the last selected, thus p1
			
		//Getting the products quantity
		//It was not attempted to get the value of p2 to avoid errors, since it doesn't exist anymore
		int quantity2 = myCart.shopCartContents.get(p2);
		
		assertEquals(1,myCart.shopCartContents.size());
		assertEquals(1,quantity2);
		}

	@Test
	public void removingOneOfSameTwoProducts() {
		//Creating an instance (object) product to insert in my shopcart
		ProdSize p = new ProdSize("CPTS","Pants",25.99,"s");
		
		//Creating an instance (object) shopcart
		ShopCart myCart = new ShopCart();
		myCart.selectedProduct = p;
		myCart.qty = 2;
		myCart.isAvailable = confirmAvailability(p);
		myCart.unitPrice = p.price;
		myCart.addProduct();
		
		myCart.removeProduct();
		
		//Getting the product quantity
		int quantity = myCart.shopCartContents.get(p);
		
		assertEquals(1,myCart.shopCartContents.size());
		assertEquals(1,quantity);
	}
	
	@Test
	public void totalOfOneProduct() {
		//Creating an instance (object) product to insert in my shopcart
		ProdSize p = new ProdSize("CPTS","Pants",25.99,"s");
		
		//Creating an instance (object) shopcart
		ShopCart myCart = new ShopCart();
		myCart.selectedProduct = p;
		myCart.qty = 1;
		myCart.unitPrice = p.price;
		myCart.isAvailable = confirmAvailability(p);		
		myCart.addProduct();		
		myCart.totalValue();
		
		assertEquals(1,myCart.shopCartContents.size());
		assertEquals(25.99,myCart.total,0.1);
	}
	
	@Test
	public void totalOfTwoProductsWithDifferentSizes() {
		//Creating an instance (object) product to insert in my shopcart
		ProdSize p1 = new ProdSize("CPTS","Pants",25.99,"s");
		ProdSize p2 = new ProdSize("CPTS","Pants",25.99,"M");
		
		//Creating an instance (object) shopcart
		ShopCart myCart = new ShopCart();
		
		myCart.selectedProduct = p1;
		myCart.qty = 1;
		myCart.unitPrice = p1.price;
		myCart.isAvailable = confirmAvailability(p1);		
		myCart.addProduct();		
		
		myCart.selectedProduct = p2;
		myCart.qty = 1;
		myCart.unitPrice = p2.price;
		myCart.isAvailable = confirmAvailability(p2);		
		myCart.addProduct();		
				
		myCart.totalValue();
		
		assertEquals(2,myCart.shopCartContents.size());
		assertEquals(51.98,myCart.total,0.1);
	}
	
	@Test
	public void totalOfThreeDifferentProductsWithDifferentQuantities() {
		//Creating an instance (object) product to insert in my shopcart
		ProdSize p1 = new ProdSize("CPTS","Pants",25.99,"s");
		ProdSize p2 = new ProdSize("CPTS","Pants",25.99,"M");
		ProdSize p3 = new ProdSize("SSNKRS","Sneakers",25.99,"41");
		
		//Creating an instance (object) shopcart
		ShopCart myCart = new ShopCart();
		
		myCart.selectedProduct = p1;
		myCart.qty = 3; //total price 77.97
		myCart.unitPrice = p1.price;
		myCart.isAvailable = confirmAvailability(p1);		
		myCart.addProduct();		
		
		myCart.selectedProduct = p2;
		myCart.qty = 1; //total price 25.99
		myCart.unitPrice = p2.price;
		myCart.isAvailable = confirmAvailability(p2);		
		myCart.addProduct();	
		
		myCart.selectedProduct = p3;
		myCart.qty = 2; //total price 51.98 
		myCart.unitPrice = p3.price;
		myCart.isAvailable = confirmAvailability(p3);		
		myCart.addProduct();			
				
		myCart.totalValue();
		
		assertEquals(3,myCart.shopCartContents.size());
		assertEquals(155.94,myCart.total,0.1);
	}
	
	@Test
	public void totalOfThreeDifferentProductsWithDifferentQuantitiesRemovingProducts() {
		//Creating an instance (object) product to insert in my shopcart
		ProdSize p1 = new ProdSize("CPTS","Pants",25.99,"s");
		ProdSize p2 = new ProdSize("CPTS","Pants",25.99,"M");
		ProdSize p3 = new ProdSize("SSNKRS","Sneakers",25.99,"41");
		
		//Creating an instance (object) shopcart
		ShopCart myCart = new ShopCart();
		
		myCart.selectedProduct = p1;
		myCart.qty = 3; //total price 77.97
		myCart.unitPrice = p1.price;
		myCart.isAvailable = confirmAvailability(p1);		
		myCart.addProduct();		
		
		myCart.selectedProduct = p2;
		myCart.qty = 1; //total price 25.99
		myCart.unitPrice = p2.price;
		myCart.isAvailable = confirmAvailability(p2);		
		myCart.addProduct();	
		
		myCart.selectedProduct = p3;
		myCart.qty = 2; //total price 51.98 
		myCart.unitPrice = p3.price;
		myCart.isAvailable = confirmAvailability(p3);		
		myCart.addProduct();			
				
		myCart.totalValue();
		
		assertEquals(3,myCart.shopCartContents.size());
		assertEquals(155.94,myCart.total,0.1);
		
		myCart.selectedProduct = p1;		
		myCart.removeProduct();
		myCart.removeProduct();
		
		myCart.selectedProduct = p2;
		myCart.removeProduct();	
		
		myCart.selectedProduct = p3;
		myCart.removeProduct();			
		
		myCart.totalValue();
		
		assertEquals(2,myCart.shopCartContents.size());
		assertEquals(51.98,myCart.total,0.1);
	}
}

	
/*
	assertEquals(1,myCart.shopCartProdMap.size());
	System.out.println("teste " + myCart.shopCartProdMap.get(p2));
	int v = myCart.shopCartProdMap.get(p2);
	if (myCart.shopCartProdMap.containsKey(p2)) {
		System.out.println("\nCONTAINS\n");	
		Set<Object> item = myCart.shopCartProdMap.keySet(p2); 
		ArrayList<Object> item = keySet;
		System.out.println("\n\n\nitem: " + item);
		System.out.println("item preço" + item.get(2));
	}
	assertEquals(2,v);
*/