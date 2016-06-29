package br.com.globalcode.aj4.thread;

public class TesteExemploThread {
	public static void main(String[] args) {
		ThreadExemplo t = new ThreadExemplo(1000, '-');
		ThreadExemplo u = new ThreadExemplo(1000, '>');
		ThreadExemplo v = new ThreadExemplo(1000, '<');
		ThreadExemplo x = new ThreadExemplo(1000, 'o');

		v.setPriority(8);
		x.setPriority(10);

		t.start();
		u.start();
		v.start();
		x.start();
	
	}
}
