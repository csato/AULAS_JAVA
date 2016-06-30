package br.com.exemplo;


public class Teste {

	public static void main(String[] args) {
	
		Printer p1 = new Printer('A');
		Printer p2 = new Printer('-');
		Printer p3 = new Printer('&');
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}


