package br.com.globalcode.aj4.thread;

import java.util.LinkedList;
import java.util.Queue;

public class ListaConvidados {

	// repositorio de dados

	private Queue<String> emails = new LinkedList<String>();
	private boolean aberta = true;

	public int getQuantidadeEmailsPendentes() {
		synchronized (this.emails) {
			return this.emails.size();
		}
	}

	public boolean isAberta() {
		return this.aberta;
	}

	public String obterEmailConvidado() {
		String email = null;
		try {
			synchronized (this.emails) {
				while (this.emails.size() == 0) {
					if (this.aberta == false) {
						return null;
					}
					String nomeThreadAtual = Thread.currentThread().getName();
					System.out.print("Lista vazia...");
					System.out.println("colocando " + nomeThreadAtual
							+ " em WAITING");
					this.emails.wait();
				}
				email = this.emails.poll();
			}// fim do bloco synchronized
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		return email;
	}

	public void adicionar(String email) throws IllegalStateException {
		if (this.aberta == true) {
			synchronized (this.emails) {
				this.emails.add(email);
				System.out.println("Emails adicionados na lista...");
				System.out.println("notificando todas as threads de entrega");
				this.emails.notifyAll();
			}// fim do bloco synchronized
		} else {
			throw new IllegalStateException("A lista já está fechada");
		}
	}

	public void fecharLista() {
		System.out.println("Todos os convites já foram adicionados");
		System.out.println("Notificando todas as threads de entrega");
		this.aberta = false;
		synchronized (this.emails) {
			this.emails.notifyAll(); // libera entregadores em espera
		}
	}
}
