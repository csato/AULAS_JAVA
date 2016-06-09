package mercado;

public class Cliente extends Pessoa {
	
	private String pedidos;
	private String programaPontos;
	
	
	@Override
	public String toString() {
		return "Cliente [pedidos=" + pedidos + ", programaPontos=" + programaPontos + ", getPedidos()=" + getPedidos()
				+ ", getProgramaPontos()=" + getProgramaPontos() + "]";
	}

	
	
	public Cliente(String pedidos, String programaPontos) {
		super();
		this.pedidos = pedidos;
		this.programaPontos = programaPontos;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public String getPedidos() {
		return pedidos;
	}

	public void setPedidos(String pedidos) {
		this.pedidos = pedidos;
	}

	public String getProgramaPontos() {
		return programaPontos;
	}

	public void setProgramaPontos(String programaPontos) {
		this.programaPontos = programaPontos;
	}

}
