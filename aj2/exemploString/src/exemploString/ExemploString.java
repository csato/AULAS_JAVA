/**
 * 
 */
package exemploString;

/**
 * @author aluno
 *
 */
public class ExemploString {

	
	/**
	 * 
	 */
	public ExemploString() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String nome;
	enum Tipo {PESSOA, ANIMAL,PLANTAS, OBJETOS;}
	private Tipo tipo;

	/**
	 * @param nome
	 * @param tipo
	 */
	public ExemploString(String nome, Tipo tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}

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
	 * @return the tipo
	 */
	public Tipo getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	

	
	

}
