package br.com.exemplo;

public class Conta {

	
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double saldo) {
		
		saldo += saldo;
		
	}

	public void debitar(double i) {
		saldo -= i;
		
	}
	
	
	
}
