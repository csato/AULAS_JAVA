package br.com.globalcode.aj4.thread;

import javax.swing.JOptionPane;

public class TesteWaitNotify {

	public static void main(String[] args) {

		// inicializando reposit�rio de dados
		ListaConvidados lista = new ListaConvidados();

		Thread t1 = new Thread(new EntregadorDeConvite(lista), "entregador1");
		Thread t2 = new Thread(new EntregadorDeConvite(lista), "entregador2");

		// disparando entregadores de convites
		// s�o as threads consumidoras do reposit�rio de dados
		t1.start();
		t2.start();

		// loop da entrada de dados
		// esta thread (main) � a produtora de dados

		while (true) {
			// tem um novo email para adicionar na lista
			String email = JOptionPane.showInputDialog(
					"Digite o email do pr�ximo convidado ", "");
			if (email != null) {
				lista.adicionar(email);
			} else {
				lista.fecharLista();
				break; // para sair do loop
			}
		}
	}

}
