package br.com.globalcode.aj4.thread;

import java.util.Iterator;

import br.com.globalcode.aj4.model.Conta;

public class Banco {

	private Conta[] contas;
	private static final int TRANSACOES_PARA_IMPRESSAO = 10000;
	public int contadorTransacoes = 0;

	// Construtor do banco: Criamos um banco com numeroContas, sendo que cada
	// conta tem saldo inicial = saldoInicial
	public Banco(int numeroContas, int saldoInicial) {
		this.contas = new Conta[numeroContas];
		for (int i = 0; i < numeroContas; i++) {
			Conta c = new Conta(saldoInicial);
			contas[i] = c;
		}
	}

	// os parametros contaSaque e contaDeposito representam a posi��o das contas
	// no array

	public synchronized void tranferir(int contaSaque, int contaDeposito, int valor) {

		// public void tranferir(int contaSaque, int contaDeposito, int valor) {
		// se n�o houver saldo suficiente, sai do metodo
		if (contas[contaSaque].saldo < valor) {
			return;
		}

		// tiramos o $ de uma conta e colocamos em outra
		contas[contaSaque].saldo -= valor;
		contas[contaDeposito].saldo += valor;

		contadorTransacoes++;
		if (contadorTransacoes % TRANSACOES_PARA_IMPRESSAO == 0) {
			imprimeTotal();
		}
	}

	public int getNumeroContas() {
		return this.contas.length;
	}

	// Este m�todo imprime o saldo total das contas presentes no banco
	private void imprimeTotal() {
		int total = 0;
		for (int i = 0; i < contas.length; i++) {
			total += contas[i].saldo;
		}
		System.out.println("Transação = " + contadorTransacoes + " total = " + total);
	}
}
