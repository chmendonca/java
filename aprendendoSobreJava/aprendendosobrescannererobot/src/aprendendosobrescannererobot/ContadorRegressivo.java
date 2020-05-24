
//https://www.callicoder.com/java-multithreading-thread-and-runnable-tutorial/
//https://www.guj.com.br/t/resolvido-timer-regressivo-como-implementar/236262/5
//https://www.javatpoint.com/java-thread-isalive-method
//https://www.devmedia.com.br/conheca-algumas-maneiras-para-saber-se-a-thread-encerrou-seu-processamento/1335
//https://www.devmedia.com.br/saiba-como-parar-uma-tread/1332
//https://pt.stackoverflow.com/questions/45320/como-parar-uma-thread

//https://stackoverflow.com/questions/7745959/how-to-simulate-keyboard-presses-in-java
//https://docs.oracle.com/javase/6/docs/api/java/awt/Robot.html
//https://docs.oracle.com/javase/6/docs/api/java/awt/event/KeyEvent.html


package aprendendosobrescannererobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class ContadorRegressivo implements Runnable{

	private int tempoDoJogo = 10;
	private int i;
	private static boolean terminouContagem = false;
	public boolean finalizar = false; 
	
/*
	public static boolean main(String[] args) {
		System.out.println("Inside : " + Thread.currentThread().getName());
		Runnable runnable = new ContadorRegressivo();
		Thread t = new Thread(runnable);
		t.start();
		return terminouContagem;
		
		//new Thread(runnable).start();		
	}
*/
	@Override
	public void run() {
		System.out.println("Inside : " + Thread.currentThread().getName());
		while (tempoDoJogo >= 0) {
			System.out.println(tempoDoJogo);
			try {
				Thread.sleep(1000);
				tempoDoJogo -= 1;
			} catch (InterruptedException ie) {
				break;
			}
		}
		System.out.println("finalizar");
		
		if (tempoDoJogo == 0) {
			try {
				Robot robot  = new Robot();
				
				//Simula um click do mouse
				//robot.mousePress(InputEvent.BUTTON1_MASK);
				//robot.mouseRelease(InputEvent.BUTTON1_MASK);
				
				//Simula uma tecla pressionada
				robot.keyPress(KeyEvent.VK_X);
				robot.keyRelease(KeyEvent.VK_X);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
			} catch (AWTException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
