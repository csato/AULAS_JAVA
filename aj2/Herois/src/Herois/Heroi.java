/**
 * 
 */
package Herois;

/**
 * @author aluno
 *
 */
public abstract class Heroi {

	/**
	 * @param nome
	 */
	public Heroi(String nome) {
		super();
		this.nome = nome;
	}
	private String nome;
	/**
	 * 
	 */
	public Heroi() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void usarHabilidadeEspecial();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Heroi [nome=" + nome + ", getNome()=" + getNome() + ", toString()=" + super.toString() + "]";
	}
	
}
