////https://stackoverflow.com/questions/7745959/how-to-simulate-keyboard-presses-in-java
//https://docs.oracle.com/javase/6/docs/api/java/awt/Robot.html
//https://docs.oracle.com/javase/6/docs/api/java/awt/event/KeyEvent.html

package aprendendosobrescannererobot;

import java.util.Scanner;

public class InputSimuladoParaOScanner {
	
	static String word;
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("entre com uma palavra: ");

		Runnable runnable = new ContadorRegressivo();
		Thread t = new Thread(runnable);
		t.start();
		
		word = teclado.next();
		teclado.close();
		
		System.out.println("typed: " + word);
		
	}

}
