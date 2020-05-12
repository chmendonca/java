package pizzaria;

import java.util.HashMap;

public class Pizza {
	
	String ingrediente = "";
	public int quantidadeIngredientesPizza = 0;
	public int precoPizza;
	
	//Criando um mapa de ingredientes totais (estático)
	public static HashMap<String,Integer> contabilizaTotal = new HashMap<String,Integer>();
	
	//Criando um mapa de ingredientes por pizza (instância)
	HashMap<String,Integer> ingredientesPizza = new HashMap<String,Integer>();
	
	public HashMap<String,Integer> adicionaIngrediente() {
		if (ingrediente.isEmpty()){
			;
		} else {
			quantidadeIngredientesPizza++;
			if (ingredientesPizza.containsKey(ingrediente)) {
				int esteIngrediente = ingredientesPizza.get(ingrediente);
				esteIngrediente++;
				ingredientesPizza.put(ingrediente, esteIngrediente);
			} else {
				ingredientesPizza.put(ingrediente, 1);
			}
			contabilizaIngrediente();
		}
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
		return contabilizaTotal;
	}

	
	public int getPreco() {
		if (quantidadeIngredientesPizza >= 1 && quantidadeIngredientesPizza <= 2) {
			precoPizza = 15;
		} else if (quantidadeIngredientesPizza >=3 && quantidadeIngredientesPizza <= 5) { 
			precoPizza = 20;
		} else if (quantidadeIngredientesPizza > 5) {
			precoPizza = 23;
		} else {
			precoPizza = 0; //Nao foram adicionados ingredientes na pizza
		}
		System.out.println("Preco da pizza: R$" + precoPizza);
		return precoPizza;
	}

}
