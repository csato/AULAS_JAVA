package br.com.globalcode.aj4.thread;

public class RunnableExemplo implements Runnable {

	int numero;
	char c;

	public RunnableExemplo(int numero, char c) {
		this.numero = numero;
		this.c = c;
		System.out.printf("Runnable vai imprimir %d  vezes o caractere %c %n",
				numero, c);
	}

	@Override
	public void run() {
		for (int i = 0; i < this.numero; i++) {
			System.out.print(c);
		}
	}

}
