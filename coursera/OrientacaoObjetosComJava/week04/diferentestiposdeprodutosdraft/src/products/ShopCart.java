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

import java.util.HashMap;

public class ShopCart {
	
	/*
	 * It was not created the class "Storage" to store the list of available products. Thus
	 *  it is necessary to create this "storage" anywhere. It has been created on the 
	 *  TestShopCart, but it was not implemented on the "ShopCart" class because it is not
	 *  part of. The "ShopCart" class contains the hashmap to store the customer selected
	 *  products. It "knows" (attribute) that the product is available or not. 
	 */
	
	public Object selectedProduct;
	public int qty; //quantity of the selected product
	public boolean isAvailable;
	public double unitPrice;
	public double total = 0;
	public HashMap<Object,Integer> shopCartContents = new HashMap<Object,Integer>();
	public HashMap<Object,Double> shopCartPrices = new HashMap<Object,Double>();
/*
	public ShopCart(String selectedProduct, int qty, boolean isAvailable) {
		//this.selectedProduct = selectedProduct;
		//this.qty = qty;
		//this.isAvailable = isAvailable;
	}
*/
	public Object getSelectedProduct() {
		return selectedProduct;
	}
	
	public void setSelectedProduct(Object selectedProduct) {
		this.selectedProduct = selectedProduct;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public boolean getIsAvailable() {
		return isAvailable;
	}
	
	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public HashMap<Object,Integer> addProduct(){
		//Is the product available?
		if (this.isAvailable) {
			if (shopCartContents.containsKey(selectedProduct)){
				shopCartContents.put(selectedProduct, shopCartContents.get(selectedProduct) + qty);
			} else {
				shopCartContents.put(selectedProduct, qty);
				productPrice();
			}			
			//System.out.println(shopCartContents);
			//System.out.println(shopCartContents.size());
			//System.out.println("shopcart " + shopCartContents.get(selectedProduct));
		}
		return shopCartContents;
	}
	
	public HashMap<Object,Integer> removeProduct(){
		if (shopCartContents.containsKey(selectedProduct)) {
			if (shopCartContents.get(selectedProduct) >= 1){
				shopCartContents.put(selectedProduct, shopCartContents.get(selectedProduct) - 1);
			}
			if (shopCartContents.get(selectedProduct) == 0) {
				shopCartContents.remove(selectedProduct);
			}
		}
		return shopCartContents;
	}
	
	public HashMap<Object,Double> productPrice(){
		shopCartPrices.put(selectedProduct, unitPrice);
        System.out.println("shopCartPrices: " + shopCartPrices);
		return shopCartPrices;
	}
		
	public double totalValue() {
		total = 0;
		shopCartContents.forEach((k, v) -> {
			//Object item = shopCartContents.keySet();
	        int itemQuantity = shopCartContents.get(k);
	        unitPrice = shopCartPrices.get(k);
	        //System.out.println("unitPrice: " + unitPrice);
	        total = total + (itemQuantity * unitPrice);
		});
		return total;		
	}
	
}

