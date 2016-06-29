package br.com.globalcode.aj4.thread;

public class ThreadExemplo extends Thread {

	int numero;
	char c;

	public ThreadExemplo(int numero, char c) {
		this.numero = numero;
		this.c = c;
		System.out.printf("Thread vai imprimir %d vezes o caractere %c %n",
				numero, c);
	}

	public void run() {
		for (int i = 0; i < this.numero; i++) {
			System.out.print(c);
		}
	}

}
