package br.com.exemplo;

public class Printer implements Runnable {
	private char c;

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public Printer(char c) {
		super();
		this.c = c;
	}
	
	public void run (){
		
		for (int i=0;i<1000;i++){
			System.out.print(c);		
		}
	}

}
