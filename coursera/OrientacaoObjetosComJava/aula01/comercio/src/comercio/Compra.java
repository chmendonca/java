package comercio;

public class Compra {
	int valorTotal;
	int numParcelas;
	
	//a vista
	public Compra (int valor) {
		valorTotal = valor;
		numParcelas = 1;
	}
	
	//parcelado
	public Compra (int parcelas, int valorParcela) {
		numParcelas = parcelas;
		valorTotal = numParcelas * valorParcela;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumParcelas() {
		return numParcelas;
	}
	
	public int getValorParcelado() {
		return valorTotal / numParcelas;
	}
		
}
