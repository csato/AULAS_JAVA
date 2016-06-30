package br.com.exemplothread;

public class Teste {

	public static void main(String[] args) {
		Printer p1 = new Printer('A');
		Printer p2 = new Printer('-');
		Printer p3 = new Printer('&');
		
		//p1.run();
		//p2.run();
		//p3.run();
		p1.start(); //utilização thread
		p2.start();
		p3.start();

		p1.setPriority(5); //utilização prioridade
		p2.setPriority(9);
		p3.setPriority(2);
		
		
	}
}
