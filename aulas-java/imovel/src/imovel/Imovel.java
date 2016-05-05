package imovel;

public class Imovel {
	
	private String endereco;
	private double area;
	private double valor;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area < 0 ? 0 : area;
	}
	
	

}
