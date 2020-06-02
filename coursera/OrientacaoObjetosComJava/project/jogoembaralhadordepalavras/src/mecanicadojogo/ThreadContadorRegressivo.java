/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 22th, 2020
 * Course: Orientação a objetos com Java
 * Week: 6 (course final project)
 * Comments: Esta thread é responsável pelo cronômetro do modo Contra-Tempo. Ela recebe o valor do tempo de jogo
 *  e inicia um contador de tempo simples. Caso receba um interrupt, a thread é interrompida e o tempo restante é
 *  descartado.
 *  Sources: 
 *  //https://www.callicoder.com/java-multithreading-thread-and-runnable-tutorial/
 *  //https://www.guj.com.br/t/resolvido-timer-regressivo-como-implementar/236262/5
 *  //https://www.javatpoint.com/java-thread-isalive-method
 *  //https://www.devmedia.com.br/conheca-algumas-maneiras-para-saber-se-a-thread-encerrou-seu-processamento/1335
 *  //https://www.devmedia.com.br/saiba-como-parar-uma-tread/1332
 *  //https://pt.stackoverflow.com/questions/45320/como-parar-uma-thread
 *  //https://stackoverflow.com/questions/7745959/how-to-simulate-keyboard-presses-in-java
 *  //https://docs.oracle.com/javase/6/docs/api/java/awt/Robot.html
 *  //https://docs.oracle.com/javase/6/docs/api/java/awt/event/KeyEvent.html
 */

package mecanicadojogo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ThreadContadorRegressivo implements Runnable{

	private int tempoDoJogo;
	private int i;
	private static boolean terminouContagem = false;
	public boolean finalizar = false; 
	
	public ThreadContadorRegressivo(int tempoDoJogo) {
		super();
		this.tempoDoJogo = tempoDoJogo;
	}

/*
	public static void main(String[] args) {
		System.out.println("Inside : " + Thread.currentThread().getName());
		Runnable runnable = new ThreadContadorRegressivo();
		Thread t = new Thread(runnable);
		t.start();
		
		//new Thread(runnable).start();		
	}
*/
	@Override
	public void run() {
		//System.out.println("Inside : " + Thread.currentThread().getName());
		while (this.tempoDoJogo > 0) {
			//System.out.println(tempoDoJogo);
			try {
				Thread.sleep(1000);
				this.tempoDoJogo -= 1;
			} catch (InterruptedException ie) {
				break;
			}
		}
		//System.out.println("tempo do jogo: " + tempoDoJogo);
		if (this.tempoDoJogo == 0) {
			try {
				Robot robot  = new Robot();
				
				//Simula um click do mouse
				//robot.mousePress(InputEvent.BUTTON1_MASK);
				//robot.mouseRelease(InputEvent.BUTTON1_MASK);
				
				//Simula uma tecla pressionada
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_M);
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_P);
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				robot.keyPress(KeyEvent.VK_G);
				robot.keyRelease(KeyEvent.VK_G);
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyPress(KeyEvent.VK_D);
				robot.keyRelease(KeyEvent.VK_D);
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
			} catch (AWTException e) {
				e.printStackTrace();
			}
		}
	}
}
