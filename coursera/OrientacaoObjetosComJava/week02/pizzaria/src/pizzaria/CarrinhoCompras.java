package pizzaria;

public class CarrinhoCompras {
	
	int precoTotal = 0;
	int pizzasPedidas = 0;
	int pizzasRegistradas = 0;
	
	public void Compras (int p) {
		if (p > 0) {
			precoTotal += p;
			pizzasRegistradas++;
		} else {
			System.out.println("Não foram escolhidos ingredientes para esta pizza \n" + 
					"Esta pizza não foi adicionada ao carrinho");
		}
		pizzasPedidas++;
	}

	public void imprimePrecoTotalCompra() {
		System.out.println("O preço total da compra ficou em: R$" + precoTotal);
	}

}
