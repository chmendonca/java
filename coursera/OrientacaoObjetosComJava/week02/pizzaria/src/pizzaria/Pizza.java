package pizzaria;

import java.util.HashMap;

public class Pizza {
	
	String ingrediente = "";
	int quantidadeIngredientesPizza = 0;
	int precoPizza;
	
	//Criando um mapa de ingredientes totais (estático)
	static HashMap<String,Integer> contabilizaTotal = new HashMap<String,Integer>();
	
	//Criando um mapa de ingredientes por pizza (instância)
	HashMap<String,Integer> ingredientesPizza = new HashMap<String,Integer>();
	
	public HashMap<String,Integer> adicionaIngrediente() {
		quantidadeIngredientesPizza++;
		if (ingredientesPizza.containsKey(ingrediente)) {
			//System.out.println("Este ingrediente já existe");
			//System.out.println("Quantidade deste ingrediente: " + 
				//	ingredientesPizza.get(ingrediente));
			int esteIngrediente = ingredientesPizza.get(ingrediente);
			esteIngrediente++;
			//System.out.println("Quantidade deste ingrediente agora: " + esteIngrediente);
			ingredientesPizza.put(ingrediente, esteIngrediente);
		} else {
			ingredientesPizza.put(ingrediente, 1);
		}
		
		System.out.println("Ingredientes da pizza: " + ingredientesPizza);
		System.out.println("Quantidade de ingredientes para cobrança: " + quantidadeIngredientesPizza);
		contabilizaIngrediente();
		return ingredientesPizza;
	}
	
	public HashMap<String,Integer> contabilizaIngrediente() { 
		if (contabilizaTotal.containsKey(ingrediente)) {
			int esteIngrediente = contabilizaTotal.get(ingrediente);
			esteIngrediente++;
			contabilizaTotal.put(ingrediente, esteIngrediente);
		} else {
			contabilizaTotal.put(ingrediente, 1);
		}	
		System.out.println("TOTAL: " + contabilizaTotal);
		return contabilizaTotal;
	}

	
	public int getPreco() {
		/*calcula da seguinte forma: 2 ingredientes ou menos custam 15 reais, 
		 * de 3 a 5 ingredientes custam 20 reais e 
		 * mais de 5 ingredientes custa 23 reais.
		 *
		 */
		if (quantidadeIngredientesPizza >= 1 && quantidadeIngredientesPizza <= 2) {
			precoPizza = 15;
		} else if (quantidadeIngredientesPizza >=3 && quantidadeIngredientesPizza <= 5) { 
			precoPizza = 20;
		} else if (quantidadeIngredientesPizza > 5) {
			precoPizza = 23;
		} else {
			precoPizza = 0; //Nao foram adicionados ingredientes na pizza
		}
		System.out.println("Preco da pizza: " + precoPizza);
		return precoPizza;
	}

}
