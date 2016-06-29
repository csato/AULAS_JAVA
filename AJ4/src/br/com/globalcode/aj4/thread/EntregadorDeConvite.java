package br.com.globalcode.aj4.thread;

public class EntregadorDeConvite implements Runnable {

	private ListaConvidados listaConvidados;

	public EntregadorDeConvite(ListaConvidados listaConvidados) {
		this.listaConvidados = listaConvidados;
	}

	@Override
	public void run() {
		String nomeThread = Thread.currentThread().getName();
		System.out.println(nomeThread + " inicio das atividades");
		boolean estaAberta = listaConvidados.isAberta();
		int quantidadePendente = listaConvidados.getQuantidadeEmailsPendentes();
		while (estaAberta || quantidadePendente > 0) {
			try {
				String email = listaConvidados.obterEmailConvidado();
				if (email != null) {
					System.out.println(nomeThread + " enviado email para "
							+ email);

					// acesso ao servidor de email e envio de mensagem simulando
					// uma lentid�o de at� 10 segundos
					Thread.sleep((int) (Math.random() * 10000));
					System.out.println("... envio de convite para " + email
							+ " conclu�do");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

			// verificando situa��o da lista
			estaAberta = listaConvidados.isAberta();
			quantidadePendente = listaConvidados.getQuantidadeEmailsPendentes();
		}
		System.out.println(nomeThread + " encerrando atividades");

	}

}
