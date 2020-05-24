
//https://www.callicoder.com/java-multithreading-thread-and-runnable-tutorial/
//https://www.guj.com.br/t/resolvido-timer-regressivo-como-implementar/236262/5
//https://www.javatpoint.com/java-thread-isalive-method
//https://www.devmedia.com.br/conheca-algumas-maneiras-para-saber-se-a-thread-encerrou-seu-processamento/1335
//https://www.devmedia.com.br/saiba-como-parar-uma-tread/1332
//https://pt.stackoverflow.com/questions/45320/como-parar-uma-thread


package aprendendosobrethreads;

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
			if (finalizar) {
				 Thread.currentThread().interrupt();
			}
			System.out.println("finalizar: " + finalizar);
	}
	}
}
