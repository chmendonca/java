package aprendendosobrethreads;

public class ExemploContadorRegressivo {
	
	public static void main(String[] args) {
		System.out.println("Inside : " + Thread.currentThread().getName());
		Runnable runnable1 = new ContadorRegressivo();
		Runnable runnable2 = new ContadorRegressivo();
		Thread t1 = new Thread(runnable1);
		Thread t2 = new Thread(runnable2);

		Runnable runnable3 = new ContadorRegressivo();
		Runnable runnable4 = new ContadorRegressivo();
		Thread t3 = new Thread(runnable3);
		Thread t4 = new Thread(runnable4);
		
		//t1.start();
		//t2.start();
		//t1.interrupt();
		try {
			System.out.println("t3stt");
			t3.start();
			System.out.println("t3j");
			t3.join();
			System.out.println("t4stt");
			t4.start();
			System.out.println("t4j");
			//t4.join();
			t4.interrupt();
			// t1.start(); //Este thread interrompe a execução pq foi interrompido
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("----------------------------------------------");
		
		/*
		for (int i = 0; i < 3; i++) {
			Runnable runnable = new ContadorRegressivo();
			Thread t = new Thread(runnable);
			t.start();
			t.interrupt();
		}*/
	
		
	}
}
