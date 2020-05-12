package escola;

public class Principal {

	public static void main(String[] args) {
		Aluno cassio = new Aluno();
		
		cassio.bim1 = 70;
		cassio.bim2 = 70;
		cassio.bim3 = 70;
		cassio.bim4 = 70;
		
		System.out.println(cassio.media());
		System.out.println(cassio.passouDeAno());

	}

}
