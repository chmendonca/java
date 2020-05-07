package imc;

public class Principal {
	
	public static void main (String[] args) {
		String faixa = "";
		
		Paciente p1 = new Paciente(99,1.7);
		p1.Imc();
		faixa = p1.Diagnostic();
		System.out.println("The pacient level is: " + faixa + ".");
		System.out.println("");
		
		Paciente p2 = new Paciente(50,2.05);
		p2.Imc();
		faixa = p2.Diagnostic();
		System.out.println("The pacient level is: " + faixa + ".");
		System.out.println("");
		
		Paciente p3 = new Paciente(75,1.80);
		p3.Imc();
		faixa = p3.Diagnostic();
		System.out.println("The pacient level is: " + faixa + ".");
		System.out.println("");
	}
}
