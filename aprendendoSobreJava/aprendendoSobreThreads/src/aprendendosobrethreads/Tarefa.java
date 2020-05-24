package aprendendosobrethreads;

public class Tarefa implements Runnable {

	private final long valorInicial;
	private final long valorFinal;
	private long total = 0;
	
	//m�todo construtor que receber� os par�metros da tarefa
	public Tarefa(int valorInicial, int valorFinal) {
		this.valorInicial = valorInicial;
		this.valorFinal = valorFinal;
	}
	
	//m�todo cque retorna o total calculado
	public long getTotal() {
		return total;
	}
	
	//Este m�todo ser faz necess�rio para que possamos dar start() na Thread
	// e iniciar a tarefa em paralelo
	
	@Override
	public void run() {
		for (long i = valorInicial; i <= valorFinal; i++) {
			total += i;
		}
	}
}