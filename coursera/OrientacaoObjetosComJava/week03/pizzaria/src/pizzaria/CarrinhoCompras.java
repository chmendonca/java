package pizzaria;

public class CarrinhoCompras {
	
	int precoTotal = 0;
	int pizzasPedidas = 0;
	int pizzasRegistradas = 0;
	
	public int Compras (int p) {
		if (p > 0) {
			precoTotal += p;
			pizzasRegistradas++;
			pizzasPedidas++;
			return precoTotal;
		} else {
			System.out.println("N�o foram escolhidos ingredientes para esta pizza \n" + 
					"Esta pizza n�o foi adicionada ao carrinho");
			return precoTotal;
		}
	}
	

	public String imprimePrecoTotalCompra() {
		String printTotal = "O pre�o total da compra ficou em: R$" + precoTotal;
		System.out.println(printTotal);
		return printTotal;
	}

}
