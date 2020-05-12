package imc;

public class Paciente {
	double peso;
	double altura;
	double calculation = 0;
	String diagnostic = "";
	
	public Paciente (double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
		System.out.println("The weight of this pacient is " + peso + " kilos and his height is " +
				altura + " meters");
	}
	
	public double Imc(){
		calculation = peso/Math.pow(altura, 2);
		System.out.println("The IMC of this pacient is " + calculation + " Kg/m2");
		return calculation;
	}
	
	public String Diagnostic() {
		if (calculation < 16) {
			 diagnostic = "Baixo peso muito grave";
		} 
		else if (calculation >= 16 && calculation <= 16.99) {
			diagnostic = "Baixo peso grave";
		}
		else if (calculation >= 17 && calculation <= 18.49) {
			diagnostic = "Baixo Peso";
		}
		else if (calculation >= 18.5 && calculation <= 24.99) {
			diagnostic = "Peso normal"; 
		}
		else if (calculation >= 25 && calculation <= 29.99) {
			diagnostic = "Sobrepeso";
		}
		else if (calculation >= 30 && calculation <= 34.99) {
			diagnostic = "Obesidade grau I";
		}
		else if (calculation >= 35 && calculation <= 39.99) {
			diagnostic = "Obesidade grau II";
		}
		else {diagnostic = "Obesidade grau III (obesidade mórbida)";
		}
		return diagnostic;
	}
}
