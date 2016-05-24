/**
 * 
 */
package Herois;

/**
 * @author aluno
 *
 */
public class Tempestade extends Marvel implements Voador, InvocadorRaios{

	/**
	 * @param nome
	 */
	public Tempestade(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public Tempestade() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void usarHabilidadeEspecial() {
		System.out.println("Fazer chover");
		
	}

	@Override
	public void DirecionarRaio() {
		System.out.println("DirecionaRaio apontando");
		
	}

	@Override
	public void levantarVoo() {
		System.out.println("Olhar par o alto");
		
	}

	@Override
	public void descer() {
		System.out.println("Olhar para terra");
		
	}

	@Override
	public void manobrar() {
		System.out.println("Olhar para horizonte");
		
	}

	@Override
	public void LevantarCoisas() {
		// TODO Auto-generated method stub
		
	}

	
	
}
