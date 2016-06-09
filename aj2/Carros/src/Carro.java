
public class Carro {
	
	private String modelo;
	private String cor;
	
	public Carro(){
		System.out.println("construtor");
	}

	
	public Carro(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

}
