package pizzaria;

public class Principal {

	public static void main(String[] args) {		
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		CarrinhoCompras c = new CarrinhoCompras();
		
		String pizza1[] = {"Bacon","Azeitona","Alho","Mussarela"};
		for (String add : pizza1) {
			p1.ingrediente = add;
			p1.adicionaIngrediente();
		}
		c.Compras(p1.getPreco());
		
		String pizza2[] = {"Bacon","Azeitona","Alho","Cebola","Alcapparra","Pepperoni"};
		for (String add : pizza2) {
			p2.ingrediente = add;
			p2.adicionaIngrediente();	
		}		
		c.Compras(p2.getPreco());
		
		String pizza3[] = {"Mussarela","Tomate"};
		for (String add : pizza3) {
			p3.ingrediente = add;
			p3.adicionaIngrediente();
		}
		c.Compras(p3.getPreco());
		c.imprimePrecoTotalCompra();
		System.out.println("\nO total de ingredientes utilizados foi: \n" + Pizza.contabilizaTotal);
		

	}

}
