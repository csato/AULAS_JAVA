package br.com.padaria1.entities;

public class Produto {

	private String nome;
	private double preco;
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 * @param preco the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nome
	 * @param preco
	 */
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", getNome()=" + getNome() + ", getPreco()=" + getPreco()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
