package br.com.globalcode.aj4.thread;

public class TesteSincronismo {

	public static void main(String[] args) {
		int saldoInicial = 1000;
		int numeroContas = 10;
		Banco banco = new Banco(numeroContas, saldoInicial);
		for (int i = 0; i < numeroContas; i++) {
			Thread t = new Thread(new Transferencia(banco, i, saldoInicial));
			t.start();
		}
	}

}
