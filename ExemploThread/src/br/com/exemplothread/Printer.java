package br.com.exemplothread;

public class Printer extends Thread{
	
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
